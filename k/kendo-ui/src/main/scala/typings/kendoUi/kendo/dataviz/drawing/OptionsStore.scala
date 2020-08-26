package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsStore extends Class {
  var observer: js.Any = js.native
  var options: OptionsStoreOptions = js.native
  def get(field: String): js.Any = js.native
  def set(field: String, value: js.Any): Unit = js.native
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
  @scala.inline
  implicit class OptionsStoreOps[Self <: OptionsStore] (val x: Self) extends AnyVal {
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
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setObserver(value: js.Any): Self = this.set("observer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: OptionsStoreOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

