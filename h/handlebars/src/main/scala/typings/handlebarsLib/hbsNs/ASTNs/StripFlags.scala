package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripFlags extends js.Object {
  var close: scala.Boolean
  var open: scala.Boolean
}

object StripFlags {
  @scala.inline
  def apply(close: scala.Boolean, open: scala.Boolean): StripFlags = {
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[StripFlags]
  }
}

