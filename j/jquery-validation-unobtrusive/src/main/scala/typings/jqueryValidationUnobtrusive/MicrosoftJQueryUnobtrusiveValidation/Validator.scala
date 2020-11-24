package typings.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validator extends js.Object {
  
  var adapters: Adapters = js.native
  
  def parse(selector: JQuerySelector): Unit = js.native
  
  def parseElement(element: JQuerySelector): Unit = js.native
  def parseElement(element: JQuerySelector, skipAttach: Boolean): Unit = js.native
}
