package typings.jshamcrest.JsHamcrest

import typings.jshamcrest.AnonAttachAssertions
import typings.jshamcrest.AnonScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods for exposing matchers and operators for several testing frameworks.
  */
@JSGlobal("JsHamcrest.Integration")
@js.native
object Integration extends js.Object {
  def JsTestDriver(): Unit = js.native
  def JsTestDriver(params: AnonScope): Unit = js.native
  def JsUnitTest(): Unit = js.native
  def JsUnitTest(params: AnonScope): Unit = js.native
  def Nodeunit(): Unit = js.native
  def Nodeunit(params: AnonScope): Unit = js.native
  def QUnit(): Unit = js.native
  def QUnit(params: AnonScope): Unit = js.native
  def Rhino(): Unit = js.native
  def WebBrowser(): Unit = js.native
  def YUITest(): Unit = js.native
  def YUITest(params: AnonScope): Unit = js.native
  def copyMembers(source: js.Object, target: js.Object): Unit = js.native
  def copyMembers(target: js.Object): Unit = js.native
  def installMatchers(source: js.Object): Unit = js.native
  def installOperators(source: js.Object): Unit = js.native
  def jasmine(): Unit = js.native
  def jasmine(params: AnonScope): Unit = js.native
  def jsUnity(): Unit = js.native
  def jsUnity(params: AnonAttachAssertions): Unit = js.native
  def screwunit(): Unit = js.native
  def screwunit(params: AnonScope): Unit = js.native
}

