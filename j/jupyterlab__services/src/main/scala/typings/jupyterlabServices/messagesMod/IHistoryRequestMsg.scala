package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestMsg
  extends IShellMessage[history_request]
     with _Message {
  
  @JSName("content")
  var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail = js.native
}
object IHistoryRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestMsg]
  }
  
  @scala.inline
  implicit class IHistoryRequestMsgMutableBuilder[Self <: IHistoryRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
