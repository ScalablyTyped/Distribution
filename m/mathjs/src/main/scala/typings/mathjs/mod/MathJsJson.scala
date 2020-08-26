package typings.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathJsJson extends js.Object {
  /**
    * Returns reviver function that can be used as reviver in JSON.parse function.
    */
  def reviver(): js.Function2[/* key */ js.Any, /* value */ js.Any, _] = js.native
}

object MathJsJson {
  @scala.inline
  def apply(reviver: () => js.Function2[/* key */ js.Any, /* value */ js.Any, _]): MathJsJson = {
    val __obj = js.Dynamic.literal(reviver = js.Any.fromFunction0(reviver))
    __obj.asInstanceOf[MathJsJson]
  }
  @scala.inline
  implicit class MathJsJsonOps[Self <: MathJsJson] (val x: Self) extends AnyVal {
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
    def setReviver(value: () => js.Function2[/* key */ js.Any, /* value */ js.Any, _]): Self = this.set("reviver", js.Any.fromFunction0(value))
  }
  
}

