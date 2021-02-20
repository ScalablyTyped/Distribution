package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IErrorMsg
  extends IIOPubMessage[error]
     with _Message {
  
  @JSName("content")
  var content_IErrorMsg: Ename = js.native
}
object IErrorMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorMsg]
  }
  
  @scala.inline
  implicit class IErrorMsgMutableBuilder[Self <: IErrorMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Ename): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
