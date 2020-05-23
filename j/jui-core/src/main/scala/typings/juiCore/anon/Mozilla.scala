package typings.juiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mozilla extends js.Object {
  /** Mozilla 브라우저 체크 */
  var mozilla: Boolean
  /** IE 브라우저 체크 */
  var msie: Boolean
  /** Webkit 브라우저 체크 */
  var webkit: Boolean
}

object Mozilla {
  @scala.inline
  def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): Mozilla = {
    val __obj = js.Dynamic.literal(mozilla = mozilla.asInstanceOf[js.Any], msie = msie.asInstanceOf[js.Any], webkit = webkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mozilla]
  }
}

