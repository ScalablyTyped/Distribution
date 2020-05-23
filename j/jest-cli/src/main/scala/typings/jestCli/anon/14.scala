package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Alias for --env`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `14` extends js.Object {
  val description: `Alias for --env`
  val `type`: string
}

object `14` {
  @scala.inline
  def apply(description: `Alias for --env`, `type`: string): `14` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
}

