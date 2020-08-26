package typings.grommet.keyboardMod

import typings.grommet.grommetStrings.component
import typings.grommet.grommetStrings.document
import typings.grommet.utilsMod.KeyboardType
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardProps extends js.Object {
  var onBackspace: js.UndefOr[KeyboardType] = js.native
  var onComma: js.UndefOr[KeyboardType] = js.native
  var onDown: js.UndefOr[KeyboardType] = js.native
  var onEnter: js.UndefOr[KeyboardType] = js.native
  var onEsc: js.UndefOr[KeyboardType] = js.native
  var onKeyDown: js.UndefOr[KeyboardType] = js.native
  var onLeft: js.UndefOr[KeyboardType] = js.native
  var onRight: js.UndefOr[KeyboardType] = js.native
  var onShift: js.UndefOr[KeyboardType] = js.native
  var onSpace: js.UndefOr[KeyboardType] = js.native
  var onTab: js.UndefOr[KeyboardType] = js.native
  var onUp: js.UndefOr[KeyboardType] = js.native
  var target: js.UndefOr[component | document] = js.native
}

object KeyboardProps {
  @scala.inline
  def apply(): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardProps]
  }
  @scala.inline
  implicit class KeyboardPropsOps[Self <: KeyboardProps] (val x: Self) extends AnyVal {
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
    def setOnBackspace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onBackspace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBackspace: Self = this.set("onBackspace", js.undefined)
    @scala.inline
    def setOnComma(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onComma", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnComma: Self = this.set("onComma", js.undefined)
    @scala.inline
    def setOnDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDown: Self = this.set("onDown", js.undefined)
    @scala.inline
    def setOnEnter(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onEsc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEsc: Self = this.set("onEsc", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnLeft(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onLeft", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLeft: Self = this.set("onLeft", js.undefined)
    @scala.inline
    def setOnRight(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onRight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRight: Self = this.set("onRight", js.undefined)
    @scala.inline
    def setOnShift(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onShift", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShift: Self = this.set("onShift", js.undefined)
    @scala.inline
    def setOnSpace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onSpace", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSpace: Self = this.set("onSpace", js.undefined)
    @scala.inline
    def setOnTab(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onTab", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    @scala.inline
    def setOnUp(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUp: Self = this.set("onUp", js.undefined)
    @scala.inline
    def setTarget(value: component | document): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

