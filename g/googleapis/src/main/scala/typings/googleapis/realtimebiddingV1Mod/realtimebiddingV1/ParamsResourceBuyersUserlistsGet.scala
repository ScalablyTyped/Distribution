package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersUserlistsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the user list to be retrieved. See UserList.name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersUserlistsGet {
  
  inline def apply(): ParamsResourceBuyersUserlistsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersUserlistsGet]
  }
  
  extension [Self <: ParamsResourceBuyersUserlistsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
