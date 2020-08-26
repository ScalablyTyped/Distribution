package typings.looksSame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait B extends js.Object {
  var B: js.Any = js.native
  var G: js.Any = js.native
  var R: js.Any = js.native
}

object B {
  @scala.inline
  def apply(B: js.Any, G: js.Any, R: js.Any): B = {
    val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
  @scala.inline
  implicit class BOps[Self <: B] (val x: Self) extends AnyVal {
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
    def setB(value: js.Any): Self = this.set("B", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: js.Any): Self = this.set("G", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: js.Any): Self = this.set("R", value.asInstanceOf[js.Any])
  }
  
}

