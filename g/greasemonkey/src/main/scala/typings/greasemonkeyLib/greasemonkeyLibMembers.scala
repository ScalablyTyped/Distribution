package typings
package greasemonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object greasemonkeyLibMembers extends js.Object {
  var unsafeWindow: stdLib.Window = js.native
  ////////////////
  // Utilities
  ////////////////
  /**
    * Adds CSS to the content page.
    * @param  css  a CSS string. It can have multiple style definitions.
    * @see    {@link http://wiki.greasespot.net/GM_addStyle}
    */
  def GM_addStyle(css: java.lang.String): scala.Unit = js.native
  ////////////////
  // Values
  ////////////////
  /**
    * Deletes an existing name / value pair from the script storage.
    * @param  name  a name of the pair to delete.
    * @see    {@link http://wiki.greasespot.net/GM_deleteValue}
    */
  def GM_deleteValue(name: java.lang.String): scala.Unit = js.native
  ////////////////
  // Resources
  ////////////////
  /**
    * Gets a content of a resouce defined by {@link http://wiki.greasespot.net/Metadata_Block#.40resource|@resource}.
    * @param    resourceName  a name of the resource to get.
    * @returns  the content of the resource.
    * @see      {@link http://wiki.greasespot.net/GM_getResourceText}
    */
  def GM_getResourceText(resourceName: java.lang.String): java.lang.String = js.native
  /**
    * Gets a URL of a resource defined by {@link http://wiki.greasespot.net/Metadata_Block#.40resource|@resource}.
    * @param    resourceName  a name of the resource.
    * @returns  a URL that returns the content of the resource.
    * @see      {@link http://wiki.greasespot.net/GM_getResourceURL}
    */
  def GM_getResourceURL(resourceName: java.lang.String): java.lang.String = js.native
  def GM_getValue(name: java.lang.String): scala.Double = js.native
  def GM_getValue(name: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  def GM_getValue(name: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def GM_getValue(name: java.lang.String, defaultValue: scala.Boolean): scala.Boolean = js.native
  def GM_getValue(name: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  /**
    * Retrieves a value from the script storage.
    * @param    name          a name to retrieve.
    * @param    defaultValue  a value to be returned when the name does not exist.
    * @returns  a retrieved value, or passed default value, or undefined.
    * @see      {@link http://wiki.greasespot.net/GM_getValue}
    */
  @JSName("GM_getValue")
  def GM_getValue_Any(name: java.lang.String): js.Any = js.native
  @JSName("GM_getValue")
  def GM_getValue_Boolean(name: java.lang.String): scala.Boolean = js.native
  @JSName("GM_getValue")
  def GM_getValue_String(name: java.lang.String): java.lang.String = js.native
  /**
    * Retrieves an array of names stored in the script storage.
    * @returns  an array of names in the storage.
    * @see      {@link http://wiki.greasespot.net/GM_listValues}
    */
  def GM_listValues(): js.Array[java.lang.String] = js.native
  /**
    * Writes a message as a log to the console with the script identifier.
    * @param  message  a message to be written.
    * @see    {@link http://wiki.greasespot.net/GM_log}
    */
  def GM_log(message: js.Any): scala.Unit = js.native
  /**
    * Opens a URL in a new tab.
    * @param    url  a URL to open.
    * @returns  window object of the opened tab.
    * @see      {@link http://wiki.greasespot.net/GM_openInTab}
    */
  def GM_openInTab(url: java.lang.String): stdLib.Window = js.native
  /**
    * Registers an item as a submenu of User Script Commands.
    * @param  caption      a caption of the menu item.
    * @param  commandFunc  a function to be invoked when the item has been selected.
    * @param  accessKey    a single character that can be used to select the item by keyboard.
    *                      It should be a letter in the caption.
    * @see    {@link http://wiki.greasespot.net/GM_registerMenuCommand}
    */
  def GM_registerMenuCommand(caption: java.lang.String, commandFunc: js.Function): scala.Unit = js.native
  def GM_registerMenuCommand(caption: java.lang.String, commandFunc: js.Function, accessKey: java.lang.String): scala.Unit = js.native
  /**
    * Sets a text to the clipboard of the opeating system.
    * @param  text  a text to be set to the clipboard.
    * @see    {@link http://wiki.greasespot.net/GM_setClipboard}
    */
  def GM_setClipboard(text: java.lang.String): scala.Unit = js.native
  /**
    * Stores a name / value pair to the script storage.
    * @param  name   a name of the pair.
    * @param  value  a value to be stored.
    * @see    {@link http://wiki.greasespot.net/GM_setValue}
    */
  def GM_setValue(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def GM_setValue(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def GM_setValue(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
    * Sends a HTTP request to a URL.
    * @param    options  options and callbacks for HTTP request.
    * @returns  an object which can abort the request.
    *           If the request is sent in the synchronous mode, it also contains the response information.
    * @see      {@link http://wiki.greasespot.net/GM_setClipboard}
    */
  def GM_xmlhttpRequest(options: GMXMLHttpRequestOptions): GMXMLHttpRequestResult = js.native
}

