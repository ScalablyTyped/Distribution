package typings.leafletDotUtm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Band extends js.Object {
  var band: String
  var southHemi: Boolean
  var x: Double
  var y: Double
  var zone: Double
}

object Anon_Band {
  @scala.inline
  def apply(band: String, southHemi: Boolean, x: Double, y: Double, zone: Double): Anon_Band = {
    val __obj = js.Dynamic.literal(band = band, southHemi = southHemi, x = x, y = y, zone = zone)
  
    __obj.asInstanceOf[Anon_Band]
  }
}

