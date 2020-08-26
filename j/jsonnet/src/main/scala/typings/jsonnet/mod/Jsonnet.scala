package typings.jsonnet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Jsonnet extends js.Object {
  def destroy(): Unit = js.native
  def eval(code: String): js.Any = js.native
  def evalFile(): js.Any = js.native
}

object Jsonnet {
  @scala.inline
  def apply(destroy: () => Unit, eval: String => js.Any, evalFile: () => js.Any): Jsonnet = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), eval = js.Any.fromFunction1(eval), evalFile = js.Any.fromFunction0(evalFile))
    __obj.asInstanceOf[Jsonnet]
  }
  @scala.inline
  implicit class JsonnetOps[Self <: Jsonnet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setEval(value: String => js.Any): Self = this.set("eval", js.Any.fromFunction1(value))
    @scala.inline
    def setEvalFile(value: () => js.Any): Self = this.set("evalFile", js.Any.fromFunction0(value))
  }
  
}

