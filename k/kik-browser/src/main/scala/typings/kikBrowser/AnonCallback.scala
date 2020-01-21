package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  def get(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def get(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def getFromCamera(callbacks: KikGetFromCameraCallbacks): Unit = js.native
  def getFromCamera(options: KikGetFromCameraOptions, callbacks: KikGetFromCameraCallbacks): Unit = js.native
  def getFromGallery(callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def getFromGallery(options: KikGetOptions, callback: js.Function1[/* photos */ js.Array[String], Unit]): Unit = js.native
  def saveToGallery(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
}

