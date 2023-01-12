package typings.markdownItContainer

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownItContainer.mod.markdownItContainer.ContainerOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof markdownItContainer.container_plugin` */
  inline def apply(md: MarkdownIt, name: String, opts: ContainerOpts): Unit = (^.asInstanceOf[js.Dynamic].apply(md.asInstanceOf[js.Any], name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("markdown-it-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object markdownItContainer {
    
    trait ContainerOpts extends StObject {
      
      var marker: js.UndefOr[String] = js.undefined
      
      var render: js.UndefOr[
            js.Function5[
              /* tokens */ js.Array[typings.markdownIt.libTokenMod.^], 
              /* index */ Double, 
              /* options */ Any, 
              /* env */ Any, 
              /* self */ typings.markdownIt.libRendererMod.^, 
              String
            ]
          ] = js.undefined
      
      var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.undefined
    }
    object ContainerOpts {
      
      inline def apply(): ContainerOpts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerOpts]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ContainerOpts] (val x: Self) extends AnyVal {
        
        inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
        
        inline def setRender(
          value: (/* tokens */ js.Array[typings.markdownIt.libTokenMod.^], /* index */ Double, /* options */ Any, /* env */ Any, /* self */ typings.markdownIt.libRendererMod.^) => String
        ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
        
        inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        inline def setValidate(value: /* params */ String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
        
        inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
  }
}
