package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEndOfSegmentLocation extends StObject {
  
  /**
    * The ID of the header, footer or footnote the location is in. An empty segment ID signifies the document's body.
    */
  var segmentId: js.UndefOr[String | Null] = js.undefined
}
object SchemaEndOfSegmentLocation {
  
  inline def apply(): SchemaEndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndOfSegmentLocation]
  }
  
  extension [Self <: SchemaEndOfSegmentLocation](x: Self) {
    
    inline def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdNull: Self = StObject.set(x, "segmentId", null)
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
