package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about vulnerable or missing HTTP Headers.
  */
@js.native
trait SchemaVulnerableHeaders extends js.Object {
  /**
    * List of vulnerable headers.
    */
  var headers: js.UndefOr[js.Array[SchemaHeader]] = js.native
  /**
    * List of missing headers.
    */
  var missingHeaders: js.UndefOr[js.Array[SchemaHeader]] = js.native
}

object SchemaVulnerableHeaders {
  @scala.inline
  def apply(headers: js.Array[SchemaHeader] = null, missingHeaders: js.Array[SchemaHeader] = null): SchemaVulnerableHeaders = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (missingHeaders != null) __obj.updateDynamic("missingHeaders")(missingHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVulnerableHeaders]
  }
}

