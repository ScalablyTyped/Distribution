package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of one operation step.
  */
@js.native
trait SchemaStep extends js.Object {
  /**
    * The short description of the step.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The status code.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaStep {
  @scala.inline
  def apply(): SchemaStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStep]
  }
  @scala.inline
  implicit class SchemaStepOps[Self <: SchemaStep] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

