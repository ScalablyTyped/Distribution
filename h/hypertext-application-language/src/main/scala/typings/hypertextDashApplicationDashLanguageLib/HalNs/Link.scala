package typings
package hypertextDashApplicationDashLanguageLib.HalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Describe a HAL Link object
     *
     * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
     */

trait Link extends js.Object {
  var deprecation: js.UndefOr[java.lang.String] = js.undefined
  var href: java.lang.String
  var hreflang: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var templated: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

