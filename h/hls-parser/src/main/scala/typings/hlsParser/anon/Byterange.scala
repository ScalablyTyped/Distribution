package typings.hlsParser.anon

import typings.hlsParser.mod.types.DateRange
import typings.hlsParser.mod.types.Key
import typings.hlsParser.mod.types.MediaInitializationSection
import typings.hlsParser.mod.types.PartialSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Byterange extends StObject {
  
  var byterange: js.UndefOr[typings.hlsParser.mod.Byterange] = js.undefined
  
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  var discontinuity: js.UndefOr[Boolean] = js.undefined
  
  var discontinuitySequence: Double
  
  var duration: Double
  
  var key: js.UndefOr[Key] = js.undefined
  
  var map: js.UndefOr[MediaInitializationSection] = js.undefined
  
  var mediaSequenceNumber: Double
  
  var parts: js.UndefOr[js.Array[PartialSegment]] = js.undefined
  
  var programDateTime: js.UndefOr[js.Date] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var uri: String
}
object Byterange {
  
  inline def apply(discontinuitySequence: Double, duration: Double, mediaSequenceNumber: Double, uri: String): Byterange = {
    val __obj = js.Dynamic.literal(discontinuitySequence = discontinuitySequence.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], mediaSequenceNumber = mediaSequenceNumber.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Byterange]
  }
  
  extension [Self <: Byterange](x: Self) {
    
    inline def setByterange(value: typings.hlsParser.mod.Byterange): Self = StObject.set(x, "byterange", value.asInstanceOf[js.Any])
    
    inline def setByterangeUndefined: Self = StObject.set(x, "byterange", js.undefined)
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDiscontinuity(value: Boolean): Self = StObject.set(x, "discontinuity", value.asInstanceOf[js.Any])
    
    inline def setDiscontinuitySequence(value: Double): Self = StObject.set(x, "discontinuitySequence", value.asInstanceOf[js.Any])
    
    inline def setDiscontinuityUndefined: Self = StObject.set(x, "discontinuity", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMap(value: MediaInitializationSection): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMediaSequenceNumber(value: Double): Self = StObject.set(x, "mediaSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setParts(value: js.Array[PartialSegment]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: PartialSegment*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setProgramDateTime(value: js.Date): Self = StObject.set(x, "programDateTime", value.asInstanceOf[js.Any])
    
    inline def setProgramDateTimeUndefined: Self = StObject.set(x, "programDateTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
