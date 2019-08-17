package typings.i18nextDashXhrDashBackend

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextDashXhrDashBackendMod {
  import typings.std.XMLHttpRequest

  type AjaxRequestCallback = js.Function2[/* response */ String, /* x */ XMLHttpRequest, Unit]
  type LoadPathOption = String | (js.Function2[/* lngs */ js.Array[String], /* namespaces */ js.Array[String], String])
}
