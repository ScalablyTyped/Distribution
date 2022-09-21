package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotOutdoorsFailureDetails extends StObject {
  
  /**
    * Relative time (from the start of the video stream) when an indoor frame was found.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotOutdoorsFailureDetails {
  
  inline def apply(): SchemaNotOutdoorsFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotOutdoorsFailureDetails]
  }
  
  extension [Self <: SchemaNotOutdoorsFailureDetails](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
