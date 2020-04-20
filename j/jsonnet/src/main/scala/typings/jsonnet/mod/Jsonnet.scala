package typings.jsonnet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jsonnet extends js.Object {
  def destroy(): Unit
  def eval(code: String): js.Any
  def evalFile(): js.Any
}

object Jsonnet {
  @scala.inline
  def apply(destroy: () => Unit, eval: String => js.Any, evalFile: () => js.Any): Jsonnet = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), eval = js.Any.fromFunction1(eval), evalFile = js.Any.fromFunction0(evalFile))
    __obj.asInstanceOf[Jsonnet]
  }
}

