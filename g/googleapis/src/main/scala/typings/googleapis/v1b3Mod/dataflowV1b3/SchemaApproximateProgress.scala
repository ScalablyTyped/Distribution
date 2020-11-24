package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Obsolete in favor of ApproximateReportedProgress and
  * ApproximateSplitRequest.
  */
@js.native
trait SchemaApproximateProgress extends js.Object {
  
  /**
    * Obsolete.
    */
  var percentComplete: js.UndefOr[Double] = js.native
  
  /**
    * Obsolete.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
  
  /**
    * Obsolete.
    */
  var remainingTime: js.UndefOr[String] = js.native
}
object SchemaApproximateProgress {
  
  @scala.inline
  def apply(): SchemaApproximateProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateProgress]
  }
  
  @scala.inline
  implicit class SchemaApproximateProgressOps[Self <: SchemaApproximateProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentComplete: Self = this.set("percentComplete", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRemainingTime(value: String): Self = this.set("remainingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingTime: Self = this.set("remainingTime", js.undefined)
  }
}
