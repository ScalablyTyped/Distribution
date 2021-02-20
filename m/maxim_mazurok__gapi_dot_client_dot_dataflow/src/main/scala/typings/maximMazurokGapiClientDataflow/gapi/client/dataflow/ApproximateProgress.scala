package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApproximateProgress extends StObject {
  
  /** Obsolete. */
  var percentComplete: js.UndefOr[Double] = js.native
  
  /** Obsolete. */
  var position: js.UndefOr[Position] = js.native
  
  /** Obsolete. */
  var remainingTime: js.UndefOr[String] = js.native
}
object ApproximateProgress {
  
  @scala.inline
  def apply(): ApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApproximateProgress]
  }
  
  @scala.inline
  implicit class ApproximateProgressMutableBuilder[Self <: ApproximateProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRemainingTime(value: String): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingTimeUndefined: Self = StObject.set(x, "remainingTime", js.undefined)
  }
}
