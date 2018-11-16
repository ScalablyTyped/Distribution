package typings
package jqueryDotSoapLib.JQuerySOAPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPEnvelope extends js.Object {
  var attributes: js.Object = js.native
  var bodies: js.Array[SOAPObject] = js.native
  var headers: js.Array[SOAPObject] = js.native
  var prefix: java.lang.String = js.native
  var soapConfig: js.Any = js.native
  var typeOf: java.lang.String = js.native
  def addAttribute(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addAttribute(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def addBody(soapObject: SOAPObject): scala.Unit = js.native
  def addHeader(soapObject: SOAPObject): scala.Unit = js.native
  def addNamespace(name: java.lang.String, uri: java.lang.String): scala.Unit = js.native
  def send(options: Options): scala.Unit = js.native
}

