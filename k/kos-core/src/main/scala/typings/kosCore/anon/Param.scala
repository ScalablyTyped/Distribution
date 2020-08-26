package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Param extends js.Object {
  var param: js.Any = js.native
}

object Param {
  @scala.inline
  def apply(param: js.Any): Param = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Param]
  }
  @scala.inline
  implicit class ParamOps[Self <: Param] (val x: Self) extends AnyVal {
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
    def setParam(value: js.Any): Self = this.set("param", value.asInstanceOf[js.Any])
  }
  
}

