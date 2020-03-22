package typings.jestCli

import typings.jestCli.jestCliStrings.`The path to a module that runs after All TestsDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  val description: `The path to a module that runs after All TestsDot`
  val `type`: string
}

object Anon3 {
  @scala.inline
  def apply(description: `The path to a module that runs after All TestsDot`, `type`: string): Anon3 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

