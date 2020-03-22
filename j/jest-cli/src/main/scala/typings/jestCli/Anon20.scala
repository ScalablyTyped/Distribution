package typings.jestCli

import typings.jestCli.jestCliStrings.`This option sets the default timeouts of test casesDot`
import typings.jestCli.jestCliStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon20 extends js.Object {
  val description: `This option sets the default timeouts of test casesDot`
  val `type`: number
}

object Anon20 {
  @scala.inline
  def apply(description: `This option sets the default timeouts of test casesDot`, `type`: number): Anon20 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon20]
  }
}

