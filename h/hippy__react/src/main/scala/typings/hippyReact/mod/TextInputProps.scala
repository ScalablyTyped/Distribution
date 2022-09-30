package typings.hippyReact.mod

import typings.hippyReact.anon.NativeEventContentSize
import typings.hippyReact.anon.NativeEventSelection
import typings.hippyReact.hippyReactStrings.`phone-pad`
import typings.hippyReact.hippyReactStrings.default
import typings.hippyReact.hippyReactStrings.done
import typings.hippyReact.hippyReactStrings.email
import typings.hippyReact.hippyReactStrings.go
import typings.hippyReact.hippyReactStrings.next
import typings.hippyReact.hippyReactStrings.numeric
import typings.hippyReact.hippyReactStrings.password
import typings.hippyReact.hippyReactStrings.search
import typings.hippyReact.hippyReactStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * If `true`, focuses the input on `componentDidMount`.
    *
    * Default: false
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * add in 2.11.5
    */
  var caretColor: js.UndefOr[String] = js.undefined
  
  /**
    * Provides an initial value that will change when the user starts typing.
    * Useful for use-cases where you do not want to deal with listening to events
    * and updating the value prop to keep the controlled state in sync.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * If `false`, text is not editable.
    *
    * Default: true
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines which keyboard to open, e.g.`numeric`.
    *
    * The following values work across platforms:
    * * `default`
    * * `number-pad`
    * * `decimal-pad`
    * * `numeric`
    * * `email-address`
    * * `phone-pad`
    * * `search`
    */
  var keyboardType: js.UndefOr[default | numeric | password | email | `phone-pad` | search] = js.undefined
  
  /**
    * Limits the maximum number of characters that can be entered.
    * Use this instead of implementing the logic in JS to avoid flicker.
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the text input can be multiple lines. The default value is `false`.
    * It is important to note that this aligns the text to the top on iOS,
    * and centers it on Android. Use with textAlignVertical set to top for the same behavior
    * in both platforms.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the number of lines for a TextInput.
    * Use it with multiline set to true to be able to fill the lines.
    */
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback that is called when the text input is blurred.
    */
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input's text changes.
    * Changed text is passed as a single string argument to the callback handler.
    *
    * @param {string} text - Text content.
    */
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input's content size changes.
    *
    * @param {Object} evt - Content size change event data.
    * @param {number} evt.nativeEvent.contentSize.width - Width of content.
    * @param {number} evt.nativeEvent.contentSize.height - Height of content.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* evt */ NativeEventContentSize, Unit]] = js.undefined
  
  /**
    * Callback that is called when text input ends.
    */
  var onEndEditing: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback that is called when keyboard popup
    *
    * @param {Object} evt - Keyboard will show event data.
    * @param {number} evt.keyboardHeight - Keyboard height.
    */
  var onKeyboardWillShow: js.UndefOr[js.Function1[/* evt */ KeyboardWillShowEvent, Unit]] = js.undefined
  
  /**
    * Callback that is called when the text input selection is changed.
    *
    * @param {Object} evt -  Selection change event data.
    * @param {number} evt.nativeEvent.selection.start - Start index of selection
    * @param {number} evt.nativeEvent.selection.end - End index of selection.
    */
  var onSelectionChange: js.UndefOr[js.Function1[/* evt */ NativeEventSelection, Unit]] = js.undefined
  
  /**
    * The string that will be rendered before text input has been entered.
    */
  var placeholder: js.UndefOr[Double] = js.undefined
  
  /**
    * The text color of the placeholder string.
    */
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  
  /**
    * The text colors array of the placeholder string.
    */
  var placeholderTextColors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Determines how the return key should look.
    *
    * The following values work across platforms:
    * * `done`
    * * `go`
    * * `next`
    * * `search`
    * * `send`
    */
  var returnKeyType: js.UndefOr[done | go | next | search | send] = js.undefined
  
  var style: js.UndefOr[TextStyleProp] = js.undefined
  
  /**
    * The color of the `TextInput` underline.
    */
  var underlineColorAndroid: js.UndefOr[String] = js.undefined
  
  /**
    * The value to show for the text input. TextInput is a controlled component,
    * which means the native value will be forced to match this value prop if provided.
    * For most uses, this works great, but in some cases this may cause flickering
    * - one common cause is preventing edits by keeping value the same.
    * In addition to setting the same value, either set editable={false},
    * or set/update maxLength to prevent unwanted edits without flicker.
    */
  var value: js.UndefOr[String] = js.undefined
}
object TextInputProps {
  
  inline def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  
  extension [Self <: TextInputProps](x: Self) {
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCaretColor(value: String): Self = StObject.set(x, "caretColor", value.asInstanceOf[js.Any])
    
    inline def setCaretColorUndefined: Self = StObject.set(x, "caretColor", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setKeyboardType(value: default | numeric | password | email | `phone-pad` | search): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChangeText(value: /* text */ String => Unit): Self = StObject.set(x, "onChangeText", js.Any.fromFunction1(value))
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnContentSizeChange(value: /* evt */ NativeEventContentSize => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnEndEditing(value: () => Unit): Self = StObject.set(x, "onEndEditing", js.Any.fromFunction0(value))
    
    inline def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
    
    inline def setOnKeyboardWillShow(value: /* evt */ KeyboardWillShowEvent => Unit): Self = StObject.set(x, "onKeyboardWillShow", js.Any.fromFunction1(value))
    
    inline def setOnKeyboardWillShowUndefined: Self = StObject.set(x, "onKeyboardWillShow", js.undefined)
    
    inline def setOnSelectionChange(value: /* evt */ NativeEventSelection => Unit): Self = StObject.set(x, "onSelectionChange", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    inline def setPlaceholder(value: Double): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColor(value: String): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
    
    inline def setPlaceholderTextColors(value: js.Array[String]): Self = StObject.set(x, "placeholderTextColors", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColorsUndefined: Self = StObject.set(x, "placeholderTextColors", js.undefined)
    
    inline def setPlaceholderTextColorsVarargs(value: String*): Self = StObject.set(x, "placeholderTextColors", js.Array(value*))
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReturnKeyType(value: done | go | next | search | send): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    inline def setStyle(value: TextStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: TextStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setUnderlineColorAndroid(value: String): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
