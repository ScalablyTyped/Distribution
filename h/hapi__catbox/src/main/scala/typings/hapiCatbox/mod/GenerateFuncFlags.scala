package typings.hapiCatbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateFuncFlags extends js.Object {
  var ttl: Double = js.native
}

object GenerateFuncFlags {
  @scala.inline
  def apply(ttl: Double): GenerateFuncFlags = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateFuncFlags]
  }
  @scala.inline
  implicit class GenerateFuncFlagsOps[Self <: GenerateFuncFlags] (val x: Self) extends AnyVal {
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
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
  }
  
}

