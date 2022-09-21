package typings.googleapis.v41Mod.adsensehostV41

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsList
  extends StObject
     with StandardParameters {
  
  /**
    * Ad clients to list accounts for.
    */
  var filterAdClientId: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceAccountsList {
  
  inline def apply(): ParamsResourceAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsList]
  }
  
  extension [Self <: ParamsResourceAccountsList](x: Self) {
    
    inline def setFilterAdClientId(value: js.Array[String]): Self = StObject.set(x, "filterAdClientId", value.asInstanceOf[js.Any])
    
    inline def setFilterAdClientIdUndefined: Self = StObject.set(x, "filterAdClientId", js.undefined)
    
    inline def setFilterAdClientIdVarargs(value: String*): Self = StObject.set(x, "filterAdClientId", js.Array(value*))
  }
}
