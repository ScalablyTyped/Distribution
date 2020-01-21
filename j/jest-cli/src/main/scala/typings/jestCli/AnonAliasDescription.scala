package typings.jestCli

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasDescription extends js.Object {
  var alias: String
  var description: String
  var `type`: string
}

object AnonAliasDescription {
  @scala.inline
  def apply(alias: String, description: String, `type`: string): AnonAliasDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasDescription]
  }
}

