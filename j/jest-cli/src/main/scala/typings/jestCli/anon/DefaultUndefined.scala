package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Print debugging info about your jest configDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultUndefined extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Print debugging info about your jest configDot`
  val `type`: boolean
}

object DefaultUndefined {
  @scala.inline
  def apply(description: `Print debugging info about your jest configDot`, `type`: boolean): DefaultUndefined = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefined]
  }
}

