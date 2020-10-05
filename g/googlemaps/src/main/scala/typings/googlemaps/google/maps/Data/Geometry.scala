package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry extends js.Object {
  def forEachLatLng(callback: js.Function1[/* latLng */ LatLng, Unit]): Unit = js.native
  def getType(): String = js.native
}

object Geometry {
  @scala.inline
  def apply(forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit, getType: () => String): Geometry = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForEachLatLng(value: js.Function1[/* latLng */ LatLng, Unit] => Unit): Self = this.set("forEachLatLng", js.Any.fromFunction1(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
  }
  
}

