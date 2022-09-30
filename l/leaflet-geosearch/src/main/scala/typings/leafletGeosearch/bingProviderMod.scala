package typings.leafletGeosearch

import typings.leafletGeosearch.anon.AdminDistrict
import typings.leafletGeosearch.anon.CalculationMethod
import typings.leafletGeosearch.anon.Coordinates
import typings.leafletGeosearch.anon.EndpointArgumentjsonpstri
import typings.leafletGeosearch.anon.EstimatedTotal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingProviderMod {
  
  @JSImport("leaflet-geosearch/dist/providers/bingProvider", JSImport.Default)
  @js.native
  open class default () extends BingProvider
  
  @js.native
  trait BingProvider
    extends typings.leafletGeosearch.providerMod.default[RequestResult, RawResult] {
    
    def endpoint(hasQueryJsonp: EndpointArgumentjsonpstri): String = js.native
    
    var searchUrl: String = js.native
  }
  
  trait RawResult extends StObject {
    
    var __type: String
    
    var address: AdminDistrict
    
    var bbox: js.Tuple4[Double, Double, Double, Double]
    
    var confidence: String
    
    var entityType: String
    
    var geocodePoints: js.Array[CalculationMethod]
    
    var matchCodes: js.Array[String]
    
    var name: String
    
    var point: Coordinates
  }
  object RawResult {
    
    inline def apply(
      __type: String,
      address: AdminDistrict,
      bbox: js.Tuple4[Double, Double, Double, Double],
      confidence: String,
      entityType: String,
      geocodePoints: js.Array[CalculationMethod],
      matchCodes: js.Array[String],
      name: String,
      point: Coordinates
    ): RawResult = {
      val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], geocodePoints = geocodePoints.asInstanceOf[js.Any], matchCodes = matchCodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawResult]
    }
    
    extension [Self <: RawResult](x: Self) {
      
      inline def setAddress(value: AdminDistrict): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setConfidence(value: String): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setGeocodePoints(value: js.Array[CalculationMethod]): Self = StObject.set(x, "geocodePoints", value.asInstanceOf[js.Any])
      
      inline def setGeocodePointsVarargs(value: CalculationMethod*): Self = StObject.set(x, "geocodePoints", js.Array(value*))
      
      inline def setMatchCodes(value: js.Array[String]): Self = StObject.set(x, "matchCodes", value.asInstanceOf[js.Any])
      
      inline def setMatchCodesVarargs(value: String*): Self = StObject.set(x, "matchCodes", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Coordinates): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestResult extends StObject {
    
    var authenticationResultCode: String
    
    var brandLogoUri: String
    
    var copyright: String
    
    var resourceSets: js.Array[EstimatedTotal]
    
    var statusCode: Double
    
    var statusDescription: String
    
    var traceId: String
  }
  object RequestResult {
    
    inline def apply(
      authenticationResultCode: String,
      brandLogoUri: String,
      copyright: String,
      resourceSets: js.Array[EstimatedTotal],
      statusCode: Double,
      statusDescription: String,
      traceId: String
    ): RequestResult = {
      val __obj = js.Dynamic.literal(authenticationResultCode = authenticationResultCode.asInstanceOf[js.Any], brandLogoUri = brandLogoUri.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], resourceSets = resourceSets.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusDescription = statusDescription.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResult]
    }
    
    extension [Self <: RequestResult](x: Self) {
      
      inline def setAuthenticationResultCode(value: String): Self = StObject.set(x, "authenticationResultCode", value.asInstanceOf[js.Any])
      
      inline def setBrandLogoUri(value: String): Self = StObject.set(x, "brandLogoUri", value.asInstanceOf[js.Any])
      
      inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      inline def setResourceSets(value: js.Array[EstimatedTotal]): Self = StObject.set(x, "resourceSets", value.asInstanceOf[js.Any])
      
      inline def setResourceSetsVarargs(value: EstimatedTotal*): Self = StObject.set(x, "resourceSets", js.Array(value*))
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusDescription(value: String): Self = StObject.set(x, "statusDescription", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    }
  }
}
