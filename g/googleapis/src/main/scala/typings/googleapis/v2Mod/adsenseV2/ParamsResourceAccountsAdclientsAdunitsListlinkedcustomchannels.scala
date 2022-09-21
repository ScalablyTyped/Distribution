package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of custom channels to include in the response, used for paging. If unspecified, at most 10000 custom channels will be returned. The maximum value is 10000; values above 10000 will be coerced to 10000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListLinkedCustomChannels` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListLinkedCustomChannels` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ad unit which owns the collection of custom channels. Format: accounts/{account\}/adclients/{adclient\}/adunits/{adunit\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels {
  
  inline def apply(): ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels]
  }
  
  extension [Self <: ParamsResourceAccountsAdclientsAdunitsListlinkedcustomchannels](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
