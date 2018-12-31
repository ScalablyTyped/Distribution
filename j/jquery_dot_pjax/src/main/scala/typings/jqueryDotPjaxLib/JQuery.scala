package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("on")
  def `on_pjax:popstate`(
    event: jqueryDotPjaxLib.jqueryDotPjaxLibStrings.`pjax:popstate`,
    handler: js.Function1[/* e */ PjaxPopStateEventObject, scala.Unit]
  ): this.type = js.native
  /**
    * Tell PJAX to listen links with delegation selector that, when click on them, fetches the href with ajax into the container.
    * Tries to make sure the back button and ctrl+click work the way you'd expect.
    * If `options.container` is not defined, the `data-pjax` attribute of the link will be treated as container.
    * If such an attribute is not defined too, the context runs with this statement will be treated as container.
    * @param delegationSelector The selector to limit which links PJAX should listen on.
    * @param options PJAX settings, which is a superset of jQuery AJAX settings. It includes the following specific options:
    * - container: a jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
    * - push: a boolean indicates whether to pushState the URL. Default is true.
    * - replace: a boolean indicates whether to use replaceState instead of pushState. Default is false.
    * @return Returns the jQuery object
    */
  def pjax(delegationSelector: java.lang.String): JQuery = js.native
  def pjax(delegationSelector: java.lang.String, containerSelector: java.lang.String): JQuery = js.native
  def pjax(delegationSelector: java.lang.String, containerSelector: java.lang.String, options: PjaxSettings): JQuery = js.native
  def pjax(delegationSelector: java.lang.String, options: PjaxSettings): JQuery = js.native
}

