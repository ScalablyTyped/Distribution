package typings
package jqueryDotSoapLib.JQuerySOAPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SOAPObject extends js.Object {
  var _parent: SOAPObject = js.native
  var attributes: js.Object = js.native
  var children: js.Array[SOAPObject] = js.native
  var name: java.lang.String = js.native
  var ns: js.Object = js.native
  var typeOf: java.lang.String = js.native
  var value: js.Any = js.native
  def addNamespace(name: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def addParameter(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addParameter(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def appendChild(soapObject: SOAPObject): SOAPObject = js.native
  def attr(name: java.lang.String, value: java.lang.String): js.Object = js.native
  def attr(name: java.lang.String, value: scala.Double): js.Object = js.native
  def end(): SOAPObject = js.native
  def find(name: java.lang.String): SOAPObject = js.native
  def hasChildren(): scala.Boolean = js.native
  def newChild(name: java.lang.String): SOAPObject = js.native
  def parent(): SOAPObject = js.native
  def `val`(value: java.lang.String): SOAPObject = js.native
  def `val`(value: scala.Double): SOAPObject = js.native
}

