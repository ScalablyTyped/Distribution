package typings
package listrLib.listrMod.ListrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListrTaskWrapper extends js.Object {
  var output: js.Any = js.native
  var title: java.lang.String = js.native
  def report(error: nodeLib.Error): scala.Unit = js.native
  def run(): js.Promise[_] = js.native
  def run(ctx: js.Any): js.Promise[_] = js.native
  def skip(message: java.lang.String): scala.Unit = js.native
}

