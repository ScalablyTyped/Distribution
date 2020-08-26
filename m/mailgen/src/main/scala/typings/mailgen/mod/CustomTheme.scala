package typings.mailgen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTheme extends js.Object {
  var path: String = js.native
  var plaintextPath: js.UndefOr[String] = js.native
}

object CustomTheme {
  @scala.inline
  def apply(path: String): CustomTheme = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTheme]
  }
  @scala.inline
  implicit class CustomThemeOps[Self <: CustomTheme] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaintextPath(value: String): Self = this.set("plaintextPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaintextPath: Self = this.set("plaintextPath", js.undefined)
  }
  
}

