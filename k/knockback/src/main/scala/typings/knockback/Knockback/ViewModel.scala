package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewModel extends Destroyable {
  def extend(source: js.Any): js.Any = js.native
  def model(): Model[_, ModelSetOptions] = js.native
  def shareOptions(): ViewModelOptions = js.native
}

object ViewModel {
  @scala.inline
  def apply(
    destroy: () => js.Any,
    extend: js.Any => js.Any,
    model: () => Model[_, ModelSetOptions],
    shareOptions: () => ViewModelOptions
  ): ViewModel = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), extend = js.Any.fromFunction1(extend), model = js.Any.fromFunction0(model), shareOptions = js.Any.fromFunction0(shareOptions))
    __obj.asInstanceOf[ViewModel]
  }
  @scala.inline
  implicit class ViewModelOps[Self <: ViewModel] (val x: Self) extends AnyVal {
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
    def setExtend(value: js.Any => js.Any): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setModel(value: () => Model[_, ModelSetOptions]): Self = this.set("model", js.Any.fromFunction0(value))
    @scala.inline
    def setShareOptions(value: () => ViewModelOptions): Self = this.set("shareOptions", js.Any.fromFunction0(value))
  }
  
}

