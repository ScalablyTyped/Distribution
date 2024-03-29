package typings.googleapis.v13Mod.adexchangebuyerV13

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePretargetingconfigDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to delete the pretargeting config for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The specific id of the configuration to delete.
    */
  var configId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePretargetingconfigDelete {
  
  inline def apply(): ParamsResourcePretargetingconfigDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePretargetingconfigDelete]
  }
  
  extension [Self <: ParamsResourcePretargetingconfigDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setConfigId(value: String): Self = StObject.set(x, "configId", value.asInstanceOf[js.Any])
    
    inline def setConfigIdUndefined: Self = StObject.set(x, "configId", js.undefined)
  }
}
