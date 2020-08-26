package typings.juiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mozilla extends js.Object {
  /** Mozilla 브라우저 체크 */
  var mozilla: Boolean = js.native
  /** IE 브라우저 체크 */
  var msie: Boolean = js.native
  /** Webkit 브라우저 체크 */
  var webkit: Boolean = js.native
}

object Mozilla {
  @scala.inline
  def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): Mozilla = {
    val __obj = js.Dynamic.literal(mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mozilla]
  }
  @scala.inline
  implicit class MozillaOps[Self <: Mozilla] (val x: Self) extends AnyVal {
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
    def setMozilla(value: Boolean): Self = this.set("mozilla", value.asInstanceOf[js.Any])
    @scala.inline
    def setMsie(value: Boolean): Self = this.set("msie", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkit(value: Boolean): Self = this.set("webkit", value.asInstanceOf[js.Any])
  }
  
}

