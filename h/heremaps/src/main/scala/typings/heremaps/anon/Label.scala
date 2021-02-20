package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  var label: String = js.native
  
  var linkId: String = js.native
  
  var mappedPosition: Latitude = js.native
  
  var mappedRoadName: String = js.native
  
  var originalPosition: Latitude = js.native
  
  var shapeIndex: Double = js.native
  
  var sideOfStreet: String = js.native
  
  var spot: Double = js.native
  
  var `type`: String = js.native
}
object Label {
  
  @scala.inline
  def apply(
    label: String,
    linkId: String,
    mappedPosition: Latitude,
    mappedRoadName: String,
    originalPosition: Latitude,
    shapeIndex: Double,
    sideOfStreet: String,
    spot: Double,
    `type`: String
  ): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], mappedPosition = mappedPosition.asInstanceOf[js.Any], mappedRoadName = mappedRoadName.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], shapeIndex = shapeIndex.asInstanceOf[js.Any], sideOfStreet = sideOfStreet.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappedPosition(value: Latitude): Self = StObject.set(x, "mappedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappedRoadName(value: String): Self = StObject.set(x, "mappedRoadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPosition(value: Latitude): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeIndex(value: Double): Self = StObject.set(x, "shapeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOfStreet(value: String): Self = StObject.set(x, "sideOfStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpot(value: Double): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
