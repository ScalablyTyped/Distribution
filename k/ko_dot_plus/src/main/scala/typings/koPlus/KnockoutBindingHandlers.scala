package typings.koPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//
// declare new binding handlers in ko.plus
//
@js.native
trait KnockoutBindingHandlers extends js.Object {
  var command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  var loadingWhen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
  var sortBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any = js.native
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    command: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    loadingWhen: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    sortBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], loadingWhen = loadingWhen.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any])
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
    def setCommand(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadingWhen(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("loadingWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortBy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = this.set("sortBy", value.asInstanceOf[js.Any])
  }
  
}

