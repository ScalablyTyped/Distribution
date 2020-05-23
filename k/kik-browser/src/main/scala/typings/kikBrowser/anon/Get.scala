package typings.kikBrowser.anon

import typings.kikBrowser.KikGetFromCameraCallbacks
import typings.kikBrowser.KikGetFromCameraOptions
import typings.kikBrowser.KikGetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def get(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def get(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def getFromCamera(callbacks: KikGetFromCameraCallbacks): Unit = js.native
  def getFromCamera(options: KikGetFromCameraOptions, callbacks: KikGetFromCameraCallbacks): Unit = js.native
  def getFromGallery(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def getFromGallery(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def saveToGallery(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
}

