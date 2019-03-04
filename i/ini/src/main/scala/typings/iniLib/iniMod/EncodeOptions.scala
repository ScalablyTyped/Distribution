package typings
package iniLib.iniMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeOptions extends js.Object {
  var section: java.lang.String
  var whitespace: scala.Boolean
}

object EncodeOptions {
  @scala.inline
  def apply(section: java.lang.String, whitespace: scala.Boolean): EncodeOptions = {
    val __obj = js.Dynamic.literal(section = section, whitespace = whitespace)
  
    __obj.asInstanceOf[EncodeOptions]
  }
}

