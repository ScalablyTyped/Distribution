package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output only.  The List companies response object.
  */
@js.native
trait SchemaListCompaniesResponse extends js.Object {
  /**
    * Companies for the current client.
    */
  var companies: js.UndefOr[js.Array[SchemaCompany]] = js.native
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCompaniesResponse {
  @scala.inline
  def apply(): SchemaListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCompaniesResponse]
  }
  @scala.inline
  implicit class SchemaListCompaniesResponseOps[Self <: SchemaListCompaniesResponse] (val x: Self) extends AnyVal {
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
    def setCompaniesVarargs(value: SchemaCompany*): Self = this.set("companies", js.Array(value :_*))
    @scala.inline
    def setCompanies(value: js.Array[SchemaCompany]): Self = this.set("companies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanies: Self = this.set("companies", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

