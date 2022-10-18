package typings.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.sv
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeSvMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/sv", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  trait Locale extends StObject {
    
    var locale: sv
    
    var long: Duration
    
    var narrow: Duration
    
    def quantify(n: Double): one | two | few | other
    
    var short: Duration
  }
  object Locale {
    
    inline def apply(long: Duration, narrow: Duration, quantify: Double => one | two | few | other, short: Duration): Locale = {
      val __obj = js.Dynamic.literal(locale = "sv", long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: sv): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      inline def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      inline def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `localeSvMod.foo` */
  override def _to: Locale = ^
}
