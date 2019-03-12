package typings
package jqueryDotSoapLib.JQuerySOAPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponse extends js.Object {
  def toJSON(): js.Any
  def toXML(): stdLib.XMLDocument
}

object SOAPResponse {
  @scala.inline
  def apply(toJSON: () => js.Any, toString: () => java.lang.String, toXML: () => stdLib.XMLDocument): SOAPResponse = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString), toXML = js.Any.fromFunction0(toXML))
  
    __obj.asInstanceOf[SOAPResponse]
  }
}

