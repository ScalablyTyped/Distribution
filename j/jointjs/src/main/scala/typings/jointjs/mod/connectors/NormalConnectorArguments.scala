package typings.jointjs.mod.connectors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalConnectorArguments extends js.Object {
  var raw: js.UndefOr[Boolean] = js.native
}

object NormalConnectorArguments {
  @scala.inline
  def apply(): NormalConnectorArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalConnectorArguments]
  }
  @scala.inline
  implicit class NormalConnectorArgumentsOps[Self <: NormalConnectorArguments] (val x: Self) extends AnyVal {
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

