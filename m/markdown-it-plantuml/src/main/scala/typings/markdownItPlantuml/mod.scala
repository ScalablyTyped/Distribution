package typings.markdownItPlantuml

import org.scalablytyped.runtime.Shortcut
import typings.markdownIt.libMod.PluginWithOptions
import typings.markdownIt.rendererMod.RenderRule
import typings.markdownIt.rendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("markdown-it-plantuml", JSImport.Namespace)
  @js.native
  val ^ : PluginWithOptions[Options] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var closeMarker: js.UndefOr[String] = js.native
    
    var diagramName: js.UndefOr[String] = js.native
    
    var generateSource: js.UndefOr[js.Function2[/* umlCode */ String, /* pluginOptions */ this.type, String]] = js.native
    
    var imageFormat: js.UndefOr[String] = js.native
    
    var openMarker: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[RenderRule] = js.native
    
    var server: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseMarker(value: String): Self = StObject.set(x, "closeMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseMarkerUndefined: Self = StObject.set(x, "closeMarker", js.undefined)
      
      @scala.inline
      def setDiagramName(value: String): Self = StObject.set(x, "diagramName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramNameUndefined: Self = StObject.set(x, "diagramName", js.undefined)
      
      @scala.inline
      def setGenerateSource(value: (/* umlCode */ String, Options) => String): Self = StObject.set(x, "generateSource", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateSourceUndefined: Self = StObject.set(x, "generateSource", js.undefined)
      
      @scala.inline
      def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
      
      @scala.inline
      def setOpenMarker(value: String): Self = StObject.set(x, "openMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMarkerUndefined: Self = StObject.set(x, "openMarker", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* tokens */ js.Array[typings.markdownIt.tokenMod.^], /* idx */ Double, /* options */ typings.markdownIt.libMod.Options, /* env */ js.Any, /* self */ Renderer) => String
      ): Self = StObject.set(x, "render", js.Any.fromFunction5(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    }
  }
  
  type _To = PluginWithOptions[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginWithOptions[Options] = ^
}
