package typings.jsrsasign.jsrsasign.KJUR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object asn1 {
  
  type DERBoolean = typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
  
  /**
    * class for ASN.1 DER IA5String
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    */
  type DERIA5String = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
  
  /** class for ASN.1 DER Null */
  type DERNull = typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
  
  /**
    * class for ASN.1 DER NumericString
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    */
  type DERNumericString = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
  
  /**
    * class for ASN.1 DER OctetString
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    * @description
    * This class provides ASN.1 OctetString simple type.
    * Supported "params" attributes are:
    *
    * - str - to set a string as a value
    * - hex - to set a hexadecimal string as a value
    * - obj - to set a encapsulated ASN.1 value by JSON object
    *    which is defined in `KJUR.asn1.ASN1Util.newObject`
    *
    * NOTE: A parameter 'obj' have been supported
    * for "OCTET STRING, encapsulates" structure.
    * since asn1 1.0.11, jsrsasign 6.1.1 (2016-Sep-25).
    * @see KJUR.asn1.DERAbstractString - superclass
    * @example
    * // default constructor
    * o = new KJUR.asn1.DEROctetString();
    * // initialize with string
    * o = new KJUR.asn1.DEROctetString({str: "aaa"});
    * // initialize with hexadecimal string
    * o = new KJUR.asn1.DEROctetString({hex: "616161"});
    * // initialize with ASN1Util.newObject argument
    * o = new KJUR.asn1.DEROctetString({obj: {seq: [{int: 3}, {prnstr: 'aaa'}]}});
    * // above generates a ASN.1 data like this:
    * // OCTET STRING, encapsulates {
    * //   SEQUENCE {
    * //     INTEGER 3
    * //     PrintableString 'aaa'
    * //     }
    * //   }
    */
  type DEROctetString = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
  
  /**
    * class for ASN.1 DER PrintableString
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    */
  type DERPrintableString = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
  
  /**
    * class for ASN.1 DER Set
    *
    * @description
    * As for argument 'params' for constructor, you can specify one of
    * following properties:
    *
    * - array - specify array of ASN1Object to set elements of content
    * - sortflag - flag for sort (default: true). ASN.1 BER is not sorted in 'SET OF'.
    *
    * NOTE1: 'params' can be omitted.
    * NOTE2: sortflag is supported since 1.0.5.
    */
  type DERSet = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractStructured
  
  /**
    * class for ASN.1 DER TeletexString
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    */
  type DERTeletexString = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
  
  /**
    * class for ASN.1 DER UTF8String
    * @param params associative array of parameters (ex. {'str': 'aaa'})
    */
  type DERUTF8String = typings.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString
}
