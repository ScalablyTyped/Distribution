package typings.iso31662.mod.CountryInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Full extends Partial {
  var code: String = js.native
}

object Full {
  @scala.inline
  def apply(code: String, name: String, sub: typings.iso31662.mod.SubdivisionInfo.Map): Full = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
  }
  
}

