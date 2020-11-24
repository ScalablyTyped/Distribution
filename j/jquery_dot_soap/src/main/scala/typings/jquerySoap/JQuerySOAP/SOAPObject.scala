package typings.jquerySoap.JQuerySOAP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SOAPObject extends js.Object {
  
  var _parent: SOAPObject = js.native
  
  def addNamespace(name: String, url: String): Unit = js.native
  
  def addParameter(name: String, value: String): Unit = js.native
  def addParameter(name: String, value: Double): Unit = js.native
  
  def appendChild(soapObject: SOAPObject): SOAPObject = js.native
  
  def attr(name: String, value: String): js.Object = js.native
  def attr(name: String, value: Double): js.Object = js.native
  
  var attributes: js.Object = js.native
  
  var children: js.Array[SOAPObject] = js.native
  
  def end(): SOAPObject = js.native
  
  def find(name: String): SOAPObject = js.native
  
  def hasChildren(): Boolean = js.native
  
  var name: String = js.native
  
  def newChild(name: String): SOAPObject = js.native
  
  var ns: js.Object = js.native
  
  def parent(): SOAPObject = js.native
  
  var typeOf: String = js.native
  
  def `val`(value: String): SOAPObject = js.native
  def `val`(value: Double): SOAPObject = js.native
  
  var value: js.Any = js.native
}
