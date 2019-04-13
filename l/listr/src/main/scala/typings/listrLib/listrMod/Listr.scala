package typings
package listrLib.listrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listr extends js.Object {
  def add(tasks: js.Array[ListrTask]): scala.Unit = js.native
  def add(tasks: ListrTask): scala.Unit = js.native
  def run(): js.Promise[_] = js.native
  def run(ctx: js.Any): js.Promise[_] = js.native
}

