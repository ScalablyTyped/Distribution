package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInsufficientGpsFailureDetails extends StObject {
  
  /**
    * The number of GPS points that were found in the video.
    */
  var gpsPointsFound: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInsufficientGpsFailureDetails {
  
  inline def apply(): SchemaInsufficientGpsFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsufficientGpsFailureDetails]
  }
  
  extension [Self <: SchemaInsufficientGpsFailureDetails](x: Self) {
    
    inline def setGpsPointsFound(value: Double): Self = StObject.set(x, "gpsPointsFound", value.asInstanceOf[js.Any])
    
    inline def setGpsPointsFoundNull: Self = StObject.set(x, "gpsPointsFound", null)
    
    inline def setGpsPointsFoundUndefined: Self = StObject.set(x, "gpsPointsFound", js.undefined)
  }
}
