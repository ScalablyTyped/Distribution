package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Activates notifications for test resultsDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultUndefinedDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Activates notifications for test resultsDot`
  val `type`: boolean
}

object DefaultUndefinedDescriptionType {
  @scala.inline
  def apply(description: `Activates notifications for test resultsDot`, `type`: boolean): DefaultUndefinedDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUndefinedDescriptionType]
  }
}

