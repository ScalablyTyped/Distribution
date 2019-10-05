package typings.leadfoot.sessionMod

import typings.dojo.promisePromiseMod.Promise
import typings.leadfoot.Anon_Height
import typings.leadfoot.Anon_X
import typings.leadfoot.leadfoot.Capabilities
import typings.leadfoot.leadfoot.Geolocation
import typings.leadfoot.leadfoot.LogEntry
import typings.leadfoot.leadfoot.WebDriverCookie
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A Session represents a connection to a remote environment that can be driven programmatically.
	 */
@js.native
trait Session extends js.Object {
  /**
  		 * Information about the available features and bugs in the remote environment.
  		 *
  		 * @readonly
  		 */
  var capabilities: Capabilities = js.native
  /**
  		 * The Server that the session runs on.
  		 *
  		 * @member {module:leadfoot/Server} server
  		 * @memberOf module:leadfoot/Session#
  		 * @readonly
  		 */
  var server: typings.leadfoot.serverMod.^ = js.native
  /**
  		 * The current session ID.
  		 *
  		 * @readonly
  		 */
  var sessionId: String = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _delete(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _delete(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _get(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _get(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * A function that performs an HTTP request to a JsonWireProtocol endpoint and normalises response status and
  		 * data.
  		 *
  		 * @param path
  		 * The path-part of the JsonWireProtocol URL. May contain placeholders in the form `/\$\d/` that will be
  		 * replaced by entries in the `pathParts` argument.
  		 *
  		 * @param requestData
  		 * The payload for the request.
  		 *
  		 * @param pathParts Optional placeholder values to inject into the path of the URL.
  		 */
  /* protected */ def _post(path: String, requestData: js.Object): Promise[js.Object] = js.native
  /* protected */ def _post(path: String, requestData: js.Object, pathParts: js.Array[String]): Promise[js.Object] = js.native
  /**
  		 * Accepts an alert, prompt, or confirmation pop-up. Equivalent to clicking the 'OK' button.
  		 */
  def acceptAlert(): Promise[Unit] = js.native
  /**
  		 * Activates an input method editor in the remote environment.
  		 * As of April 2014, no known remote environments support IME functions.
  		 *
  		 * @param engine The type of IME to activate.
  		 */
  def activateIme(engine: String): Promise[Unit] = js.native
  /**
  		 * Clears all cookies for the current page.
  		 */
  def clearCookies(): Promise[Unit] = js.native
  /**
  		 * Clears all data in local storage for the focused window/frame.
  		 */
  def clearLocalStorage(): Promise[Unit] = js.native
  /**
  		 * Clears all data in session storage for the focused window/frame.
  		 */
  def clearSessionStorage(): Promise[Unit] = js.native
  /**
  		 * Clicks a mouse button at the point where the mouse cursor is currently positioned. This method may fail to
  		 * execute with an error if the mouse has not been moved anywhere since the page was loaded.
  		 *
  		 * @param button
  		 * The button to click. 0 corresponds to the primary mouse button, 1 to the middle mouse button, 2 to the
  		 * secondary mouse button. Numbers above 2 correspond to any additional buttons a mouse might provide.
  		 */
  def clickMouseButton(): Promise[Unit] = js.native
  def clickMouseButton(button: Double): Promise[Unit] = js.native
  /**
  		 * Closes the currently focused window. In most environments, after the window has been closed, it is necessary
  		 * to explicitly switch to whatever window is now focused.
  		 */
  def closeCurrentWindow(): Promise[Unit] = js.native
  /**
  		 * Deactivates any active input method editor in the remote environment.
  		 * As of April 2014, no known remote environments support IME functions.
  		 */
  def deactivateIme(): Promise[Unit] = js.native
  /**
  		 * Deletes a cookie on the current page.
  		 *
  		 * @param name The name of the cookie to delete.
  		 */
  def deleteCookie(name: String): Promise[Unit] = js.native
  /**
  		 * Deletes a value from local storage for the focused window/frame.
  		 *
  		 * @param key The key of the data to delete.
  		 */
  def deleteLocalStorageItem(key: String): Promise[Unit] = js.native
  /**
  		 * Deletes a value from session storage for the focused window/frame.
  		 *
  		 * @param key The key of the data to delete.
  		 */
  def deleteSessionStorageItem(key: String): Promise[Unit] = js.native
  /**
  		 * Dismisses an alert, prompt, or confirmation pop-up. Equivalent to clicking the 'OK' button of an alert pop-up
  		 * or the 'Cancel' button of a prompt or confirmation pop-up.
  		 */
  def dismissAlert(): Promise[Unit] = js.native
  /**
  		 * Double-clicks the primary mouse button.
  		 */
  def doubleClick(): Promise[Unit] = js.native
  /**
  		 * Performs a double-tap gesture on an element.
  		 *
  		 * @param element The element to double-tap.
  		 */
  def doubleTap(element: typings.leadfoot.elementMod.^): Promise[Unit] = js.native
  def execute[T](script: String, args: js.Array[_]): Promise[T] = js.native
  /**
  		 * Executes JavaScript code within the focused window/frame. The code should return a value synchronously.
  		 *
  		 * @see {@link module:leadfoot/Session#executeAsync} to execute code that returns values asynchronously.
  		 *
  		 * @param script
  		 * The code to execute. If a string value is passed, it will be converted to a function on the remote end.
  		 *
  		 * @param args
  		 * An array of arguments that will be passed to the executed code. Only values that can be serialised to JSON, plus
  		 * {@link module:leadfoot/Element} objects, can be specified as arguments.
  		 *
  		 * @returns
  		 * The value returned by the remote code. Only values that can be serialised to JSON, plus DOM elements, can be
  		 * returned.
  		 */
  def execute[T](script: js.Function, args: js.Array[_]): Promise[T] = js.native
  def executeAsync[T](script: String, args: js.Array[_]): Promise[T] = js.native
  /**
  		 * Executes JavaScript code within the focused window/frame. The code must invoke the provided callback in
  		 * order to signal that it has completed execution.
  		 *
  		 * @see {@link module:leadfoot/Session#execute} to execute code that returns values synchronously.
  		 * @see {@link module:leadfoot/Session#setExecuteAsyncTimeout} to set the time until an asynchronous script is
  		 * considered timed out.
  		 *
  		 * @param script
  		 * The code to execute. If a string value is passed, it will be converted to a function on the remote end.
  		 *
  		 * @param args
  		 * An array of arguments that will be passed to the executed code. Only values that can be serialised to JSON, plus
  		 * {@link module:leadfoot/Element} objects, can be specified as arguments. In addition to these arguments, a
  		 * callback function will always be passed as the final argument to the script. This callback function must be
  		 * invoked in order to signal that execution has completed. The return value of the script, if any, should be passed
  		 * to this callback function.
  		 *
  		 * @returns
  		 * The value returned by the remote code. Only values that can be serialised to JSON, plus DOM elements, can be
  		 * returned.
  		 */
  def executeAsync[T](script: js.Function, args: js.Array[_]): Promise[T] = js.native
  /**
  		 * Gets the first element from the focused window/frame that matches the given query.
  		 *
  		 * @see {@link module:leadfoot/Session#setFindTimeout} to set the amount of time it the remote environment
  		 * should spend waiting for an element that does not exist at the time of the `find` call before timing
  		 * out.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def find(using: String, value: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets all elements from the focused window/frame that match the given query.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def findAll(using: String, value: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given CSS class name.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def findAllByClassName(className: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given CSS selector.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def findAllByCssSelector(selector: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given case-insensitive link text.
  		 *
  		 * @param text The link text of the element.
  		 */
  def findAllByLinkText(text: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given name attribute.
  		 *
  		 * @param name The name of the element.
  		 */
  def findAllByName(name: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame partially matching the given case-insensitive link text.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def findAllByPartialLinkText(text: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given HTML tag name.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def findAllByTagName(tagName: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets all elements in the currently active window/frame matching the given XPath selector.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def findAllByXpath(path: String): Promise[js.Array[typings.leadfoot.elementMod.^]] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given CSS class name.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def findByClassName(className: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given CSS selector.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def findByCssSelector(selector: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given ID.
  		 *
  		 * @param id The ID of the element.
  		 */
  def findById(id: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given case-insensitive link text.
  		 *
  		 * @param text The link text of the element.
  		 */
  def findByLinkText(text: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given name attribute.
  		 *
  		 * @param name The name of the element.
  		 */
  def findByName(name: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame partially matching the given case-insensitive link text.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def findByPartialLinkText(text: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given HTML tag name.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def findByTagName(tagName: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the first element in the currently active window/frame matching the given XPath selector.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def findByXpath(path: String): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Flicks a finger. Note that this method is currently badly specified and highly dysfunctional and is only
  		 * provided for the sake of completeness.
  		 *
  		 * @param element The element where the flick should start.
  		 * @param xOffset The x-offset in pixels to flick by.
  		 * @param yOffset The x-offset in pixels to flick by.
  		 * @param speed The speed of the flick, in pixels per *second*. Most human flicks are 100–200ms, so
  		 * this value will be higher than expected.
  		 */
  def flickFinger(element: typings.leadfoot.elementMod.^, xOffset: Double, yOffset: Double, speed: Double): Promise[Unit] = js.native
  /**
  		 * Navigates the focused window/frame to a new URL.
  		 */
  def get(url: String): Promise[Unit] = js.native
  /**
  		 * Gets the currently focused element from the focused window/frame.
  		 */
  def getActiveElement(): Promise[typings.leadfoot.elementMod.^] = js.native
  /**
  		 * Gets the currently active input method editor for the remote environment.
  		 * As of April 2014, no known remote environments support IME functions.
  		 */
  def getActiveImeEngine(): Promise[String] = js.native
  /**
  		 * Gets the text displayed in the currently active alert pop-up.
  		 */
  def getAlertText(): Promise[String] = js.native
  /**
  		 * Gets a list of identifiers for all currently open windows.
  		 */
  def getAllWindowHandles(): Promise[js.Array[String]] = js.native
  /**
  		 * Gets the current state of the HTML5 application cache for the current page.
  		 *
  		 * @returns
  		 * The cache status. One of 0 (uncached), 1 (cached/idle), 2 (checking), 3 (downloading), 4 (update ready), 5
  		 * (obsolete).
  		 */
  def getApplicationCacheStatus(): Promise[Double] = js.native
  /**
  		 * Gets a list of input method editor engines available to the remote environment.
  		 * As of April 2014, no known remote environments support IME functions.
  		 */
  def getAvailableImeEngines(): Promise[js.Array[String]] = js.native
  /**
  		 * Gets the types of logs that are currently available for retrieval from the remote environment.
  		 */
  def getAvailableLogTypes(): Promise[js.Array[String]] = js.native
  /**
  		 * Gets all cookies set on the current page.
  		 */
  def getCookies(): Promise[js.Array[WebDriverCookie]] = js.native
  /**
  		 * Gets the URL that is loaded in the focused window/frame.
  		 */
  def getCurrentUrl(): Promise[String] = js.native
  /**
  		 * Gets the identifier for the window that is currently focused.
  		 *
  		 * @returns A window handle identifier that can be used with other window handling functions.
  		 */
  def getCurrentWindowHandle(): Promise[String] = js.native
  /**
  		 * Gets the timeout for {@link module:leadfoot/Session#executeAsync} calls.
  		 */
  def getExecuteAsyncTimeout(): Promise[Double] = js.native
  /**
  		 * Gets the timeout for {@link module:leadfoot/Session#find} calls.
  		 */
  def getFindTimeout(): Promise[Double] = js.native
  /**
  		 * Gets the current geographical location of the remote environment.
  		 *
  		 * @returns
  		 * Latitude and longitude are specified using standard WGS84 decimal latitude/longitude. Altitude is specified
  		 * as meters above the WGS84 ellipsoid. Not all environments support altitude.
  		 */
  def getGeolocation(): Promise[Geolocation] = js.native
  /**
  		 * Gets a value from local storage for the focused window/frame.
  		 *
  		 * @param key The key of the data to get.
  		 */
  def getLocalStorageItem(key: String): Promise[String] = js.native
  /**
  		 * Gets the list of keys set in local storage for the focused window/frame.
  		 */
  def getLocalStorageKeys(): Promise[js.Array[String]] = js.native
  /**
  		 * Gets the number of keys set in local storage for the focused window/frame.
  		 */
  def getLocalStorageLength(): Promise[Double] = js.native
  /**
  		 * Gets all logs from the remote environment of the given type. The logs in the remote environment are cleared
  		 * once they have been retrieved.
  		 *
  		 * @param type
  		 * The type of log entries to retrieve. Available log types differ between remote environments. Use
  		 * {@link module:leadfoot/Session#getAvailableLogTypes} to learn what log types are currently available. Not all
  		 * environments support all possible log types.
  		 *
  		 * @returns
  		 * An array of log entry objects. Timestamps in log entries are Unix timestamps, in seconds.
  		 */
  def getLogsFor(`type`: String): Promise[js.Array[LogEntry]] = js.native
  /**
  		 * Gets the current screen orientation.
  		 *
  		 * @returns Either 'portrait' or 'landscape'.
  		 */
  def getOrientation(): Promise[String] = js.native
  /**
  		 * Gets the timeout for {@link module:leadfoot/Session#get} calls.
  		 */
  def getPageLoadTimeout(): Promise[Double] = js.native
  /**
  		 * Gets the HTML loaded in the focused window/frame. This markup is serialised by the remote environment so
  		 * may not exactly match the HTML provided by the Web server.
  		 */
  def getPageSource(): Promise[String] = js.native
  /**
  		 * Gets the title of the focused window/frame.
  		 */
  def getPageTitle(): Promise[String] = js.native
  /**
  		 * Gets a value from session storage for the focused window/frame.
  		 *
  		 * @param key The key of the data to get.
  		 */
  def getSessionStorageItem(key: String): Promise[String] = js.native
  /**
  		 * Gets the list of keys set in session storage for the focused window/frame.
  		 */
  def getSessionStorageKeys(): Promise[js.Array[String]] = js.native
  /**
  		 * Gets the number of keys set in session storage for the focused window/frame.
  		 */
  def getSessionStorageLength(): Promise[Double] = js.native
  /**
  		 * Gets the current value of a timeout for the session.
  		 *
  		 * @param type The type of timeout to retrieve. One of 'script', 'implicit', or 'page load'.
  		 * @returns The timeout, in milliseconds.
  		 */
  def getTimeout(`type`: String): Promise[Double] = js.native
  /**
  		 * Gets the position of a window.
  		 *
  		 * @param windowHandle
  		 * The name of the window to query. See {@link module:leadfoot/Session#switchToWindow} to learn about valid
  		 * window names. Omit this argument to query the currently focused window.
  		 *
  		 * @returns
  		 * An object describing the position of the window, in CSS pixels, relative to the top-left corner of the
  		 * primary monitor. If a secondary monitor exists above or to the left of the primary monitor, these values
  		 * will be negative.
  		 */
  def getWindowPosition(): Promise[Anon_X] = js.native
  def getWindowPosition(windowHandle: String): Promise[Anon_X] = js.native
  /**
  		 * Gets the dimensions of a window.
  		 *
  		 * @param windowHandle
  		 * The name of the window to query. See {@link module:leadfoot/Session#switchToWindow} to learn about valid
  		 * window names. Omit this argument to query the currently focused window.
  		 *
  		 * @returns
  		 * An object describing the width and height of the window, in CSS pixels.
  		 */
  def getWindowSize(): Promise[Anon_Height] = js.native
  def getWindowSize(windowHandle: String): Promise[Anon_Height] = js.native
  /**
  		 * Navigates the focused window/frame back one page using the browser’s navigation history.
  		 */
  def goBack(): Promise[Unit] = js.native
  /**
  		 * Navigates the focused window/frame forward one page using the browser’s navigation history.
  		 */
  def goForward(): Promise[Unit] = js.native
  /**
  		 * Returns whether or not an input method editor is currently active in the remote environment.
  		 * As of April 2014, no known remote environments support IME functions.
  		 */
  def isImeActivated(): Promise[Boolean] = js.native
  /**
  		 * Performs a long-tap gesture on an element.
  		 *
  		 * @param element The element to long-tap.
  		 */
  def longTap(element: typings.leadfoot.elementMod.^): Promise[Unit] = js.native
  /**
  		 * Maximises a window according to the platform’s window system behaviour.
  		 *
  		 * @param windowHandle
  		 * The name of the window to resize. See {@link module:leadfoot/Session#switchToWindow} to learn about valid
  		 * window names. Omit this argument to resize the currently focused window.
  		 */
  def maximizeWindow(): Promise[Unit] = js.native
  def maximizeWindow(windowHandle: String): Promise[Unit] = js.native
  /**
  		 * Moves the last depressed finger to a new point on the touch screen.
  		 *
  		 * @param x The screen x-coordinate to move to, maybe in device pixels.
  		 * @param y The screen y-coordinate to move to, maybe in device pixels.
  		 */
  def moveFinger(x: Double, y: Double): Promise[Unit] = js.native
  /**
  		 * Moves the remote environment’s mouse cursor to the specified element or relative position. If the element is
  		 * outside of the viewport, the remote driver will attempt to scroll it into view automatically.
  		 *
  		 * @param element
  		 * The element to move the mouse to. If x-offset and y-offset are not specified, the mouse will be moved to the
  		 * centre of the element.
  		 *
  		 * @param xOffset
  		 * The x-offset of the cursor, maybe in CSS pixels, relative to the left edge of the specified element’s
  		 * bounding client rectangle. If no element is specified, the offset is relative to the previous position of the
  		 * mouse, or to the left edge of the page’s root element if the mouse was never moved before.
  		 *
  		 * @param yOffset
  		 * The y-offset of the cursor, maybe in CSS pixels, relative to the top edge of the specified element’s bounding
  		 * client rectangle. If no element is specified, the offset is relative to the previous position of the mouse,
  		 * or to the top edge of the page’s root element if the mouse was never moved before.
  		 */
  def moveMouseTo(element: typings.leadfoot.elementMod.^): Promise[Unit] = js.native
  def moveMouseTo(element: typings.leadfoot.elementMod.^, xOffset: Double): Promise[Unit] = js.native
  def moveMouseTo(element: typings.leadfoot.elementMod.^, xOffset: Double, yOffset: Double): Promise[Unit] = js.native
  def moveMouseTo(xOffset: Double, yOffset: Double): Promise[Unit] = js.native
  /**
  		 * Depresses a new finger at the given point on a touch screen device without releasing it.
  		 *
  		 * @param x The screen x-coordinate to press, maybe in device pixels.
  		 * @param y The screen y-coordinate to press, maybe in device pixels.
  		 */
  def pressFinger(x: Double, y: Double): Promise[Unit] = js.native
  /**
  		 * Types into the focused window/frame/element.
  		 *
  		 * @param keys
  		 * The text to type in the remote environment. It is possible to type keys that do not have normal character
  		 * representations (modifier keys, function keys, etc.) as well as keys that have two different representations
  		 * on a typical US-ASCII keyboard (numpad keys); use the values from {@link module:leadfoot/keys} to type these
  		 * special characters. Any modifier keys that are activated by this call will persist until they are
  		 * deactivated. To deactivate a modifier key, type the same modifier key a second time, or send `\\uE000`
  		 * ('NULL') to deactivate all currently active modifier keys.
  		 */
  def pressKeys(keys: String): Promise[Unit] = js.native
  def pressKeys(keys: js.Array[String]): Promise[Unit] = js.native
  /**
  		 * Depresses a mouse button without releasing it.
  		 *
  		 * @param button The button to press. See {@link module:leadfoot/Session#click} for available options.
  		 */
  def pressMouseButton(): Promise[Unit] = js.native
  def pressMouseButton(button: Double): Promise[Unit] = js.native
  /**
  		 * Terminates the session. No more commands will be accepted by the remote after this point.
  		 */
  def quit(): Promise[Unit] = js.native
  /**
  		 * Reloads the current browser window/frame.
  		 */
  def refresh(): Promise[Unit] = js.native
  /**
  		 * Releases whatever finger exists at the given point on a touch screen device.
  		 *
  		 * @param x The screen x-coordinate where a finger is pressed, maybe in device pixels.
  		 * @param y The screen y-coordinate where a finger is pressed, maybe in device pixels.
  		 */
  def releaseFinger(x: Double, y: Double): Promise[Unit] = js.native
  /**
  		 * Releases a previously depressed mouse button.
  		 *
  		 * @param button The button to press. See {@link module:leadfoot/Session#click} for available options.
  		 */
  def releaseMouseButton(): Promise[Unit] = js.native
  def releaseMouseButton(button: Double): Promise[Unit] = js.native
  /**
  		 * Sets a cookie on the current page.
  		 *
  		 * @param cookie
  		 */
  def setCookie(cookie: WebDriverCookie): Promise[Unit] = js.native
  /**
  		 * Sets the timeout for {@link module:leadfoot/Session#executeAsync} calls.
  		 *
  		 * @param ms The length of the timeout, in milliseconds.
  		 */
  def setExecuteAsyncTimeout(ms: Double): Promise[Double] = js.native
  /**
  		 * Sets the timeout for {@link module:leadfoot/Session#find} calls.
  		 *
  		 * @param ms The length of the timeout, in milliseconds.
  		 */
  def setFindTimeout(ms: Double): Promise[Unit] = js.native
  /**
  		 * Sets the geographical location of the remote environment.
  		 *
  		 * @param location
  		 * Latitude and longitude are specified using standard WGS84 decimal latitude/longitude. Altitude is specified
  		 * as meters above the WGS84 ellipsoid. Not all environments support altitude.
  		 */
  def setGeolocation(location: Geolocation): Promise[Unit] = js.native
  /**
  		 * Sets a value in local storage for the focused window/frame.
  		 *
  		 * @param key The key to set.
  		 * @param value The value to set.
  		 */
  def setLocalStorageItem(key: String, value: String): Promise[Unit] = js.native
  /**
  		 * Sets the screen orientation.
  		 *
  		 * @param orientation Either 'portrait' or 'landscape'.
  		 */
  def setOrientation(orientation: String): Promise[Unit] = js.native
  /**
  		 * Sets the timeout for {@link module:leadfoot/Session#get} calls.
  		 *
  		 * @param ms The length of the timeout, in milliseconds.
  		 */
  def setPageLoadTimeout(ms: Double): Promise[Unit] = js.native
  /**
  		 * Sets a value in session storage for the focused window/frame.
  		 *
  		 * @param key The key to set.
  		 * @param value The value to set.
  		 */
  def setSessionStorageItem(key: String, value: String): Promise[Unit] = js.native
  /**
  		 * Sets the value of a timeout for the session.
  		 *
  		 * @param type
  		 * The type of timeout to set. One of 'script', 'implicit', or 'page load'.
  		 *
  		 * @param ms
  		 * The length of time to use for the timeout, in milliseconds. A value of 0 will cause operations to time out
  		 * immediately.
  		 */
  def setTimeout(`type`: String, ms: Double): Promise[Unit] = js.native
  /**
  		 * Sets the position of a window.
  		 *
  		 * @param windowHandle
  		 * The name of the window to move. See {@link module:leadfoot/Session#switchToWindow} to learn about valid
  		 * window names. Omit this argument to move the currently focused window.
  		 *
  		 * @param x
  		 * The screen x-coordinate to move to, in CSS pixels, relative to the left edge of the primary monitor.
  		 *
  		 * @param y
  		 * The screen y-coordinate to move to, in CSS pixels, relative to the top edge of the primary monitor.
  		 */
  def setWindowPosition(windowHandle: String, x: Double, y: Double): Promise[Unit] = js.native
  def setWindowPosition(x: Double, y: Double): Promise[Unit] = js.native
  def setWindowSize(width: Double, height: Double): Promise[Unit] = js.native
  /**
  		 * Sets the dimensions of a window.
  		 *
  		 * @param windowHandle
  		 * The name of the window to resize. See {@link module:leadfoot/Session#switchToWindow} to learn about valid
  		 * window names. Omit this argument to resize the currently focused window.
  		 *
  		 * @param width
  		 * The new width of the window, in CSS pixels.
  		 *
  		 * @param height
  		 * The new height of the window, in CSS pixels.
  		 */
  def setWindowSize(windowHandle: String, width: Double, height: Double): Promise[Unit] = js.native
  /**
  		 * Switches the currently focused frame to a new frame.
  		 *
  		 * @param id
  		 * The frame to switch to. In most environments, a number or string value corresponds to a key in the
  		 * `window.frames` object of the currently active frame. If `null`, the topmost (default) frame will be used.
  		 * If an Element is provided, it must correspond to a `<frame>` or `<iframe>` element.
  		 */
  def switchToFrame(id: String): Promise[Unit] = js.native
  def switchToFrame(id: Double): Promise[Unit] = js.native
  def switchToFrame(id: typings.leadfoot.elementMod.^): Promise[Unit] = js.native
  /**
  		 * Switches the currently focused frame to the parent of the currently focused frame.
  		 */
  def switchToParentFrame(): Promise[Unit] = js.native
  /**
  		 * Switches the currently focused window to a new window.
  		 *
  		 * @param name
  		 * The name of the window to switch to. In most environments, this value corresponds to the `window.name`
  		 * property of a window; however, this is not the case in mobile environments. In mobile environments, use
  		 * {@link module:leadfoot/Session#getAllWindowHandles} to learn what window names can be used.
  		 */
  def switchToWindow(name: String): Promise[Unit] = js.native
  /**
  		 * Gets a screenshot of the focused window and returns it in PNG format.
  		 *
  		 * @returns A buffer containing a PNG image.
  		 */
  def takeScreenshot(): Promise[Buffer] = js.native
  /**
  		 * Taps an element on a touch screen device. If the element is outside of the viewport, the remote driver will
  		 * attempt to scroll it into view automatically.
  		 *
  		 * @param element The element to tap.
  		 */
  def tap(element: typings.leadfoot.elementMod.^): Promise[Unit] = js.native
  /**
  		 * Scrolls the currently focused window on a touch screen device.
  		 *
  		 * @param element
  		 * An element to scroll to. The window will be scrolled so the element is as close to the top-left corner of the
  		 * window as possible.
  		 *
  		 * @param xOffset
  		 * An optional x-offset, relative to the left edge of the element, in CSS pixels. If no element is specified,
  		 * the offset is relative to the previous scroll position of the window.
  		 *
  		 * @param yOffset
  		 * An optional y-offset, relative to the top edge of the element, in CSS pixels. If no element is specified,
  		 * the offset is relative to the previous scroll position of the window.
  		 */
  def touchScroll(element: typings.leadfoot.elementMod.^, xOffset: Double, yOffset: Double): Promise[Unit] = js.native
  def touchScroll(xOffset: Double, yOffset: Double): Promise[Unit] = js.native
  /**
  		 * Types into the currently active prompt pop-up.
  		 *
  		 * @param text The text to type into the pop-up’s input box.
  		 */
  def typeInPrompt(text: String): Promise[Unit] = js.native
  def typeInPrompt(text: js.Array[String]): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame that match the given query to be destroyed.
  		 *
  		 * @param using
  		 * The element retrieval strategy to use. See {@link module:leadfoot/Session#find} for options.
  		 *
  		 * @param value
  		 * The strategy-specific value to search for. See {@link module:leadfoot/Session#find} for details.
  		 */
  def waitForDeleted(using: String, value: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given CSS class name to be destroyed.
  		 *
  		 * @param className The CSS class name to search for.
  		 */
  def waitForDeletedByClassName(className: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given CSS selector to be destroyed.
  		 *
  		 * @param selector The CSS selector to search for.
  		 */
  def waitForDeletedByCssSelector(className: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given ID to be destroyed.
  		 *
  		 * @param id The ID of the element.
  		 */
  def waitForDeletedById(id: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given case-insensitive link text to be destroyed.
  		 *
  		 * @param text The link text of the element.
  		 */
  def waitForDeletedByLinkText(text: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given name attribute to be destroyed.
  		 *
  		 * @param name The name of the element.
  		 */
  def waitForDeletedByName(name: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame partially matching the given case-insensitive link text to be
  		 * destroyed.
  		 *
  		 * @param text The partial link text of the element.
  		 */
  def waitForDeletedByPartialLinkText(text: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given HTML tag name to be destroyed.
  		 *
  		 * @param tagName The tag name of the element.
  		 */
  def waitForDeletedByTagName(tagName: String): Promise[Unit] = js.native
  /**
  		 * Waits for all elements in the currently active window/frame matching the given XPath selector to be destroyed.
  		 *
  		 * @param path The XPath selector to search for.
  		 */
  def waitForDeletedByXpath(path: String): Promise[Unit] = js.native
}

