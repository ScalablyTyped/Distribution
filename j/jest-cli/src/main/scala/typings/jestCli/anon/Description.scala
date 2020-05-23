package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Automock all files by defaultDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Automock all files by defaultDot`
  val `type`: boolean
}

object Description {
  @scala.inline
  def apply(description: `Automock all files by defaultDot`, `type`: boolean): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

