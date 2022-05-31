package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReplyAbortContent
  extends StObject
     with _ReplyContent[js.Any] {
  
  var status: abort
}
object IReplyAbortContent {
  
  inline def apply(): IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = "abort")
    __obj.asInstanceOf[IReplyAbortContent]
  }
  
  extension [Self <: IReplyAbortContent](x: Self) {
    
    inline def setStatus(value: abort): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
