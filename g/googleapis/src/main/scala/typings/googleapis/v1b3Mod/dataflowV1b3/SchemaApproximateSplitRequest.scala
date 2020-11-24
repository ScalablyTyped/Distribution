package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A suggestion by the service to the worker to dynamically split the
  * WorkItem.
  */
@js.native
trait SchemaApproximateSplitRequest extends js.Object {
  
  /**
    * A fraction at which to split the work item, from 0.0 (beginning of the
    * input) to 1.0 (end of the input).
    */
  var fractionConsumed: js.UndefOr[Double] = js.native
  
  /**
    * The fraction of the remainder of work to split the work item at, from 0.0
    * (split at the current position) to 1.0 (end of the input).
    */
  var fractionOfRemainder: js.UndefOr[Double] = js.native
  
  /**
    * A Position at which to split the work item.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}
object SchemaApproximateSplitRequest {
  
  @scala.inline
  def apply(): SchemaApproximateSplitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproximateSplitRequest]
  }
  
  @scala.inline
  implicit class SchemaApproximateSplitRequestOps[Self <: SchemaApproximateSplitRequest] (val x: Self) extends AnyVal {
    
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
    def setFractionConsumed(value: Double): Self = this.set("fractionConsumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractionConsumed: Self = this.set("fractionConsumed", js.undefined)
    
    @scala.inline
    def setFractionOfRemainder(value: Double): Self = this.set("fractionOfRemainder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFractionOfRemainder: Self = this.set("fractionOfRemainder", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
