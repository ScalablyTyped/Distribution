package typings
package jsonDashFileDashPlusLib.jsonDashFileDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  val indent: scala.Double
  val trailing: scala.Boolean
}

object Format {
  @scala.inline
  def apply(indent: scala.Double, trailing: scala.Boolean): Format = {
    val __obj = js.Dynamic.literal(indent = indent, trailing = trailing)
  
    __obj.asInstanceOf[Format]
  }
}

