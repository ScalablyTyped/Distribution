package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReplyAbortContent
  extends _ReplyContent[js.Any] {
  
  var status: abort = js.native
}
object IReplyAbortContent {
  
  @scala.inline
  def apply(status: abort): IReplyAbortContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyAbortContent]
  }
  
  @scala.inline
  implicit class IReplyAbortContentMutableBuilder[Self <: IReplyAbortContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: abort): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
