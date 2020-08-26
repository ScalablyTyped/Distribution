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
  def apply(): SchemaListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherProfilesResponse]
  }
  @scala.inline
  implicit class SchemaListPublisherProfilesResponseOps[Self <: SchemaListPublisherProfilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPublisherProfilesVarargs(value: SchemaPublisherProfile*): Self = this.set("publisherProfiles", js.Array(value :_*))
    @scala.inline
    def setPublisherProfiles(value: js.Array[SchemaPublisherProfile]): Self = this.set("publisherProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherProfiles: Self = this.set("publisherProfiles", js.undefined)
  }
  
}

