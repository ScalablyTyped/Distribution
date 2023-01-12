package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapDataEvent extends StObject {
  
  var dataType: String
  
  var sourceDataType: MapSourceDataType
  
  var `type`: String
}
object MapDataEvent {
  
  inline def apply(dataType: String, sourceDataType: MapSourceDataType, `type`: String): MapDataEvent = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], sourceDataType = sourceDataType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapDataEvent] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setSourceDataType(value: MapSourceDataType): Self = StObject.set(x, "sourceDataType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
