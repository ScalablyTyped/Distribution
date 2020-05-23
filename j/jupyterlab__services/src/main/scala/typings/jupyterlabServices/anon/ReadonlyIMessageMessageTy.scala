package typings.jupyterlabServices.anon

import typings.jupyterlabServices.messagesMod.Channel
import typings.jupyterlabServices.messagesMod.ICommInfoReply
import typings.jupyterlabServices.messagesMod.ICompleteReply
import typings.jupyterlabServices.messagesMod.IExecuteCount
import typings.jupyterlabServices.messagesMod.IExecuteReply
import typings.jupyterlabServices.messagesMod.IHeader
import typings.jupyterlabServices.messagesMod.IHistoryReply
import typings.jupyterlabServices.messagesMod.IHistoryRequestRange
import typings.jupyterlabServices.messagesMod.IHistoryRequestSearch
import typings.jupyterlabServices.messagesMod.IHistoryRequestTail
import typings.jupyterlabServices.messagesMod.IInfoReply
import typings.jupyterlabServices.messagesMod.IInputReply
import typings.jupyterlabServices.messagesMod.IInspectReply
import typings.jupyterlabServices.messagesMod.IIsCompleteReplyIncomplete
import typings.jupyterlabServices.messagesMod.IIsCompleteReplyOther
import typings.jupyterlabServices.messagesMod.MessageType
import typings.jupyterlabServices.messagesMod.ReplyContent
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
trait ReadonlyIMessageMessageTy extends js.Object {
  val buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  val channel: Channel
  val content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event
  val header: IHeader[MessageType]
  val metadata: JSONObject
  val parent_header: IHeader[MessageType] | js.Object
}

object ReadonlyIMessageMessageTy {
  @scala.inline
  def apply(
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
}

