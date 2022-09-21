package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.Tlv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER encoder object */
@JSImport("jsrsasign", "KJUR.asn1.ASN1Object")
@js.native
open class ASN1Object ()
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object {
  def this(params: Tlv) = this()
  
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
  
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  var hL: String = js.native
  
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  var hT: String = js.native
  
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  var hTLV: String = js.native
  
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  var hV: String = js.native
  
  /** flag whether internal data was changed */
  /* CompleteClass */
  var isModified: String = js.native
  
  /** JSON object parameter for ASN.1 encode */
  /* CompleteClass */
  var params: Tlv | Null = js.native
}
