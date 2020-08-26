package typings.inflected.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Humanize extends js.Object {
  var capitalize: Boolean = js.native
}

object Humanize {
  @scala.inline
  def apply(capitalize: Boolean): Humanize = {
    val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Humanize]
  }
  @scala.inline
  implicit class HumanizeOps[Self <: Humanize] (val x: Self) extends AnyVal {
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
    def setCapitalize(value: Boolean): Self = this.set("capitalize", value.asInstanceOf[js.Any])
  }
  
}

