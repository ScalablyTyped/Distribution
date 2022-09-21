package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMattersList
  extends StObject
     with StandardParameters {
  
  /**
    * The number of matters to return in the response. Default and maximum are 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The pagination token as returned in the response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If set, lists only matters with the specified state. The default lists matters of all states.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how much information about the matter to return in response.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceMattersList {
  
  inline def apply(): ParamsResourceMattersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersList]
  }
  
  extension [Self <: ParamsResourceMattersList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
