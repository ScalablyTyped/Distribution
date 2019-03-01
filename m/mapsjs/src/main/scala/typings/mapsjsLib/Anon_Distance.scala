package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: scala.Double
  var pt: mapsjsLib.mapsjsMod.point
  var ptIdx: scala.Double
  var setIdx: scala.Double
}

object Anon_Distance {
  @scala.inline
  def apply(distance: scala.Double, pt: mapsjsLib.mapsjsMod.point, ptIdx: scala.Double, setIdx: scala.Double): Anon_Distance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("pt")(pt)
    __obj.updateDynamic("ptIdx")(ptIdx)
    __obj.updateDynamic("setIdx")(setIdx)
    __obj.asInstanceOf[Anon_Distance]
  }
}

