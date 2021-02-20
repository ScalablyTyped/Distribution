package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDebugReplyMsg
  extends IControlMessage[debug_reply]
     with _Message {
  
  @JSName("content")
  var content_IDebugReplyMsg: Body = js.native
}
object IDebugReplyMsg {
  
  @scala.inline
  def apply(
    channel: control,
    content: Body,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugReplyMsg]
  }
  
  @scala.inline
  implicit class IDebugReplyMsgMutableBuilder[Self <: IDebugReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Body): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
