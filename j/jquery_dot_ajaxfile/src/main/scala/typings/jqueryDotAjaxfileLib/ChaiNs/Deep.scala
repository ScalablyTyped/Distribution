package typings
package jqueryDotAjaxfileLib.ChaiNs

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
  def equal(value: js.Any, message: java.lang.String): Assertion = js.native
  def include(value: java.lang.String): Assertion = js.native
  def include(value: java.lang.String, message: java.lang.String): Assertion = js.native
  def include(value: jqueryDotAjaxfileLib.Object): Assertion = js.native
  def include(value: jqueryDotAjaxfileLib.Object, message: java.lang.String): Assertion = js.native
  def include(value: scala.Double): Assertion = js.native
  def include(value: scala.Double, message: java.lang.String): Assertion = js.native
  def property(name: java.lang.String): Assertion = js.native
  def property(name: java.lang.String, value: js.Any): Assertion = js.native
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): Assertion = js.native
}

