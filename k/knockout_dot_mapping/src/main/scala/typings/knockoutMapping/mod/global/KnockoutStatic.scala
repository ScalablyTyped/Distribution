package typings.knockoutMapping.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  // this is a declaration merging with knockout's interface
  var mapping: KnockoutMapping = js.native
}

object KnockoutStatic {
  @scala.inline
  def apply(mapping: KnockoutMapping): KnockoutStatic = {
    val __obj = js.Dynamic.literal(mapping = mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  @scala.inline
  implicit class KnockoutStaticOps[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
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
    def setMapping(value: KnockoutMapping): Self = this.set("mapping", value.asInstanceOf[js.Any])
  }
  
}

