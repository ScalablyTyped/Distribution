package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: String
  var `type`: string
}

object Anon_Description {
  @scala.inline
  def apply(description: String, `type`: string): Anon_Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

