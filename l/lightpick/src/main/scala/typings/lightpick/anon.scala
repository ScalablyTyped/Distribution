package typings.lightpick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<lightpick.lightpick.Options.Locale.PluralizeFnLocale> */
  trait PartialPluralizeFnLocale extends StObject {
    
    var one: js.UndefOr[String] = js.undefined
    
    var other: js.UndefOr[String] = js.undefined
  }
  object PartialPluralizeFnLocale {
    
    inline def apply(): PartialPluralizeFnLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPluralizeFnLocale]
    }
    
    extension [Self <: PartialPluralizeFnLocale](x: Self) {
      
      inline def setOne(value: String): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    }
  }
}
