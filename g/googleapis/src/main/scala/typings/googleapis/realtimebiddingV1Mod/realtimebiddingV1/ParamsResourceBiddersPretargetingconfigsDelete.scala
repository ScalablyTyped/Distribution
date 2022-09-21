package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBiddersPretargetingconfigsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the pretargeting configuration to delete. Format: bidders/{bidderAccountId\}/pretargetingConfig/{configId\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBiddersPretargetingconfigsDelete {
  
  inline def apply(): ParamsResourceBiddersPretargetingconfigsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersPretargetingconfigsDelete]
  }
  
  extension [Self <: ParamsResourceBiddersPretargetingconfigsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
