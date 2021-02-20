package typings.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.ru
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/ru", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var locale: ru = js.native
    
    var long: Duration = js.native
    
    var `long-convenient`: Duration = js.native
    
    var `long-time`: Duration = js.native
    
    var narrow: Duration = js.native
    
    def quantify(n: Double): one | two | few | other = js.native
    
    var short: Duration = js.native
    
    var `short-convenient`: Duration = js.native
    
    var `short-time`: Duration = js.native
    
    var tiny: Duration = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      locale: ru,
      long: Duration,
      `long-convenient`: Duration,
      `long-time`: Duration,
      narrow: Duration,
      quantify: Double => one | two | few | other,
      short: Duration,
      `short-convenient`: Duration,
      `short-time`: Duration,
      tiny: Duration
    ): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
      __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
      __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
      __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
      __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: ru): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLong-convenient`(value: Duration): Self = StObject.set(x, "long-convenient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLong-time`(value: Duration): Self = StObject.set(x, "long-time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-convenient`(value: Duration): Self = StObject.set(x, "short-convenient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setShort-time`(value: Duration): Self = StObject.set(x, "short-time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiny(value: Duration): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `ruMod.foo` */
  override def _to: Locale = ^
}
