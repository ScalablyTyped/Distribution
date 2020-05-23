package typings.knockback.Knockback

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewModel extends Destroyable {
  def extend(source: js.Any): js.Any
  def model(): Model[_, ModelSetOptions]
  def shareOptions(): ViewModelOptions
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
}

