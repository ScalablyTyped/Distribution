package typings.jsonic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var depth: js.UndefOr[Double] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var maxchars: js.UndefOr[Double] = js.native
  var maxitems: js.UndefOr[Double] = js.native
  var omit: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setMaxchars(value: Double): Self = this.set("maxchars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxchars: Self = this.set("maxchars", js.undefined)
    @scala.inline
    def setMaxitems(value: Double): Self = this.set("maxitems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxitems: Self = this.set("maxitems", js.undefined)
    @scala.inline
    def setOmitVarargs(value: String*): Self = this.set("omit", js.Array(value :_*))
    @scala.inline
    def setOmit(value: js.Array[String]): Self = this.set("omit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmit: Self = this.set("omit", js.undefined)
  }
  
}

