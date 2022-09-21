package typings.jsrsasign.jsrsasign.KJUR.asn1.x509

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AuthorityInfoAccess ASN.1 structure class
  * @param params associative array of parameters
  * @description
  * ```
  * id-pe OBJECT IDENTIFIER  ::=  { id-pkix 1 }
  * id-pe-authorityInfoAccess OBJECT IDENTIFIER ::= { id-pe 1 }
  * AuthorityInfoAccessSyntax  ::=
  *         SEQUENCE SIZE (1..MAX) OF AccessDescription
  * AccessDescription  ::=  SEQUENCE {
  *         accessMethod          OBJECT IDENTIFIER,
  *         accessLocation        GeneralName  }
  * id-ad OBJECT IDENTIFIER ::= { id-pkix 48 }
  * id-ad-caIssuers OBJECT IDENTIFIER ::= { id-ad 2 }
  * id-ad-ocsp OBJECT IDENTIFIER ::= { id-ad 1 }
  * ```
  * @example
  * e1 = new KJUR.asn1.x509.AuthorityInfoAccess({
  *   array: [{
  *     accessMethod:{'oid': '1.3.6.1.5.5.7.48.1'},
  *     accessLocation:{'uri': 'http://ocsp.cacert.org'}
  *   }]
  * });
  */
trait AuthorityInfoAccess
  extends StObject
     with Extension {
  
  def getExtnValueHex(): String
  
  def setAccessDescriptionArray(accessDescriptionArray: js.Array[ExtensionParam]): Unit
}
object AuthorityInfoAccess {
  
  inline def apply(
    getEncodedHex: () => String,
    getExtnValueHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setAccessDescriptionArray: js.Array[ExtensionParam] => Unit
  ): AuthorityInfoAccess = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getExtnValueHex = js.Any.fromFunction0(getExtnValueHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setAccessDescriptionArray = js.Any.fromFunction1(setAccessDescriptionArray), params = null)
    __obj.asInstanceOf[AuthorityInfoAccess]
  }
  
  extension [Self <: AuthorityInfoAccess](x: Self) {
    
    inline def setGetExtnValueHex(value: () => String): Self = StObject.set(x, "getExtnValueHex", js.Any.fromFunction0(value))
    
    inline def setSetAccessDescriptionArray(value: js.Array[ExtensionParam] => Unit): Self = StObject.set(x, "setAccessDescriptionArray", js.Any.fromFunction1(value))
  }
}
