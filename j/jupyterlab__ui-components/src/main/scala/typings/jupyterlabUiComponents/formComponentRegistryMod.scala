package typings.jupyterlabUiComponents

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formComponentRegistryMod {
  
  @JSImport("@jupyterlab/ui-components/lib/FormComponentRegistry", "FormComponentRegistry")
  @js.native
  open class FormComponentRegistry ()
    extends StObject
       with IFormComponentRegistry {
    
    /* private */ var _renderers: Any = js.native
    
    /**
      * Adds a renderer for a given id - if the id is already in use, returns false.
      * Otherwise, returns true.
      * @param id - Unique ID for the given renderer.
      * @param renderer - A function that takes props and returns a rendered component
      * @returns - Whether the renderer was added successfully. False if the id is already in use.
      */
    /* CompleteClass */
    override def addRenderer(
      id: String,
      renderer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
    ): Unit = js.native
    
    /**
      * Returns the renderer for the given id
      * @param id - The unique id for the renderer.
      * @returns - A function that takes props and returns a rendered component.
      */
    /* CompleteClass */
    override def getRenderer(id: String): Any = js.native
    
    /**
      * Returns all registered renderers in dictionary form.
      * @returns - A dictionary that maps an id to a renderer.
      */
    /* CompleteClass */
    var renderers: StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
      ] = js.native
    /**
      * Returns all registered renderers in dictionary form.
      * @returns - A dictionary that maps an id to a renderer.
      */
    @JSName("renderers")
    def renderers_MFormComponentRegistry: StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
      ] = js.native
  }
  
  trait IFormComponentRegistry extends StObject {
    
    /**
      * Adds a renderer for a given id - if the id is already in use, returns false.
      * Otherwise, returns true.
      * @param id - Unique ID for the given renderer.
      * @param renderer - A function that takes props and returns a rendered component
      * @returns - Whether the renderer was added successfully. False if the id is already in use.
      */
    def addRenderer(
      id: String,
      renderer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
    ): Unit
    
    /**
      * Returns the renderer for the given id
      * @param id - The unique id for the renderer.
      * @returns - A function that takes props and returns a rendered component.
      */
    def getRenderer(id: String): Any
    
    /**
      * Returns all registered renderers in dictionary form.
      * @returns - A dictionary that maps an id to a renderer.
      */
    var renderers: StringDictionary[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
      ]
  }
  object IFormComponentRegistry {
    
    @JSImport("@jupyterlab/ui-components/lib/FormComponentRegistry", "IFormComponentRegistry")
    @js.native
    val ^ : Token[IFormComponentRegistry] = js.native
    
    extension [Self <: IFormComponentRegistry](x: Self) {
      
      inline def setAddRenderer(
        value: (String, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any) => Unit
      ): Self = StObject.set(x, "addRenderer", js.Any.fromFunction2(value))
      
      inline def setGetRenderer(value: String => Any): Self = StObject.set(x, "getRenderer", js.Any.fromFunction1(value))
      
      inline def setRenderers(
        value: StringDictionary[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Field */ Any
            ]
      ): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
    }
  }
}
