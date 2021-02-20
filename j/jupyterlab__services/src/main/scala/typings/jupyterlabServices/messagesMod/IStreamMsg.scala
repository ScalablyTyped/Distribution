package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Name
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.stream
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStreamMsg
  extends IIOPubMessage[stream]
     with _Message {
  
  @JSName("content")
  var content_IStreamMsg: Name = js.native
}
object IStreamMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Name,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStreamMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamMsg]
  }
  
  @scala.inline
  implicit class IStreamMsgMutableBuilder[Self <: IStreamMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Name): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
