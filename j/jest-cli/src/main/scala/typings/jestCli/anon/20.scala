package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`This option sets the default timeouts of test casesDot`
import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `20` extends js.Object {
  val description: `This option sets the default timeouts of test casesDot`
  val `type`: number
}

object `20` {
  @scala.inline
  def apply(description: `This option sets the default timeouts of test casesDot`, `type`: number): `20` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
}

