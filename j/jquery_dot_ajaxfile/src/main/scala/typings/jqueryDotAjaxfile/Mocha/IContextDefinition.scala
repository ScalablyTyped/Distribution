package typings.jqueryDotAjaxfile.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextDefinition extends js.Object {
  def apply(description: String, spec: js.Function0[Unit]): ISuite = js.native
  def only(description: String, spec: js.Function0[Unit]): ISuite = js.native
  def skip(description: String, spec: js.Function0[Unit]): Unit = js.native
  def timeout(ms: Double): Unit = js.native
}

