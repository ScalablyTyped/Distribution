package typings.jestDashCli

import typings.jestDashCli.jestDashCliNumbers.`true`
import typings.jestDashCli.jestDashCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var description: String
  var string: `true`
  var `type`: array
}

object Anon_Array {
  @scala.inline
  def apply(description: String, string: `true`, `type`: array): Anon_Array = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}

