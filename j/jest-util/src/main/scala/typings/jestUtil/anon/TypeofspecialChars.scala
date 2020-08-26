package typings.jestUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofspecialChars extends js.Object {
  val ARROW: /* " \\u203A " */ String = js.native
  val CLEAR: String = js.native
  val ICONS: Failed = js.native
}

object TypeofspecialChars {
  @scala.inline
  def apply(ARROW: /* " \\u203A " */ String, CLEAR: String, ICONS: Failed): TypeofspecialChars = {
    val __obj = js.Dynamic.literal(ARROW = ARROW.asInstanceOf[js.Any], CLEAR = CLEAR.asInstanceOf[js.Any], ICONS = ICONS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofspecialChars]
  }
  @scala.inline
  implicit class TypeofspecialCharsOps[Self <: TypeofspecialChars] (val x: Self) extends AnyVal {
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
    def setARROW(value: /* " \\u203A " */ String): Self = this.set("ARROW", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLEAR(value: String): Self = this.set("CLEAR", value.asInstanceOf[js.Any])
    @scala.inline
    def setICONS(value: Failed): Self = this.set("ICONS", value.asInstanceOf[js.Any])
  }
  
}

