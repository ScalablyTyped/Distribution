package typings
package juiDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mozilla extends js.Object {
  /** Mozilla 브라우저 체크 */
  var mozilla: scala.Boolean
  /** IE 브라우저 체크 */
  var msie: scala.Boolean
  /** Webkit 브라우저 체크 */
  var webkit: scala.Boolean
}

object Anon_Mozilla {
  @scala.inline
  def apply(mozilla: scala.Boolean, msie: scala.Boolean, webkit: scala.Boolean): Anon_Mozilla = {
    val __obj = js.Dynamic.literal(mozilla = mozilla, msie = msie, webkit = webkit)
  
    __obj.asInstanceOf[Anon_Mozilla]
  }
}

