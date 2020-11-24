package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OperationMetadata provides information about the operation execution.
  * Returned in the long-running operation&#39;s metadata field.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  
  /**
    * The name of the API method that initiated the operation.
    */
  var apiMethodName: js.UndefOr[String] = js.native
  
  var counter: js.UndefOr[SchemaProgressCounter] = js.native
  
  /**
    * The time at which the operation was created by the API.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which execution was completed.
    */
  var endTime: js.UndefOr[String] = js.native
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setApiMethodName(value: String): Self = this.set("apiMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMethodName: Self = this.set("apiMethodName", js.undefined)
    
    @scala.inline
    def setCounter(value: SchemaProgressCounter): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
  }
}
