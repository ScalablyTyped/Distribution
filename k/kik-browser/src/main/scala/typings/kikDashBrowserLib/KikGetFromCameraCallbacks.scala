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
    onCancel: () => scala.Unit,
    onComplete: js.Array[java.lang.String] => scala.Unit,
    onPhoto: (java.lang.String, scala.Double) => scala.Unit,
    onSelect: scala.Double => scala.Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
  
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
}

