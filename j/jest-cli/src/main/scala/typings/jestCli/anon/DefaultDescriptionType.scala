package typings.jestCli.anon

import typings.jestCli.jestCliStrings.`Alias for Graveaccent--colorGraveaccentDot`
import typings.jestCli.jestCliStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultDescriptionType extends js.Object {
  val default: js.UndefOr[scala.Nothing] = js.native
  val description: `Alias for Graveaccent--colorGraveaccentDot` = js.native
  val `type`: boolean = js.native
}

object DefaultDescriptionType {
  @scala.inline
  def apply(description: `Alias for Graveaccent--colorGraveaccentDot`, `type`: boolean): DefaultDescriptionType = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescriptionType]
  }
  @scala.inline
  implicit class DefaultDescriptionTypeOps[Self <: DefaultDescriptionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: `Alias for Graveaccent--colorGraveaccentDot`): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

