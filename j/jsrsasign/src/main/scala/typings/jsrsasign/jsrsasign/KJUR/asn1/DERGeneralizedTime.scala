package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.jsrsasign.jsrsasignStrings.gen
import typings.jsrsasign.jsrsasignStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER GeneralizedTime
  * @param params associative array of parameters (ex. {'str': '20130430235959Z'})
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - str - specify initial ASN.1 value(V) by a string (ex.'20130430235959Z')
  * - hex - specify initial ASN.1 value(V) by a hexadecimal string
  * - date - specify Date object.
  * - millis - specify flag to show milliseconds (from 1.0.6)
  *
  * NOTE1: 'params' can be omitted.
  * NOTE2: 'withMillis' property is supported from asn1 1.0.6.
  */
trait DERGeneralizedTime
  extends StObject
     with DERAbstractTime {
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * When you specify UTC time, use 'Date.UTC' method like this:
    * o1 = new DERUTCTime();
    * o1.setByDate(date);
    *
    * date = new Date(Date.UTC(2015, 0, 31, 23, 59, 59, 0)); #2015JAN31 23:59:59
    */
  def setByDate(dateObject: js.Date): Unit
  
  var withMillis: Boolean
}
object DERGeneralizedTime {
  
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
    setByDate: js.Date => Unit,
    setByDateValue: (Double, Double, Double, Double, Double, Double) => Unit,
    setString: String => Unit,
    withMillis: Boolean,
    zeroPadding: (String, Double) => String
  ): DERGeneralizedTime = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction3(formatDate), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getString = js.Any.fromFunction0(getString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDate = js.Any.fromFunction1(setByDate), setByDateValue = js.Any.fromFunction6(setByDateValue), setString = js.Any.fromFunction1(setString), withMillis = withMillis.asInstanceOf[js.Any], zeroPadding = js.Any.fromFunction2(zeroPadding), params = null)
    __obj.asInstanceOf[DERGeneralizedTime]
  }
  
  extension [Self <: DERGeneralizedTime](x: Self) {
    
    inline def setSetByDate(value: js.Date => Unit): Self = StObject.set(x, "setByDate", js.Any.fromFunction1(value))
    
    inline def setWithMillis(value: Boolean): Self = StObject.set(x, "withMillis", value.asInstanceOf[js.Any])
  }
}
