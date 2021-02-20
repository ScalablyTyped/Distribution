package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Wait
import typings.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClearOutputMsg
  extends IIOPubMessage[clear_output]
     with _Message {
  
  @JSName("content")
  var content_IClearOutputMsg: Wait = js.native
}
object IClearOutputMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearOutputMsg]
  }
  
  @scala.inline
  implicit class IClearOutputMsgMutableBuilder[Self <: IClearOutputMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Wait): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
