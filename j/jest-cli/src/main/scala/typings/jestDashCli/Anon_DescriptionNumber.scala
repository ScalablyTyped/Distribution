package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionNumber extends js.Object {
  var description: String
  var `type`: number
}

object Anon_DescriptionNumber {
  @scala.inline
  def apply(description: String, `type`: number): Anon_DescriptionNumber = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionNumber]
  }
}

