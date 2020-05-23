package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescriptionString extends js.Object {
  val description: java.lang.String
  val string: `true`
  val `type`: array
}

object DescriptionString {
  @scala.inline
  def apply(description: java.lang.String, string: `true`, `type`: array): DescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionString]
  }
}

