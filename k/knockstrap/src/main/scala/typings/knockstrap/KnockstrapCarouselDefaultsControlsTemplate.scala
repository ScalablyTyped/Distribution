package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapCarouselDefaultsControlsTemplate extends KnockstrapDefaultsTemplateBase {
  def dataConverter(value: js.Any): KnockstrapCarouselDefaultsIdDataConverted = js.native
}

object KnockstrapCarouselDefaultsControlsTemplate {
  @scala.inline
  def apply(
    dataConverter: js.Any => KnockstrapCarouselDefaultsIdDataConverted,
    name: String,
    templateEngine: KnockstrapStringTemplateEngine
  ): KnockstrapCarouselDefaultsControlsTemplate = {
    val __obj = js.Dynamic.literal(dataConverter = js.Any.fromFunction1(dataConverter), name = name.asInstanceOf[js.Any], templateEngine = templateEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsControlsTemplate]
  }
  @scala.inline
  implicit class KnockstrapCarouselDefaultsControlsTemplateOps[Self <: KnockstrapCarouselDefaultsControlsTemplate] (val x: Self) extends AnyVal {
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
    def setDataConverter(value: js.Any => KnockstrapCarouselDefaultsIdDataConverted): Self = this.set("dataConverter", js.Any.fromFunction1(value))
  }
  
}

