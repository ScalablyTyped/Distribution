package typings.jestCli

import typings.jestCli.jestCliBooleans.`true`
import typings.jestCli.jestCliStrings.`A list of custom reporters for the test suiteDot`
import typings.jestCli.jestCliStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStringType extends js.Object {
  val description: `A list of custom reporters for the test suiteDot`
  val string: `true`
  val `type`: array
}

object AnonStringType {
  @scala.inline
  def apply(description: `A list of custom reporters for the test suiteDot`, string: `true`, `type`: array): AnonStringType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStringType]
  }
}

