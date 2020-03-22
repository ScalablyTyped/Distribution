package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleString extends js.Object {
  /**
    * @default consistent
    */
  var style: String
}

object AnonStyleString {
  @scala.inline
  def apply(style: String): AnonStyleString = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStyleString]
  }
}

