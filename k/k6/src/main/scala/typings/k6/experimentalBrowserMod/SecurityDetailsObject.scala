package typings.k6.experimentalBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDetailsObject extends StObject {
  
  /**
    * Common Name component of the Issuer field. The value is extracted from the
    * certificate. This should only be used for informational purposes.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The specific TLS protocol used. For example `TLS 1.3`.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * String with hex encoded SHA256 fingerprint of the certificate. The value is
    * extracted from the certificate.
    */
  var sanList: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Common Name component of the Subject field. The value is extracted from the
    * certificate. This should only be used for informational purposes.
    */
  var subjectName: js.UndefOr[String] = js.undefined
  
  /**
    * Unix timestamp (in seconds) specifying the exact date/time when this cert
    * becomes valid.
    */
  var validFrom: js.UndefOr[Double] = js.undefined
  
  /**
    * Unix timestamp (in seconds) specifying the exact date/time when this cert
    * becomes invalid.
    */
  var validTo: js.UndefOr[Double] = js.undefined
}
object SecurityDetailsObject {
  
  inline def apply(): SecurityDetailsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityDetailsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDetailsObject] (val x: Self) extends AnyVal {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSanList(value: js.Array[String]): Self = StObject.set(x, "sanList", value.asInstanceOf[js.Any])
    
    inline def setSanListUndefined: Self = StObject.set(x, "sanList", js.undefined)
    
    inline def setSanListVarargs(value: String*): Self = StObject.set(x, "sanList", js.Array(value*))
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameUndefined: Self = StObject.set(x, "subjectName", js.undefined)
    
    inline def setValidFrom(value: Double): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
    
    inline def setValidTo(value: Double): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "validTo", js.undefined)
  }
}
