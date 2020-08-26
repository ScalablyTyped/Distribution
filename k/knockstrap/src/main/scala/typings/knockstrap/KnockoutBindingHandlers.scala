package typings.knockstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutBindingHandlers extends js.Object {
  var alert: AlertKnockoutBindingHandler = js.native
  var carousel: CarouselKnockoutBindingHandler = js.native
  var checkbox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  var modal: ModalKnockoutBindingHandler = js.native
  var popover: PopoverKnockoutBindingHandler = js.native
  var progress: ProgressKnockoutBindingHandler = js.native
  var radio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  var toggle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  var tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    alert: AlertKnockoutBindingHandler,
    carousel: CarouselKnockoutBindingHandler,
    checkbox: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    modal: ModalKnockoutBindingHandler,
    popover: PopoverKnockoutBindingHandler,
    progress: ProgressKnockoutBindingHandler,
    radio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    toggle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    tooltip: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], carousel = carousel.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  @scala.inline
  implicit class KnockoutBindingHandlersOps[Self <: KnockoutBindingHandlers] (val x: Self) extends AnyVal {
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
    def setAlert(value: AlertKnockoutBindingHandler): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def setCarousel(value: CarouselKnockoutBindingHandler): Self = this.set("carousel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckbox(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setModal(value: ModalKnockoutBindingHandler): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopover(value: PopoverKnockoutBindingHandler): Self = this.set("popover", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: ProgressKnockoutBindingHandler): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadio(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

