package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperty extends js.Object {
  var property: String
}

object AnonProperty {
  @scala.inline
  def apply(property: String): AnonProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperty]
  }
}

