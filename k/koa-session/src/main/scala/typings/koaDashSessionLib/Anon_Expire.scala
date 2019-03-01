package typings
package koaDashSessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expire extends js.Object {
  var _expire: js.UndefOr[scala.Double] = js.undefined
  var _maxAge: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Expire {
  @scala.inline
  def apply(_expire: scala.Int | scala.Double = null, _maxAge: scala.Int | scala.Double = null): Anon_Expire = {
    val __obj = js.Dynamic.literal()
    if (_expire != null) __obj.updateDynamic("_expire")(_expire.asInstanceOf[js.Any])
    if (_maxAge != null) __obj.updateDynamic("_maxAge")(_maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expire]
  }
}

