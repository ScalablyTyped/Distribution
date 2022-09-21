package typings.greasemonkey

import typings.greasemonkey.GM.Request
import typings.greasemonkey.GM.Value
import typings.greasemonkey.anon.Script
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object GM {
    
    @JSGlobal("GM")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Deletes an existing name / value pair from storage.
      * @see {@link https://wiki.greasespot.net/GM.deleteValue}
      * @param name Property name to delete
      * @returns A Promise, resolved successfully with no value on success,
      * rejected with no value on failure.
      */
    inline def deleteValue(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteValue")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
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
    inline def getResourceUrl(resourceName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceUrl")(resourceName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
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
    inline def getValue(name: String): js.Promise[js.UndefOr[Value]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Value]]]
    inline def getValue[TValue](name: String, defaultValue: TValue): js.Promise[TValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValue")(name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TValue]]
    
    // Headers
    /**
      * Meta data about the running user script.
      * @see {@link https://wiki.greasespot.net/GM.info}
      */
    @JSGlobal("GM.info")
    @js.native
    def info: Script = js.native
    inline def info_=(x: Script): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    /**
      * Retrieves an array of preference names that this script has stored
      * @see {@link https://wiki.greasespot.net/GM.listValues}
      * @returns A Promise, rejected in case of error and otherwise resolved with
      * an string[] for previously set values
      */
    inline def listValues(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listValues")().asInstanceOf[js.Promise[js.Array[String]]]
    
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
    inline def notification(text: String, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def notification(text: String, title: String, image: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def notification(text: String, title: String, image: String, onClick: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def notification(text: String, title: String, image: Unit, onClick: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Opens the specified URL in a new tab.
      * @see {@link https://wiki.greasespot.net/GM.openInTab}
      * @param url The URL to navigate the new tab to
      * @param openInBackground Force tab to/to not open in a background tab.
      * Default (unspecified) behavior honors Firefox configuration.
      */
    inline def openInTab(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openInTab")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def openInTab(url: String, openInBackground: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openInTab")(url.asInstanceOf[js.Any], openInBackground.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Adds an item to the User Script Commands menu.
      * @param caption The caption to display on the menu item.
      * @param commandFunc The function to call when the menu item is selected.
      * @param accessKey A single character that can be used to select the
      * item when the menu is open. It should be a letter in the caption.
      * @see {@link https://wiki.greasespot.net/GM.registerMenuCommand}
      */
    inline def registerMenuCommand(caption: String, commandFunc: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMenuCommand")(caption.asInstanceOf[js.Any], commandFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def registerMenuCommand(caption: String, commandFunc: js.Function0[Unit], accessKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMenuCommand")(caption.asInstanceOf[js.Any], commandFunc.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Sets the current contents of the operating system's clipboard
      * @see {@link https://wiki.greasespot.net/GM.setClipboard}
      */
    inline def setClipboard(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClipboard")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    inline def setValue(name: String, value: Value): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setValue")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Performs a similar function to the standard XMLHttpRequest object, but
      * allows these requests to cross the [same origin policy]{@link https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy} boundaries.
      * @see {@link https://wiki.greasespot.net/GM.xmlHttpRequest}
      */
    inline def xmlHttpRequest(details: Request[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHttpRequest")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Window object of the content page where the user script is running on.
    * @see {@link http://wiki.greasespot.net/UnsafeWindow}
    */
  @JSGlobal("unsafeWindow")
  @js.native
  def unsafeWindow: Window = js.native
  inline def unsafeWindow_=(x: Window): Unit = js.Dynamic.global.updateDynamic("unsafeWindow")(x.asInstanceOf[js.Any])
}
