package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCondition describes why a cluster or a node pool has a certain status
  * (e.g., ERROR or DEGRADED).
  */
@js.native
trait SchemaStatusCondition extends js.Object {
  /**
    * Machine-friendly representation of the condition
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaStatusCondition {
  @scala.inline
  def apply(): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatusCondition]
  }
  @scala.inline
  implicit class SchemaStatusConditionOps[Self <: SchemaStatusCondition] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

