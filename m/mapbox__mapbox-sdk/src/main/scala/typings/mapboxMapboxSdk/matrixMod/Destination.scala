package typings.mapboxMapboxSdk.matrixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  var location: js.Array[Double]
  var name: String
}

object Destination {
  @scala.inline
  def apply(location: js.Array[Double], name: String): Destination = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Destination]
  }
}

