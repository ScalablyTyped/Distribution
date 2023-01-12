package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.source_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapSourceDataEvent
  extends StObject
     with MapLibreEvent[scala.Unit] {
  
  var dataType: source_
  
  var isSourceLoaded: Boolean
  
  var source: SourceSpecification
  
  var sourceDataType: MapSourceDataType
  
  var sourceId: String
  
  var tile: Any
}
object MapSourceDataEvent {
  
  inline def apply(
    isSourceLoaded: Boolean,
    originalEvent: scala.Unit,
    source: SourceSpecification,
    sourceDataType: MapSourceDataType,
    sourceId: String,
    target: Map,
    tile: Any,
    `type`: String
  ): MapSourceDataEvent = {
    val __obj = js.Dynamic.literal(dataType = "source", isSourceLoaded = isSourceLoaded.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDataType = sourceDataType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapSourceDataEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapSourceDataEvent] (val x: Self) extends AnyVal {
    
    inline def setDataType(value: source_): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setIsSourceLoaded(value: Boolean): Self = StObject.set(x, "isSourceLoaded", value.asInstanceOf[js.Any])
    
    inline def setSource(value: SourceSpecification): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDataType(value: MapSourceDataType): Self = StObject.set(x, "sourceDataType", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTile(value: Any): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
