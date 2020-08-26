package typings.handsontable.mod.Handsontable.plugins.moveUI

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUI extends js.Object {
  var hot: Core = js.native
  var state: Double = js.native
  def appendTo(wrapper: HTMLElement): Unit = js.native
  def build(): Unit = js.native
  def destroy(): Unit = js.native
  def getOffset(): js.Object = js.native
  def getPosition(): js.Object = js.native
  def getSize(): js.Object = js.native
  def isAppended(): Boolean = js.native
  def isBuilt(): Boolean = js.native
  def setOffset(top: Double, left: Double): Unit = js.native
  def setPosition(top: Double, left: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

object BaseUI {
  @scala.inline
  def apply(
    appendTo: HTMLElement => Unit,
    build: () => Unit,
    destroy: () => Unit,
    getOffset: () => js.Object,
    getPosition: () => js.Object,
    getSize: () => js.Object,
    hot: Core,
    isAppended: () => Boolean,
    isBuilt: () => Boolean,
    setOffset: (Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    setSize: (Double, Double) => Unit,
    state: Double
  ): BaseUI = {
    val __obj = js.Dynamic.literal(appendTo = js.Any.fromFunction1(appendTo), build = js.Any.fromFunction0(build), destroy = js.Any.fromFunction0(destroy), getOffset = js.Any.fromFunction0(getOffset), getPosition = js.Any.fromFunction0(getPosition), getSize = js.Any.fromFunction0(getSize), hot = hot.asInstanceOf[js.Any], isAppended = js.Any.fromFunction0(isAppended), isBuilt = js.Any.fromFunction0(isBuilt), setOffset = js.Any.fromFunction2(setOffset), setPosition = js.Any.fromFunction2(setPosition), setSize = js.Any.fromFunction2(setSize), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUI]
  }
  @scala.inline
  implicit class BaseUIOps[Self <: BaseUI] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: HTMLElement => Unit): Self = this.set("appendTo", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => Unit): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOffset(value: () => js.Object): Self = this.set("getOffset", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPosition(value: () => js.Object): Self = this.set("getPosition", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSize(value: () => js.Object): Self = this.set("getSize", js.Any.fromFunction0(value))
    @scala.inline
    def setHot(value: Core): Self = this.set("hot", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAppended(value: () => Boolean): Self = this.set("isAppended", js.Any.fromFunction0(value))
    @scala.inline
    def setIsBuilt(value: () => Boolean): Self = this.set("isBuilt", js.Any.fromFunction0(value))
    @scala.inline
    def setSetOffset(value: (Double, Double) => Unit): Self = this.set("setOffset", js.Any.fromFunction2(value))
    @scala.inline
    def setSetPosition(value: (Double, Double) => Unit): Self = this.set("setPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setSetSize(value: (Double, Double) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

