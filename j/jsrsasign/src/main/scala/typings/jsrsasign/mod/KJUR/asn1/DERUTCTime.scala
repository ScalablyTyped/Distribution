package typings.jsrsasign.mod.KJUR.asn1

import typings.jsrsasign.anon.Tlv
import typings.jsrsasign.jsrsasign.KJUR.asn1.DateParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typings.jsrsasign.jsrsasignStrings.gen
import typings.jsrsasign.jsrsasignStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER UTCTime
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  *
  * NOTE: 'params' can be omitted.
  * @example
  * d1 = new KJUR.asn1.DERUTCTime();
  * d1.setString('130430125959Z');
  *
  * d2 = new KJUR.asn1.DERUTCTime({'str': '130430125959Z'});
  * d3 = new KJUR.asn1.DERUTCTime({'date': new Date(Date.UTC(2015, 0, 31, 0, 0, 0, 0))});
  * d4 = new KJUR.asn1.DERUTCTime('130430125959Z');
  */
@JSImport("jsrsasign", "KJUR.asn1.DERUTCTime")
@js.native
open class DERUTCTime ()
  extends StObject
     with typings.jsrsasign.jsrsasign.KJUR.asn1.DERUTCTime {
  def this(params: String) = this()
  def this(params: DateParam) = this()
  def this(params: HexParam) = this()
  def this(params: StringParam) = this()
  
  /**
    * format date string by Data object
    * @param type 'utc' or 'gen'
    * @param withMillis flag for with millisections or not
    * @description
    * 'withMillis' flag is supported from asn1 1.0.6.
    */
  /* private */ /* CompleteClass */
  override def formatDate(dateObject: js.Date, `type`: utc | gen, withMillis: Boolean): String = js.native
  
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
    * get string value of this string object
    * @return string value of this time object
    */
  /* CompleteClass */
  override def getString(): String = js.native
  
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
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * o = new KJUR.asn1.DERUTCTime();
    * o.setByDate(new Date("2016/12/31"));
    */
  /* CompleteClass */
  override def setByDate(dateObject: js.Date): Unit = js.native
  
  /**
    * set value by a Date object
    * @param year year of date (ex. 2013)
    * @param month month of date between 1 and 12 (ex. 12)
    * @param day day of month
    * @param hour hours of date
    * @param min minutes of date
    * @param sec seconds of date
    */
  /* CompleteClass */
  override def setByDateValue(year: Double, month: Double, day: Double, hour: Double, min: Double, sec: Double): Unit = js.native
  
  /**
    * set value by a string
    * @param newS value by a string to set such like "130430235959Z"
    */
  /* CompleteClass */
  override def setString(newS: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  override def zeroPadding(s: String, len: Double): String = js.native
}
