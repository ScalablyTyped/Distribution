package typings.jestCli

import typings.jestCli.jestCliStrings.string
import typings.jestCli.jestCliStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAliasDescriptionType extends js.Object {
  val alias: w
  val description: String
  val `type`: string
}

object AnonAliasDescriptionType {
  @scala.inline
  def apply(alias: w, description: String, `type`: string): AnonAliasDescriptionType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAliasDescriptionType]
  }
}

