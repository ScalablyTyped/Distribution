package typings.k6

import typings.k6.anon.stateElementStateundefine
import typings.k6.experimentalBrowserFrameMod.Frame
import typings.k6.experimentalBrowserJsHandleMod.JSHandle
import typings.k6.experimentalBrowserMod.ElementClickOptions
import typings.k6.experimentalBrowserMod.ElementHandleOptions
import typings.k6.experimentalBrowserMod.InputElementState
import typings.k6.experimentalBrowserMod.KeyboardModifierOptions
import typings.k6.experimentalBrowserMod.KeyboardPressOptions
import typings.k6.experimentalBrowserMod.MouseMoveOptions
import typings.k6.experimentalBrowserMod.Rect
import typings.k6.experimentalBrowserMod.ScreenshotOptions
import typings.k6.experimentalBrowserMod.SelectOptionsObject
import typings.k6.experimentalBrowserMod.StrictnessOptions
import typings.k6.experimentalBrowserMod.TimeoutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserElementHandleMod {
  
  @JSImport("k6/experimental/browser/element_handle", "ElementHandle")
  @js.native
  open class ElementHandle () extends JSHandle[Any] {
    
    /**
      * Finds an element matching the specified selector in the `ElementHandle`'s subtree.
      * @param selector A selector to query element for.
      * @returns An `ElementHandle` pointing to the result element or `null`.
      */
    @JSName("$")
    def $(selector: String): ElementHandle | Null = js.native
    
    /**
      * Finds all elements matching the specified selector in the `ElementHandle`'s subtree.
      * @param selector A selector to query element for.
      * @returns A list of `ElementHandle`s pointing to the result elements.
      */
    @JSName("$$")
    def DollarDollar(selector: String): js.Array[ElementHandle] = js.native
    
    /**
      * This method returns the bounding box of the element.
      * @returns Element's bounding box.
      */
    def boundingBox(): Rect = js.native
    
    /**
      * Get the content frame for element handles.
      * @returns The content frame handle of the element handle.
      */
    def contentFrame(): Frame = js.native
    
    /**
      * Fill the `input` or `textarea` element with the provided `value`.
      * @param value Value to fill for the `input` or `textarea` element.
      * @param options Element handle options.
      */
    def fill(value: String): Unit = js.native
    def fill(value: String, options: ElementHandleOptions): Unit = js.native
    
    /**
      * Focuses the element.
      */
    def focus(): Unit = js.native
    
    /**
      * Fetch the element's attribute value.
      * @param name Attribute name to get the value for.
      * @returns Attribute value.
      */
    def getAttribute(name: String): String | Null = js.native
    
    /**
      * Scrolls element into view and hovers over its center point.
      * @param options Hover options.
      */
    def hover(): Unit = js.native
    def hover(options: ElementClickOptions & KeyboardModifierOptions): Unit = js.native
    
    /**
      * Returns the `element.innerHTML`.
      * @returns Element's innerHTML.
      */
    def innerHTML(): String = js.native
    
    /**
      * Returns the `element.innerText`.
      * @returns Element's innerText.
      */
    def innerText(): String = js.native
    
    /**
      * Returns `input.value` for the selected `input`, `textarea` or `select` element.
      * @returns The input value of the element.
      */
    def inputValue(): String = js.native
    def inputValue(options: TimeoutOptions): String = js.native
    
    /**
      * Checks if a checkbox or radio is checked.
      * @returns Whether the element is checked.
      */
    def isChecked(): Boolean = js.native
    
    /**
      * Checks if the element is disabled.
      * @returns Whether the element is disabled.
      */
    def isDisabled(): Boolean = js.native
    
    /**
      * Checks if the element is editable.
      * @returns Whether the element is editable.
      */
    def isEditable(): Boolean = js.native
    
    /**
      * Checks if the element is enabled.
      * @returns Whether the element is enabled.
      */
    def isEnabled(): Boolean = js.native
    
    /**
      * Checks if the element is hidden.
      * @returns Whether the element is hidden.
      */
    def isHidden(): Boolean = js.native
    
    /**
      * Checks if the element is visible.
      * @returns Whether the element is visible.
      */
    def isVisible(): Boolean = js.native
    
    /**
      * Returns the frame containing the given element.
      * @returns The frame that contains the element handle.
      */
    def ownerFrame(): Frame = js.native
    
    /**
      * Focuses the element, and then uses `keyboard.down` and `keyboard.up` with the specified key.
      * @param key A keyboard key name or a single character to press.
      * @param options Keyboard press options.
      */
    def press(key: String): Unit = js.native
    def press(key: String, options: KeyboardPressOptions): Unit = js.native
    
    /**
      * This method scrolls element into view, if needed, and then captures a
      * screenshot of it.
      * @param options Screenshot options.
      * @returns An `ArrayBuffer` with the screenshot data.
      */
    def screenshot(): js.typedarray.ArrayBuffer = js.native
    def screenshot(options: ScreenshotOptions & TimeoutOptions): js.typedarray.ArrayBuffer = js.native
    
    /**
      * This method checks whether the element is actionable using provided options, and
      * then tries to scroll it into view, unless it is completely visible.
      * @param options Element handle options.
      */
    def scrollIntoViewIfNeeded(): Unit = js.native
    def scrollIntoViewIfNeeded(options: ElementHandleOptions): Unit = js.native
    
    /**
      * Select one or more options of a `<select>` element which match the values.
      * @param values Values of options to select.
      * @param options Element handle options.
      * @returns List of selected options.
      */
    def selectOption(values: String): js.Array[String] = js.native
    def selectOption(values: String, options: ElementHandleOptions): js.Array[String] = js.native
    def selectOption(values: js.Array[ElementHandle | SelectOptionsObject | String]): js.Array[String] = js.native
    def selectOption(values: js.Array[ElementHandle | SelectOptionsObject | String], options: ElementHandleOptions): js.Array[String] = js.native
    def selectOption(values: ElementHandle): js.Array[String] = js.native
    def selectOption(values: ElementHandle, options: ElementHandleOptions): js.Array[String] = js.native
    def selectOption(values: SelectOptionsObject): js.Array[String] = js.native
    def selectOption(values: SelectOptionsObject, options: ElementHandleOptions): js.Array[String] = js.native
    
    /**
      * Focuses the element and selects all its text content.
      * @param options Element handle options.
      */
    def selectText(): Unit = js.native
    def selectText(options: ElementHandleOptions): Unit = js.native
    
    /**
      * Scrolls element into view if needed, and then uses `page.tapscreen` to tap in the center of the element
      * or at the specified position.
      * @param options Tap options.
      */
    def tap(): Unit = js.native
    def tap(options: MouseMoveOptions): Unit = js.native
    
    /**
      * Returns the `node.textContent`.
      * @returns The text content of the element.
      */
    def textContent(): String = js.native
    
    /**
      * Scrolls element into view, focuses element and types text.
      * @param text Text to type into the element.
      * @param options Typing options.
      */
    def `type`(text: String): Unit = js.native
    def `type`(text: String, options: KeyboardPressOptions): Unit = js.native
    
    /**
      * Scrolls element into view, and if it's an input element of type
      * checkbox that is already checked, clicks on it to mark it as unchecked.
      * @param options Click options.
      */
    def uncheck(): Unit = js.native
    def uncheck(options: ElementClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Returns when the element satisfies the `state`.
      * @param state Wait for element to satisfy this state.
      * @param options Wait options.
      */
    def waitForElementState(state: InputElementState): Unit = js.native
    def waitForElementState(state: InputElementState, options: TimeoutOptions): Unit = js.native
    
    /**
      * Returns when the child element matching `selector` satisfies the `state`.
      * @param selector A selector to query for.
      * @param options Wait options.
      */
    def waitForSelector(selector: String): Unit = js.native
    def waitForSelector(selector: String, options: stateElementStateundefine): Unit = js.native
  }
}
