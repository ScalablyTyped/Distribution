package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: java.lang.String
  val `type`: boolean
}

object Default {
  @scala.inline
  def apply(description: java.lang.String, `type`: boolean): Default = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

