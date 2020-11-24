package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ProgressCounter provides counters to describe an operation&#39;s progress.
  */
@js.native
trait SchemaProgressCounter extends js.Object {
  
  /**
    * The number of units that failed in the operation.
    */
  var failure: js.UndefOr[String] = js.native
  
  /**
    * The number of units that are pending in the operation.
    */
  var pending: js.UndefOr[String] = js.native
  
  /**
    * The number of units that succeeded in the operation.
    */
  var success: js.UndefOr[String] = js.native
}
object SchemaProgressCounter {
  
  @scala.inline
  def apply(): SchemaProgressCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProgressCounter]
  }
  
  @scala.inline
  implicit class SchemaProgressCounterOps[Self <: SchemaProgressCounter] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: String): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setPending(value: String): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePending: Self = this.set("pending", js.undefined)
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
