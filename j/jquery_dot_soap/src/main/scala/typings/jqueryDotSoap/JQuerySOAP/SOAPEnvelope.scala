package typings.jqueryDotSoap.JQuerySOAP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPEnvelope extends js.Object {
  var attributes: js.Object = js.native
  var bodies: js.Array[SOAPObject] = js.native
  var headers: js.Array[SOAPObject] = js.native
  var prefix: String = js.native
  var soapConfig: js.Any = js.native
  var typeOf: String = js.native
  def addAttribute(name: String, value: String): Unit = js.native
  def addAttribute(name: String, value: Double): Unit = js.native
  def addBody(soapObject: SOAPObject): Unit = js.native
  def addHeader(soapObject: SOAPObject): Unit = js.native
  def addNamespace(name: String, uri: String): Unit = js.native
  def send(options: Options): Unit = js.native
}

