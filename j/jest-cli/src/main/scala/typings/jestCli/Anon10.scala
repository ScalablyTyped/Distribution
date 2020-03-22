package typings.jestCli

import typings.jestCli.jestCliStrings.`A JSON string which allows the use of a custom resolverDot`
import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  val description: `A JSON string which allows the use of a custom resolverDot`
  val `type`: string
}

object Anon10 {
  @scala.inline
  def apply(description: `A JSON string which allows the use of a custom resolverDot`, `type`: string): Anon10 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon10]
  }
}

