package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ImageVersions in a project and location.
  */
@js.native
trait SchemaListImageVersionsResponse extends js.Object {
  /**
    * The list of supported ImageVersions in a location.
    */
  var imageVersions: js.UndefOr[js.Array[SchemaImageVersion]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListImageVersionsResponse {
  @scala.inline
  def apply(imageVersions: js.Array[SchemaImageVersion] = null, nextPageToken: String = null): SchemaListImageVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (imageVersions != null) __obj.updateDynamic("imageVersions")(imageVersions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListImageVersionsResponse]
  }
}

