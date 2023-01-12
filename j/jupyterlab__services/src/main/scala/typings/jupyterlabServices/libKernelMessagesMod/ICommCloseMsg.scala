package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Commid
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_close
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommCloseMsg[T /* <: iopub | shell */]
  extends StObject
     with IMessage[comm_close] {
  
  @JSName("channel")
  var channel_ICommCloseMsg: T
  
  @JSName("content")
  var content_ICommCloseMsg: Commid
}
object ICommCloseMsg {
  
  inline def apply[T /* <: iopub | shell */](
    channel: T,
    content: Commid,
    header: IHeader[comm_close],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommCloseMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommCloseMsg[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommCloseMsg[?], T /* <: iopub | shell */] (val x: Self & ICommCloseMsg[T]) extends AnyVal {
    
    inline def setChannel(value: T): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Commid): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
