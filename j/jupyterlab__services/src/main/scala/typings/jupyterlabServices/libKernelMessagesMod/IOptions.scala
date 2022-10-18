package typings.jupyterlabServices.libKernelMessagesMod

import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOptions[T /* <: Message */] extends StObject {
  
  var buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.undefined
  
  var channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any
  
  var content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any
  
  var metadata: js.UndefOr[JSONObject] = js.undefined
  
  var msgId: js.UndefOr[String] = js.undefined
  
  var msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
  
  var parentHeader: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
  ] = js.undefined
  
  var session: String
  
  var username: js.UndefOr[String] = js.undefined
}
object IOptions {
  
  inline def apply[T /* <: Message */](
    channel: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any,
    content: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any,
    msgType: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any,
    session: String
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], msgType = msgType.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
  
  extension [Self <: IOptions[?], T /* <: Message */](x: Self & IOptions[T]) {
    
    inline def setBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    inline def setBuffersVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value*))
    
    inline def setChannel(value: /* import warning: importer.ImportType#apply Failed type conversion: T['channel'] */ js.Any): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(value: /* import warning: importer.ImportType#apply Failed type conversion: T['content'] */ js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
    
    inline def setMsgIdUndefined: Self = StObject.set(x, "msgId", js.undefined)
    
    inline def setMsgType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['header']['msg_type'] */ js.Any
    ): Self = StObject.set(x, "msgType", value.asInstanceOf[js.Any])
    
    inline def setParentHeader(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T['parent_header'] */ js.Any
    ): Self = StObject.set(x, "parentHeader", value.asInstanceOf[js.Any])
    
    inline def setParentHeaderUndefined: Self = StObject.set(x, "parentHeader", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
