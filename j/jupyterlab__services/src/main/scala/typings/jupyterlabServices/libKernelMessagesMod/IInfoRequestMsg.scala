package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Allowstdin
import typings.jupyterlabServices.anon.Arguments
import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.anon.Code
import typings.jupyterlabServices.anon.CodeString
import typings.jupyterlabServices.anon.Commid
import typings.jupyterlabServices.anon.Cursorpos
import typings.jupyterlabServices.anon.Data
import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.anon.Event
import typings.jupyterlabServices.anon.Executioncount
import typings.jupyterlabServices.anon.Executionstate
import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.anon.Name
import typings.jupyterlabServices.anon.Password
import typings.jupyterlabServices.anon.Targetname
import typings.jupyterlabServices.anon.Transient
import typings.jupyterlabServices.anon.TransientDisplayidString
import typings.jupyterlabServices.anon.Wait
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInfoRequestMsg
  extends StObject
     with IShellMessage[kernel_info_request]
     with _Message
object IInfoRequestMsg {
  
  inline def apply(
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] & IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) & TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[kernel_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoRequestMsg]
  }
}
