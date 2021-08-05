package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.selectInterfaceMod.SelectChangeEventDetail
import typings.ionicCore.selectInterfaceMod.SelectCompareFn
import typings.ionicCore.selectInterfaceMod.SelectInterface
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSelect extends StObject {
  
  /**
    * The text to display on the cancel button.
    */
  var cancelText: js.UndefOr[String] = js.undefined
  
  /**
    * A property name or function used to compare object values
    */
  var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the select.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The interface the select should use: `action-sheet`, `popover` or `alert`.
    */
  var interface: js.UndefOr[SelectInterface] = js.undefined
  
  /**
    * Any additional options that the `alert`, `action-sheet` or `popover` interface can take. See the [ion-alert docs](../alert), the [ion-action-sheet docs](../action-sheet) and the [ion-popover docs](../popover) for the create options for each interface.  Note: `interfaceOptions` will not override `inputs` or `buttons` with the `alert` interface.
    */
  var interfaceOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * If `true`, the select can accept multiple values.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The text to display on the ok button.
    */
  var okText: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the select loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the selection is cancelled.
    */
  var onIonCancel: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[SelectChangeEventDetail[js.Any]], Unit]] = js.undefined
  
  /**
    * Emitted when the select has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ CustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * The text to display when the select is empty.
    */
  var placeholder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The text to display instead of the selected option's value.
    */
  var selectedText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * the value of the select.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}
object IonSelect {
  
  inline def apply(): IonSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSelect]
  }
  
  extension [Self <: IonSelect](x: Self) {
    
    inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setCompareWith(value: String | SelectCompareFn): Self = StObject.set(x, "compareWith", value.asInstanceOf[js.Any])
    
    inline def setCompareWithFunction2(value: (/* currentValue */ js.Any, /* compareValue */ js.Any) => Boolean): Self = StObject.set(x, "compareWith", js.Any.fromFunction2(value))
    
    inline def setCompareWithNull: Self = StObject.set(x, "compareWith", null)
    
    inline def setCompareWithUndefined: Self = StObject.set(x, "compareWith", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInterface(value: SelectInterface): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceOptions(value: js.Any): Self = StObject.set(x, "interfaceOptions", value.asInstanceOf[js.Any])
    
    inline def setInterfaceOptionsUndefined: Self = StObject.set(x, "interfaceOptions", js.undefined)
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
    
    inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1(value))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonCancel(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonCancel", js.Any.fromFunction1(value))
    
    inline def setOnIonCancelUndefined: Self = StObject.set(x, "onIonCancel", js.undefined)
    
    inline def setOnIonChange(value: /* event */ CustomEvent[SelectChangeEventDetail[js.Any]] => Unit): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1(value))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ CustomEvent[Unit] => Unit): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1(value))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSelectedText(value: String): Self = StObject.set(x, "selectedText", value.asInstanceOf[js.Any])
    
    inline def setSelectedTextNull: Self = StObject.set(x, "selectedText", null)
    
    inline def setSelectedTextUndefined: Self = StObject.set(x, "selectedText", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
