package typings.jqueryDotSoap.JQuerySOAP

import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponse extends js.Object {
  def toJSON(): js.Any
  def toXML(): XMLDocument
}

object SOAPResponse {
  @scala.inline
  def apply(toJSON: () => js.Any, toXML: () => XMLDocument): SOAPResponse = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toXML = js.Any.fromFunction0(toXML))
  
    __obj.asInstanceOf[SOAPResponse]
  }
}

