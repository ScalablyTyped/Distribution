package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Obsolete in favor of ApproximateReportedProgress and
  * ApproximateSplitRequest.
  */
trait SchemaApproximateProgress extends StObject {
  
  /**
    * Obsolete.
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /**
    * Obsolete.
    */
  var position: js.UndefOr[SchemaPosition] = js.undefined
  
  /**
    * Obsolete.
    */
  var remainingTime: js.UndefOr[String] = js.undefined
}
object SchemaApproximateProgress {
  
  inline def apply(): SchemaApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateProgress]
  }
  
  extension [Self <: SchemaApproximateProgress](x: Self) {
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRemainingTime(value: String): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
    
    inline def setRemainingTimeUndefined: Self = StObject.set(x, "remainingTime", js.undefined)
  }
}
