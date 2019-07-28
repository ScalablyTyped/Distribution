package typings.listr.listrMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTaskWrapper[Ctx] extends js.Object {
  var output: String = js.native
  var title: String = js.native
  def report(error: Error): Unit = js.native
  def run(): js.Promise[Unit] = js.native
  def run(ctx: Ctx): js.Promise[Unit] = js.native
  def skip(message: String): Unit = js.native
}

