package typings.jestCli.anon

import typings.jestCli.jestCliStrings.c
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDescription extends js.Object {
  val alias: c
  val description: java.lang.String
  val `type`: string
}

object AliasDescription {
  @scala.inline
  def apply(alias: c, description: java.lang.String, `type`: string): AliasDescription = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescription]
  }
}

