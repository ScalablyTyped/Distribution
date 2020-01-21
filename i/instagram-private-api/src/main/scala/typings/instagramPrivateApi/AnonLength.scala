package typings.instagramPrivateApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var source_type: String
}

object AnonLength {
  @scala.inline
  def apply(length: Double, source_type: String): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLength]
  }
}

