package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PjaxStatic extends js.Object {
  /**
       * PJAX default settings.
       */
  var defaults: PjaxSettings = js.native
  /**
       * Loads a URL with ajax, puts the response body inside a container, then pushState()'s the loaded URL.
       * Works just like $.ajax in that it accepts a jQuery ajax settings object (with keys like url, type, data, etc).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def apply(): jqueryLib.JQueryXHR = js.native
  /**
       * Loads a URL with ajax, puts the response body inside a container, then pushState()'s the loaded URL.
       * Works just like $.ajax in that it accepts a jQuery ajax settings object (with keys like url, type, data, etc).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def apply(options: PjaxSettings): jqueryLib.JQueryXHR = js.native
  /**
       * PJAX on click handler.
       * @param event A jQuery click event.
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def click(event: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  /**
       * PJAX on click handler.
       * @param event A jQuery click event.
       * @param containerSelector A jQuery selector indicates where to stick the response body. E.g., $(containerSelector).html(xhr.responseBody).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. The `containerSelector` parameter has priority.
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def click(event: jqueryLib.JQueryNs.Event, containerSelector: java.lang.String): scala.Unit = js.native
  /**
       * PJAX on click handler.
       * @param event A jQuery click event.
       * @param containerSelector A jQuery selector indicates where to stick the response body. E.g., $(containerSelector).html(xhr.responseBody).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. The `containerSelector` parameter has priority.
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def click(event: jqueryLib.JQueryNs.Event, containerSelector: java.lang.String, options: PjaxSettings): scala.Unit = js.native
  /**
       * PJAX on click handler.
       * @param event A jQuery click event.
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def click(event: jqueryLib.JQueryNs.Event, options: PjaxSettings): scala.Unit = js.native
  /**
       * Disable pushState behavior.
       * This is the case when a browser doesn't support pushState. It is sometimes useful to disable pushState for debugging on a modern browser.
       */
  def disable(): scala.Unit = js.native
  /**
       * Install pjax functions on $.pjax to enable pushState behavior. Does nothing if already enabled.
       */
  def enable(): scala.Unit = js.native
  /**
       * Reload current page with pjax.
       */
  def reload(container: java.lang.String): jqueryLib.JQueryXHR = js.native
  /**
       * Reload current page with pjax.
       */
  def reload(container: java.lang.String, options: PjaxSettings): jqueryLib.JQueryXHR = js.native
  /**
       * PJAX on form submit handler
       * @param event A jQuery click event.
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def submit(event: jqueryLib.JQueryNs.Event): scala.Unit = js.native
  /**
       * PJAX on form submit handler
       * @param event A jQuery click event.
       * @param containerSelector A jQuery selector indicates where to stick the response body. E.g., $(containerSelector).html(xhr.responseBody).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. The `containerSelector` parameter has priority.
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def submit(event: jqueryLib.JQueryNs.Event, containerSelector: java.lang.String): scala.Unit = js.native
  /**
       * PJAX on form submit handler
       * @param event A jQuery click event.
       * @param containerSelector A jQuery selector indicates where to stick the response body. E.g., $(containerSelector).html(xhr.responseBody).
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. The `containerSelector` parameter has priority.
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def submit(event: jqueryLib.JQueryNs.Event, containerSelector: java.lang.String, options: PjaxSettings): scala.Unit = js.native
  /**
       * PJAX on form submit handler
       * @param event A jQuery click event.
       * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
       * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * - push: a boolean indicates whether to pushState the URL. Default is true.
       * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
       */
  def submit(event: jqueryLib.JQueryNs.Event, options: PjaxSettings): scala.Unit = js.native
}

