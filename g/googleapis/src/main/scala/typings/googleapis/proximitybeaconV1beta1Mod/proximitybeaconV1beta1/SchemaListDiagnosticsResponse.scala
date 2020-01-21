package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response that contains the requested diagnostics.
  */
@js.native
trait SchemaListDiagnosticsResponse extends js.Object {
  /**
    * The diagnostics matching the given request.
    */
  var diagnostics: js.UndefOr[js.Array[SchemaDiagnostics]] = js.native
  /**
    * Token that can be used for pagination. Returned only if the request
    * matches more beacons than can be returned in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDiagnosticsResponse {
  @scala.inline
  def apply(diagnostics: js.Array[SchemaDiagnostics] = null, nextPageToken: String = null): SchemaListDiagnosticsResponse = {
    val __obj = js.Dynamic.literal()
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDiagnosticsResponse]
  }
}

