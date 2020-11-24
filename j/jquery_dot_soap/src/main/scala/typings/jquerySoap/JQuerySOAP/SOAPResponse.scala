package typings.jquerySoap.JQuerySOAP

import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SOAPResponse extends js.Object {
  
  def toJSON(): js.Any = js.native
  
  def toXML(): XMLDocument = js.native
}
object SOAPResponse {
  
  @scala.inline
  def apply(toJSON: () => js.Any, toXML: () => XMLDocument): SOAPResponse = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toXML = js.Any.fromFunction0(toXML))
    __obj.asInstanceOf[SOAPResponse]
  }
  
  @scala.inline
  implicit class SOAPResponseOps[Self <: SOAPResponse] (val x: Self) extends AnyVal {
    
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
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToXML(value: () => XMLDocument): Self = this.set("toXML", js.Any.fromFunction0(value))
  }
}
