package typings.ini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var section: String
  var whitespace: Boolean
}

object EncodeOptions {
  @scala.inline
  def apply(section: String, whitespace: Boolean): EncodeOptions = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeOptions]
  }
}

