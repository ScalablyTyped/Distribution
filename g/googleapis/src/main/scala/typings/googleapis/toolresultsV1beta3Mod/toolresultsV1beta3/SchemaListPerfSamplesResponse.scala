package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListPerfSamplesResponse extends js.Object {
  /**
    * Optional, returned if result size exceeds the page size specified in the
    * request (or the default page size, 500, if unspecified). It indicates the
    * last sample timestamp to be used as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.native
  var perfSamples: js.UndefOr[js.Array[SchemaPerfSample]] = js.native
}

object SchemaListPerfSamplesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, perfSamples: js.Array[SchemaPerfSample] = null): SchemaListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (perfSamples != null) __obj.updateDynamic("perfSamples")(perfSamples.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPerfSamplesResponse]
  }
}

