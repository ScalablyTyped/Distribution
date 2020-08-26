package typings.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindStrategy extends js.Object {
  var strategy: String | Unit = js.native
  def clearMap(): Unit = js.native
  def createMap(length: Double): Unit = js.native
  def createRow(params: js.Any): Unit = js.native
  def destroy(): Unit = js.native
  def klass(): Unit = js.native
  def removeRow(params: js.Any): Unit = js.native
  def setStrategy(name: String): Unit = js.native
  def translate(params: js.Any): Unit = js.native
}

object BindStrategy {
  @scala.inline
  def apply(
    clearMap: () => Unit,
    createMap: Double => Unit,
    createRow: js.Any => Unit,
    destroy: () => Unit,
    klass: () => Unit,
    removeRow: js.Any => Unit,
    setStrategy: String => Unit,
    strategy: String | Unit,
    translate: js.Any => Unit
  ): BindStrategy = {
    val __obj = js.Dynamic.literal(clearMap = js.Any.fromFunction0(clearMap), createMap = js.Any.fromFunction1(createMap), createRow = js.Any.fromFunction1(createRow), destroy = js.Any.fromFunction0(destroy), klass = js.Any.fromFunction0(klass), removeRow = js.Any.fromFunction1(removeRow), setStrategy = js.Any.fromFunction1(setStrategy), strategy = strategy.asInstanceOf[js.Any], translate = js.Any.fromFunction1(translate))
    __obj.asInstanceOf[BindStrategy]
  }
  @scala.inline
  implicit class BindStrategyOps[Self <: BindStrategy] (val x: Self) extends AnyVal {
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
    def setClearMap(value: () => Unit): Self = this.set("clearMap", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateMap(value: Double => Unit): Self = this.set("createMap", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateRow(value: js.Any => Unit): Self = this.set("createRow", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setKlass(value: () => Unit): Self = this.set("klass", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveRow(value: js.Any => Unit): Self = this.set("removeRow", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStrategy(value: String => Unit): Self = this.set("setStrategy", js.Any.fromFunction1(value))
    @scala.inline
    def setStrategy(value: String | Unit): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslate(value: js.Any => Unit): Self = this.set("translate", js.Any.fromFunction1(value))
  }
  
}

