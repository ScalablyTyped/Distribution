package typings.jsonDashFileDashPlus.jsonDashFileDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  val indent: Double
  val trailing: Boolean
}

object Format {
  @scala.inline
  def apply(indent: Double, trailing: Boolean): Format = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Format]
  }
}

