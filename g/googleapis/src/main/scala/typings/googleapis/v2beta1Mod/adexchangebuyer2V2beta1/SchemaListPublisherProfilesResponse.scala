package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for profiles visible to the buyer.
  */
@js.native
trait SchemaListPublisherProfilesResponse extends js.Object {
  /**
    * List pagination support
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching publisher profiles.
    */
  var publisherProfiles: js.UndefOr[js.Array[SchemaPublisherProfile]] = js.native
}

object SchemaListPublisherProfilesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, publisherProfiles: js.Array[SchemaPublisherProfile] = null): SchemaListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (publisherProfiles != null) __obj.updateDynamic("publisherProfiles")(publisherProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListPublisherProfilesResponse]
  }
}

