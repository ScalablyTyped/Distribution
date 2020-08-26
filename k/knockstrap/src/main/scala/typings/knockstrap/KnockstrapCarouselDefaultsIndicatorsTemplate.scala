package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapCarouselDefaultsIndicatorsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdItemsDataConverted = js.native
}

object KnockstrapCarouselDefaultsIndicatorsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsIndicatorsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIndicatorsTemplate]
  }
  @scala.inline
  implicit class KnockstrapCarouselDefaultsIndicatorsTemplateOps[Self <: KnockstrapCarouselDefaultsIndicatorsTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataConverter(value: js.Any => KnockstrapCarouselDefaultsIdItemsDataConverted): Self = this.set("dataConverter", js.Any.fromFunction1(value))
  }
  
}

