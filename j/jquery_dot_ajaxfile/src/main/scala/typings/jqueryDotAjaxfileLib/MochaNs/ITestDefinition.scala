package typings
package jqueryDotAjaxfileLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestDefinition extends js.Object {
  def apply(expectation: java.lang.String): ITest = js.native
  def apply(expectation: java.lang.String, assertion: js.Function0[scala.Unit]): ITest = js.native
  def apply(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ jqueryDotAjaxfileLib.MochaDone, scala.Unit]
  ): ITest = js.native
  def only(expectation: java.lang.String): ITest = js.native
  def only(expectation: java.lang.String, assertion: js.Function0[scala.Unit]): ITest = js.native
  def only(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ jqueryDotAjaxfileLib.MochaDone, scala.Unit]
  ): ITest = js.native
  def skip(expectation: java.lang.String): scala.Unit = js.native
  def skip(expectation: java.lang.String, assertion: js.Function0[scala.Unit]): scala.Unit = js.native
  def skip(
    expectation: java.lang.String,
    assertion: js.Function1[/* done */ jqueryDotAjaxfileLib.MochaDone, scala.Unit]
  ): scala.Unit = js.native
  def timeout(ms: scala.Double): scala.Unit = js.native
}

