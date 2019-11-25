package typings.mapsjs.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait pointObject extends js.Object {
  var x: Double
  var y: Double
}

object pointObject {
  @scala.inline
  def apply(x: Double, y: Double): pointObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[pointObject]
  }
}

