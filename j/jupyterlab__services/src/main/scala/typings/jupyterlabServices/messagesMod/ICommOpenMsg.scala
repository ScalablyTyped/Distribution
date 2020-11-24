package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Data
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommOpenMsg[T /* <: shell | iopub */] extends IMessage[comm_open] {
  
  @JSName("channel")
  var channel_ICommOpenMsg: T = js.native
  
  @JSName("content")
  var content_ICommOpenMsg: Data = js.native
}
object ICommOpenMsg {
  
  @scala.inline
  def apply[T /* <: shell | iopub */](
    channel: T,
    content: Data,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
  
  @scala.inline
  implicit class ICommOpenMsgOps[Self <: ICommOpenMsg[_], T /* <: shell | iopub */] (val x: Self with ICommOpenMsg[T]) extends AnyVal {
    
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
    def setChannel(value: T): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Data): Self = this.set("content", value.asInstanceOf[js.Any])
  }
}
