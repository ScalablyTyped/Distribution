package typings.jsonFilePlus.mod

import typings.jsonFilePlus.jsonFilePlusStrings.Charactertabulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  val indent: Double | Charactertabulation
  val trailing: Boolean
}

object Format {
  @scala.inline
  def apply(indent: Double | Charactertabulation, trailing: Boolean): Format = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

