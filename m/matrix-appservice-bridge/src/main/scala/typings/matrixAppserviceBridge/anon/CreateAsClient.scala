package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.mod.CreateRoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAsClient extends js.Object {
  var createAsClient: Boolean = js.native
  var options: CreateRoomOptions = js.native
}

object CreateAsClient {
  @scala.inline
  def apply(createAsClient: Boolean, options: CreateRoomOptions): CreateAsClient = {
    val __obj = js.Dynamic.literal(createAsClient = createAsClient.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAsClient]
  }
  @scala.inline
  implicit class CreateAsClientOps[Self <: CreateAsClient] (val x: Self) extends AnyVal {
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
    def setCreateAsClient(value: Boolean): Self = this.set("createAsClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: CreateRoomOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

