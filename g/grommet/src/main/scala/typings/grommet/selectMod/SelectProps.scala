package typings.grommet.selectMod

import typings.grommet.anon.Bottom
import typings.grommet.anon.Key
import typings.grommet.anon.Multiple
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var closeOnChange: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean | (js.Array[Double | String | js.Object])] = js.native
  
  var disabledKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  
  var dropAlign: js.UndefOr[Bottom] = js.native
  
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
  
  var dropProps: js.UndefOr[DropProps] = js.native
  
  var dropTarget: js.UndefOr[js.Object] = js.native
  
  var emptySearchMessage: js.UndefOr[String] = js.native
  
  var focusIndicator: js.UndefOr[Boolean] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var icon: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var labelKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var messages: js.UndefOr[Multiple] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var options: js.Array[String | Boolean | Double | Element | js.Object] = js.native
  
  var placeholder: js.UndefOr[PlaceHolderType] = js.native
  
  var plain: js.UndefOr[Boolean] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var searchPlaceholder: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.native
  
  var value: js.UndefOr[String | Element | js.Object | (js.Array[String | Double | js.Object])] = js.native
  
  var valueKey: js.UndefOr[String | Key | (js.Function1[/* repeated */ js.Any, _])] = js.native
  
  var valueLabel: js.UndefOr[ReactNode] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): SelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: (String | Boolean | Double | Element | js.Object)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[String | Boolean | Double | Element | js.Object]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setChildren(value: /* repeated */ js.Any => _): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setCloseOnChange(value: Boolean): Self = this.set("closeOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnChange: Self = this.set("closeOnChange", js.undefined)
    
    @scala.inline
    def setDisabledVarargs(value: (Double | String | js.Object)*): Self = this.set("disabled", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: Boolean | (js.Array[Double | String | js.Object])): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledKeyFunction1(value: /* repeated */ js.Any => _): Self = this.set("disabledKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabledKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("disabledKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledKey: Self = this.set("disabledKey", js.undefined)
    
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
    def setEmptySearchMessage(value: String): Self = this.set("emptySearchMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptySearchMessage: Self = this.set("emptySearchMessage", js.undefined)
    
    @scala.inline
    def setFocusIndicator(value: Boolean): Self = this.set("focusIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusIndicator: Self = this.set("focusIndicator", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setIconFunction1(value: /* repeated */ js.Any => _): Self = this.set("icon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIcon(value: Boolean | (js.Function1[/* repeated */ js.Any, _]) | ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabelKeyFunction1(value: /* repeated */ js.Any => _): Self = this.set("labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMessages(value: Multiple): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* repeated */ js.Any => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnMore(value: /* repeated */ js.Any => _): Self = this.set("onMore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMore: Self = this.set("onMore", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* repeated */ js.Any => _): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOnSearch(value: /* search */ String => Unit): Self = this.set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: PlaceHolderType): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = this.set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPlaceholder: Self = this.set("searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: Double*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: Double | js.Array[Double]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: (String | Double | js.Object)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | Element | js.Object | (js.Array[String | Double | js.Object])): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueKeyFunction1(value: /* repeated */ js.Any => _): Self = this.set("valueKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueKey(value: String | Key | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setValueLabel(value: ReactNode): Self = this.set("valueLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueLabel: Self = this.set("valueLabel", js.undefined)
  }
}
