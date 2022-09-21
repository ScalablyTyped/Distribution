package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasignStrings.gen
import typings.jsrsasign.jsrsasignStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base class for ASN.1 DER Generalized/UTCTime class
  * @param params associative array of parameters (ex. {'str': '130430235959Z'})
  */
trait DERAbstractTime
  extends StObject
     with ASN1Object {
  
  /**
    * format date string by Data object
    * @param type 'utc' or 'gen'
    * @param withMillis flag for with millisections or not
    * @description
    * 'withMillis' flag is supported from asn1 1.0.6.
    */
  /* private */ def formatDate(dateObject: js.Date, `type`: utc | gen, withMillis: Boolean): String
  
  /**
    * get string value of this string object
    * @return string value of this time object
    */
  def getString(): String
  
  /**
    * set value by a Date object
    * @param year year of date (ex. 2013)
    * @param month month of date between 1 and 12 (ex. 12)
    * @param day day of month
    * @param hour hours of date
    * @param min minutes of date
    * @param sec seconds of date
    */
  def setByDateValue(year: Double, month: Double, day: Double, hour: Double, min: Double, sec: Double): Unit
  
  /**
    * set value by a string
    * @param newS value by a string to set such like "130430235959Z"
    */
  def setString(newS: String): Unit
  
  /* private */ def zeroPadding(s: String, len: Double): String
}
object DERAbstractTime {
  
  inline def apply(
    formatDate: (js.Date, utc | gen, Boolean) => String,
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getString: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setByDateValue: (Double, Double, Double, Double, Double, Double) => Unit,
    setString: String => Unit,
    zeroPadding: (String, Double) => String
  ): DERAbstractTime = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction3(formatDate), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getString = js.Any.fromFunction0(getString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDateValue = js.Any.fromFunction6(setByDateValue), setString = js.Any.fromFunction1(setString), zeroPadding = js.Any.fromFunction2(zeroPadding), params = null)
    __obj.asInstanceOf[DERAbstractTime]
  }
  
  extension [Self <: DERAbstractTime](x: Self) {
    
    inline def setFormatDate(value: (js.Date, utc | gen, Boolean) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction3(value))
    
    inline def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setSetByDateValue(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "setByDateValue", js.Any.fromFunction6(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
    
    inline def setZeroPadding(value: (String, Double) => String): Self = StObject.set(x, "zeroPadding", js.Any.fromFunction2(value))
  }
}
