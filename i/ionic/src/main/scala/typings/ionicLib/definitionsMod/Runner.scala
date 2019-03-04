package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Runner[T /* <: js.Object */, U] extends js.Object {
  def run(options: T): js.Promise[U]
}

object Runner {
  @scala.inline
  def apply[T /* <: js.Object */, U](run: js.Function1[T, js.Promise[U]]): Runner[T, U] = {
    val __obj = js.Dynamic.literal(run = run)
  
    __obj.asInstanceOf[Runner[T, U]]
  }
}

