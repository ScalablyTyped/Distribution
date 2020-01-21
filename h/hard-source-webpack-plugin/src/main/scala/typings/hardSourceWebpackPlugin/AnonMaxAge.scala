package typings.hardSourceWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxAge extends js.Object {
  var maxAge: Double
  var sizeThreshold: Double
}

object AnonMaxAge {
  @scala.inline
  def apply(maxAge: Double, sizeThreshold: Double): AnonMaxAge = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaxAge]
  }
}

