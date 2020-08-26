package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DomainMappingCondition contains state information for a DomainMapping.
  */
@js.native
trait SchemaDomainMappingCondition extends js.Object {
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.native
  /**
    * One-word CamelCase reason for the condition&#39;s current status.
    * +optional
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Type of domain mapping condition.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDomainMappingCondition {
  @scala.inline
  def apply(): SchemaDomainMappingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingCondition]
  }
  @scala.inline
  implicit class SchemaDomainMappingConditionOps[Self <: SchemaDomainMappingCondition] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

