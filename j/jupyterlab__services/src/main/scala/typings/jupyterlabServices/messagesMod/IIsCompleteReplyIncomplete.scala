package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.incomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIsCompleteReplyIncomplete extends StObject {
  
  var indent: String = js.native
  
  var status: incomplete = js.native
}
object IIsCompleteReplyIncomplete {
  
  @scala.inline
  def apply(indent: String, status: incomplete): IIsCompleteReplyIncomplete = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyIncomplete]
  }
  
  @scala.inline
  implicit class IIsCompleteReplyIncompleteMutableBuilder[Self <: IIsCompleteReplyIncomplete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: incomplete): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
