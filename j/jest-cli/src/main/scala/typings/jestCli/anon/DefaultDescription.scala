package typings.jestCli.anon

import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDescription extends js.Object {
  val default: Boolean
  val description: java.lang.String
  val `type`: boolean
}

object DefaultDescription {
  @scala.inline
  def apply(default: Boolean, description: java.lang.String, `type`: boolean): DefaultDescription = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescription]
  }
}

