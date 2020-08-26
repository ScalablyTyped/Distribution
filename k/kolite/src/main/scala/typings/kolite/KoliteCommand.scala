package typings.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Command /////////////////////////////////////////////
@js.native
trait KoliteCommand extends js.Object {
  var canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  def execute(args: js.Any*): js.Any = js.native
}

object KoliteCommand {
  @scala.inline
  def apply(
    canExecute: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any,
    execute: /* repeated */ js.Any => js.Any
  ): KoliteCommand = {
    val __obj = js.Dynamic.literal(canExecute = canExecute.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute))
    __obj.asInstanceOf[KoliteCommand]
  }
  @scala.inline
  implicit class KoliteCommandOps[Self <: KoliteCommand] (val x: Self) extends AnyVal {
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
    def setCanExecute(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any
    ): Self = this.set("canExecute", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecute(value: /* repeated */ js.Any => js.Any): Self = this.set("execute", js.Any.fromFunction1(value))
  }
  
}

