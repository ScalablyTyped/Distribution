package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikGetFromCameraCallbacks extends js.Object {
  def onCancel(): Unit
  def onComplete(photos: js.Array[String]): Unit
  def onPhoto(photo: String, index: Double): Unit
  def onSelect(numPhotos: Double): Unit
}

object KikGetFromCameraCallbacks {
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onComplete: js.Array[String] => Unit,
    onPhoto: (String, Double) => Unit,
    onSelect: Double => Unit
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onComplete = js.Any.fromFunction1(onComplete), onPhoto = js.Any.fromFunction2(onPhoto), onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
}

