package typings.jquerySoap

import typings.jquery.JQueryXHR
import typings.jquerySoap.JQuerySOAP.Options
import typings.jquerySoap.JQuerySOAP.SOAP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def soap(): JQueryXHR = js.native
  def soap(options: Options): JQueryXHR = js.native
  @JSName("soap")
  var soap_Original: SOAP = js.native
}
