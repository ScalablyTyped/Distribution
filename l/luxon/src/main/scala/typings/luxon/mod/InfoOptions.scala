package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfoOptions extends StObject {
  
  var locale: js.UndefOr[String] = js.undefined
}
object InfoOptions {
  
  inline def apply(): InfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoOptions]
  }
  
  extension [Self <: InfoOptions](x: Self) {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
