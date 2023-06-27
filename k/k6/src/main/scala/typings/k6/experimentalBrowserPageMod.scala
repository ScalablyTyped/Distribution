package typings.k6

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Button
import typings.k6.anon.ColorScheme
import typings.k6.anon.Force
import typings.k6.anon.Modifiers
import typings.k6.anon.NoWaitAfter
import typings.k6.anon.Polling
import typings.k6.anon.Position
import typings.k6.anon.State
import typings.k6.anon.Strict
import typings.k6.anon.Timeout
import typings.k6.anon.WaitUntil
import typings.k6.anon.Width
import typings.k6.anon.`0`
import typings.k6.anon.clipxnumberynumberwidthnu
import typings.k6.experimentalBrowserElementHandleMod.ElementHandle
import typings.k6.experimentalBrowserFrameMod.Frame
import typings.k6.experimentalBrowserJsHandleMod.JSHandle
import typings.k6.experimentalBrowserKeyboardMod.Keyboard
import typings.k6.experimentalBrowserLocatorMod.Locator
import typings.k6.experimentalBrowserMod.BrowserContext
import typings.k6.experimentalBrowserMod.EvaluationArgument
import typings.k6.experimentalBrowserMod.NavigationOptions
import typings.k6.experimentalBrowserMod.PageFunction
import typings.k6.experimentalBrowserMod.SelectOptionsObject
import typings.k6.experimentalBrowserMouseMod.Mouse
import typings.k6.experimentalBrowserResponseMod.Response
import typings.k6.experimentalBrowserTouchscreenMod.Touchscreen
import typings.k6.experimentalBrowserWorkerMod.Worker
import typings.k6.k6Strings.achromatopsia
import typings.k6.k6Strings.blurredVision
import typings.k6.k6Strings.deuteranopia
import typings.k6.k6Strings.domcontentloaded
import typings.k6.k6Strings.load
import typings.k6.k6Strings.networkidle
import typings.k6.k6Strings.none
import typings.k6.k6Strings.protanopia
import typings.k6.k6Strings.tritanopia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalBrowserPageMod {
  
  @JSImport("k6/experimental/browser/page", "Page")
  @js.native
  open class Page () extends StObject {
    
    /**
      * **NOTE** Use locator-based page.locator(selector[, options]) instead.
      *
      * The method finds an element matching the specified selector within the page.
      * If no elements match the selector, the return value resolves to `null`.
      * To wait for an element on the page, use locator.waitFor([options]).
      * @param selector A selector to query for.
      */
    @JSName("$")
    def $(selector: String): ElementHandle = js.native
    
    /**
      * **NOTE** Use locator-based page.locator(selector[, options]) instead.
      *
      * The method finds all elements matching the specified selector within the
      * page. If no elements match the selector, the return value resolves to `[]`.
      * @param selector A selector to query for.
      */
    @JSName("$$")
    def DollarDollar(selector: String): js.Array[ElementHandle] = js.native
    
    /**
      * Activates the browser tab so that it comes into focus and actions can be
      * performed against it.
      */
    def bringToFront(): Unit = js.native
    
    /**
      * **NOTE** Use locator-based `locator.check([options])` instead.
      *
      * This method is used to select an input checkbox.
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def check(selector: String): Unit = js.native
    def check(selector: String, options: Force): Unit = js.native
    
    /**
      * **NOTE** Use locator-based `locator.click([options])` instead.
      *
      * This method clicks an element matching `selector`.
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def click(selector: String): js.Promise[Unit] = js.native
    def click(selector: String, options: Button): js.Promise[Unit] = js.native
    
    /**
      * This will close the tab that this page is associated with.
      */
    def close(): Unit = js.native
    
    /**
      * Gets the HTML contents of the page.
      */
    def content(): String = js.native
    
    /**
      * Gets the `BrowserContext` that the page belongs to.
      */
    def context(): BrowserContext = js.native
    
    /**
      * **NOTE** Use locator-based `locator.dblclick([options])` instead.
      *
      * Mouse double clicks an element matching provided selector.
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def dblclick(selector: String): Unit = js.native
    def dblclick(selector: String, options: Modifiers): Unit = js.native
    
    /**
      * **NOTE** Use locator-based locator.dispatchEvent([options]) instead.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param type DOM event type: `"click"` etc.
      * @param eventInit Optional event-specific initialization properties.
      * @param options
      */
    def dispatchEvent(selector: String, `type`: String): Unit = js.native
    def dispatchEvent(selector: String, `type`: String, eventInit: Unit, options: Strict): Unit = js.native
    def dispatchEvent(selector: String, `type`: String, eventInit: EvaluationArgument): Unit = js.native
    def dispatchEvent(selector: String, `type`: String, eventInit: EvaluationArgument, options: Strict): Unit = js.native
    
    /**
      * This method changes the `CSS media type` through the `media` argument,
      * and/or the `'prefers-colors-scheme'` media feature, using the `colorScheme`
      * argument.
      * @param options
      */
    def emulateMedia(): Unit = js.native
    def emulateMedia(options: ColorScheme): Unit = js.native
    
    /**
      * This emulates your website with the specified vision deficiency type.
      * The supported types are:
      * - none: default.
      * - blurredVision: where vision is less precise.
      * - protanopia: the inability to perceive any red light.
      * - deuteranopia: the inability to perceive any green light.
      * - tritanopia: the inability to perceive any blue light.
      * - achromatopsia: the inability to perceive any color except for shades of
      * grey (extremely rare).
      * @param type
      */
    def emulateVisionDeficiency(`type`: none | blurredVision | deuteranopia | protanopia | tritanopia | achromatopsia): Unit = js.native
    
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
      * **NOTE** Use locator-based `locator.fill(value[, options])` instead.
      *
      * Fill an `input`, `textarea` or `[contenteditable]` element with the
      * provided value.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param value Value to fill for the `<input>`, `<textarea>` or
      * `[contenteditable]` element.
      * @param options
      */
    def fill(selector: String, value: String): Unit = js.native
    def fill(selector: String, value: String, options: NoWaitAfter): Unit = js.native
    
    /**
      * **NOTE** Use locator-based `locator.focus([options])` instead.
      *
      * This method fetches an element with `selector` and focuses it.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def focus(selector: String): Unit = js.native
    def focus(selector: String, options: Strict): Unit = js.native
    
    /**
      * Frames returns an array of frames on the page.
      */
    def frames(): js.Array[Frame] = js.native
    
    /**
      * **NOTE** Use locator-based locator.getAttribute(name[, options]) instead.
      *
      * Returns the element attribute value for the given attribute name.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param name Attribute name to get the value for.
      * @param options
      */
    def getAttribute(selector: String, name: String): Null | String = js.native
    def getAttribute(selector: String, name: String, options: Strict): Null | String = js.native
    
    /**
      * Navigates to the specified url and returns the main resource response.
      *
      * navigating to `about:blank` or navigation to the same URL with a different
      * hash, will succeed and return `null`.
      *
      * @param url URL to navigate page to. The url should include scheme, e.g.
      * `https://`.
      * @param options
      */
    def goto(url: String): js.Promise[Null | Response] = js.native
    def goto(url: String, options: NavigationOptions): js.Promise[Null | Response] = js.native
    
    /**
      * **NOTE** Use locator-based locator.hover([options]) instead.
      *
      * This method hovers over an element matching `selector`.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def hover(selector: String): Unit = js.native
    def hover(selector: String, options: Position): Unit = js.native
    
    /**
      * **NOTE** Use locator-based locator.innerHTML([options]) instead.
      *
      * Returns `element.innerHTML`.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def innerHTML(selector: String): String = js.native
    def innerHTML(selector: String, options: Strict): String = js.native
    
    /**
      * **NOTE** Use locator-based locator.innerText([options]) instead.
      *
      * Returns `element.innerText`.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def innerText(selector: String): String = js.native
    def innerText(selector: String, options: Strict): String = js.native
    
    /**
      * **NOTE** Use locator-based locator.inputValue([options]) instead.
      *
      * Returns `input.value` for the selected `<input>` or `<textarea>` or
      * `<select>` element.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def inputValue(selector: String): String = js.native
    def inputValue(selector: String, options: Strict): String = js.native
    
    /**
      * **NOTE** Use locator-based locator.isChecked([options]) instead.
      *
      * Checks to see if the `checkbox` `input` type is selected or not.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isChecked(selector: String): Boolean = js.native
    def isChecked(selector: String, options: Strict): Boolean = js.native
    
    /**
      * Indicates that the page has been closed.
      */
    def isClosed(): Boolean = js.native
    
    /**
      * **NOTE** Use locator-based locator.isDisabled([options]) instead.
      *
      * Returns whether the element is disabled.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isDisabled(selector: String): Boolean = js.native
    def isDisabled(selector: String, options: Strict): Boolean = js.native
    
    /**
      * **NOTE** Use locator-based locator.isEditable([options]) instead.
      *
      * Returns whether the element is editable.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isEditable(selector: String): Boolean = js.native
    def isEditable(selector: String, options: Strict): Boolean = js.native
    
    /**
      * **NOTE** Use locator-based locator.isEnabled([options]) instead.
      *
      * Returns whether the element is enabled.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isEnabled(selector: String): Boolean = js.native
    def isEnabled(selector: String, options: Strict): Boolean = js.native
    
    /**
      * **NOTE** Use locator-based locator.isHidden([options]) instead.
      *
      * Returns whether the element is hidden.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isHidden(selector: String): Boolean = js.native
    def isHidden(selector: String, options: Strict): Boolean = js.native
    
    /**
      * **NOTE** Use locator-based locator.isVisible([options]) instead.
      *
      * Returns whether the element is visible.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def isVisible(selector: String): Boolean = js.native
    def isVisible(selector: String, options: Strict): Boolean = js.native
    
    /**
      * Returns the keyboard instance to interact with a virtual keyboard on the
      * page.
      */
    var keyboard: Keyboard = js.native
    
    /**
      * The method returns an element locator. Locators resolve to the element
      * when the action takes place, which means locators can span over navigations
      * where the underlying dom changes.
      *
      * @param selector A selector to use when resolving DOM element.
      */
    def locator(selector: String): Locator = js.native
    
    /**
      * The page's main frame. Page is made up of frames in a hierarchical. At the
      * top is mainFrame. A page is guaranteed to have a mainFrame.
      */
    def mainFrame(): Frame = js.native
    
    /**
      * Returns the mouse instance to interact with a virtual mouse on the page.
      */
    var mouse: Mouse = js.native
    
    /**
      * Returns the page that opened the current page. The first page that is
      * navigated to will have a null opener.
      */
    def opener(): Page | Null = js.native
    
    /**
      * **NOTE** Use locator-based locator.press(key[, options]) instead.
      *
      * Focuses the element, and then uses keyboard.down(key) and
      * keyboard.up(key).
      *
      * A superset of the `key` values can be found [here](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key/Key_Values).
      *
      * Following modification shortcuts are also supported: `Shift`, `Control`,
      * `Alt`, `Meta`, `ShiftLeft`.
      *
      * Holding down `Shift` will type the text that corresponds to the `key` in
      * the upper case.
      *
      * If `key` is a single character, it is case-sensitive, so the values `a`
      * and `A` will generate different respective texts.
      *
      * Shortcuts such as `key: "Control+o"` or `key: "Control+Shift+T"` are
      * supported as well. When specified with the modifier, modifier is pressed
      * and being held while the subsequent key is being pressed.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param key Name of the key to press or a character to generate, such as
      * `ArrowLeft` or `a`.
      * @param options
      */
    def press(selector: String, key: String): Unit = js.native
    def press(selector: String, key: String, options: Timeout): Unit = js.native
    
    /**
      * This reloads the current page Returns the main resource response.
      *
      * @param options
      */
    def reload(): Null | Response = js.native
    def reload(options: WaitUntil): Null | Response = js.native
    
    /**
      * Returns the buffer with the captured screenshot from the browser.
      *
      * @param options
      */
    def screenshot(): js.typedarray.ArrayBuffer = js.native
    def screenshot(options: clipxnumberynumberwidthnu): js.typedarray.ArrayBuffer = js.native
    
    /**
      * **NOTE** Use locator-based locator.selectOption(values[, options]) instead.
      *
      * This select one or more options which match the values from a <select>
      * element.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param values Options to select. If the select has multiple attribute, all
      * matching options are selected, otherwise only the first option matching
      * one of the passed options is selected. Object can be made up of keys with
      * value, label or index.
      * @param options
      */
    def selectOption(selector: String, values: String): js.Array[String] = js.native
    def selectOption(selector: String, values: String, options: NoWaitAfter): js.Array[String] = js.native
    def selectOption(selector: String, values: js.Array[ElementHandle | SelectOptionsObject | String]): js.Array[String] = js.native
    def selectOption(
      selector: String,
      values: js.Array[ElementHandle | SelectOptionsObject | String],
      options: NoWaitAfter
    ): js.Array[String] = js.native
    def selectOption(selector: String, values: ElementHandle): js.Array[String] = js.native
    def selectOption(selector: String, values: ElementHandle, options: NoWaitAfter): js.Array[String] = js.native
    def selectOption(selector: String, values: SelectOptionsObject): js.Array[String] = js.native
    def selectOption(selector: String, values: SelectOptionsObject, options: NoWaitAfter): js.Array[String] = js.native
    
    /**
      * Set the supplied html string to the current page.
      *
      * @param html HTML markup to assign to the page.
      * @param options
      */
    def setContent(html: String): Unit = js.native
    def setContent(html: String, options: WaitUntil): Unit = js.native
    
    /**
      * This setting will change the navigation timeout for the following methods:
      * - page.goto(url[, options])
      * - page.reload([options])
      * - page.setContent(html[, options])
      * - page.waitForNavigation([options])
      *
      * @param timeout in milliseconds
      */
    def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
    
    /**
      * This setting will change the timeout for all the methods accepting a
      * `timeout` option.
      *
      * @param timeout in milliseconds
      */
    def setDefaultTimeout(timeout: Double): Unit = js.native
    
    /**
      * This sets extra HTTP headers which will be sent with subsequent
      * HTTP requests.
      *
      * @param headers An object containing the additional HTTP headers.
      * All header values must be strings.
      */
    def setExtraHTTPHeaders(headers: StringDictionary[String]): Unit = js.native
    
    /**
      * This will update the page's width and height.
      *
      * @param viewportSize
      */
    def setViewportSize(viewportSize: Width): Unit = js.native
    
    /**
      * **NOTE** Use locator-based locator.tap([options]) instead.
      *
      * Tap the first element that matches the selector.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def tap(selector: String): Unit = js.native
    def tap(selector: String, options: Position): Unit = js.native
    
    /**
      * **NOTE** Use locator-based locator.textContent([options]) instead.
      *
      * Returns `element.textContent`.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def textContent(selector: String): String = js.native
    def textContent(selector: String, options: Strict): String = js.native
    
    /**
      * Returns the page's title.
      */
    def title(): String = js.native
    
    /**
      * Returns the touchscreen instance to interact with a virtual touchscreen on
      * the page.
      */
    var touchscreen: Touchscreen = js.native
    
    /**
      * **NOTE** Use locator-based locator.type(text[, options]) instead.
      *
      * Type the `text` in the first element found that matches the selector.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param text The text to type into the element.
      * @param options
      */
    def `type`(selector: String, text: String): Unit = js.native
    def `type`(selector: String, text: String, options: Timeout): Unit = js.native
    
    /**
      * **NOTE** Use locator-based `locator.uncheck([options])` instead.
      *
      * This method is used to unselect an input checkbox.
      *
      * @param selector A selector to search for an element. If there are multiple
      * elements satisfying the selector, the first will be used.
      * @param options
      */
    def uncheck(selector: String): Unit = js.native
    def uncheck(selector: String, options: Force): Unit = js.native
    
    /**
      * Returns the page's URL.
      */
    def url(): String = js.native
    
    /**
      * Returns the page's size (width and height).
      */
    def viewportSize(): Width = js.native
    
    /**
      * Returns when the `pageFunction` returns a truthy value.
      *
      * @param pageFunction Function to be evaluated in the page context.
      * @param arg Optional argument to pass to `pageFunction`.
      * @param options
      */
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R]): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: Unit, arg: Arg): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: Polling): js.Promise[JSHandle[R]] = js.native
    def waitForFunction[R, Arg](pageFunction: PageFunction[Arg, R], options: Polling, arg: Arg): js.Promise[JSHandle[R]] = js.native
    
    /**
      * This waits for the given load state to be reached. It will immediately
      * unblock if that lifecycle event has already been received.
      *
      * @param state Optional load state to wait for, defaults to `load`:
      * - `'domcontentloaded'` - consider operation to be finished when the
      * `DOMContentLoaded` event is fired.
      * - `'load'` - consider operation to be finished when the `load` event is
      * fired.
      * - `'networkidle'` - **DISCOURAGED** consider operation to be finished
      * when there are no network connections for at least `500` ms. Don't use
      * this method for testing especially with chatty websites where the event
      * may never fire, rely on web assertions to assess readiness instead.
      * @param options
      */
    def waitForLoadState(): Unit = js.native
    def waitForLoadState(state: load | domcontentloaded | networkidle): Unit = js.native
    def waitForLoadState(state: load | domcontentloaded | networkidle, options: `0`): Unit = js.native
    def waitForLoadState(state: Unit, options: `0`): Unit = js.native
    
    /**
      * Waits for the given navigation lifecycle event to occur and returns the main
      * resource response.
      *
      * @param options
      */
    def waitForNavigation(): js.Promise[Null | Response] = js.native
    def waitForNavigation(options: WaitUntil): js.Promise[Null | Response] = js.native
    
    /**
      * **NOTE** Use web assertions that assert visibility or a locator-based
      * locator.waitFor([options]) instead.
      *
      * Returns when element specified by selector satisfies `state` option.
      *
      * @param selector A selector to query for.
      * @param options
      */
    def waitForSelector(selector: String): ElementHandle = js.native
    def waitForSelector(selector: String, options: State): ElementHandle = js.native
    
    /**
      * **NOTE** Never wait for timeout in production, use this only for debugging.
      * Tests that wait for time are inherently flaky. Use `Locator` actions and
      * web assertions that wait automatically.
      *
      * Waits for the given `timeout` in milliseconds.
      *
      * @param timeout A timeout to wait for
      */
    def waitForTimeout(timeout: Double): Unit = js.native
    
    /**
      * This method returns all of the dedicated WebWorkers associated with the page.
      */
    def workers(): js.Array[Worker] = js.native
  }
}
