package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePretargetingconfigList
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to get the pretargeting configs for.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePretargetingconfigList {
  
  inline def apply(): ParamsResourcePretargetingconfigList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePretargetingconfigList]
  }
  
  extension [Self <: ParamsResourcePretargetingconfigList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
