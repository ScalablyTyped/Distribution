package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShieldedInstanceIdentityEntry extends StObject {
  
  /** A PEM-encoded X.509 certificate. This field can be empty. */
  var ekCert: js.UndefOr[String] = js.undefined
  
  /** A PEM-encoded public key. */
  var ekPub: js.UndefOr[String] = js.undefined
}
object ShieldedInstanceIdentityEntry {
  
  @scala.inline
  def apply(): ShieldedInstanceIdentityEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceIdentityEntry]
  }
  
  @scala.inline
  implicit class ShieldedInstanceIdentityEntryMutableBuilder[Self <: ShieldedInstanceIdentityEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEkCert(value: String): Self = StObject.set(x, "ekCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEkCertUndefined: Self = StObject.set(x, "ekCert", js.undefined)
    
    @scala.inline
    def setEkPub(value: String): Self = StObject.set(x, "ekPub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEkPubUndefined: Self = StObject.set(x, "ekPub", js.undefined)
  }
}
