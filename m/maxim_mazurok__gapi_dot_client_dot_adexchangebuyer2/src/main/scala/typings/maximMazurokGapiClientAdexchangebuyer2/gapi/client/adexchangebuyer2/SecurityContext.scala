package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityContext extends StObject {
  
  /** The security types in this context. */
  var securities: js.UndefOr[js.Array[String]] = js.undefined
}
object SecurityContext {
  
  inline def apply(): SecurityContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityContext]
  }
  
  extension [Self <: SecurityContext](x: Self) {
    
    inline def setSecurities(value: js.Array[String]): Self = StObject.set(x, "securities", value.asInstanceOf[js.Any])
    
    inline def setSecuritiesUndefined: Self = StObject.set(x, "securities", js.undefined)
    
    inline def setSecuritiesVarargs(value: String*): Self = StObject.set(x, "securities", js.Array(value*))
  }
}
