package typings.jupyterlabServices.messagesMod

import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions[T /* <: Message */] extends StObject {
  
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
  implicit class IOptionsMutableBuilder[Self <: IOptions[_], T /* <: Message */] (val x: Self with IOptions[T]) extends AnyVal {
    
    @scala.inline
    def setBuffers(value: js.Array[ArrayBuffer | ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    @scala.inline
    def setBuffersVarargs(value: (ArrayBuffer | ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgIdUndefined: Self = StObject.set(x, "msgId", js.undefined)
    
    @scala.inline
    def setMsgType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
    ): Self = StObject.set(x, "msgType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHeader(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
    ): Self = StObject.set(x, "parentHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentHeaderUndefined: Self = StObject.set(x, "parentHeader", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
