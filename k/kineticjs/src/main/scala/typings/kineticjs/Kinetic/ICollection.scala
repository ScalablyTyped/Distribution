package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection extends js.Object {
  @JSName("apply")
  def apply(method: js.Function, `val`: js.Any): js.Any = js.native
  def each(func: js.Function0[_]): js.Any = js.native
}

object ICollection {
  @scala.inline
  def apply(apply: (js.Function, js.Any) => js.Any, each: js.Function0[_] => js.Any): ICollection = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), each = js.Any.fromFunction1(each))
    __obj.asInstanceOf[ICollection]
  }
  @scala.inline
  implicit class ICollectionOps[Self <: ICollection] (val x: Self) extends AnyVal {
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
    def setApply(value: (js.Function, js.Any) => js.Any): Self = this.set("apply", js.Any.fromFunction2(value))
    @scala.inline
    def setEach(value: js.Function0[_] => js.Any): Self = this.set("each", js.Any.fromFunction1(value))
  }
  
}

