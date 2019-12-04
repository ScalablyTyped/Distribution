package typings.jestDashCli

import typings.jestDashCli.jestDashCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AliasDescription extends js.Object {
  var alias: String
  var description: String
  var `type`: string
}

object Anon_AliasDescription {
  @scala.inline
  def apply(alias: String, description: String, `type`: string): Anon_AliasDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AliasDescription]
  }
}

