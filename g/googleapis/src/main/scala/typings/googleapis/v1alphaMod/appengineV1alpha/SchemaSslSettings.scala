package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SSL configuration for a DomainMapping resource.
  */
@js.native
trait SchemaSslSettings extends js.Object {
  /**
    * ID of the AuthorizedCertificate resource configuring SSL for the
    * application. Clearing this field will remove SSL support.By default, a
    * managed certificate is automatically created for every domain mapping. To
    * omit SSL support or to configure SSL manually, specify
    * no_managed_certificate on a CREATE or UPDATE request. You must be
    * authorized to administer the AuthorizedCertificate resource to manually
    * map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String] = js.native
  /**
    * Whether the mapped certificate is an App Engine managed certificate.
    * Managed certificates are created by default with a domain mapping. To opt
    * out, specify no_managed_certificate on a CREATE or UPDATE
    * request.@OutputOnly
    */
  var isManagedCertificate: js.UndefOr[Boolean] = js.native
}

object SchemaSslSettings {
  @scala.inline
  def apply(): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslSettings]
  }
  @scala.inline
  implicit class SchemaSslSettingsOps[Self <: SchemaSslSettings] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: String): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
    @scala.inline
    def setIsManagedCertificate(value: Boolean): Self = this.set("isManagedCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsManagedCertificate: Self = this.set("isManagedCertificate", js.undefined)
  }
  
}

