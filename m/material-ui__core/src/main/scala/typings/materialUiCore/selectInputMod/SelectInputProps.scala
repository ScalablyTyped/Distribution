package typings.materialUiCore.selectInputMod

import typings.materialUiCore.anon.PartialMenuProps
import typings.materialUiCore.anon.Value
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.react.mod.ChangeEvent
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectInputProps extends js.Object {
  
  var IconComponent: js.UndefOr[ReactType[_]] = js.native
  
  var MenuProps: js.UndefOr[PartialMenuProps] = js.native
  
  var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var autoWidth: Boolean = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Value, Unit]] = js.native
  
  var multiple: Boolean = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var native: Boolean = js.native
  
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.native
  
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
  ] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var renderValue: js.UndefOr[
    js.Function1[
      /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]), 
      ReactNode
    ]
  ] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var value: String | Double | Boolean | (js.Array[String | Double | Boolean]) = js.native
  
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}
object SelectInputProps {
  
  @scala.inline
  def apply(
    autoWidth: Boolean,
    multiple: Boolean,
    native: Boolean,
    value: String | Double | Boolean | (js.Array[String | Double | Boolean])
  ): SelectInputProps = {
    val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInputProps]
  }
  
  @scala.inline
  implicit class SelectInputPropsOps[Self <: SelectInputProps] (val x: Self) extends AnyVal {
    
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
    def setAutoWidth(value: Boolean): Self = this.set("autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (String | Double | Boolean)*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconComponent(value: ReactType[_]): Self = this.set("IconComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconComponent: Self = this.set("IconComponent", js.undefined)
    
    @scala.inline
    def setMenuProps(value: PartialMenuProps): Self = this.set("MenuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuProps: Self = this.set("MenuProps", js.undefined)
    
    @scala.inline
    def setSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("SelectDisplayProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectDisplayProps: Self = this.set("SelectDisplayProps", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInputRef(value: /* ref */ HTMLSelectElement | Value => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnBlur(value: FocusEvent[_] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* event */ ChangeEvent[js.Object] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setOnFocus(value: FocusEvent[_] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRenderValue(value: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => ReactNode): Self = this.set("renderValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderValue: Self = this.set("renderValue", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setVariant(value: standard | outlined | filled): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
