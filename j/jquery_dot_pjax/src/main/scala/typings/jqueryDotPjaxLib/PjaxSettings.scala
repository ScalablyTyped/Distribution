package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PjaxSettings
  extends jqueryLib.JQueryNs.AjaxSettings[js.Any] {
  /**
       * A jQuery selector indicates where to stick the response body. E.g., $(container).html(xhr.responseBody).
       * If it is not defined, the `data-pjax` attribute of the link will be treated as container.
       * If such an attribute is not defined too, the context will be treated as container.
       */
  var container: js.UndefOr[java.lang.String] = js.undefined
  /**
       * CSS selector for the fragment to extract from ajax response.
       */
  var fragment: js.UndefOr[java.lang.String] = js.undefined
  /**
       * How many requests to cache. Defaults to 20.
       */
  var maxCacheLength: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether to pushState the URL. Defaults to true.
       */
  var push: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to replaceState the URL. Defaults to false.
       */
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Vertical position to scroll to after navigation.
       * To avoid changing scroll position, pass false.
       */
  var scrollTo: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
       * Eventually the relatedTarget value for pjax events.
       */
  var target: js.UndefOr[stdLib.EventTarget] = js.undefined
  /**
       * A string or function returning the current pjax version
       */
  var version: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
}

