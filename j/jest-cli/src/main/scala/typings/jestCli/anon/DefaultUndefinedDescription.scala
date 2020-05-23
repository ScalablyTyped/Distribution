package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Disables stack trace in test results output`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultUndefinedDescription extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Disables stack trace in test results output`
  val `type`: boolean
}

object DefaultUndefinedDescription {
  @scala.inline
  def apply(description: `Disables stack trace in test results output`, `type`: boolean): DefaultUndefinedDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedDescription]
  }
}

