package typings
package jqueryDotDynatreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynaTreeAjaxOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
   // >0: Make sure we get an ajax error for invalid URLs
  var dataType: js.UndefOr[java.lang.String] = js.undefined
   // false: Append random '_' argument to the request url to prevent caching.
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

