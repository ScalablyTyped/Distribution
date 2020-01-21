package typings.hapiLab.mod.script

import typings.hapiLab.hapiLabStrings.plan
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  def apply(title: String, content: js.Function0[Unit]): Unit = js.native
  def apply(title: String, options: Omit[TestOptions, plan], content: js.Function0[Unit]): Unit = js.native
  def only(title: String, content: js.Function0[Unit]): Unit = js.native
  @JSName("only")
  def only_plan(title: String, options: Omit[TestOptions, plan], content: js.Function0[Unit]): Unit = js.native
  def skip(title: String, content: js.Function0[Unit]): Unit = js.native
  @JSName("skip")
  def skip_plan(title: String, options: Omit[TestOptions, plan], content: js.Function0[Unit]): Unit = js.native
}

