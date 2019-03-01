package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikGetFromCameraCallbacks extends js.Object {
  def onCancel(): scala.Unit
  def onComplete(photos: js.Array[java.lang.String]): scala.Unit
  def onPhoto(photo: java.lang.String, index: scala.Double): scala.Unit
  def onSelect(numPhotos: scala.Double): scala.Unit
}

object KikGetFromCameraCallbacks {
  @scala.inline
  def apply(
    onCancel: js.Function0[scala.Unit],
    onComplete: js.Function1[js.Array[java.lang.String], scala.Unit],
    onPhoto: js.Function2[java.lang.String, scala.Double, scala.Unit],
    onSelect: js.Function1[scala.Double, scala.Unit]
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(onCancel)
    __obj.updateDynamic("onComplete")(onComplete)
    __obj.updateDynamic("onPhoto")(onPhoto)
    __obj.updateDynamic("onSelect")(onSelect)
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
}

