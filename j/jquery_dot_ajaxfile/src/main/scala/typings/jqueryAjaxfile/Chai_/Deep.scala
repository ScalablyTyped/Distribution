package typings.jqueryAjaxfile.Chai_

import typings.jqueryAjaxfile.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deep extends js.Object {
  @JSName("equal")
  var equal_Original: Equal = js.native
  @JSName("include")
  var include_Original: Include = js.native
  @JSName("property")
  var property_Original: Property = js.native
  def equal(value: js.Any): Assertion = js.native
  def equal(value: js.Any, message: String): Assertion = js.native
  def include(value: String): Assertion = js.native
  def include(value: String, message: String): Assertion = js.native
  def include(value: Double): Assertion = js.native
  def include(value: Double, message: String): Assertion = js.native
  def include(value: Object): Assertion = js.native
  def include(value: Object, message: String): Assertion = js.native
  def property(name: String): Assertion = js.native
  def property(name: String, value: js.Any): Assertion = js.native
  def property(name: String, value: js.Any, message: String): Assertion = js.native
}

