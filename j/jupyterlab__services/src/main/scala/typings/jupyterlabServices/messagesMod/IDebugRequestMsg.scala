package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Arguments
import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDebugRequestMsg
  extends IControlMessage[debug_request]
     with _Message {
  
  @JSName("content")
  var content_IDebugRequestMsg: Arguments = js.native
}
object IDebugRequestMsg {
  
  @scala.inline
  def apply(
    channel: control,
    content: Arguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
  
  @scala.inline
  implicit class IDebugRequestMsgMutableBuilder[Self <: IDebugRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Arguments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
