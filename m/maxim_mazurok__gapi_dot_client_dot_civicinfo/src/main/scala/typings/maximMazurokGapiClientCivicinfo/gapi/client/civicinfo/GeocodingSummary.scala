package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodingSummary extends StObject {
  
  /**
    * Represents the best estimate of whether or not the input address was fully understood and the address is correctly componentized. Mirrors the same-name field in
    * geostore.staging.AddressLinkupScoringProto.
    */
  var addressUnderstood: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of the FeatureProto returned by the geocoder */
  var featureId: js.UndefOr[FeatureIdProto] = js.undefined
  
  /** The feature type for the FeatureProto returned by the geocoder */
  var featureType: js.UndefOr[String] = js.undefined
  
  /** Precision of the center point (lat/long) of the geocoded FeatureProto */
  var positionPrecisionMeters: js.UndefOr[Double] = js.undefined
  
  /** The query sent to the geocoder */
  var queryString: js.UndefOr[String] = js.undefined
}
object GeocodingSummary {
  
  inline def apply(): GeocodingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocodingSummary]
  }
  
  extension [Self <: GeocodingSummary](x: Self) {
    
    inline def setAddressUnderstood(value: Boolean): Self = StObject.set(x, "addressUnderstood", value.asInstanceOf[js.Any])
    
    inline def setAddressUnderstoodUndefined: Self = StObject.set(x, "addressUnderstood", js.undefined)
    
    inline def setFeatureId(value: FeatureIdProto): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
    
    inline def setFeatureIdUndefined: Self = StObject.set(x, "featureId", js.undefined)
    
    inline def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
    
    inline def setPositionPrecisionMeters(value: Double): Self = StObject.set(x, "positionPrecisionMeters", value.asInstanceOf[js.Any])
    
    inline def setPositionPrecisionMetersUndefined: Self = StObject.set(x, "positionPrecisionMeters", js.undefined)
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
  }
}
