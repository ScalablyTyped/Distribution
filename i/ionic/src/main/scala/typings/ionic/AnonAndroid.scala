package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAndroid extends js.Object {
  var android: js.UndefOr[js.Object] = js.undefined
  var ios: js.UndefOr[js.Object] = js.undefined
}

object AnonAndroid {
  @scala.inline
  def apply(android: js.Object = null, ios: js.Object = null): AnonAndroid = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAndroid]
  }
}

