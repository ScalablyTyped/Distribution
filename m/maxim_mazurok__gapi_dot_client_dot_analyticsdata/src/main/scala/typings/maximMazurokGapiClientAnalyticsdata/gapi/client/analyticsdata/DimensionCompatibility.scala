package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionCompatibility extends StObject {
  
  /** The compatibility of this dimension. If the compatibility is COMPATIBLE, this dimension can be successfully added to the report. */
  var compatibility: js.UndefOr[String] = js.undefined
  
  /** The dimension metadata contains the API name for this compatibility information. The dimension metadata also contains other helpful information like the UI name and description. */
  var dimensionMetadata: js.UndefOr[DimensionMetadata] = js.undefined
}
object DimensionCompatibility {
  
  inline def apply(): DimensionCompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionCompatibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionCompatibility] (val x: Self) extends AnyVal {
    
    inline def setCompatibility(value: String): Self = StObject.set(x, "compatibility", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityUndefined: Self = StObject.set(x, "compatibility", js.undefined)
    
    inline def setDimensionMetadata(value: DimensionMetadata): Self = StObject.set(x, "dimensionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDimensionMetadataUndefined: Self = StObject.set(x, "dimensionMetadata", js.undefined)
  }
}
