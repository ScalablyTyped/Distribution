package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var text: java.lang.String
  var value: scala.Double
}

object Distance {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Distance]
  }
}

