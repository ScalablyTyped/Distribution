package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashComponentInstance extends js.Object {
  var parameters: js.Array[_] = js.native
}

object FlashComponentInstance {
  @scala.inline
  def apply(parameters: js.Array[_]): FlashComponentInstance = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashComponentInstance]
  }
  @scala.inline
  implicit class FlashComponentInstanceOps[Self <: FlashComponentInstance] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: js.Any*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
  
}

