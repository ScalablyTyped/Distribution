package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the list of matters.
  */
@js.native
trait SchemaListMattersResponse extends js.Object {
  /**
    * List of matters.
    */
  var matters: js.UndefOr[js.Array[SchemaMatter]] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListMattersResponse {
  @scala.inline
  def apply(matters: js.Array[SchemaMatter] = null, nextPageToken: String = null): SchemaListMattersResponse = {
    val __obj = js.Dynamic.literal()
    if (matters != null) __obj.updateDynamic("matters")(matters.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListMattersResponse]
  }
}

