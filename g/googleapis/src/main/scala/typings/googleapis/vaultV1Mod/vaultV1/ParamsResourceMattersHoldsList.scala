package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersHoldsList
  extends StObject
     with StandardParameters {
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of holds to return in the response, between 0 and 100 inclusive. Leaving this empty, or as 0, is the same as **page_size** = 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The pagination token as returned in the response. An empty token means start from the beginning.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of detail to return for a hold.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersHoldsList {
  
  inline def apply(): ParamsResourceMattersHoldsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersHoldsList]
  }
  
  extension [Self <: ParamsResourceMattersHoldsList](x: Self) {
    
    inline def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    inline def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
