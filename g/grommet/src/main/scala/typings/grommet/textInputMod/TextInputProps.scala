package typings.grommet.textInputMod

import typings.grommet.anon.Bottom
import typings.grommet.anon.EnterSelect
import typings.grommet.anon.LabelValue
import typings.grommet.anon.Suggestion
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputProps extends js.Object {
  var dropAlign: js.UndefOr[Bottom] = js.native
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
  var dropProps: js.UndefOr[DropProps] = js.native
  var dropTarget: js.UndefOr[js.Object] = js.native
  var focusIndicator: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[Element] = js.native
  var id: js.UndefOr[String] = js.native
  var messages: js.UndefOr[EnterSelect] = js.native
  var name: js.UndefOr[String] = js.native
  var onSelect: js.UndefOr[js.Function1[/* x */ Suggestion, Unit]] = js.native
  var onSuggestionsClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onSuggestionsOpen: js.UndefOr[js.Function0[Unit]] = js.native
  var placeholder: js.UndefOr[PlaceHolderType] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  var suggestions: js.UndefOr[js.Array[LabelValue | String]] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object TextInputProps {
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  @scala.inline
  implicit class TextInputPropsOps[Self <: TextInputProps] (val x: Self) extends AnyVal {
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
    def setDropAlign(value: Bottom): Self = this.set("dropAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropAlign: Self = this.set("dropAlign", js.undefined)
    @scala.inline
    def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = this.set("dropHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropHeight: Self = this.set("dropHeight", js.undefined)
    @scala.inline
    def setDropProps(value: DropProps): Self = this.set("dropProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropProps: Self = this.set("dropProps", js.undefined)
    @scala.inline
    def setDropTarget(value: js.Object): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    @scala.inline
    def setFocusIndicator(value: Boolean): Self = this.set("focusIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusIndicator: Self = this.set("focusIndicator", js.undefined)
    @scala.inline
    def setIcon(value: Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMessages(value: EnterSelect): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnSelect(value: /* x */ Suggestion => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnSuggestionsClose(value: () => Unit): Self = this.set("onSuggestionsClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuggestionsClose: Self = this.set("onSuggestionsClose", js.undefined)
    @scala.inline
    def setOnSuggestionsOpen(value: () => Unit): Self = this.set("onSuggestionsOpen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuggestionsOpen: Self = this.set("onSuggestionsOpen", js.undefined)
    @scala.inline
    def setPlaceholder(value: PlaceHolderType): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuggestionsVarargs(value: (LabelValue | String)*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[LabelValue | String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

