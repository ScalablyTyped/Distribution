package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultDescription extends js.Object {
  var default: Double
  var description: String
  var `type`: number
}

object Anon_DefaultDescription {
  @scala.inline
  def apply(default: Double, description: String, `type`: number): Anon_DefaultDescription = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultDescription]
  }
}

