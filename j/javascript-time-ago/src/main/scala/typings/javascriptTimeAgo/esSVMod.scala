package typings.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.`es-SV`
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSVMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/es-SV", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  trait Locale extends StObject {
    
    var locale: `es-SV`
    
    var long: Duration
    
    def quantify(n: Double): one | two | few | other
  }
  object Locale {
    
    @scala.inline
    def apply(long: Duration, quantify: Double => one | two | few | other): Locale = {
      val __obj = js.Dynamic.literal(locale = "es-SV", long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: `es-SV`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `esSVMod.foo` */
  override def _to: Locale = ^
}
