package typings.jestCli.anon

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`A list of custom reporters for the test suiteDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringType extends js.Object {
  val description: `A list of custom reporters for the test suiteDot`
  val string: `true`
  val `type`: array
}

object StringType {
  @scala.inline
  def apply(description: `A list of custom reporters for the test suiteDot`, string: `true`, `type`: array): StringType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringType]
  }
}

