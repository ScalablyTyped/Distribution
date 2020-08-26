package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
@js.native
trait SchemaListAuthorizedCertificatesResponse extends js.Object {
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[SchemaAuthorizedCertificate]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(): SchemaListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAuthorizedCertificatesResponse]
  }
  @scala.inline
  implicit class SchemaListAuthorizedCertificatesResponseOps[Self <: SchemaListAuthorizedCertificatesResponse] (val x: Self) extends AnyVal {
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
    def setCertificatesVarargs(value: SchemaAuthorizedCertificate*): Self = this.set("certificates", js.Array(value :_*))
    @scala.inline
    def setCertificates(value: js.Array[SchemaAuthorizedCertificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

