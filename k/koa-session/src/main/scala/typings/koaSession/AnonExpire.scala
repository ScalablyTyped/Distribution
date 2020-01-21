package typings.koaSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpire extends js.Object {
  var _expire: js.UndefOr[Double] = js.undefined
  var _maxAge: js.UndefOr[Double] = js.undefined
}

object AnonExpire {
  @scala.inline
  def apply(_expire: Int | Double = null, _maxAge: Int | Double = null): AnonExpire = {
    val __obj = js.Dynamic.literal()
    if (_expire != null) __obj.updateDynamic("_expire")(_expire.asInstanceOf[js.Any])
    if (_maxAge != null) __obj.updateDynamic("_maxAge")(_maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpire]
  }
}

