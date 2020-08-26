package typings.jsonapiSerializer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  var parameter: js.UndefOr[String] = js.native
  var pointer: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
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
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    @scala.inline
    def setPointer(value: String): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
  }
  
}

