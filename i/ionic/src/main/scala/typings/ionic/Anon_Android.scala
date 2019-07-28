package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Android extends js.Object {
  var android: js.UndefOr[js.Object] = js.undefined
  var ios: js.UndefOr[js.Object] = js.undefined
}

object Anon_Android {
  @scala.inline
  def apply(android: js.Object = null, ios: js.Object = null): Anon_Android = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android)
    if (ios != null) __obj.updateDynamic("ios")(ios)
    __obj.asInstanceOf[Anon_Android]
  }
}

