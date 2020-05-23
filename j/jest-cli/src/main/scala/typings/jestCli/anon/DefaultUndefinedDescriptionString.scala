package typings.jestCli.anon

import typings.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultUndefinedDescriptionString extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: java.lang.String
  val `type`: string
}

object DefaultUndefinedDescriptionString {
  @scala.inline
  def apply(description: java.lang.String, `type`: string): DefaultUndefinedDescriptionString = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedDescriptionString]
  }
}

