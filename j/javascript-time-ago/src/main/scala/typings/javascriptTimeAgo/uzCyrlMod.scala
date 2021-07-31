package typings.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.`uz-Cyrl`
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uzCyrlMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/uz-Cyrl", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  trait Locale extends StObject {
    
    var locale: `uz-Cyrl`
    
    var long: Duration
    
    var narrow: Duration
    
    def quantify(n: Double): one | two | few | other
    
    var short: Duration
  }
  object Locale {
    
    @scala.inline
    def apply(long: Duration, narrow: Duration, quantify: Double => one | two | few | other, short: Duration): Locale = {
      val __obj = js.Dynamic.literal(locale = "uz-Cyrl", long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: `uz-Cyrl`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `uzCyrlMod.foo` */
  override def _to: Locale = ^
}
