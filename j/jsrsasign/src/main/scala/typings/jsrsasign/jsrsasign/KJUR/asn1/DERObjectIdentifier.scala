package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER ObjectIdentifier
  * @param params associative array of parameters (ex. {'oid': '2.5.4.5'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - oid - specify initial ASN.1 value(V) by a oid string (ex. 2.5.4.13)
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  *
  * NOTE: 'params' can be omitted.
  */
trait DERObjectIdentifier
  extends StObject
     with ASN1Object {
  
  /**
    * set value by a hexadecimal string
    * @param newHexString hexadecimal value of OID bytes
    */
  def setValueHex(newHexString: String): Unit
  
  /**
    * set value by a OID name
    * @param oidName OID name (ex. 'serverAuth')
    * @description
    * OID name shall be defined in 'KJUR.asn1.x509.OID.name2oidList'.
    * Otherwise raise error.
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueName("serverAuth");
    */
  def setValueName(oidName: String): Unit
  
  /**
    * set value by a OID string
    * @param oidString OID string (ex. 2.5.4.13)
    * @example
    * o = new KJUR.asn1.DERObjectIdentifier();
    * o.setValueOidString("2.5.4.13");
    */
  def setValueOidString(oidString: String): Unit
}
object DERObjectIdentifier {
  
  inline def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setValueHex: String => Unit,
    setValueName: String => Unit,
    setValueOidString: String => Unit
  ): DERObjectIdentifier = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setValueHex = js.Any.fromFunction1(setValueHex), setValueName = js.Any.fromFunction1(setValueName), setValueOidString = js.Any.fromFunction1(setValueOidString), params = null)
    __obj.asInstanceOf[DERObjectIdentifier]
  }
  
  extension [Self <: DERObjectIdentifier](x: Self) {
    
    inline def setSetValueHex(value: String => Unit): Self = StObject.set(x, "setValueHex", js.Any.fromFunction1(value))
    
    inline def setSetValueName(value: String => Unit): Self = StObject.set(x, "setValueName", js.Any.fromFunction1(value))
    
    inline def setSetValueOidString(value: String => Unit): Self = StObject.set(x, "setValueOidString", js.Any.fromFunction1(value))
  }
}
