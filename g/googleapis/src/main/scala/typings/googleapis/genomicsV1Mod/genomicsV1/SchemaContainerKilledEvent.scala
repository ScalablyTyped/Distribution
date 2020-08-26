package typings.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container is forcibly terminated by the worker.
  * Currently, this only occurs when the container outlives the timeout
  * specified by the user.
  */
@js.native
trait SchemaContainerKilledEvent extends js.Object {
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
}

object SchemaContainerKilledEvent {
  @scala.inline
  def apply(): SchemaContainerKilledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainerKilledEvent]
  }
  @scala.inline
  implicit class SchemaContainerKilledEventOps[Self <: SchemaContainerKilledEvent] (val x: Self) extends AnyVal {
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
    def setActionId(value: Double): Self = this.set("actionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
  }
  
}

