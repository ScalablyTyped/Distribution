package typings.ini.iniMod

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
    val __obj = js.Dynamic.literal(section = section, whitespace = whitespace)
  
    __obj.asInstanceOf[EncodeOptions]
  }
}

