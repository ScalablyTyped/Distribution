package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("pjax")
  var pjax_Original: PjaxStatic = js.native
  /**
    * Loads a URL with ajax, puts the response body inside a container, then pushState()'s the loaded URL.
    * Works just like $.ajax in that it accepts a jQuery ajax settings object (with keys like url, type, data, etc).
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    */
  def pjax(): jqueryLib.JQueryXHR = js.native
  def pjax(options: PjaxSettings): jqueryLib.JQueryXHR = js.native
}

