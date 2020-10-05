package typings.googlemaps.google.maps.Data

import typings.googlemaps.google.maps.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends Geometry {
  def getArray(): js.Array[LinearRing] = js.native
  def getAt(n: Double): LinearRing = js.native
  def getLength(): Double = js.native
}

object Polygon {
  @scala.inline
  def apply(
    forEachLatLng: js.Function1[/* latLng */ LatLng, Unit] => Unit,
    getArray: () => js.Array[LinearRing],
    getAt: Double => LinearRing,
    getLength: () => Double,
    getType: () => String
  ): Polygon = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1(forEachLatLng), getArray = js.Any.fromFunction0(getArray), getAt = js.Any.fromFunction1(getAt), getLength = js.Any.fromFunction0(getLength), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[Polygon]
  }
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
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
    def setGetArray(value: () => js.Array[LinearRing]): Self = this.set("getArray", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAt(value: Double => LinearRing): Self = this.set("getAt", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
  }
  
}

