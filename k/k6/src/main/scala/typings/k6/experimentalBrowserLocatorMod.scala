package typings.k6

import typings.k6.anon.Index
import typings.k6.anon.stateElementStateundefineState
import typings.k6.experimentalBrowserMod.ElementClickOptions
import typings.k6.experimentalBrowserMod.ElementHandleOptions
import typings.k6.experimentalBrowserMod.EvaluationArgument
import typings.k6.experimentalBrowserMod.KeyboardPressOptions
import typings.k6.experimentalBrowserMod.MouseMoveOptions
import typings.k6.experimentalBrowserMod.MouseMultiClickOptions
import typings.k6.experimentalBrowserMod.StrictnessOptions
import typings.k6.experimentalBrowserMod.TimeoutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserLocatorMod {
  
  @JSImport("k6/experimental/browser/locator", "Locator")
  @js.native
  open class Locator () extends StObject {
    
    /**
      * Use this method to select an `input type="checkbox"`.
      * @param options Options to use.
      */
    def check(): Unit = js.native
    def check(options: ElementClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Mouse click on the chosen element.
      * @param options Options to use.
      * @returns Promise which resolves when the element is successfully clicked.
      */
    def click(): js.Promise[Unit] = js.native
    def click(options: MouseMoveOptions & MouseMultiClickOptions & StrictnessOptions): js.Promise[Unit] = js.native
    
    /**
      * Mouse double click on the chosen element.
      * @param options Options to use.
      */
    def dblclick(): Unit = js.native
    def dblclick(options: MouseMoveOptions & MouseMultiClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Dispatches HTML DOM event types e.g. `click`.
      * @param type DOM event type.
      * @param eventInit Event-specific properties.
      * @param options Options to use.
      */
    def dispatchEvent(`type`: String): Unit = js.native
    def dispatchEvent(`type`: String, eventInit: Unit, options: TimeoutOptions & StrictnessOptions): Unit = js.native
    def dispatchEvent(`type`: String, eventInit: EvaluationArgument): Unit = js.native
    def dispatchEvent(`type`: String, eventInit: EvaluationArgument, options: TimeoutOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Fill an `input`, `textarea` or `contenteditable` element with the provided value.
      * @param value Value to fill for the `input` or `textarea` element.
      * @param options Options to use.
      */
    def fill(value: String): Unit = js.native
    def fill(value: String, options: ElementHandleOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Focuses the element using locator's selector.
      * @param options Options to use.
      */
    def focus(): Unit = js.native
    def focus(options: TimeoutOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Returns the element attribute value for the given attribute name.
      * @param name Attribute name to retrieve value for.
      * @param options Options to use.
      * @returns Attribute value.
      */
    def getAttribute(name: String): String | Null = js.native
    def getAttribute(name: String, options: TimeoutOptions & StrictnessOptions): String | Null = js.native
    
    /**
      * Hover over the element.
      * @param options Options to use.
      */
    def hover(): Unit = js.native
    def hover(options: MouseMoveOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Returns the `element.innerHTML`.
      * @param options Options to use.
      * @returns Element's innerHTML.
      */
    def innerHTML(): String = js.native
    def innerHTML(options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Returns the `element.innerText`.
      * @param options Options to use.
      * @returns Element's innerText.
      */
    def innerText(): String = js.native
    def innerText(options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Returns `input.value` for the selected `input`, `textarea` or `select` element.
      * @param options Options to use.
      * @returns The input value of the element.
      */
    def inputValue(): String = js.native
    def inputValue(options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Checks to see if the `input type="checkbox"` is selected or not.
      * @param options Options to use.
      * @returns `true` if the element is checked, `false` otherwise.
      */
    def isChecked(): Boolean = js.native
    def isChecked(options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Checks if the element is `disabled`.
      * @param options Options to use.
      * @returns `true` if the element is disabled, `false` otherwise.
      */
    def isDisabled(): Boolean = js.native
    def isDisabled(options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Checks if the element is editable.
      * @param options Options to use.
      * @returns `true` if the element is editable, `false` otherwise.
      */
    def isEditable(): Boolean = js.native
    def isEditable(options: TimeoutOptions): Boolean = js.native
    
    /**
      * Checks if the element is `enabled`.
      * @param options Options to use.
      * @returns `true` if the element is enabled, `false` otherwise.
      */
    def isEnabled(): Boolean = js.native
    def isEnabled(options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Checks if the element is `hidden`.
      * @param options Options to use.
      * @returns `true` if the element is hidden, `false` otherwise.
      */
    def isHidden(): Boolean = js.native
    def isHidden(options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Checks if the element is `visible`.
      * @param options Options to use.
      * @returns `true` if the element is visible, `false` otherwise.
      */
    def isVisible(): Boolean = js.native
    def isVisible(options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Press a single key on the keyboard or a combination of keys.
      * A superset of the key values can be found [here](https://developer.mozilla.org/en-US/docs/Web/API/UI_Events/Keyboard_event_key_values).
      * @param key Name of the key to press or a character to generate, such as `ArrowLeft` or `a`.
      * @param options Keyboard press options.
      */
    def press(key: String): Unit = js.native
    def press(key: String, options: KeyboardPressOptions): Unit = js.native
    
    /**
      * Select one or more options which match the values. If the select has the multiple attribute, all matching options are selected,
      * otherwise only the first option matching one of the passed options is selected.
      * @param values Values of options to select.
      * @param options Options to use.
      * @returns List of selected options.
      */
    def selectOption(values: String): js.Array[String] = js.native
    def selectOption(values: String, options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    def selectOption(values: js.Array[String]): js.Array[String] = js.native
    def selectOption(values: js.Array[String], options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    def selectOption(values: Index): js.Array[String] = js.native
    def selectOption(values: Index, options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    
    /**
      * Tap on the chosen element.
      * @param options Options to use.
      */
    def tap(): Unit = js.native
    def tap(options: MouseMoveOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Returns the `element.textContent`.
      * @param options Options to use.
      * @returns Element's textContent.
      */
    def textContent(): String = js.native
    def textContent(options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Type a text into the input field.
      * @param text Text to type into the input field.
      * @param options Typing options.
      */
    def `type`(text: String): Unit = js.native
    def `type`(text: String, options: KeyboardPressOptions): Unit = js.native
    
    /**
      * Use this method to unselect an `input type="checkbox"`.
      * @param options Options to use.
      */
    def uncheck(): Unit = js.native
    def uncheck(options: ElementClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Wait for the element to be in a particular state e.g. `visible`.
      * @param options Wait options.
      */
    def waitFor(): Unit = js.native
    def waitFor(options: stateElementStateundefineState): Unit = js.native
  }
}
