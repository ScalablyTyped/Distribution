package typings.juiDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mozilla extends js.Object {
  /** Mozilla 브라우저 체크 */
  var mozilla: Boolean
  /** IE 브라우저 체크 */
  var msie: Boolean
  /** Webkit 브라우저 체크 */
  var webkit: Boolean
}

object Anon_Mozilla {
  @scala.inline
  def apply(mozilla: Boolean, msie: Boolean, webkit: Boolean): Anon_Mozilla = {
    val __obj = js.Dynamic.literal(mozilla = mozilla, msie = msie, webkit = webkit)
  
    __obj.asInstanceOf[Anon_Mozilla]
  }
}

