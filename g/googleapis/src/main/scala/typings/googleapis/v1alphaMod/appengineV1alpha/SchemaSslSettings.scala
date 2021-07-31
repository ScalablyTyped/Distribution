package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SSL configuration for a DomainMapping resource.
  */
trait SchemaSslSettings extends StObject {
  
  /**
    * ID of the AuthorizedCertificate resource configuring SSL for the
    * application. Clearing this field will remove SSL support.By default, a
    * managed certificate is automatically created for every domain mapping. To
    * omit SSL support or to configure SSL manually, specify
    * no_managed_certificate on a CREATE or UPDATE request. You must be
    * authorized to administer the AuthorizedCertificate resource to manually
    * map it to a DomainMapping resource. Example: 12345.
    */
  var certificateId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the mapped certificate is an App Engine managed certificate.
    * Managed certificates are created by default with a domain mapping. To opt
    * out, specify no_managed_certificate on a CREATE or UPDATE
    * request.@OutputOnly
    */
  var isManagedCertificate: js.UndefOr[Boolean] = js.undefined
}
object SchemaSslSettings {
  
  @scala.inline
  def apply(): SchemaSslSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslSettings]
  }
  
  @scala.inline
  implicit class SchemaSslSettingsMutableBuilder[Self <: SchemaSslSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateId(value: String): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setIsManagedCertificate(value: Boolean): Self = StObject.set(x, "isManagedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsManagedCertificateUndefined: Self = StObject.set(x, "isManagedCertificate", js.undefined)
  }
}
