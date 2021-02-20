package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.complete
import typings.jupyterlabServices.jupyterlabServicesStrings.invalid
import typings.jupyterlabServices.jupyterlabServicesStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIsCompleteReplyOther extends StObject {
  
  var status: complete | invalid | unknown = js.native
}
object IIsCompleteReplyOther {
  
  @scala.inline
  def apply(status: complete | invalid | unknown): IIsCompleteReplyOther = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyOther]
  }
  
  @scala.inline
  implicit class IIsCompleteReplyOtherMutableBuilder[Self <: IIsCompleteReplyOther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: complete | invalid | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
