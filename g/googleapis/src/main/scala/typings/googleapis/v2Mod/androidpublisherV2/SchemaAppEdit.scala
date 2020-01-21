package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an edit of an app. An edit allows clients to make multiple
  * changes before committing them in one operation.
  */
@js.native
trait SchemaAppEdit extends js.Object {
  /**
    * The time at which the edit will expire and will be no longer valid for
    * use in any subsequent API calls (encoded as seconds since the Epoch).
    */
  var expiryTimeSeconds: js.UndefOr[String] = js.native
  /**
    * The ID of the edit that can be used in subsequent API calls.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaAppEdit {
  @scala.inline
  def apply(expiryTimeSeconds: String = null, id: String = null): SchemaAppEdit = {
    val __obj = js.Dynamic.literal()
    if (expiryTimeSeconds != null) __obj.updateDynamic("expiryTimeSeconds")(expiryTimeSeconds.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppEdit]
  }
}

