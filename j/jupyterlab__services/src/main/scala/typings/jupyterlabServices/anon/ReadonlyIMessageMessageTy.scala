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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
@js.native
trait ReadonlyIMessageMessageTy extends js.Object {
  
  val buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.native
  
  val channel: Channel = js.native
  
  val content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event = js.native
  
  val header: IHeader[MessageType] = js.native
  
  val metadata: JSONObject = js.native
  
  val parent_header: IHeader[MessageType] | js.Object = js.native
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
    parent_header: IHeader[MessageType] | js.Object
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
  
  @scala.inline
  implicit class ReadonlyIMessageMessageTyOps[Self <: ReadonlyIMessageMessageTy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader[MessageType]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[MessageType] | js.Object): Self = this.set("parent_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersVarargs(value: (ArrayBuffer | ArrayBufferView)*): Self = this.set("buffers", js.Array(value :_*))
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBuffer | ArrayBufferView]): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffers: Self = this.set("buffers", js.undefined)
  }
}
