package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Targetname
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommInfoRequestMsg
  extends IShellMessage[comm_info_request]
     with _Message {
  
  @JSName("content")
  var content_ICommInfoRequestMsg: Targetname = js.native
}
object ICommInfoRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: Targetname,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoRequestMsg]
  }
  
  @scala.inline
  implicit class ICommInfoRequestMsgMutableBuilder[Self <: ICommInfoRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Targetname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
