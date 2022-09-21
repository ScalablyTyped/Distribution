package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsLocksList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of Locks to return per page. Default: 100. Max: 200.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Label on which Locks are applied. Format: labels/{label\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceLabelsLocksList {
  
  inline def apply(): ParamsResourceLabelsLocksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsLocksList]
  }
  
  extension [Self <: ParamsResourceLabelsLocksList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
