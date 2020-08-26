package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale extends js.Object {
  var symbol: String = js.native
  def scale(d: Double): Double = js.native
}

object Scale {
  @scala.inline
  def apply(scale: Double => Double, symbol: String): Scale = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  implicit class ScaleOps[Self <: Scale] (val x: Self) extends AnyVal {
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
    def setScale(value: Double => Double): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

