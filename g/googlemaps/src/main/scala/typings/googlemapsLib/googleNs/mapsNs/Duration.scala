package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var text: java.lang.String
  var value: scala.Double
}

object Duration {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): Duration = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[Duration]
  }
}

