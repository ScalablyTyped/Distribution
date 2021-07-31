package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.AdminDistrict
import typings.leafletGeosearch.anon.BingProviderResultPointca
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BingProviderResultRaw extends StObject {
  
  var __type: String
  
  var address: AdminDistrict
  
  var bbox: js.Tuple4[Double, Double, Double, Double]
  
  var confidence: String
  
  var entityType: String
  
  var geocodePoints: js.Array[BingProviderResultPointca]
  
  var matchCodes: js.Array[String]
  
  var name: String
  
  var point: BingProviderResultPoint
}
object BingProviderResultRaw {
  
  @scala.inline
  def apply(
    __type: String,
    address: AdminDistrict,
    bbox: js.Tuple4[Double, Double, Double, Double],
    confidence: String,
    entityType: String,
    geocodePoints: js.Array[BingProviderResultPointca],
    matchCodes: js.Array[String],
    name: String,
    point: BingProviderResultPoint
  ): BingProviderResultRaw = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], geocodePoints = geocodePoints.asInstanceOf[js.Any], matchCodes = matchCodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderResultRaw]
  }
  
  @scala.inline
  implicit class BingProviderResultRawMutableBuilder[Self <: BingProviderResultRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: AdminDistrict): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: String): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocodePoints(value: js.Array[BingProviderResultPointca]): Self = StObject.set(x, "geocodePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocodePointsVarargs(value: BingProviderResultPointca*): Self = StObject.set(x, "geocodePoints", js.Array(value :_*))
    
    @scala.inline
    def setMatchCodes(value: js.Array[String]): Self = StObject.set(x, "matchCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCodesVarargs(value: String*): Self = StObject.set(x, "matchCodes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: BingProviderResultPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
