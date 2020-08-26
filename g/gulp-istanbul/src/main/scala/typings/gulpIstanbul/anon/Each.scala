package typings.gulpIstanbul.anon

import typings.gulpIstanbul.mod.CoverageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  var each: js.UndefOr[CoverageOptions | Double] = js.native
  var global: js.UndefOr[CoverageOptions | Double] = js.native
}

object Each {
  @scala.inline
  def apply(): Each = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Each]
  }
  @scala.inline
  implicit class EachOps[Self <: Each] (val x: Self) extends AnyVal {
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
    def setEach(value: CoverageOptions | Double): Self = this.set("each", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setGlobal(value: CoverageOptions | Double): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
  }
  
}

