package typings.kineticjs.Kinetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  def drawFunc(): js.Any = js.native
}

object CustomConfig {
  @scala.inline
  def apply(drawFunc: () => js.Any): CustomConfig = {
    val __obj = js.Dynamic.literal(drawFunc = js.Any.fromFunction0(drawFunc))
    __obj.asInstanceOf[CustomConfig]
  }
  @scala.inline
  implicit class CustomConfigOps[Self <: CustomConfig] (val x: Self) extends AnyVal {
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
    def setDrawFunc(value: () => js.Any): Self = this.set("drawFunc", js.Any.fromFunction0(value))
  }
  
}

