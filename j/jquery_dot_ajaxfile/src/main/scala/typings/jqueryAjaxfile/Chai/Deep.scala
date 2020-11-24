package typings.jqueryAjaxfile.Chai

import typings.jqueryAjaxfile.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deep extends js.Object {
  
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: String): Assertion = js.native
  @JSName("equal")
  var equal_Original: Equal = js.native
  
  def include(value: String): Assertion = js.native
  def include(value: String, message: String): Assertion = js.native
  def include(value: Double): Assertion = js.native
  def include(value: Double, message: String): Assertion = js.native
  def include(value: Object): Assertion = js.native
  def include(value: Object, message: String): Assertion = js.native
  @JSName("include")
  var include_Original: Include = js.native
  
  def property(name: String): Assertion = js.native
  def property(name: String, value: js.UndefOr[scala.Nothing], message: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
  @JSName("property")
  var property_Original: Property = js.native
}
