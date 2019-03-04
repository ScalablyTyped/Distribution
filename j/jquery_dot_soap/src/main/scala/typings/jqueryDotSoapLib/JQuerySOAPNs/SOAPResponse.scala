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
  def apply(
    toJSON: js.Function0[js.Any],
    toString: js.Function0[java.lang.String],
    toXML: js.Function0[stdLib.XMLDocument]
  ): SOAPResponse = {
    val __obj = js.Dynamic.literal(toJSON = toJSON, toString = toString, toXML = toXML)
  
    __obj.asInstanceOf[SOAPResponse]
  }
}

