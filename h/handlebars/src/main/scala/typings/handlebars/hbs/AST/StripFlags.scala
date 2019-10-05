package typings.handlebars.hbs.AST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripFlags extends js.Object {
  var close: Boolean
  var open: Boolean
}

object StripFlags {
  @scala.inline
  def apply(close: Boolean, open: Boolean): StripFlags = {
    val __obj = js.Dynamic.literal(close = close, open = open)
  
    __obj.asInstanceOf[StripFlags]
  }
}

