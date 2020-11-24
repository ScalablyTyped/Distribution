package typings.jupyterlabServices.messagesMod

import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions[T /* <: Message */] extends js.Object {
  
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.native
  
  var channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any = js.native
  
  var content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any = js.native
  
  var metadata: js.UndefOr[JSONObject] = js.native
  
  var msgId: js.UndefOr[String] = js.native
  
  var msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any = js.native
  
  var parentHeader: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
  ] = js.native
  
  var session: String = js.native
  
  var username: js.UndefOr[String] = js.native
}
object IOptions {
  
  @scala.inline
  def apply[T /* <: Message */](
    channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any,
    content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any,
    msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any,
    session: String
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], msgType = msgType.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions[_], T /* <: Message */] (val x: Self with IOptions[T]) extends AnyVal {
    
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
    def setChannel(value: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
    ): Self = this.set("msgType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersVarargs(value: (ArrayBuffer | ArrayBufferView)*): Self = this.set("buffers", js.Array(value :_*))
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBuffer | ArrayBufferView]): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffers: Self = this.set("buffers", js.undefined)
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMsgId(value: String): Self = this.set("msgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMsgId: Self = this.set("msgId", js.undefined)
    
    @scala.inline
    def setParentHeader(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
    ): Self = this.set("parentHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentHeader: Self = this.set("parentHeader", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
