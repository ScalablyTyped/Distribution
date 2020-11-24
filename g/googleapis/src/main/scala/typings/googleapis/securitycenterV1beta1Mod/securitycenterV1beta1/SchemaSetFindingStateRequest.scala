package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for updating a finding&#39;s state.
  */
@js.native
trait SchemaSetFindingStateRequest extends js.Object {
  
  /**
    * The time at which the updated state takes effect.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The desired State of the finding.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaSetFindingStateRequest {
  
  @scala.inline
  def apply(): SchemaSetFindingStateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetFindingStateRequest]
  }
  
  @scala.inline
  implicit class SchemaSetFindingStateRequestOps[Self <: SchemaSetFindingStateRequest] (val x: Self) extends AnyVal {
    
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
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
