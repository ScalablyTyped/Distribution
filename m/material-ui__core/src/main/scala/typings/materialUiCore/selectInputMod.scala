package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.PartialMenuProps
import typings.materialUiCore.anon.Value
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.std.HTMLDivElement
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectInputMod extends Shortcut {
  
  @JSImport("@material-ui/core/Select/SelectInput", JSImport.Default)
  @js.native
  val default: ComponentType[SelectInputProps] = js.native
  
  trait SelectInputProps extends StObject {
    
    var IconComponent: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var MenuProps: js.UndefOr[PartialMenuProps] = js.undefined
    
    var SelectDisplayProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoWidth: Boolean
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | Value, Unit]] = js.undefined
    
    var multiple: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    var native: Boolean
    
    var onBlur: js.UndefOr[FocusEventHandler[js.Any]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode, Unit]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[js.Any]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderValue: js.UndefOr[
        js.Function1[
          /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]), 
          ReactNode
        ]
      ] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var value: String | Double | Boolean | (js.Array[String | Double | Boolean])
    
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object SelectInputProps {
    
    inline def apply(
      autoWidth: Boolean,
      multiple: Boolean,
      native: Boolean,
      value: String | Double | Boolean | (js.Array[String | Double | Boolean])
    ): SelectInputProps = {
      val __obj = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInputProps]
    }
    
    extension [Self <: SelectInputProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIconComponent(value: ReactType[js.Any]): Self = StObject.set(x, "IconComponent", value.asInstanceOf[js.Any])
      
      inline def setIconComponentUndefined: Self = StObject.set(x, "IconComponent", js.undefined)
      
      inline def setInputRef(value: /* ref */ HTMLSelectElement | Value => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setMenuProps(value: PartialMenuProps): Self = StObject.set(x, "MenuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "MenuProps", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: FocusEvent[js.Any] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLSelectElement], /* child */ ReactNode) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[js.Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnOpen(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderValue(value: /* value */ String | Double | Boolean | (js.Array[String | Double | Boolean]) => ReactNode): Self = StObject.set(x, "renderValue", js.Any.fromFunction1(value))
      
      inline def setRenderValueUndefined: Self = StObject.set(x, "renderValue", js.undefined)
      
      inline def setSelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "SelectDisplayProps", value.asInstanceOf[js.Any])
      
      inline def setSelectDisplayPropsUndefined: Self = StObject.set(x, "SelectDisplayProps", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setValue(value: String | Double | Boolean | (js.Array[String | Double | Boolean])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = ComponentType[SelectInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectInputMod.foo` */
  override def _to: ComponentType[SelectInputProps] = default
}
