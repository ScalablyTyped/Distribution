package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockstrapCarouselDefaults extends js.Object {
  var controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate = js.native
  var css: String = js.native
  var indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate = js.native
  var itemTemplate: KnockstrapCarouselDefaultsItemTemplate = js.native
}

object KnockstrapCarouselDefaults {
  @scala.inline
  def apply(
    controlsTemplate: KnockstrapCarouselDefaultsControlsTemplate,
    css: String,
    indicatorsTemplate: KnockstrapCarouselDefaultsIndicatorsTemplate,
    itemTemplate: KnockstrapCarouselDefaultsItemTemplate
  ): KnockstrapCarouselDefaults = {
    val __obj = js.Dynamic.literal(controlsTemplate = controlsTemplate.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], indicatorsTemplate = indicatorsTemplate.asInstanceOf[js.Any], itemTemplate = itemTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaults]
  }
  @scala.inline
  implicit class KnockstrapCarouselDefaultsOps[Self <: KnockstrapCarouselDefaults] (val x: Self) extends AnyVal {
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
    def setControlsTemplate(value: KnockstrapCarouselDefaultsControlsTemplate): Self = this.set("controlsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndicatorsTemplate(value: KnockstrapCarouselDefaultsIndicatorsTemplate): Self = this.set("indicatorsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemTemplate(value: KnockstrapCarouselDefaultsItemTemplate): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
  }
  
}

