package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessChainTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of the business chain, e.g. "KFC", "Chase Bank". */
  var businessChain: js.UndefOr[String] = js.undefined
  
  /** Output only. The display name of the geographic region, e.g. "Ontario, Canada". */
  var geoRegion: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of the geographic region. */
  var geoRegionType: js.UndefOr[String] = js.undefined
}
object BusinessChainTargetingOptionDetails {
  
  inline def apply(): BusinessChainTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessChainTargetingOptionDetails]
  }
  
  extension [Self <: BusinessChainTargetingOptionDetails](x: Self) {
    
    inline def setBusinessChain(value: String): Self = StObject.set(x, "businessChain", value.asInstanceOf[js.Any])
    
    inline def setBusinessChainUndefined: Self = StObject.set(x, "businessChain", js.undefined)
    
    inline def setGeoRegion(value: String): Self = StObject.set(x, "geoRegion", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionType(value: String): Self = StObject.set(x, "geoRegionType", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionTypeUndefined: Self = StObject.set(x, "geoRegionType", js.undefined)
    
    inline def setGeoRegionUndefined: Self = StObject.set(x, "geoRegion", js.undefined)
  }
}
