package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.AdminDistrict
import typings.leafletGeosearch.anon.BingProviderResultPointca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BingProviderResultRaw extends js.Object {
  
  var __type: String = js.native
  
  var address: AdminDistrict = js.native
  
  var bbox: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var confidence: String = js.native
  
  var entityType: String = js.native
  
  var geocodePoints: js.Array[BingProviderResultPointca] = js.native
  
  var matchCodes: js.Array[String] = js.native
  
  var name: String = js.native
  
  var point: BingProviderResultPoint = js.native
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
  implicit class BingProviderResultRawOps[Self <: BingProviderResultRaw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__type(value: String): Self = this.set("__type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: AdminDistrict): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidence(value: String): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocodePointsVarargs(value: BingProviderResultPointca*): Self = this.set("geocodePoints", js.Array(value :_*))
    
    @scala.inline
    def setGeocodePoints(value: js.Array[BingProviderResultPointca]): Self = this.set("geocodePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCodesVarargs(value: String*): Self = this.set("matchCodes", js.Array(value :_*))
    
    @scala.inline
    def setMatchCodes(value: js.Array[String]): Self = this.set("matchCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: BingProviderResultPoint): Self = this.set("point", value.asInstanceOf[js.Any])
  }
}
