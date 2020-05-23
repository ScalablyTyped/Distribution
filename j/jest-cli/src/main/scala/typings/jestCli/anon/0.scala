package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`The directory where Jest should output its coverage filesDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  val description: `The directory where Jest should output its coverage filesDot`
  val `type`: string
}

object `0` {
  @scala.inline
  def apply(description: `The directory where Jest should output its coverage filesDot`, `type`: string): `0` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

