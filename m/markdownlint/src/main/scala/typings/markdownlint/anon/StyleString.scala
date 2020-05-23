package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleString extends js.Object {
  /**
    * @default consistent
    */
  var style: String
}

object StyleString {
  @scala.inline
  def apply(style: String): StyleString = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleString]
  }
}

