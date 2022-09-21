package typings.jsrsasign.jsrsasign.KJUR.asn1

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
trait DERUTCTime
  extends StObject
     with DERAbstractTime {
  
  /**
    * set value by a Date object
    * @param dateObject Date object to set ASN.1 value(V)
    * @example
    * o = new KJUR.asn1.DERUTCTime();
    * o.setByDate(new Date("2016/12/31"));
    */
  def setByDate(dateObject: js.Date): Unit
}
object DERUTCTime {
  
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
    zeroPadding: (String, Double) => String
  ): DERUTCTime = {
    val __obj = js.Dynamic.literal(formatDate = js.Any.fromFunction3(formatDate), getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getString = js.Any.fromFunction0(getString), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setByDate = js.Any.fromFunction1(setByDate), setByDateValue = js.Any.fromFunction6(setByDateValue), setString = js.Any.fromFunction1(setString), zeroPadding = js.Any.fromFunction2(zeroPadding), params = null)
    __obj.asInstanceOf[DERUTCTime]
  }
  
  extension [Self <: DERUTCTime](x: Self) {
    
    inline def setSetByDate(value: js.Date => Unit): Self = StObject.set(x, "setByDate", js.Any.fromFunction1(value))
  }
}
