package typings.jqueryPjax

import typings.jquery.JQuery.Event
import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PjaxStatic extends js.Object {
  
  /**
    * Loads a URL with ajax, puts the response body inside a container, then pushState()'s the loaded URL.
    * Works just like $.ajax in that it accepts a jQuery ajax settings object (with keys like url, type, data, etc).
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    */
  def apply(): JQueryXHR = js.native
  def apply(options: PjaxSettings): JQueryXHR = js.native
  
  /**
    * PJAX on click handler.
    * @param event A jQuery click event.
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    */
  def click(event: Event): Unit = js.native
  def click(event: Event, containerSelector: js.UndefOr[scala.Nothing], options: PjaxSettings): Unit = js.native
  def click(event: Event, containerSelector: String): Unit = js.native
  def click(event: Event, containerSelector: String, options: PjaxSettings): Unit = js.native
  def click(event: Event, options: PjaxSettings): Unit = js.native
  
  /**
    * PJAX default settings.
    */
  var defaults: PjaxSettings = js.native
  
  /**
    * Disable pushState behavior.
    * This is the case when a browser doesn't support pushState. It is sometimes useful to disable pushState for debugging on a modern browser.
    */
  def disable(): Unit = js.native
  
  /**
    * Install pjax functions on $.pjax to enable pushState behavior. Does nothing if already enabled.
    */
  def enable(): Unit = js.native
  
  /**
    * Reload current page with pjax.
    */
  def reload(container: String): JQueryXHR = js.native
  def reload(container: String, options: PjaxSettings): JQueryXHR = js.native
  
  /**
    * PJAX on form submit handler
    * @param event A jQuery click event.
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    */
  def submit(event: Event): Unit = js.native
  def submit(event: Event, containerSelector: js.UndefOr[scala.Nothing], options: PjaxSettings): Unit = js.native
  def submit(event: Event, containerSelector: String): Unit = js.native
  def submit(event: Event, containerSelector: String, options: PjaxSettings): Unit = js.native
  def submit(event: Event, options: PjaxSettings): Unit = js.native
}
