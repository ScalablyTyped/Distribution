package typings.jqueryAjaxfile.Mocha_

import typings.jqueryAjaxfile.MochaDone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITestDefinition extends js.Object {
  def apply(expectation: String): ITest = js.native
  def apply(expectation: String, assertion: js.Function0[Unit]): ITest = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): ITest = js.native
  def only(expectation: String): ITest = js.native
  def only(expectation: String, assertion: js.Function0[Unit]): ITest = js.native
  def only(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): ITest = js.native
  def skip(expectation: String): Unit = js.native
  def skip(expectation: String, assertion: js.Function0[Unit]): Unit = js.native
  def skip(expectation: String, assertion: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  def timeout(ms: Double): Unit = js.native
}

