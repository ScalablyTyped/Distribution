package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListFindings` method.
  */
@js.native
trait SchemaListFindingsResponse extends js.Object {
  /**
    * The list of Findings returned.
    */
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFindingsResponse {
  @scala.inline
  def apply(findings: js.Array[SchemaFinding] = null, nextPageToken: String = null): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (findings != null) __obj.updateDynamic("findings")(findings.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
}

