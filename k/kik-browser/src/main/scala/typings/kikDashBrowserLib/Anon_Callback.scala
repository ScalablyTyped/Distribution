package typings
package kikDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def get(callback: js.Function1[/* photos */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def get(
    options: KikGetOptions,
    callback: js.Function1[/* photos */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getFromCamera(callbacks: KikGetFromCameraCallbacks): scala.Unit = js.native
  def getFromCamera(options: KikGetFromCameraOptions, callbacks: KikGetFromCameraCallbacks): scala.Unit = js.native
  def getFromGallery(callback: js.Function1[/* photos */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  def getFromGallery(
    options: KikGetOptions,
    callback: js.Function1[/* photos */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def saveToGallery(url: java.lang.String, callback: js.Function1[/* status */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

