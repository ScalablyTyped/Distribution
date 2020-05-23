package typings.hardSourceWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxAge extends js.Object {
  var maxAge: Double
  var sizeThreshold: Double
}

object MaxAge {
  @scala.inline
  def apply(maxAge: Double, sizeThreshold: Double): MaxAge = {
    val __obj = js.Dynamic.literal(maxAge = maxAge.asInstanceOf[js.Any], sizeThreshold = sizeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAge]
  }
}

