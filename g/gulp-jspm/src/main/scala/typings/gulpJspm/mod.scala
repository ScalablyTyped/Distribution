package typings.gulpJspm

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-jspm", JSImport.Namespace)
  @js.native
  val ^ : GulpJspm = js.native
  
  type GulpJspm = js.Function1[/* options */ js.UndefOr[Options], ReadWriteStream]
  
  @js.native
  trait Options extends StObject {
    
    var arithmetic: js.UndefOr[String] = js.native
    
    var inject: js.UndefOr[Boolean] = js.native
    
    var minify: js.UndefOr[Boolean] = js.native
    
    var plugin: js.UndefOr[Boolean | String] = js.native
    
    var selfExecutingBundle: js.UndefOr[Boolean] = js.native
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
      def setArithmetic(value: String): Self = StObject.set(x, "arithmetic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArithmeticUndefined: Self = StObject.set(x, "arithmetic", js.undefined)
      
      @scala.inline
      def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setPlugin(value: Boolean | String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      @scala.inline
      def setSelfExecutingBundle(value: Boolean): Self = StObject.set(x, "selfExecutingBundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfExecutingBundleUndefined: Self = StObject.set(x, "selfExecutingBundle", js.undefined)
    }
  }
  
  type _To = GulpJspm
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpJspm = ^
}
