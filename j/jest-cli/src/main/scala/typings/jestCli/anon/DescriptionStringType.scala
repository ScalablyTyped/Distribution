package typings.jestCli.anon

import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionStringType extends js.Object {
  val default: typings.jestCli.jestCliNumbers.`5`
  val description: java.lang.String
  val `type`: number
}

object DescriptionStringType {
  @scala.inline
  def apply(default: typings.jestCli.jestCliNumbers.`5`, description: java.lang.String, `type`: number): DescriptionStringType = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionStringType]
  }
}

