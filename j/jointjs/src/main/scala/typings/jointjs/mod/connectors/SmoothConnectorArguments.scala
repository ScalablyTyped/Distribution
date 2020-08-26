package typings.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmoothConnectorArguments extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
}

object SmoothConnectorArguments {
  @scala.inline
  def apply(): SmoothConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmoothConnectorArguments]
  }
  @scala.inline
  implicit class SmoothConnectorArgumentsOps[Self <: SmoothConnectorArguments] (val x: Self) extends AnyVal {
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

