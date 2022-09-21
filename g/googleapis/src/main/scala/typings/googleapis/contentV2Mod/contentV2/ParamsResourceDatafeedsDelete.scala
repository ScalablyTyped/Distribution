package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the datafeed.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to simulate a request like in a live environment. If set to true, dry-run mode checks the validity of the request and returns errors (if any).
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDatafeedsDelete {
  
  inline def apply(): ParamsResourceDatafeedsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedsDelete]
  }
  
  extension [Self <: ParamsResourceDatafeedsDelete](x: Self) {
    
    inline def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    inline def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
  }
}
