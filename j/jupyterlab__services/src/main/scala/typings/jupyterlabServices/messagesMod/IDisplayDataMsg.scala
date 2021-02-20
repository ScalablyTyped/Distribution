package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.jupyterlabServicesStrings.display_data
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisplayDataMsg
  extends IIOPubMessage[display_data]
     with _Message {
  
  @JSName("content")
  var content_IDisplayDataMsg: Metadata = js.native
}
object IDisplayDataMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayDataMsg]
  }
  
  @scala.inline
  implicit class IDisplayDataMsgMutableBuilder[Self <: IDisplayDataMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Metadata): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
