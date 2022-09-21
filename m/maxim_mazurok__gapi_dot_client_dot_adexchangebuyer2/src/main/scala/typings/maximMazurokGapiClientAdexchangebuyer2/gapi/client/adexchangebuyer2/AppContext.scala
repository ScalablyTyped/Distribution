package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppContext extends StObject {
  
  /** The app types this restriction applies to. */
  var appTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object AppContext {
  
  inline def apply(): AppContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppContext]
  }
  
  extension [Self <: AppContext](x: Self) {
    
    inline def setAppTypes(value: js.Array[String]): Self = StObject.set(x, "appTypes", value.asInstanceOf[js.Any])
    
    inline def setAppTypesUndefined: Self = StObject.set(x, "appTypes", js.undefined)
    
    inline def setAppTypesVarargs(value: String*): Self = StObject.set(x, "appTypes", js.Array(value*))
  }
}
