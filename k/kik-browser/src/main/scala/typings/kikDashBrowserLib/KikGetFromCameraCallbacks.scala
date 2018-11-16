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

