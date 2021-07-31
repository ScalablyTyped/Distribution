package typings.gulpPugI18n

import typings.gulpPugI18n.anon.Default
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(options: Options): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-pug-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with typings.pug.mod.Options {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var i18n: Default
  }
  object Options {
    
    @scala.inline
    def apply(i18n: Default): Options = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setI18n(value: Default): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
}
