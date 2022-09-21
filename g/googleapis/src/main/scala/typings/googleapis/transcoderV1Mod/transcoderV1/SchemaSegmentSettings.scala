package typings.googleapis.transcoderV1Mod.transcoderV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSegmentSettings extends StObject {
  
  /**
    * Required. Create an individual segment file. The default is `false`.
    */
  var individualSegments: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Duration of the segments in seconds. The default is `6.0s`. Note that `segmentDuration` must be greater than or equal to [`gopDuration`](#videostream), and `segmentDuration` must be divisible by [`gopDuration`](#videostream).
    */
  var segmentDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaSegmentSettings {
  
  inline def apply(): SchemaSegmentSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegmentSettings]
  }
  
  extension [Self <: SchemaSegmentSettings](x: Self) {
    
    inline def setIndividualSegments(value: Boolean): Self = StObject.set(x, "individualSegments", value.asInstanceOf[js.Any])
    
    inline def setIndividualSegmentsNull: Self = StObject.set(x, "individualSegments", null)
    
    inline def setIndividualSegmentsUndefined: Self = StObject.set(x, "individualSegments", js.undefined)
    
    inline def setSegmentDuration(value: String): Self = StObject.set(x, "segmentDuration", value.asInstanceOf[js.Any])
    
    inline def setSegmentDurationNull: Self = StObject.set(x, "segmentDuration", null)
    
    inline def setSegmentDurationUndefined: Self = StObject.set(x, "segmentDuration", js.undefined)
  }
}
