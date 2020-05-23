package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Alias for Graveaccent--colorGraveaccentDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.undefined
  val description: `Alias for Graveaccent--colorGraveaccentDot`
  val `type`: boolean
}

object DefaultDescriptionType {
  @scala.inline
  def apply(description: `Alias for Graveaccent--colorGraveaccentDot`, `type`: boolean): DefaultDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescriptionType]
  }
}

