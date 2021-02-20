package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A certificate managed by App Engine.
  */
@js.native
trait SchemaManagedCertificate extends StObject {
  
  /**
    * Time at which the certificate was last renewed. The renewal process is
    * fully managed. Certificate renewal will automatically occur before the
    * certificate expires. Renewal errors can be tracked via
    * ManagementStatus.@OutputOnly
    */
  var lastRenewalTime: js.UndefOr[String] = js.native
  
  /**
    * Status of certificate management. Refers to the most recent certificate
    * acquisition or renewal attempt.@OutputOnly
    */
  var status: js.UndefOr[String] = js.native
}
object SchemaManagedCertificate {
  
  @scala.inline
  def apply(): SchemaManagedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedCertificate]
  }
  
  @scala.inline
  implicit class SchemaManagedCertificateMutableBuilder[Self <: SchemaManagedCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastRenewalTime(value: String): Self = StObject.set(x, "lastRenewalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRenewalTimeUndefined: Self = StObject.set(x, "lastRenewalTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
