package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceErrorEvent extends DataSourceEvent {
  var errorThrown: js.Any
  var errors: js.UndefOr[js.Any] = js.undefined
  var status: java.lang.String
  var xhr: kendoDashUiLib.JQueryXHR
}

