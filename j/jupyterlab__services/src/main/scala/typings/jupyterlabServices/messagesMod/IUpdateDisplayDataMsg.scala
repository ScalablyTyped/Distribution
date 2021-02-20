package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.anon.TransientDisplayidString
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUpdateDisplayDataMsg
  extends IIOPubMessage[update_display_data]
     with _Message {
  
  @JSName("content")
  var content_IUpdateDisplayDataMsg: Metadata with TransientDisplayidString = js.native
}
object IUpdateDisplayDataMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Metadata with TransientDisplayidString,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDisplayDataMsg]
  }
  
  @scala.inline
  implicit class IUpdateDisplayDataMsgMutableBuilder[Self <: IUpdateDisplayDataMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Metadata with TransientDisplayidString): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
