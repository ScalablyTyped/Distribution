package typings.k6

import typings.k6.experimentalBrowserElementHandleMod.ElementHandle
import typings.k6.experimentalBrowserJsHandleMod.JSHandle
import typings.k6.experimentalBrowserLocatorMod.Locator
import typings.k6.experimentalBrowserMod.ContentLoadOptions
import typings.k6.experimentalBrowserMod.ElementClickOptions
import typings.k6.experimentalBrowserMod.ElementHandleOptions
import typings.k6.experimentalBrowserMod.ElementStateFilter
import typings.k6.experimentalBrowserMod.KeyboardModifierOptions
import typings.k6.experimentalBrowserMod.KeyboardPressOptions
import typings.k6.experimentalBrowserMod.LifecycleEvent
import typings.k6.experimentalBrowserMod.MouseClickOptions
import typings.k6.experimentalBrowserMod.MouseMoveOptions
import typings.k6.experimentalBrowserMod.MouseMultiClickOptions
import typings.k6.experimentalBrowserMod.NavigationOptions
import typings.k6.experimentalBrowserMod.PageFunction
import typings.k6.experimentalBrowserMod.PollingOptions
import typings.k6.experimentalBrowserMod.SelectOptionsObject
import typings.k6.experimentalBrowserMod.StrictnessOptions
import typings.k6.experimentalBrowserMod.TimeoutOptions
import typings.k6.experimentalBrowserPageMod.Page
import typings.k6.experimentalBrowserResponseMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserFrameMod {
  
  @JSImport("k6/experimental/browser/frame", "Frame")
  @js.native
  open class Frame () extends StObject {
    
    /**
      * Finds an element matching the specified selector within the `Frame`.
      * @param selector A selector to query element for.
      * @returns An `ElementHandle` pointing to the result element or `null`.
      */
    @JSName("$")
    def $(selector: String): ElementHandle | Null = js.native
    
    /**
      * Finds all elements matching the specified selector within the `Frame`.
      * @param selector A selector to query element for.
      * @returns A list of `ElementHandle`s pointing to the result elements.
      */
    @JSName("$$")
    def DollarDollar(selector: String): js.Array[ElementHandle] = js.native
    
    /**
      * Checks the first checkbox element found that matches selector.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def check(selector: String): Unit = js.native
    def check(selector: String, options: ElementClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Get a list of all child frames.
      * @returns A list of all child frames.
      */
    def childFrames(): js.Array[Frame] = js.native
    
    /**
      * Clicks the element.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns A promise that resolves when the element is clicked.
      */
    def click(selector: String): js.Promise[Unit] = js.native
    def click(selector: String, options: MouseMultiClickOptions & StrictnessOptions): js.Promise[Unit] = js.native
    
    /**
      * Get the HTML content of the frame.
      * @returns The HTML content of the frame.
      */
    def content(): String = js.native
    
    /**
      * Double clicks the element.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def dblclick(selector: String): Unit = js.native
    def dblclick(selector: String, options: MouseClickOptions & MouseMoveOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Dispatches an event for the first element matching the selector.
      * @param selector The selector to use.
      * @param type The type of event to dispatch.
      * @param eventInit The event initialization properties.
      * @param options The options to use.
      */
    def dispatchEvent(selector: String, `type`: String): Unit = js.native
    def dispatchEvent(selector: String, `type`: String, eventInit: js.Object): Unit = js.native
    def dispatchEvent(
      selector: String,
      `type`: String,
      eventInit: js.Object,
      options: TimeoutOptions & StrictnessOptions
    ): Unit = js.native
    def dispatchEvent(selector: String, `type`: String, eventInit: Unit, options: TimeoutOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Returns the value of the `pageFunction` invocation.
      *
      * A string can also be passed in instead of a function.
      *
      * @param pageFunction Function to be evaluated in the page context.
      * @param arg Optional argument to pass to `pageFunction`.
      */
    def evaluate[R, Arg](pageFunction: PageFunction[Arg, R]): R = js.native
    def evaluate[R, Arg](pageFunction: PageFunction[Arg, R], arg: Arg): R = js.native
    
    /**
      * Returns the value of the `pageFunction` invocation as a [JSHandle].
      *
      * The only difference between page.evaluate(pageFunction[, arg]) and
      * page.evaluateHandle(pageFunction[, arg]) is that
      * page.evaluateHandle(pageFunction[, arg])returns [JSHandle].
      *
      * @param pageFunction Function to be evaluated in the page context.
      * @param arg Optional argument to pass to `pageFunction`.
      */
    def evaluateHandle[R, Arg](pageFunction: PageFunction[Arg, R]): JSHandle[R] = js.native
    def evaluateHandle[R, Arg](pageFunction: PageFunction[Arg, R], arg: Arg): JSHandle[R] = js.native
    
    /**
      * Fills out the first element found that matches the selector.
      * @param selector The selector to use.
      * @param value The value to fill.
      * @param options The options to use.
      */
    def fill(selector: String, value: String): Unit = js.native
    def fill(selector: String, value: String, options: ElementHandleOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Focuses the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def focus(selector: String): Unit = js.native
    def focus(selector: String, options: TimeoutOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Get the `ElementHandle` for this frame.
      * @returns The `ElementHandle` for this frame.
      */
    def frameElement(): ElementHandle = js.native
    
    /**
      * Get the value of an attribute of the first element found that matches the selector.
      * @param selector The selector to use.
      * @param name The name of the attribute to get.
      * @param options The options to use.
      * @returns The value of the attribute.
      */
    def getAttribute(selector: String, name: String): String = js.native
    def getAttribute(selector: String, name: String, options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Navigate the frame to the specified URL and return a HTTP response object.
      * @param url The URL to navigate to.
      * @param options The options to use.
      * @returns A promise that resolves to the HTTP response object.
      */
    def goto(url: String): js.Promise[Response | Null] = js.native
    def goto(url: String, options: NavigationOptions): js.Promise[Response | Null] = js.native
    
    /**
      * Hovers the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def hover(selector: String): Unit = js.native
    def hover(selector: String, options: ElementClickOptions & KeyboardModifierOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Get the `innerHTML` attribute of the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns The `innerHTML` attribute of the first element found.
      */
    def innerHTML(selector: String): String = js.native
    def innerHTML(selector: String, options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Get the `innerText` attribute of the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns The `innerText` attribute of the first element found.
      */
    def innerText(selector: String): String = js.native
    def innerText(selector: String, options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Get the input value of the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns The input value of the first element found.
      */
    def inputValue(selector: String): String = js.native
    def inputValue(selector: String, options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Get the `checked` attribute of the first checkbox element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the checkbox is checked, `false` otherwise.
      */
    def isChecked(selector: String): Boolean = js.native
    def isChecked(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Get whether the frame is detached or not.
      * @returns `true` if the frame is detached, `false` otherwise.
      */
    def isDetached(): Boolean = js.native
    
    /**
      * Get whether the first element found that matches the selector is disabled or not.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the element is disabled, `false` otherwise.
      */
    def isDisabled(selector: String): Boolean = js.native
    def isDisabled(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Get whether the first element found that matches the selector is editable or not.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the element is editable, `false` otherwise.
      */
    def isEditable(selector: String): Boolean = js.native
    def isEditable(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Get whether the first element found that matches the selector is enabled or not.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the element is enabled, `false` otherwise.
      */
    def isEnabled(selector: String): Boolean = js.native
    def isEnabled(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Get whether the first element found that matches the selector is hidden or not.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the element is hidden, `false` otherwise.
      */
    def isHidden(selector: String): Boolean = js.native
    def isHidden(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Get whether the first element found that matches the selector is visible or not.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns `true` if the element is visible, `false` otherwise.
      */
    def isVisible(selector: String): Boolean = js.native
    def isVisible(selector: String, options: TimeoutOptions & StrictnessOptions): Boolean = js.native
    
    /**
      * Сreates and returns a new locator for this frame.
      * @param selector The selector to use.
      * @returns The new locator.
      */
    def locator(selector: String): Locator = js.native
    
    /**
      * Get the name of the frame.
      * @returns The name of the frame.
      */
    def name(): String = js.native
    
    /**
      * Get the page that owns frame.
      * @returns The page that owns frame.
      */
    def page(): Page = js.native
    
    /**
      * Get the parent frame.
      * @returns The parent frame, or `null` if there is no parent frame.
      */
    def parentFrame(): Frame | Null = js.native
    
    /**
      * Press the given key for the first element found that matches the selector.
      * @param selector The selector to use.
      * @param key The key to press.
      * @param options The options to use.
      */
    def press(selector: String, key: String): Unit = js.native
    def press(selector: String, key: String, options: KeyboardPressOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Select the given options and return the array of option values of the first element
      * found that matches the selector.
      * @param selector The selector to use.
      * @param values The values to select.
      * @returns The array of option values of the first element found.
      */
    def selectOption(selector: String, values: String): js.Array[String] = js.native
    def selectOption(selector: String, values: String, options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    def selectOption(selector: String, values: js.Array[ElementHandle | SelectOptionsObject | String]): js.Array[String] = js.native
    def selectOption(
      selector: String,
      values: js.Array[ElementHandle | SelectOptionsObject | String],
      options: ElementHandleOptions & StrictnessOptions
    ): js.Array[String] = js.native
    def selectOption(selector: String, values: ElementHandle): js.Array[String] = js.native
    def selectOption(selector: String, values: ElementHandle, options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    def selectOption(selector: String, values: SelectOptionsObject): js.Array[String] = js.native
    def selectOption(selector: String, values: SelectOptionsObject, options: ElementHandleOptions & StrictnessOptions): js.Array[String] = js.native
    
    /**
      * Replace the entire HTML document content.
      * @param html The HTML to use.
      * @param options The options to use.
      */
    def setContent(html: String): Unit = js.native
    def setContent(html: String, options: ContentLoadOptions): Unit = js.native
    
    /**
      * Taps the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def tap(selector: String): Unit = js.native
    def tap(selector: String, options: ElementClickOptions & KeyboardModifierOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Get the text content of the first element found that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns The text content of the first element found.
      */
    def textContent(selector: String): String = js.native
    def textContent(selector: String, options: TimeoutOptions & StrictnessOptions): String = js.native
    
    /**
      * Get the title of the frame.
      * @returns The title of the frame.
      */
    def title(): String = js.native
    
    /**
      * Type the given text for the first element found that matches the selector.
      * @param selector The selector to use.
      * @param text The text to type.
      * @param options The options to use.
      */
    def `type`(selector: String, text: String): Unit = js.native
    def `type`(selector: String, text: String, options: KeyboardPressOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Uncheck the first found element that matches the selector.
      * @param selector The selector to use.
      * @param options The options to use.
      */
    def uncheck(selector: String): Unit = js.native
    def uncheck(selector: String, options: ElementClickOptions & StrictnessOptions): Unit = js.native
    
    /**
      * Get the URL of the frame.
      * @returns The URL of the frame.
      */
    def url(): String = js.native
    
    /**
      * Wait for the given function to return a truthy value.
      * @param predicate The function to call and wait for.
      * @param options The options to use.
      */
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R]): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: PollingOptions & TimeoutOptions): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: PollingOptions & TimeoutOptions, arg: Arg): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: Unit, arg: Arg): js.Promise[JSHandle[R]] = js.native
    
    /**
      * Wait for the given load state to be reached.
      * This will unblock if that lifecycle event has already been received.
      * @param state The load state to wait for, defaults to `load`.
      * @param options The options to use.
      */
    def waitForLoadState(): Unit = js.native
    def waitForLoadState(state: Unit, options: TimeoutOptions): Unit = js.native
    def waitForLoadState(state: LifecycleEvent): Unit = js.native
    def waitForLoadState(state: LifecycleEvent, options: TimeoutOptions): Unit = js.native
    
    /**
      * Waits for the navigation event to happen.
      * @param options The options to use.
      * @returns A promise that resolves to the response of the navigation when it happens.
      */
    def waitForNavigation(): js.Promise[Response | Null] = js.native
    def waitForNavigation(options: ContentLoadOptions): js.Promise[Response | Null] = js.native
    
    /**
      * Wait for the given selector to match the waiting criteria.
      * @param selector The selector to use.
      * @param options The options to use.
      * @returns The first element found that matches the selector.
      */
    def waitForSelector(selector: String): ElementHandle = js.native
    def waitForSelector(selector: String, options: ElementStateFilter & TimeoutOptions & StrictnessOptions): ElementHandle = js.native
    
    /**
      * Wait for the given timeout to elapse.
      * @param timeout The timeout to wait for.
      */
    def waitForTimeout(timeout: Double): Unit = js.native
  }
}
