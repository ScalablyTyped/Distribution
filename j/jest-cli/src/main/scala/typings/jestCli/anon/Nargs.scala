package typings.jestCli.anon

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nargs extends js.Object {
  val description: java.lang.String
  val nargs: typings.jestCli.jestCliNumbers.`1`
  val `type`: string
}

object Nargs {
  @scala.inline
  def apply(description: java.lang.String, nargs: typings.jestCli.jestCliNumbers.`1`, `type`: string): Nargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nargs]
  }
}

