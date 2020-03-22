package typings.jestCli

import typings.jestCli.jestCliStrings.`Generate a basic configuration file`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5 extends js.Object {
  val description: `Generate a basic configuration file`
  val `type`: boolean
}

object Anon5 {
  @scala.inline
  def apply(description: `Generate a basic configuration file`, `type`: boolean): Anon5 = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon5]
  }
}

