package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCerts Resource
  */
@js.native
trait SchemaSslCert extends StObject {
  
  /**
    * PEM representation.
    */
  var cert: js.UndefOr[String] = js.native
  
  /**
    * Serial number, as extracted from the certificate.
    */
  var certSerialNumber: js.UndefOr[String] = js.native
  
  /**
    * User supplied name. Constrained to [a-zA-Z.-_ ]+.
    */
  var commonName: js.UndefOr[String] = js.native
  
  /**
    * The time when the certificate was created in RFC 3339 format, for example
    * 2012-11-15T16:19:00.094Z
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time when the certificate expires in RFC 3339 format, for example
    * 2012-11-15T16:19:00.094Z.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * Name of the database instance.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#sslCert.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Sha1 Fingerprint.
    */
  var sha1Fingerprint: js.UndefOr[String] = js.native
}
object SchemaSslCert {
  
  @scala.inline
  def apply(): SchemaSslCert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCert]
  }
  
  @scala.inline
  implicit class SchemaSslCertMutableBuilder[Self <: SchemaSslCert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertSerialNumber(value: String): Self = StObject.set(x, "certSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertSerialNumberUndefined: Self = StObject.set(x, "certSerialNumber", js.undefined)
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
