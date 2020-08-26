package typings.greasemonkey

import typings.greasemonkey.GM.Request
import typings.greasemonkey.GM.Value
import typings.greasemonkey.anon.Script
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * Window object of the content page where the user script is running on.
    * @see {@link http://wiki.greasespot.net/UnsafeWindow}
    */
  var unsafeWindow: Window = js.native
  @js.native
  object GM extends js.Object {
    // Headers
    /**
      * Meta data about the running user script.
      * @see {@link https://wiki.greasespot.net/GM.info}
      */
    var info: Script = js.native
    /**
      * Deletes an existing name / value pair from storage.
      * @see {@link https://wiki.greasespot.net/GM.deleteValue}
      * @param name Property name to delete
      * @returns A Promise, resolved successfully with no value on success,
      * rejected with no value on failure.
      */
    def deleteValue(name: String): js.Promise[Unit] = js.native
    // Resources
    /**
      * Given a defined `@resource`, this method returns it as a URL
      * @see {@link https://wiki.greasespot.net/GM.getResourceUrl}
      * @param resourceName The name provided when the `@resource` was defined
      * @returns A Promise, rejected on failure and resolved with a string URL on
      * success.
      * Treat the result as opaque string. It will work where you need a URL
      * (for a `<link>` or `<style>` for CSS, for an `<img>` tag, or similar).
      */
    def getResourceUrl(resourceName: String): js.Promise[String] = js.native
    /**
      * Retrieves a value that was set with `GM.setValue`
      * @see {@link https://wiki.greasespot.net/GM.getValue}
      * @param name The property name to get
      * @param defaultValue The default value to be returned when none has
      * previously been set
      * @returns A Promise, rejected in case of error and otherwise resolved with:
      * - When this name has been set - `string`, `integer` or `boolean` as
      * previously set
      * - When this name has not been set, and default is provided - The value
      * passed as default
      * - When this name has not been set, and default is not provided -
      * `undefined`
      * @example
      * // Retrieving the value associated with the name 'timezoneOffset' with a default value defined:
      * const timezoneOffset = await GM.getValue("timezoneOffset", -5)
      * @example
      * // For structured data used `JSON.stringify()` to place an object into storage and then `JSON.parse()` to convert it back
      * const storedObject = JSON.parse(await GM.getValue('foo', '{}'));
      */
    def getValue[TValue](name: String): js.Promise[js.UndefOr[TValue]] = js.native
    def getValue[TValue](name: String, defaultValue: TValue): js.Promise[js.UndefOr[TValue]] = js.native
    /**
      * Retrieves an array of preference names that this script has stored
      * @see {@link https://wiki.greasespot.net/GM.listValues}
      * @returns A Promise, rejected in case of error and otherwise resolved with
      * an string[] for previously set values
      */
    def listValues(): js.Promise[js.Array[String]] = js.native
    // Other
    /**
      * Displays a notification to the user, using the underlying operating
      * system's notification mechanism
      * @see {@link https://wiki.greasespot.net/GM.notification}
      * @param text The main notification text
      * @param title The title of the notification
      * @param image The URL for an image to display in the dialog. If not
      * provided, the Greasemonkey logo by default.
      * @param onClick Callback, triggered when the notification's button is
      * clicked.
      */
    def notification(text: String, title: String): Unit = js.native
    def notification(text: String, title: String, image: js.UndefOr[scala.Nothing], onClick: js.Function0[Unit]): Unit = js.native
    def notification(text: String, title: String, image: String): Unit = js.native
    def notification(text: String, title: String, image: String, onClick: js.Function0[Unit]): Unit = js.native
    /**
      * Opens the specified URL in a new tab.
      * @see {@link https://wiki.greasespot.net/GM.openInTab}
      * @param url The URL to navigate the new tab to
      * @param openInBackground Force tab to/to not open in a background tab.
      * Default (unspecified) behavior honors Firefox configuration.
      */
    def openInTab(url: String): Unit = js.native
    def openInTab(url: String, openInBackground: Boolean): Unit = js.native
    /**
      * Sets the current contents of the operating system's clipboard
      * @see {@link https://wiki.greasespot.net/GM.setClipboard}
      */
    def setClipboard(text: String): Unit = js.native
    // Values
    /**
      * Allows user script authors to persist simple values across page loads and
      * across origins.
      * Strings, booleans, and integers are currently the only allowed data types.
      * @see {@link https://wiki.greasespot.net/GM.setValue}
      * @param name The unique (within this script) name for this value.
      * Should be restricted to valid Javascript identifier characters.
      * @param value Any valid value of these types. Any other type may cause
      * undefined behavior, including crashes
      * @returns A Promise, resolved successfully with no value on success,
      * rejected with no value on failure
      */
    def setValue(name: String, value: Value): js.Promise[Unit] = js.native
    /**
      * Performs a similar function to the standard XMLHttpRequest object, but
      * allows these requests to cross the [same origin policy]{@link https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy} boundaries.
      * @see {@link https://wiki.greasespot.net/GM.xmlHttpRequest}
      */
    def xmlHttpRequest(details: Request[_]): Unit = js.native
  }
  
}

