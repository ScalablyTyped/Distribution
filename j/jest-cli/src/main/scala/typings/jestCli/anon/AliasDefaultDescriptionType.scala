package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Run tests that failed in the previous executionDot`
import typings.jestCli.jestCliStrings.boolean
import typings.jestCli.jestCliStrings.f
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasDefaultDescriptionType extends js.Object {
  val alias: f
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Run tests that failed in the previous executionDot`
  val `type`: boolean
}

object AliasDefaultDescriptionType {
  @scala.inline
  def apply(alias: f, description: `Run tests that failed in the previous executionDot`, `type`: boolean): AliasDefaultDescriptionType = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasDefaultDescriptionType]
  }
}

