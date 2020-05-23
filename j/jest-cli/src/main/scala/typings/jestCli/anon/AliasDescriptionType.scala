package typings.jestCli.anon

import typings.jestCli.jestCliStrings.string
import typings.jestCli.jestCliStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDescriptionType extends js.Object {
  val alias: w
  val description: java.lang.String
  val `type`: string
}

object AliasDescriptionType {
  @scala.inline
  def apply(alias: w, description: java.lang.String, `type`: string): AliasDescriptionType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDescriptionType]
  }
}

