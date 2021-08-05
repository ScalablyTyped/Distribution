package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproximateProgress extends StObject {
  
  /** Obsolete. */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /** Obsolete. */
  var position: js.UndefOr[Position] = js.undefined
  
  /** Obsolete. */
  var remainingTime: js.UndefOr[String] = js.undefined
}
object ApproximateProgress {
  
  inline def apply(): ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateProgress]
  }
  
  extension [Self <: ApproximateProgress](x: Self) {
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRemainingTime(value: String): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
    
    inline def setRemainingTimeUndefined: Self = StObject.set(x, "remainingTime", js.undefined)
  }
}
