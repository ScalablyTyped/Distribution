package typings.lyricist.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pyong extends js.Object {
  var pyong: Boolean = js.native
}

object Pyong {
  @scala.inline
  def apply(pyong: Boolean): Pyong = {
    val __obj = js.Dynamic.literal(pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pyong]
  }
  @scala.inline
  implicit class PyongOps[Self <: Pyong] (val x: Self) extends AnyVal {
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
    def setPyong(value: Boolean): Self = this.set("pyong", value.asInstanceOf[js.Any])
  }
  
}

