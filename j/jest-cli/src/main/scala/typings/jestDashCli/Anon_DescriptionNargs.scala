package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionNargs extends js.Object {
  var description: String
  var nargs: Double
  var `type`: string
}

object Anon_DescriptionNargs {
  @scala.inline
  def apply(description: String, nargs: Double, `type`: string): Anon_DescriptionNargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionNargs]
  }
}

