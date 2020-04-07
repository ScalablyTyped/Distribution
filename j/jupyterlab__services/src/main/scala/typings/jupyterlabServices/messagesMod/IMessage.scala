package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonAllowstdin
import typings.jupyterlabServices.AnonArguments
import typings.jupyterlabServices.AnonBody
import typings.jupyterlabServices.AnonCode
import typings.jupyterlabServices.AnonCodeString
import typings.jupyterlabServices.AnonCommid
import typings.jupyterlabServices.AnonCursorpos
import typings.jupyterlabServices.AnonData
import typings.jupyterlabServices.AnonEname
import typings.jupyterlabServices.AnonEvent
import typings.jupyterlabServices.AnonExecutioncount
import typings.jupyterlabServices.AnonExecutionstate
import typings.jupyterlabServices.AnonMetadata
import typings.jupyterlabServices.AnonName
import typings.jupyterlabServices.AnonPassword
import typings.jupyterlabServices.AnonTargetname
import typings.jupyterlabServices.AnonTransient
import typings.jupyterlabServices.AnonTransientAnonDisplayidString
import typings.jupyterlabServices.AnonWait
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage[MSGTYPE /* <: MessageType */] extends js.Object {
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel
  /**
    * The content of the message.
    */
  var content: AnonWait | AnonCommid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | AnonTargetname | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE]
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object
}

object IMessage {
  @scala.inline
  def apply[MSGTYPE /* <: MessageType */](
    channel: Channel,
    content: AnonWait | AnonCommid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | AnonTargetname | AnonData | AnonCode | AnonMetadata | AnonEname | AnonExecutioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | AnonAllowstdin | AnonTransient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | AnonPassword | AnonCursorpos | AnonCodeString | AnonExecutionstate | AnonName | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with AnonTransientAnonDisplayidString) | AnonArguments | AnonBody | AnonEvent,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
}

