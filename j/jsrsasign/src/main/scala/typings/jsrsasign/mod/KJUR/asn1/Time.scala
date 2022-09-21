package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.StringParamtypegenundefin
import typings.jsrsasign.anon.Tlv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Time ASN.1 structure class
  * @param params associative array of parameters (ex. {'str': '130508235959Z'})
  * @example
  * var t1 = new KJUR.asn1.x509.Time{'str': '130508235959Z'} // UTCTime by default
  * var t2 = new KJUR.asn1.x509.Time{'type': 'gen',  'str': '20130508235959Z'} // GeneralizedTime
  */
@JSImport("jsrsasign", "KJUR.asn1.Time")
@js.native
open class Time ()
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.Time {
  def this(params: StringParamtypegenundefin) = this()
  
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
