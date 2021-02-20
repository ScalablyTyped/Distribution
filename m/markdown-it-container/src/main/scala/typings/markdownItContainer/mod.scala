package typings.markdownItContainer

import typings.markdownIt.libMod.MarkdownIt
import typings.markdownIt.tokenMod.^
import typings.markdownItContainer.mod.markdownItContainer.ContainerOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof markdownItContainer.container_plugin` */
  @JSImport("markdown-it-container", JSImport.Namespace)
  @js.native
  def apply(md: MarkdownIt, name: String, opts: ContainerOpts): Unit = js.native
  
  object markdownItContainer {
    
    @js.native
    trait ContainerOpts extends StObject {
      
      var marker: js.UndefOr[String] = js.native
      
      var render: js.UndefOr[
            js.Function5[
              /* tokens */ js.Array[^], 
              /* index */ Double, 
              /* options */ js.Any, 
              /* env */ js.Any, 
              /* self */ typings.markdownIt.rendererMod.^, 
              Unit
            ]
          ] = js.native
      
      var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.native
    }
    object ContainerOpts {
      
      @scala.inline
      def apply(): ContainerOpts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ContainerOpts]
      }
      
      @scala.inline
      implicit class ContainerOptsMutableBuilder[Self <: ContainerOpts] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
        
        @scala.inline
        def setRender(
          value: (/* tokens */ js.Array[^], /* index */ Double, /* options */ js.Any, /* env */ js.Any, /* self */ typings.markdownIt.rendererMod.^) => Unit
        ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
        
        @scala.inline
        def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
        
        @scala.inline
        def setValidate(value: /* params */ String => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
  }
}
