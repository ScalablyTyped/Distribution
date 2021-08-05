package typings.markdownItPlantuml

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownIt.rendererMod.RenderRule
import typings.markdownIt.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-plantuml", JSImport.Namespace)
  @js.native
  val ^ : PluginWithOptions[Options] = js.native
  
  trait Options extends StObject {
    
    var closeMarker: js.UndefOr[String] = js.undefined
    
    var diagramName: js.UndefOr[String] = js.undefined
    
    var generateSource: js.UndefOr[js.Function2[/* umlCode */ String, /* pluginOptions */ this.type, String]] = js.undefined
    
    var imageFormat: js.UndefOr[String] = js.undefined
    
    var openMarker: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[RenderRule] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCloseMarker(value: String): Self = StObject.set(x, "closeMarker", value.asInstanceOf[js.Any])
      
      inline def setCloseMarkerUndefined: Self = StObject.set(x, "closeMarker", js.undefined)
      
      inline def setDiagramName(value: String): Self = StObject.set(x, "diagramName", value.asInstanceOf[js.Any])
      
      inline def setDiagramNameUndefined: Self = StObject.set(x, "diagramName", js.undefined)
      
      inline def setGenerateSource(value: (/* umlCode */ String, Options) => String): Self = StObject.set(x, "generateSource", js.Any.fromFunction2(value))
      
      inline def setGenerateSourceUndefined: Self = StObject.set(x, "generateSource", js.undefined)
      
      inline def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
      
      inline def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
      
      inline def setOpenMarker(value: String): Self = StObject.set(x, "openMarker", value.asInstanceOf[js.Any])
      
      inline def setOpenMarkerUndefined: Self = StObject.set(x, "openMarker", js.undefined)
      
      inline def setRender(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ typings.markdownIt.libMod.Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  type _To = PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginWithOptions[Options] = ^
}
