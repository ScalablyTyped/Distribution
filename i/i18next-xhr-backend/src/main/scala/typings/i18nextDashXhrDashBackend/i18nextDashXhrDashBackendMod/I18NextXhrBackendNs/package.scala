package typings.i18nextDashXhrDashBackend.i18nextDashXhrDashBackendMod

import typings.i18nextDashXhrDashBackend.i18nextDashXhrDashBackendNumbers.`false`
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object I18NextXhrBackendNs {
  type AjaxRequestCallback = js.Function2[/* response */ String, /* x */ XMLHttpRequest, Unit]
  type LoadCallback = js.Function2[/* error */ js.Any, /* result */ String | `false`, Unit]
  type LoadPathOption = String | (js.Function2[/* lngs */ js.Array[String], /* namespaces */ js.Array[String], String])
}
