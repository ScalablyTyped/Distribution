package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Caissuer
import typings.jsrsasign.anon.Ocsp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.jsrsasign.anon.Dictkey
  - typings.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier
  - typings.jsrsasign.jsrsasign.ExtKeyUsage
  - typings.jsrsasign.jsrsasign.ExtSubjectAltName
  - typings.jsrsasign.jsrsasign.ExtIssuerAltName
  - typings.jsrsasign.jsrsasign.ExtBasicConstraints
  - typings.jsrsasign.jsrsasign.ExtNameConstraints
  - typings.jsrsasign.jsrsasign.ExtCRLDistributionPoints
  - typings.jsrsasign.jsrsasign.ExtCertificatePolicies
  - typings.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier
  - typings.jsrsasign.jsrsasign.ExtExtKeyUsage
  - typings.jsrsasign.jsrsasign.ExtAuthorityInfoAccess
  - typings.jsrsasign.jsrsasign.ExtCRLNumber
  - typings.jsrsasign.jsrsasign.ExtCRLReason
  - typings.jsrsasign.jsrsasign.ExtOcspNonce
  - typings.jsrsasign.jsrsasign.ExtOcspNoCheck
  - typings.jsrsasign.jsrsasign.ExtAdobeTimeStamp
*/
trait ExtParam extends StObject
object ExtParam {
  
  inline def Dictkey(extn: String, extname: String): typings.jsrsasign.anon.Dictkey = {
    val __obj = js.Dynamic.literal(extn = extn.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Dictkey]
  }
  
  inline def Exclude(exclude: js.Array[GeneralSubtree]): typings.jsrsasign.anon.Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extname = "nameConstraints")
    __obj.asInstanceOf[typings.jsrsasign.anon.Exclude]
  }
  
  inline def ExtAdobeTimeStamp(): typings.jsrsasign.jsrsasign.ExtAdobeTimeStamp = {
    val __obj = js.Dynamic.literal(extname = "adobeTimeStamp")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtAdobeTimeStamp]
  }
  
  inline def ExtAuthorityInfoAccess(array: js.Array[Ocsp | Caissuer]): typings.jsrsasign.jsrsasign.ExtAuthorityInfoAccess = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "authorityInfoAccess")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtAuthorityInfoAccess]
  }
  
  inline def ExtAuthorityKeyIdentifier(kid: Hex): typings.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(extname = "authorityKeyIdentifier", kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtAuthorityKeyIdentifier]
  }
  
  inline def ExtBasicConstraints(): typings.jsrsasign.jsrsasign.ExtBasicConstraints = {
    val __obj = js.Dynamic.literal(extname = "basicConstraints")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtBasicConstraints]
  }
  
  inline def ExtCRLDistributionPoints(array: js.Array[DistributionPoint]): typings.jsrsasign.jsrsasign.ExtCRLDistributionPoints = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "cRLDistributionPoints")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtCRLDistributionPoints]
  }
  
  inline def ExtCRLNumber(): typings.jsrsasign.jsrsasign.ExtCRLNumber = {
    val __obj = js.Dynamic.literal(extname = "cRLNumber")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtCRLNumber]
  }
  
  inline def ExtCRLReason(): typings.jsrsasign.jsrsasign.ExtCRLReason = {
    val __obj = js.Dynamic.literal(extname = "cRLReason")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtCRLReason]
  }
  
  inline def ExtCertificatePolicies(array: js.Array[PolicyInformation]): typings.jsrsasign.jsrsasign.ExtCertificatePolicies = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "certificatePolicies")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtCertificatePolicies]
  }
  
  inline def ExtExtKeyUsage(array: js.Array[String]): typings.jsrsasign.jsrsasign.ExtExtKeyUsage = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "extKeyUsage")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtExtKeyUsage]
  }
  
  inline def ExtIssuerAltName(array: js.Array[GeneralName]): typings.jsrsasign.jsrsasign.ExtIssuerAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "issuerAltName")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtIssuerAltName]
  }
  
  inline def ExtKeyUsage(names: js.Array[String]): typings.jsrsasign.jsrsasign.ExtKeyUsage = {
    val __obj = js.Dynamic.literal(extname = "keyUsage", names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtKeyUsage]
  }
  
  inline def ExtOcspNoCheck(): typings.jsrsasign.jsrsasign.ExtOcspNoCheck = {
    val __obj = js.Dynamic.literal(extname = "ocspNoCheck")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtOcspNoCheck]
  }
  
  inline def ExtOcspNonce(hex: String): typings.jsrsasign.jsrsasign.ExtOcspNonce = {
    val __obj = js.Dynamic.literal(extname = "ocspNonce", hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtOcspNonce]
  }
  
  inline def ExtSubjectAltName(array: js.Array[GeneralName]): typings.jsrsasign.jsrsasign.ExtSubjectAltName = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], extname = "subjectAltName")
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtSubjectAltName]
  }
  
  inline def ExtSubjectKeyIdentifier(kid: Hex): typings.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier = {
    val __obj = js.Dynamic.literal(extname = "subjectKeyIdentifier", kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.jsrsasign.ExtSubjectKeyIdentifier]
  }
  
  inline def Permit(permit: js.Array[GeneralSubtree]): typings.jsrsasign.anon.Permit = {
    val __obj = js.Dynamic.literal(extname = "nameConstraints", permit = permit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsrsasign.anon.Permit]
  }
}
