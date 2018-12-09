package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listr extends js.Object {
  def add(tasks: js.Array[listrLib.listrMod.ListrNs.ListrTask]): scala.Unit = js.native
  def add(tasks: listrLib.listrMod.ListrNs.ListrTask): scala.Unit = js.native
  def run(): js.Promise[_] = js.native
  def run(ctx: js.Any): js.Promise[_] = js.native
}

