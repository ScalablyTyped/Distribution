package typings.jqueryDotAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryAddressStatic extends js.Object {
  def apply(): js.Any = js.native
  /**
    * Provides the state of the auto update mode. Enabled by default.
    */
  def autoUpdate(): Boolean = js.native
  /**
    * Enables or disables the auto update mode which can be turned off when multiple parameters values have to be changed at once.
    */
  def autoUpdate(value: Boolean): JQueryAddressStatic = js.native
  /**
    * Provides the base address of the document.
    */
  def baseURL(): String = js.native
  /**
    * Binds any supported event type to a function with support for an optional map of data.
    */
  def bind(`type`: js.Any, data: js.Any, callback: js.Function): JQueryAddressStatic = js.native
  /**
    * Binds a function to be executed whenever the address is changed. 
    * The function receives a single event object parameter that contains the following properties: 
    * value, path, pathNames, parameterNames, parameters and queryString.
    */
  def change(callback: js.Function): JQueryAddressStatic = js.native
  /**
    * Provides the state of the crawling mode. Disables by default.
    */
  def crawlable(): Boolean = js.native
  /**
    * Enables or disables the crawling mode which will automatically convert the values into a Google Ajax Crawling friendly format.
    */
  def crawlable(value: Boolean): JQueryAddressStatic = js.native
  /**
    * Binds a function to be executed when the address is changed from the browser usually when entering the page or using the back and forward buttons. 
    * The function receives a single event object parameter that contains the following properties: 
    * value, path, pathNames, parameterNames, parameters and queryString.
    */
  def externalChange(eventhandler: js.Function): JQueryAddressStatic = js.native
  /**
    * Provides the hash fragment part of the deep linking value.
    */
  def hash(): String = js.native
  /**
    * Sets the hash fragment part of the deep linking value.
    */
  def hash(value: String): JQueryAddressStatic = js.native
  /**
    * Provides the state of the history mode setting. Enabled by default.
    */
  def history(): Boolean = js.native
  /**
    * Enables or disables the history mode which generated entries in the browser history.
    */
  def history(value: Boolean): Unit = js.native
  /**
    * Binds a function to be executed once when the address is initiated. 
    * The function receives a single event object parameter that contains the following properties: 
    * value, path, pathNames, parameterNames, parameters and queryString.
    */
  def init(callback: js.Function): JQueryAddressStatic = js.native
  /**
    * Binds a function to be executed when the address is changed from inside the page that uses the plugin. 
    * The function receives a single event object parameter that contains the following properties: 
    * value, path, pathNames, parameterNames, parameters and queryString.
    */
  def internalChange(eventhandler: js.Function): JQueryAddressStatic = js.native
  /**
    * Provides the value of a specific query parameter.
    */
  def parameter(name: String): String = js.native
  /**
    * Sets a query parameter value. Appending is disabled by default but can be enabled for array values.
    */
  def parameter(name: String, value: String, append: Boolean): JQueryAddressStatic = js.native
  /**
    * Provides a list of all the query parameter names.
    */
  def parameterNames(): js.Array[String] = js.native
  /**
    * Provides the deep linking value without the query string and the hash fragment.
    */
  def path(): String = js.native
  /**
    * Sets the deep linking value without the query string and the hash fragment.
    */
  def path(value: String): JQueryAddressStatic = js.native
  /**
    * Provides a list of all the folders in the deep linking path.
    */
  def pathNames(): js.Array[String] = js.native
  /**
    * Provides the query string part of the deep linking value.
    */
  def queryString(): String = js.native
  /**
    * Sets the query string part of the deep linking value.
    */
  def queryString(value: String): JQueryAddressStatic = js.native
  /**
    * Provides the value used as a base path for the HTML5 state management.
    */
  def state(): String = js.native
  /**
    * Sets the base path of the website that is utilized in HTML5 state management.
    */
  def state(value: String): JQueryAddressStatic = js.native
  /**
    * Provides the state of the strict mode setting. Enabled by default.
    */
  def strict(): Boolean = js.native
  /**
    * Enables or disables the strict mode which automatically appends a slash in the beginning of the deep linking value.
    */
  def strict(value: Boolean): JQueryAddressStatic = js.native
  /**
    * Provides the title of the HTML document.
    */
  def title(): String = js.native
  /**
    * Sets the title of the HTML document.
    */
  def title(value: String): JQueryAddressStatic = js.native
  /**
    * Provides the currently set page view tracking function.
    */
  def tracker(): js.Any = js.native
  /**
    * Sets a function for page view tracking. Google Analytics tracking is automatically invoked if it exists in the page.
    */
  def tracker(value: js.Function): JQueryAddressStatic = js.native
  /**
    * Updates the value when auto updating is disabled.
    */
  def update(): JQueryAddressStatic = js.native
  /**
    * Provides the current deep linking value.
    */
  def value(): String = js.native
  /**
    * Sets the current deep linking value.
    */
  def value(url: String): JQueryAddressStatic = js.native
  /**
    * Provides the state of the wrap mode. Disabled by default.
    */
  def wrap(): Boolean = js.native
  /**
    * Enables or disables the wrap mode which generates a DIV wrapper around the page content and fixes any scroll issues caused by the use of hash fragments.
    */
  def wrap(value: Boolean): JQueryAddressStatic = js.native
}

