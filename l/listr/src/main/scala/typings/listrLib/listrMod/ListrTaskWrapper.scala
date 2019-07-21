package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTaskWrapper[Ctx] extends js.Object {
  var output: java.lang.String = js.native
  var title: java.lang.String = js.native
  def report(error: stdLib.Error): scala.Unit = js.native
  def run(): js.Promise[scala.Unit] = js.native
  def run(ctx: Ctx): js.Promise[scala.Unit] = js.native
  def skip(message: java.lang.String): scala.Unit = js.native
}

