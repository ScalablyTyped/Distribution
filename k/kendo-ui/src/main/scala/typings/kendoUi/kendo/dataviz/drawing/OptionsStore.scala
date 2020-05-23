package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsStore extends Class {
  var observer: js.Any
  var options: OptionsStoreOptions
  def get(field: String): js.Any
  def set(field: String, value: js.Any): Unit
}

object OptionsStore {
  @scala.inline
  def apply(
    get: String => js.Any,
    observer: js.Any,
    options: OptionsStoreOptions,
    set: (String, js.Any) => Unit
  ): OptionsStore = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), observer = observer.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[OptionsStore]
  }
}

