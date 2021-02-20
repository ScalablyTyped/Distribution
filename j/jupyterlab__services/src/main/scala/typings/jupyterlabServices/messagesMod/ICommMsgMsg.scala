package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Commid
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_msg
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
  
  @JSName("channel")
  var channel_ICommMsgMsg: T = js.native
  
  @JSName("content")
  var content_ICommMsgMsg: Commid = js.native
}
object ICommMsgMsg {
  
  @scala.inline
  def apply[T /* <: iopub | shell */](
    channel: T,
    content: Commid,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
  
  @scala.inline
  implicit class ICommMsgMsgMutableBuilder[Self <: ICommMsgMsg[_], T /* <: iopub | shell */] (val x: Self with ICommMsgMsg[T]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: T): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Commid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
