package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `23` extends js.Object {
  var dark: js.UndefOr[js.Array[String]] = js.native
  var light: js.UndefOr[js.Array[String]] = js.native
}

object `23` {
  @scala.inline
  def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`]
  }
  @scala.inline
  implicit class `23Ops`[Self <: `23`] (val x: Self) extends AnyVal {
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
    def setDarkVarargs(value: String*): Self = this.set("dark", js.Array(value :_*))
    @scala.inline
    def setDark(value: js.Array[String]): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setLightVarargs(value: String*): Self = this.set("light", js.Array(value :_*))
    @scala.inline
    def setLight(value: js.Array[String]): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
  }
  
}

