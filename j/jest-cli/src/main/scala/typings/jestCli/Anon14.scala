package typings.jestCli

import typings.jestCli.jestCliStrings.`Alias for --env`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon14 extends js.Object {
  val description: `Alias for --env`
  val `type`: string
}

object Anon14 {
  @scala.inline
  def apply(description: `Alias for --env`, `type`: string): Anon14 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon14]
  }
}

