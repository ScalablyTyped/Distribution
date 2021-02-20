package typings.lightpick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<lightpick.lightpick.Options.Locale.PluralizeFnLocale> */
  @js.native
  trait PartialPluralizeFnLocale extends StObject {
    
    var one: js.UndefOr[String] = js.native
    
    var other: js.UndefOr[String] = js.native
  }
  object PartialPluralizeFnLocale {
    
    @scala.inline
    def apply(): PartialPluralizeFnLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPluralizeFnLocale]
    }
    
    @scala.inline
    implicit class PartialPluralizeFnLocaleMutableBuilder[Self <: PartialPluralizeFnLocale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      @scala.inline
      def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    }
  }
}
