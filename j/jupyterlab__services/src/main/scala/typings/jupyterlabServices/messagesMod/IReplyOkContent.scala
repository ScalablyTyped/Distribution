package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReplyOkContent extends StObject {
  
  var status: ok = js.native
}
object IReplyOkContent {
  
  @scala.inline
  def apply(status: ok): IReplyOkContent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReplyOkContent]
  }
  
  @scala.inline
  implicit class IReplyOkContentMutableBuilder[Self <: IReplyOkContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ok): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
