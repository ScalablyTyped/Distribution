package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Allowstdin
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteRequestMsg
  extends IShellMessage[execute_request]
     with _Message {
  
  @JSName("content")
  var content_IExecuteRequestMsg: Allowstdin = js.native
}
object IExecuteRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteRequestMsg]
  }
  
  @scala.inline
  implicit class IExecuteRequestMsgMutableBuilder[Self <: IExecuteRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Allowstdin): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
