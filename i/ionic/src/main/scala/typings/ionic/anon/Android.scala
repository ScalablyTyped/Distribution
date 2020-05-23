package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Android extends js.Object {
  var android: js.UndefOr[js.Object] = js.undefined
  var ios: js.UndefOr[js.Object] = js.undefined
}

object Android {
  @scala.inline
  def apply(android: js.Object = null, ios: js.Object = null): Android = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Android]
  }
}

