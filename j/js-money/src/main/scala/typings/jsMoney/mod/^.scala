package typings.jsMoney.mod

import typings.jsMoney.currencyMod.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-money", JSImport.Namespace)
@js.native
class ^ protected () extends Money {
  def this(amount: Double, currency: String) = this()
  def this(amount: Double, currency: Currency) = this()
}
@JSImport("js-money", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var AED: Currency = js.native
  
  var AFN: Currency = js.native
  
  var ALL: Currency = js.native
  
  var AMD: Currency = js.native
  
  var ARS: Currency = js.native
  
  var AUD: Currency = js.native
  
  var AZN: Currency = js.native
  
  var BAM: Currency = js.native
  
  var BDT: Currency = js.native
  
  var BGN: Currency = js.native
  
  var BHD: Currency = js.native
  
  var BIF: Currency = js.native
  
  var BND: Currency = js.native
  
  var BOB: Currency = js.native
  
  var BRL: Currency = js.native
  
  var BTC: Currency = js.native
  
  var BWP: Currency = js.native
  
  var BYR: Currency = js.native
  
  var BZD: Currency = js.native
  
  var CAD: Currency = js.native
  
  var CDF: Currency = js.native
  
  var CHF: Currency = js.native
  
  var CLP: Currency = js.native
  
  var CNY: Currency = js.native
  
  var COP: Currency = js.native
  
  var CRC: Currency = js.native
  
  var CVE: Currency = js.native
  
  var CZK: Currency = js.native
  
  var DJF: Currency = js.native
  
  var DKK: Currency = js.native
  
  var DOP: Currency = js.native
  
  var DZD: Currency = js.native
  
  var EEK: Currency = js.native
  
  var EGP: Currency = js.native
  
  var ERN: Currency = js.native
  
  var ETB: Currency = js.native
  
  var EUR: Currency = js.native
  
  var GBP: Currency = js.native
  
  var GEL: Currency = js.native
  
  var GHS: Currency = js.native
  
  var GNF: Currency = js.native
  
  var GTQ: Currency = js.native
  
  var HKD: Currency = js.native
  
  var HNL: Currency = js.native
  
  var HRK: Currency = js.native
  
  var HUF: Currency = js.native
  
  var IDR: Currency = js.native
  
  var ILS: Currency = js.native
  
  var INR: Currency = js.native
  
  var IQD: Currency = js.native
  
  var IRR: Currency = js.native
  
  var ISK: Currency = js.native
  
  var JMD: Currency = js.native
  
  var JOD: Currency = js.native
  
  var JPY: Currency = js.native
  
  var KES: Currency = js.native
  
  var KHR: Currency = js.native
  
  var KMF: Currency = js.native
  
  var KRW: Currency = js.native
  
  var KWD: Currency = js.native
  
  var KZT: Currency = js.native
  
  var LAK: Currency = js.native
  
  var LBP: Currency = js.native
  
  var LKR: Currency = js.native
  
  var LTL: Currency = js.native
  
  var LVL: Currency = js.native
  
  var LYD: Currency = js.native
  
  var MAD: Currency = js.native
  
  var MDL: Currency = js.native
  
  var MGA: Currency = js.native
  
  var MKD: Currency = js.native
  
  var MMK: Currency = js.native
  
  var MOP: Currency = js.native
  
  var MUR: Currency = js.native
  
  var MXN: Currency = js.native
  
  var MYR: Currency = js.native
  
  var MZN: Currency = js.native
  
  var NAD: Currency = js.native
  
  var NGN: Currency = js.native
  
  var NIO: Currency = js.native
  
  var NOK: Currency = js.native
  
  var NPR: Currency = js.native
  
  var NZD: Currency = js.native
  
  var OMR: Currency = js.native
  
  var PAB: Currency = js.native
  
  var PEN: Currency = js.native
  
  var PHP: Currency = js.native
  
  var PKR: Currency = js.native
  
  var PLN: Currency = js.native
  
  var PYG: Currency = js.native
  
  var QAR: Currency = js.native
  
  var RON: Currency = js.native
  
  var RSD: Currency = js.native
  
  var RUB: Currency = js.native
  
  var RWF: Currency = js.native
  
  var SAR: Currency = js.native
  
  var SDG: Currency = js.native
  
  var SEK: Currency = js.native
  
  var SGD: Currency = js.native
  
  var SOS: Currency = js.native
  
  var SYP: Currency = js.native
  
  var THB: Currency = js.native
  
  var TND: Currency = js.native
  
  var TOP: Currency = js.native
  
  var TRY: Currency = js.native
  
  var TTD: Currency = js.native
  
  var TWD: Currency = js.native
  
  var TZS: Currency = js.native
  
  var UAH: Currency = js.native
  
  var UGX: Currency = js.native
  
  //#region Currencies
  var USD: Currency = js.native
  
  var UYU: Currency = js.native
  
  var UZS: Currency = js.native
  
  var VEF: Currency = js.native
  
  var VND: Currency = js.native
  
  var XAF: Currency = js.native
  
  var XOF: Currency = js.native
  
  var YER: Currency = js.native
  
  var ZAR: Currency = js.native
  
  var ZMK: Currency = js.native
  
  def fromDecimal(amount: Double, currency: String): Money = js.native
  def fromDecimal(amount: Double, currency: String, rounder: RoundFunction): Money = js.native
  def fromDecimal(amount: Double, currency: String, rounder: Rounders): Money = js.native
  def fromDecimal(amount: Double, currency: Currency): Money = js.native
  def fromDecimal(amount: Double, currency: Currency, rounder: RoundFunction): Money = js.native
  def fromDecimal(amount: Double, currency: Currency, rounder: Rounders): Money = js.native
  
  def fromInteger(amount: Double, currency: String): Money = js.native
  def fromInteger(amount: Double, currency: Currency): Money = js.native
}
