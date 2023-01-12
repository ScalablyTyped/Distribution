package typings.libphonenumberJs

import org.scalablytyped.runtime.StringDictionary
import typings.libphonenumberJs.anon.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("libphonenumber-js/types", "ParseError")
  @js.native
  open class ParseError () extends StObject {
    
    var message: String = js.native
  }
  
  @JSImport("libphonenumber-js/types", "PhoneNumber")
  @js.native
  open class PhoneNumber protected () extends StObject {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: MetadataJson
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: MetadataJson) = this()
    
    var carrierCode: js.UndefOr[CarrierCode] = js.native
    
    var country: js.UndefOr[CountryCode] = js.native
    
    var countryCallingCode: CountryCallingCode = js.native
    
    var ext: js.UndefOr[Extension] = js.native
    
    def format(format: NumberFormat): String = js.native
    def format(format: NumberFormat, options: FormatNumberOptions): String = js.native
    
    def formatInternational(): String = js.native
    def formatInternational(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def formatNational(): String = js.native
    def formatNational(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def getType(): NumberType = js.native
    
    def getURI(): String = js.native
    def getURI(options: FormatNumberOptionsWithoutIDD): String = js.native
    
    def isEqual(phoneNumber: PhoneNumber): Boolean = js.native
    
    def isNonGeographic(): Boolean = js.native
    
    def isPossible(): Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    var nationalNumber: NationalNumber = js.native
    
    var number: E164Number = js.native
    
    def setExt(ext: Extension): Unit = js.native
  }
  
  type CarrierCode = Tagged[String, typings.libphonenumberJs.libphonenumberJsStrings.CarrierCode]
  
  /* Inlined {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]:? std.Array<any>} */
  trait Countries extends StObject {
    
    var AC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var AZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var BZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var CZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var DZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var EH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ER: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ES: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ET: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var FR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var GY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var HU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ID: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var IT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var JP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var KZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var LY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ME: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ML: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MQ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var MZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NP: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var NZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var OM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var PY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var QA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var RW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SB: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ST: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SX: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var SZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TD: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TH: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TJ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TL: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TO: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TR: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TV: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TW: js.UndefOr[js.Array[Any]] = js.undefined
    
    var TZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var US: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UY: js.UndefOr[js.Array[Any]] = js.undefined
    
    var UZ: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VC: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VG: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VI: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VN: js.UndefOr[js.Array[Any]] = js.undefined
    
    var VU: js.UndefOr[js.Array[Any]] = js.undefined
    
    var WF: js.UndefOr[js.Array[Any]] = js.undefined
    
    var WS: js.UndefOr[js.Array[Any]] = js.undefined
    
    var XK: js.UndefOr[js.Array[Any]] = js.undefined
    
    var YE: js.UndefOr[js.Array[Any]] = js.undefined
    
    var YT: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZA: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZM: js.UndefOr[js.Array[Any]] = js.undefined
    
    var ZW: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Countries {
    
    inline def apply(): Countries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Countries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Countries] (val x: Self) extends AnyVal {
      
      inline def setAC(value: js.Array[Any]): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      inline def setACUndefined: Self = StObject.set(x, "AC", js.undefined)
      
      inline def setACVarargs(value: Any*): Self = StObject.set(x, "AC", js.Array(value*))
      
      inline def setAD(value: js.Array[Any]): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setADUndefined: Self = StObject.set(x, "AD", js.undefined)
      
      inline def setADVarargs(value: Any*): Self = StObject.set(x, "AD", js.Array(value*))
      
      inline def setAE(value: js.Array[Any]): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAEUndefined: Self = StObject.set(x, "AE", js.undefined)
      
      inline def setAEVarargs(value: Any*): Self = StObject.set(x, "AE", js.Array(value*))
      
      inline def setAF(value: js.Array[Any]): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      inline def setAFUndefined: Self = StObject.set(x, "AF", js.undefined)
      
      inline def setAFVarargs(value: Any*): Self = StObject.set(x, "AF", js.Array(value*))
      
      inline def setAG(value: js.Array[Any]): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      inline def setAGUndefined: Self = StObject.set(x, "AG", js.undefined)
      
      inline def setAGVarargs(value: Any*): Self = StObject.set(x, "AG", js.Array(value*))
      
      inline def setAI(value: js.Array[Any]): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      inline def setAIUndefined: Self = StObject.set(x, "AI", js.undefined)
      
      inline def setAIVarargs(value: Any*): Self = StObject.set(x, "AI", js.Array(value*))
      
      inline def setAL(value: js.Array[Any]): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      inline def setALUndefined: Self = StObject.set(x, "AL", js.undefined)
      
      inline def setALVarargs(value: Any*): Self = StObject.set(x, "AL", js.Array(value*))
      
      inline def setAM(value: js.Array[Any]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAMUndefined: Self = StObject.set(x, "AM", js.undefined)
      
      inline def setAMVarargs(value: Any*): Self = StObject.set(x, "AM", js.Array(value*))
      
      inline def setAO(value: js.Array[Any]): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      inline def setAOUndefined: Self = StObject.set(x, "AO", js.undefined)
      
      inline def setAOVarargs(value: Any*): Self = StObject.set(x, "AO", js.Array(value*))
      
      inline def setAR(value: js.Array[Any]): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      inline def setARUndefined: Self = StObject.set(x, "AR", js.undefined)
      
      inline def setARVarargs(value: Any*): Self = StObject.set(x, "AR", js.Array(value*))
      
      inline def setAS(value: js.Array[Any]): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      inline def setASUndefined: Self = StObject.set(x, "AS", js.undefined)
      
      inline def setASVarargs(value: Any*): Self = StObject.set(x, "AS", js.Array(value*))
      
      inline def setAT(value: js.Array[Any]): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setATUndefined: Self = StObject.set(x, "AT", js.undefined)
      
      inline def setATVarargs(value: Any*): Self = StObject.set(x, "AT", js.Array(value*))
      
      inline def setAU(value: js.Array[Any]): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      inline def setAUUndefined: Self = StObject.set(x, "AU", js.undefined)
      
      inline def setAUVarargs(value: Any*): Self = StObject.set(x, "AU", js.Array(value*))
      
      inline def setAW(value: js.Array[Any]): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      inline def setAWUndefined: Self = StObject.set(x, "AW", js.undefined)
      
      inline def setAWVarargs(value: Any*): Self = StObject.set(x, "AW", js.Array(value*))
      
      inline def setAX(value: js.Array[Any]): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      inline def setAXUndefined: Self = StObject.set(x, "AX", js.undefined)
      
      inline def setAXVarargs(value: Any*): Self = StObject.set(x, "AX", js.Array(value*))
      
      inline def setAZ(value: js.Array[Any]): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      inline def setAZUndefined: Self = StObject.set(x, "AZ", js.undefined)
      
      inline def setAZVarargs(value: Any*): Self = StObject.set(x, "AZ", js.Array(value*))
      
      inline def setBA(value: js.Array[Any]): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      inline def setBAUndefined: Self = StObject.set(x, "BA", js.undefined)
      
      inline def setBAVarargs(value: Any*): Self = StObject.set(x, "BA", js.Array(value*))
      
      inline def setBB(value: js.Array[Any]): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      inline def setBBUndefined: Self = StObject.set(x, "BB", js.undefined)
      
      inline def setBBVarargs(value: Any*): Self = StObject.set(x, "BB", js.Array(value*))
      
      inline def setBD(value: js.Array[Any]): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      inline def setBDUndefined: Self = StObject.set(x, "BD", js.undefined)
      
      inline def setBDVarargs(value: Any*): Self = StObject.set(x, "BD", js.Array(value*))
      
      inline def setBE(value: js.Array[Any]): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      inline def setBEUndefined: Self = StObject.set(x, "BE", js.undefined)
      
      inline def setBEVarargs(value: Any*): Self = StObject.set(x, "BE", js.Array(value*))
      
      inline def setBF(value: js.Array[Any]): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      inline def setBFUndefined: Self = StObject.set(x, "BF", js.undefined)
      
      inline def setBFVarargs(value: Any*): Self = StObject.set(x, "BF", js.Array(value*))
      
      inline def setBG(value: js.Array[Any]): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      inline def setBGUndefined: Self = StObject.set(x, "BG", js.undefined)
      
      inline def setBGVarargs(value: Any*): Self = StObject.set(x, "BG", js.Array(value*))
      
      inline def setBH(value: js.Array[Any]): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      inline def setBHUndefined: Self = StObject.set(x, "BH", js.undefined)
      
      inline def setBHVarargs(value: Any*): Self = StObject.set(x, "BH", js.Array(value*))
      
      inline def setBI(value: js.Array[Any]): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      inline def setBIUndefined: Self = StObject.set(x, "BI", js.undefined)
      
      inline def setBIVarargs(value: Any*): Self = StObject.set(x, "BI", js.Array(value*))
      
      inline def setBJ(value: js.Array[Any]): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      inline def setBJUndefined: Self = StObject.set(x, "BJ", js.undefined)
      
      inline def setBJVarargs(value: Any*): Self = StObject.set(x, "BJ", js.Array(value*))
      
      inline def setBL(value: js.Array[Any]): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      inline def setBLUndefined: Self = StObject.set(x, "BL", js.undefined)
      
      inline def setBLVarargs(value: Any*): Self = StObject.set(x, "BL", js.Array(value*))
      
      inline def setBM(value: js.Array[Any]): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      inline def setBMUndefined: Self = StObject.set(x, "BM", js.undefined)
      
      inline def setBMVarargs(value: Any*): Self = StObject.set(x, "BM", js.Array(value*))
      
      inline def setBN(value: js.Array[Any]): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      inline def setBNUndefined: Self = StObject.set(x, "BN", js.undefined)
      
      inline def setBNVarargs(value: Any*): Self = StObject.set(x, "BN", js.Array(value*))
      
      inline def setBO(value: js.Array[Any]): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      inline def setBOUndefined: Self = StObject.set(x, "BO", js.undefined)
      
      inline def setBOVarargs(value: Any*): Self = StObject.set(x, "BO", js.Array(value*))
      
      inline def setBQ(value: js.Array[Any]): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      inline def setBQUndefined: Self = StObject.set(x, "BQ", js.undefined)
      
      inline def setBQVarargs(value: Any*): Self = StObject.set(x, "BQ", js.Array(value*))
      
      inline def setBR(value: js.Array[Any]): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      inline def setBRUndefined: Self = StObject.set(x, "BR", js.undefined)
      
      inline def setBRVarargs(value: Any*): Self = StObject.set(x, "BR", js.Array(value*))
      
      inline def setBS(value: js.Array[Any]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBSVarargs(value: Any*): Self = StObject.set(x, "BS", js.Array(value*))
      
      inline def setBT(value: js.Array[Any]): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      inline def setBTUndefined: Self = StObject.set(x, "BT", js.undefined)
      
      inline def setBTVarargs(value: Any*): Self = StObject.set(x, "BT", js.Array(value*))
      
      inline def setBW(value: js.Array[Any]): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      inline def setBWUndefined: Self = StObject.set(x, "BW", js.undefined)
      
      inline def setBWVarargs(value: Any*): Self = StObject.set(x, "BW", js.Array(value*))
      
      inline def setBY(value: js.Array[Any]): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBYUndefined: Self = StObject.set(x, "BY", js.undefined)
      
      inline def setBYVarargs(value: Any*): Self = StObject.set(x, "BY", js.Array(value*))
      
      inline def setBZ(value: js.Array[Any]): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      inline def setBZUndefined: Self = StObject.set(x, "BZ", js.undefined)
      
      inline def setBZVarargs(value: Any*): Self = StObject.set(x, "BZ", js.Array(value*))
      
      inline def setCA(value: js.Array[Any]): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      inline def setCAUndefined: Self = StObject.set(x, "CA", js.undefined)
      
      inline def setCAVarargs(value: Any*): Self = StObject.set(x, "CA", js.Array(value*))
      
      inline def setCC(value: js.Array[Any]): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      inline def setCCUndefined: Self = StObject.set(x, "CC", js.undefined)
      
      inline def setCCVarargs(value: Any*): Self = StObject.set(x, "CC", js.Array(value*))
      
      inline def setCD(value: js.Array[Any]): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      inline def setCDUndefined: Self = StObject.set(x, "CD", js.undefined)
      
      inline def setCDVarargs(value: Any*): Self = StObject.set(x, "CD", js.Array(value*))
      
      inline def setCF(value: js.Array[Any]): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      inline def setCFUndefined: Self = StObject.set(x, "CF", js.undefined)
      
      inline def setCFVarargs(value: Any*): Self = StObject.set(x, "CF", js.Array(value*))
      
      inline def setCG(value: js.Array[Any]): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      inline def setCGUndefined: Self = StObject.set(x, "CG", js.undefined)
      
      inline def setCGVarargs(value: Any*): Self = StObject.set(x, "CG", js.Array(value*))
      
      inline def setCH(value: js.Array[Any]): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCHUndefined: Self = StObject.set(x, "CH", js.undefined)
      
      inline def setCHVarargs(value: Any*): Self = StObject.set(x, "CH", js.Array(value*))
      
      inline def setCI(value: js.Array[Any]): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      inline def setCIUndefined: Self = StObject.set(x, "CI", js.undefined)
      
      inline def setCIVarargs(value: Any*): Self = StObject.set(x, "CI", js.Array(value*))
      
      inline def setCK(value: js.Array[Any]): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      inline def setCKUndefined: Self = StObject.set(x, "CK", js.undefined)
      
      inline def setCKVarargs(value: Any*): Self = StObject.set(x, "CK", js.Array(value*))
      
      inline def setCL(value: js.Array[Any]): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      inline def setCLUndefined: Self = StObject.set(x, "CL", js.undefined)
      
      inline def setCLVarargs(value: Any*): Self = StObject.set(x, "CL", js.Array(value*))
      
      inline def setCM(value: js.Array[Any]): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      inline def setCMUndefined: Self = StObject.set(x, "CM", js.undefined)
      
      inline def setCMVarargs(value: Any*): Self = StObject.set(x, "CM", js.Array(value*))
      
      inline def setCN(value: js.Array[Any]): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      inline def setCNUndefined: Self = StObject.set(x, "CN", js.undefined)
      
      inline def setCNVarargs(value: Any*): Self = StObject.set(x, "CN", js.Array(value*))
      
      inline def setCO(value: js.Array[Any]): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      inline def setCOUndefined: Self = StObject.set(x, "CO", js.undefined)
      
      inline def setCOVarargs(value: Any*): Self = StObject.set(x, "CO", js.Array(value*))
      
      inline def setCR(value: js.Array[Any]): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      inline def setCRUndefined: Self = StObject.set(x, "CR", js.undefined)
      
      inline def setCRVarargs(value: Any*): Self = StObject.set(x, "CR", js.Array(value*))
      
      inline def setCU(value: js.Array[Any]): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      inline def setCUUndefined: Self = StObject.set(x, "CU", js.undefined)
      
      inline def setCUVarargs(value: Any*): Self = StObject.set(x, "CU", js.Array(value*))
      
      inline def setCV(value: js.Array[Any]): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      inline def setCVUndefined: Self = StObject.set(x, "CV", js.undefined)
      
      inline def setCVVarargs(value: Any*): Self = StObject.set(x, "CV", js.Array(value*))
      
      inline def setCW(value: js.Array[Any]): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setCWUndefined: Self = StObject.set(x, "CW", js.undefined)
      
      inline def setCWVarargs(value: Any*): Self = StObject.set(x, "CW", js.Array(value*))
      
      inline def setCX(value: js.Array[Any]): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      inline def setCXUndefined: Self = StObject.set(x, "CX", js.undefined)
      
      inline def setCXVarargs(value: Any*): Self = StObject.set(x, "CX", js.Array(value*))
      
      inline def setCY(value: js.Array[Any]): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      inline def setCYUndefined: Self = StObject.set(x, "CY", js.undefined)
      
      inline def setCYVarargs(value: Any*): Self = StObject.set(x, "CY", js.Array(value*))
      
      inline def setCZ(value: js.Array[Any]): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      inline def setCZUndefined: Self = StObject.set(x, "CZ", js.undefined)
      
      inline def setCZVarargs(value: Any*): Self = StObject.set(x, "CZ", js.Array(value*))
      
      inline def setDE(value: js.Array[Any]): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      inline def setDEUndefined: Self = StObject.set(x, "DE", js.undefined)
      
      inline def setDEVarargs(value: Any*): Self = StObject.set(x, "DE", js.Array(value*))
      
      inline def setDJ(value: js.Array[Any]): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      inline def setDJUndefined: Self = StObject.set(x, "DJ", js.undefined)
      
      inline def setDJVarargs(value: Any*): Self = StObject.set(x, "DJ", js.Array(value*))
      
      inline def setDK(value: js.Array[Any]): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      inline def setDKUndefined: Self = StObject.set(x, "DK", js.undefined)
      
      inline def setDKVarargs(value: Any*): Self = StObject.set(x, "DK", js.Array(value*))
      
      inline def setDM(value: js.Array[Any]): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDMUndefined: Self = StObject.set(x, "DM", js.undefined)
      
      inline def setDMVarargs(value: Any*): Self = StObject.set(x, "DM", js.Array(value*))
      
      inline def setDO(value: js.Array[Any]): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      inline def setDOUndefined: Self = StObject.set(x, "DO", js.undefined)
      
      inline def setDOVarargs(value: Any*): Self = StObject.set(x, "DO", js.Array(value*))
      
      inline def setDZ(value: js.Array[Any]): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      inline def setDZUndefined: Self = StObject.set(x, "DZ", js.undefined)
      
      inline def setDZVarargs(value: Any*): Self = StObject.set(x, "DZ", js.Array(value*))
      
      inline def setEC(value: js.Array[Any]): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      inline def setECUndefined: Self = StObject.set(x, "EC", js.undefined)
      
      inline def setECVarargs(value: Any*): Self = StObject.set(x, "EC", js.Array(value*))
      
      inline def setEE(value: js.Array[Any]): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      inline def setEEUndefined: Self = StObject.set(x, "EE", js.undefined)
      
      inline def setEEVarargs(value: Any*): Self = StObject.set(x, "EE", js.Array(value*))
      
      inline def setEG(value: js.Array[Any]): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      inline def setEGUndefined: Self = StObject.set(x, "EG", js.undefined)
      
      inline def setEGVarargs(value: Any*): Self = StObject.set(x, "EG", js.Array(value*))
      
      inline def setEH(value: js.Array[Any]): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      inline def setEHUndefined: Self = StObject.set(x, "EH", js.undefined)
      
      inline def setEHVarargs(value: Any*): Self = StObject.set(x, "EH", js.Array(value*))
      
      inline def setER(value: js.Array[Any]): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      inline def setERUndefined: Self = StObject.set(x, "ER", js.undefined)
      
      inline def setERVarargs(value: Any*): Self = StObject.set(x, "ER", js.Array(value*))
      
      inline def setES(value: js.Array[Any]): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setESUndefined: Self = StObject.set(x, "ES", js.undefined)
      
      inline def setESVarargs(value: Any*): Self = StObject.set(x, "ES", js.Array(value*))
      
      inline def setET(value: js.Array[Any]): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      inline def setETUndefined: Self = StObject.set(x, "ET", js.undefined)
      
      inline def setETVarargs(value: Any*): Self = StObject.set(x, "ET", js.Array(value*))
      
      inline def setFI(value: js.Array[Any]): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      inline def setFIUndefined: Self = StObject.set(x, "FI", js.undefined)
      
      inline def setFIVarargs(value: Any*): Self = StObject.set(x, "FI", js.Array(value*))
      
      inline def setFJ(value: js.Array[Any]): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      inline def setFJUndefined: Self = StObject.set(x, "FJ", js.undefined)
      
      inline def setFJVarargs(value: Any*): Self = StObject.set(x, "FJ", js.Array(value*))
      
      inline def setFK(value: js.Array[Any]): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      inline def setFKUndefined: Self = StObject.set(x, "FK", js.undefined)
      
      inline def setFKVarargs(value: Any*): Self = StObject.set(x, "FK", js.Array(value*))
      
      inline def setFM(value: js.Array[Any]): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      inline def setFMUndefined: Self = StObject.set(x, "FM", js.undefined)
      
      inline def setFMVarargs(value: Any*): Self = StObject.set(x, "FM", js.Array(value*))
      
      inline def setFO(value: js.Array[Any]): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      inline def setFOUndefined: Self = StObject.set(x, "FO", js.undefined)
      
      inline def setFOVarargs(value: Any*): Self = StObject.set(x, "FO", js.Array(value*))
      
      inline def setFR(value: js.Array[Any]): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      inline def setFRUndefined: Self = StObject.set(x, "FR", js.undefined)
      
      inline def setFRVarargs(value: Any*): Self = StObject.set(x, "FR", js.Array(value*))
      
      inline def setGA(value: js.Array[Any]): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      inline def setGAUndefined: Self = StObject.set(x, "GA", js.undefined)
      
      inline def setGAVarargs(value: Any*): Self = StObject.set(x, "GA", js.Array(value*))
      
      inline def setGB(value: js.Array[Any]): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      inline def setGBUndefined: Self = StObject.set(x, "GB", js.undefined)
      
      inline def setGBVarargs(value: Any*): Self = StObject.set(x, "GB", js.Array(value*))
      
      inline def setGD(value: js.Array[Any]): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      inline def setGDUndefined: Self = StObject.set(x, "GD", js.undefined)
      
      inline def setGDVarargs(value: Any*): Self = StObject.set(x, "GD", js.Array(value*))
      
      inline def setGE(value: js.Array[Any]): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      inline def setGEUndefined: Self = StObject.set(x, "GE", js.undefined)
      
      inline def setGEVarargs(value: Any*): Self = StObject.set(x, "GE", js.Array(value*))
      
      inline def setGF(value: js.Array[Any]): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      inline def setGFUndefined: Self = StObject.set(x, "GF", js.undefined)
      
      inline def setGFVarargs(value: Any*): Self = StObject.set(x, "GF", js.Array(value*))
      
      inline def setGG(value: js.Array[Any]): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      inline def setGGUndefined: Self = StObject.set(x, "GG", js.undefined)
      
      inline def setGGVarargs(value: Any*): Self = StObject.set(x, "GG", js.Array(value*))
      
      inline def setGH(value: js.Array[Any]): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      inline def setGHUndefined: Self = StObject.set(x, "GH", js.undefined)
      
      inline def setGHVarargs(value: Any*): Self = StObject.set(x, "GH", js.Array(value*))
      
      inline def setGI(value: js.Array[Any]): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      inline def setGIUndefined: Self = StObject.set(x, "GI", js.undefined)
      
      inline def setGIVarargs(value: Any*): Self = StObject.set(x, "GI", js.Array(value*))
      
      inline def setGL(value: js.Array[Any]): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      inline def setGLUndefined: Self = StObject.set(x, "GL", js.undefined)
      
      inline def setGLVarargs(value: Any*): Self = StObject.set(x, "GL", js.Array(value*))
      
      inline def setGM(value: js.Array[Any]): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      inline def setGMUndefined: Self = StObject.set(x, "GM", js.undefined)
      
      inline def setGMVarargs(value: Any*): Self = StObject.set(x, "GM", js.Array(value*))
      
      inline def setGN(value: js.Array[Any]): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      inline def setGNUndefined: Self = StObject.set(x, "GN", js.undefined)
      
      inline def setGNVarargs(value: Any*): Self = StObject.set(x, "GN", js.Array(value*))
      
      inline def setGP(value: js.Array[Any]): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      inline def setGPUndefined: Self = StObject.set(x, "GP", js.undefined)
      
      inline def setGPVarargs(value: Any*): Self = StObject.set(x, "GP", js.Array(value*))
      
      inline def setGQ(value: js.Array[Any]): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      inline def setGQUndefined: Self = StObject.set(x, "GQ", js.undefined)
      
      inline def setGQVarargs(value: Any*): Self = StObject.set(x, "GQ", js.Array(value*))
      
      inline def setGR(value: js.Array[Any]): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      inline def setGRUndefined: Self = StObject.set(x, "GR", js.undefined)
      
      inline def setGRVarargs(value: Any*): Self = StObject.set(x, "GR", js.Array(value*))
      
      inline def setGT(value: js.Array[Any]): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGTUndefined: Self = StObject.set(x, "GT", js.undefined)
      
      inline def setGTVarargs(value: Any*): Self = StObject.set(x, "GT", js.Array(value*))
      
      inline def setGU(value: js.Array[Any]): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      inline def setGUUndefined: Self = StObject.set(x, "GU", js.undefined)
      
      inline def setGUVarargs(value: Any*): Self = StObject.set(x, "GU", js.Array(value*))
      
      inline def setGW(value: js.Array[Any]): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      inline def setGWUndefined: Self = StObject.set(x, "GW", js.undefined)
      
      inline def setGWVarargs(value: Any*): Self = StObject.set(x, "GW", js.Array(value*))
      
      inline def setGY(value: js.Array[Any]): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      inline def setGYUndefined: Self = StObject.set(x, "GY", js.undefined)
      
      inline def setGYVarargs(value: Any*): Self = StObject.set(x, "GY", js.Array(value*))
      
      inline def setHK(value: js.Array[Any]): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      inline def setHKUndefined: Self = StObject.set(x, "HK", js.undefined)
      
      inline def setHKVarargs(value: Any*): Self = StObject.set(x, "HK", js.Array(value*))
      
      inline def setHN(value: js.Array[Any]): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      inline def setHNUndefined: Self = StObject.set(x, "HN", js.undefined)
      
      inline def setHNVarargs(value: Any*): Self = StObject.set(x, "HN", js.Array(value*))
      
      inline def setHR(value: js.Array[Any]): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      inline def setHRUndefined: Self = StObject.set(x, "HR", js.undefined)
      
      inline def setHRVarargs(value: Any*): Self = StObject.set(x, "HR", js.Array(value*))
      
      inline def setHT(value: js.Array[Any]): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      inline def setHTUndefined: Self = StObject.set(x, "HT", js.undefined)
      
      inline def setHTVarargs(value: Any*): Self = StObject.set(x, "HT", js.Array(value*))
      
      inline def setHU(value: js.Array[Any]): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      inline def setHUUndefined: Self = StObject.set(x, "HU", js.undefined)
      
      inline def setHUVarargs(value: Any*): Self = StObject.set(x, "HU", js.Array(value*))
      
      inline def setID(value: js.Array[Any]): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setIDVarargs(value: Any*): Self = StObject.set(x, "ID", js.Array(value*))
      
      inline def setIE(value: js.Array[Any]): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setIEUndefined: Self = StObject.set(x, "IE", js.undefined)
      
      inline def setIEVarargs(value: Any*): Self = StObject.set(x, "IE", js.Array(value*))
      
      inline def setIL(value: js.Array[Any]): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      inline def setILUndefined: Self = StObject.set(x, "IL", js.undefined)
      
      inline def setILVarargs(value: Any*): Self = StObject.set(x, "IL", js.Array(value*))
      
      inline def setIM(value: js.Array[Any]): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      inline def setIMUndefined: Self = StObject.set(x, "IM", js.undefined)
      
      inline def setIMVarargs(value: Any*): Self = StObject.set(x, "IM", js.Array(value*))
      
      inline def setIN(value: js.Array[Any]): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      inline def setINUndefined: Self = StObject.set(x, "IN", js.undefined)
      
      inline def setINVarargs(value: Any*): Self = StObject.set(x, "IN", js.Array(value*))
      
      inline def setIO(value: js.Array[Any]): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      inline def setIOUndefined: Self = StObject.set(x, "IO", js.undefined)
      
      inline def setIOVarargs(value: Any*): Self = StObject.set(x, "IO", js.Array(value*))
      
      inline def setIQ(value: js.Array[Any]): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      inline def setIQUndefined: Self = StObject.set(x, "IQ", js.undefined)
      
      inline def setIQVarargs(value: Any*): Self = StObject.set(x, "IQ", js.Array(value*))
      
      inline def setIR(value: js.Array[Any]): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      inline def setIRUndefined: Self = StObject.set(x, "IR", js.undefined)
      
      inline def setIRVarargs(value: Any*): Self = StObject.set(x, "IR", js.Array(value*))
      
      inline def setIS(value: js.Array[Any]): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setISUndefined: Self = StObject.set(x, "IS", js.undefined)
      
      inline def setISVarargs(value: Any*): Self = StObject.set(x, "IS", js.Array(value*))
      
      inline def setIT(value: js.Array[Any]): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      inline def setITUndefined: Self = StObject.set(x, "IT", js.undefined)
      
      inline def setITVarargs(value: Any*): Self = StObject.set(x, "IT", js.Array(value*))
      
      inline def setJE(value: js.Array[Any]): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      inline def setJEUndefined: Self = StObject.set(x, "JE", js.undefined)
      
      inline def setJEVarargs(value: Any*): Self = StObject.set(x, "JE", js.Array(value*))
      
      inline def setJM(value: js.Array[Any]): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      inline def setJMUndefined: Self = StObject.set(x, "JM", js.undefined)
      
      inline def setJMVarargs(value: Any*): Self = StObject.set(x, "JM", js.Array(value*))
      
      inline def setJO(value: js.Array[Any]): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      inline def setJOUndefined: Self = StObject.set(x, "JO", js.undefined)
      
      inline def setJOVarargs(value: Any*): Self = StObject.set(x, "JO", js.Array(value*))
      
      inline def setJP(value: js.Array[Any]): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      inline def setJPUndefined: Self = StObject.set(x, "JP", js.undefined)
      
      inline def setJPVarargs(value: Any*): Self = StObject.set(x, "JP", js.Array(value*))
      
      inline def setKE(value: js.Array[Any]): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      inline def setKEUndefined: Self = StObject.set(x, "KE", js.undefined)
      
      inline def setKEVarargs(value: Any*): Self = StObject.set(x, "KE", js.Array(value*))
      
      inline def setKG(value: js.Array[Any]): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      inline def setKGUndefined: Self = StObject.set(x, "KG", js.undefined)
      
      inline def setKGVarargs(value: Any*): Self = StObject.set(x, "KG", js.Array(value*))
      
      inline def setKH(value: js.Array[Any]): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      inline def setKHUndefined: Self = StObject.set(x, "KH", js.undefined)
      
      inline def setKHVarargs(value: Any*): Self = StObject.set(x, "KH", js.Array(value*))
      
      inline def setKI(value: js.Array[Any]): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      inline def setKIUndefined: Self = StObject.set(x, "KI", js.undefined)
      
      inline def setKIVarargs(value: Any*): Self = StObject.set(x, "KI", js.Array(value*))
      
      inline def setKM(value: js.Array[Any]): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      inline def setKMUndefined: Self = StObject.set(x, "KM", js.undefined)
      
      inline def setKMVarargs(value: Any*): Self = StObject.set(x, "KM", js.Array(value*))
      
      inline def setKN(value: js.Array[Any]): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      inline def setKNUndefined: Self = StObject.set(x, "KN", js.undefined)
      
      inline def setKNVarargs(value: Any*): Self = StObject.set(x, "KN", js.Array(value*))
      
      inline def setKP(value: js.Array[Any]): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      inline def setKPUndefined: Self = StObject.set(x, "KP", js.undefined)
      
      inline def setKPVarargs(value: Any*): Self = StObject.set(x, "KP", js.Array(value*))
      
      inline def setKR(value: js.Array[Any]): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      inline def setKRUndefined: Self = StObject.set(x, "KR", js.undefined)
      
      inline def setKRVarargs(value: Any*): Self = StObject.set(x, "KR", js.Array(value*))
      
      inline def setKW(value: js.Array[Any]): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      inline def setKWUndefined: Self = StObject.set(x, "KW", js.undefined)
      
      inline def setKWVarargs(value: Any*): Self = StObject.set(x, "KW", js.Array(value*))
      
      inline def setKY(value: js.Array[Any]): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      inline def setKYUndefined: Self = StObject.set(x, "KY", js.undefined)
      
      inline def setKYVarargs(value: Any*): Self = StObject.set(x, "KY", js.Array(value*))
      
      inline def setKZ(value: js.Array[Any]): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      inline def setKZUndefined: Self = StObject.set(x, "KZ", js.undefined)
      
      inline def setKZVarargs(value: Any*): Self = StObject.set(x, "KZ", js.Array(value*))
      
      inline def setLA(value: js.Array[Any]): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      inline def setLAUndefined: Self = StObject.set(x, "LA", js.undefined)
      
      inline def setLAVarargs(value: Any*): Self = StObject.set(x, "LA", js.Array(value*))
      
      inline def setLB(value: js.Array[Any]): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      inline def setLBUndefined: Self = StObject.set(x, "LB", js.undefined)
      
      inline def setLBVarargs(value: Any*): Self = StObject.set(x, "LB", js.Array(value*))
      
      inline def setLC(value: js.Array[Any]): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      inline def setLCUndefined: Self = StObject.set(x, "LC", js.undefined)
      
      inline def setLCVarargs(value: Any*): Self = StObject.set(x, "LC", js.Array(value*))
      
      inline def setLI(value: js.Array[Any]): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      inline def setLIUndefined: Self = StObject.set(x, "LI", js.undefined)
      
      inline def setLIVarargs(value: Any*): Self = StObject.set(x, "LI", js.Array(value*))
      
      inline def setLK(value: js.Array[Any]): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      inline def setLKUndefined: Self = StObject.set(x, "LK", js.undefined)
      
      inline def setLKVarargs(value: Any*): Self = StObject.set(x, "LK", js.Array(value*))
      
      inline def setLR(value: js.Array[Any]): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      inline def setLRUndefined: Self = StObject.set(x, "LR", js.undefined)
      
      inline def setLRVarargs(value: Any*): Self = StObject.set(x, "LR", js.Array(value*))
      
      inline def setLS(value: js.Array[Any]): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      inline def setLSUndefined: Self = StObject.set(x, "LS", js.undefined)
      
      inline def setLSVarargs(value: Any*): Self = StObject.set(x, "LS", js.Array(value*))
      
      inline def setLT(value: js.Array[Any]): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLTUndefined: Self = StObject.set(x, "LT", js.undefined)
      
      inline def setLTVarargs(value: Any*): Self = StObject.set(x, "LT", js.Array(value*))
      
      inline def setLU(value: js.Array[Any]): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      inline def setLUUndefined: Self = StObject.set(x, "LU", js.undefined)
      
      inline def setLUVarargs(value: Any*): Self = StObject.set(x, "LU", js.Array(value*))
      
      inline def setLV(value: js.Array[Any]): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      inline def setLVUndefined: Self = StObject.set(x, "LV", js.undefined)
      
      inline def setLVVarargs(value: Any*): Self = StObject.set(x, "LV", js.Array(value*))
      
      inline def setLY(value: js.Array[Any]): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      inline def setLYUndefined: Self = StObject.set(x, "LY", js.undefined)
      
      inline def setLYVarargs(value: Any*): Self = StObject.set(x, "LY", js.Array(value*))
      
      inline def setMA(value: js.Array[Any]): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      inline def setMAUndefined: Self = StObject.set(x, "MA", js.undefined)
      
      inline def setMAVarargs(value: Any*): Self = StObject.set(x, "MA", js.Array(value*))
      
      inline def setMC(value: js.Array[Any]): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      inline def setMCUndefined: Self = StObject.set(x, "MC", js.undefined)
      
      inline def setMCVarargs(value: Any*): Self = StObject.set(x, "MC", js.Array(value*))
      
      inline def setMD(value: js.Array[Any]): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setMDUndefined: Self = StObject.set(x, "MD", js.undefined)
      
      inline def setMDVarargs(value: Any*): Self = StObject.set(x, "MD", js.Array(value*))
      
      inline def setME(value: js.Array[Any]): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      inline def setMEUndefined: Self = StObject.set(x, "ME", js.undefined)
      
      inline def setMEVarargs(value: Any*): Self = StObject.set(x, "ME", js.Array(value*))
      
      inline def setMF(value: js.Array[Any]): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMFUndefined: Self = StObject.set(x, "MF", js.undefined)
      
      inline def setMFVarargs(value: Any*): Self = StObject.set(x, "MF", js.Array(value*))
      
      inline def setMG(value: js.Array[Any]): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMGUndefined: Self = StObject.set(x, "MG", js.undefined)
      
      inline def setMGVarargs(value: Any*): Self = StObject.set(x, "MG", js.Array(value*))
      
      inline def setMH(value: js.Array[Any]): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      inline def setMHUndefined: Self = StObject.set(x, "MH", js.undefined)
      
      inline def setMHVarargs(value: Any*): Self = StObject.set(x, "MH", js.Array(value*))
      
      inline def setMK(value: js.Array[Any]): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      inline def setMKUndefined: Self = StObject.set(x, "MK", js.undefined)
      
      inline def setMKVarargs(value: Any*): Self = StObject.set(x, "MK", js.Array(value*))
      
      inline def setML(value: js.Array[Any]): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      inline def setMLUndefined: Self = StObject.set(x, "ML", js.undefined)
      
      inline def setMLVarargs(value: Any*): Self = StObject.set(x, "ML", js.Array(value*))
      
      inline def setMM(value: js.Array[Any]): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
      
      inline def setMMVarargs(value: Any*): Self = StObject.set(x, "MM", js.Array(value*))
      
      inline def setMN(value: js.Array[Any]): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      inline def setMNUndefined: Self = StObject.set(x, "MN", js.undefined)
      
      inline def setMNVarargs(value: Any*): Self = StObject.set(x, "MN", js.Array(value*))
      
      inline def setMO(value: js.Array[Any]): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      inline def setMOUndefined: Self = StObject.set(x, "MO", js.undefined)
      
      inline def setMOVarargs(value: Any*): Self = StObject.set(x, "MO", js.Array(value*))
      
      inline def setMP(value: js.Array[Any]): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      inline def setMPUndefined: Self = StObject.set(x, "MP", js.undefined)
      
      inline def setMPVarargs(value: Any*): Self = StObject.set(x, "MP", js.Array(value*))
      
      inline def setMQ(value: js.Array[Any]): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      inline def setMQUndefined: Self = StObject.set(x, "MQ", js.undefined)
      
      inline def setMQVarargs(value: Any*): Self = StObject.set(x, "MQ", js.Array(value*))
      
      inline def setMR(value: js.Array[Any]): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMRUndefined: Self = StObject.set(x, "MR", js.undefined)
      
      inline def setMRVarargs(value: Any*): Self = StObject.set(x, "MR", js.Array(value*))
      
      inline def setMS(value: js.Array[Any]): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMSUndefined: Self = StObject.set(x, "MS", js.undefined)
      
      inline def setMSVarargs(value: Any*): Self = StObject.set(x, "MS", js.Array(value*))
      
      inline def setMT(value: js.Array[Any]): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      inline def setMTUndefined: Self = StObject.set(x, "MT", js.undefined)
      
      inline def setMTVarargs(value: Any*): Self = StObject.set(x, "MT", js.Array(value*))
      
      inline def setMU(value: js.Array[Any]): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      inline def setMUUndefined: Self = StObject.set(x, "MU", js.undefined)
      
      inline def setMUVarargs(value: Any*): Self = StObject.set(x, "MU", js.Array(value*))
      
      inline def setMV(value: js.Array[Any]): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      inline def setMVUndefined: Self = StObject.set(x, "MV", js.undefined)
      
      inline def setMVVarargs(value: Any*): Self = StObject.set(x, "MV", js.Array(value*))
      
      inline def setMW(value: js.Array[Any]): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      inline def setMWUndefined: Self = StObject.set(x, "MW", js.undefined)
      
      inline def setMWVarargs(value: Any*): Self = StObject.set(x, "MW", js.Array(value*))
      
      inline def setMX(value: js.Array[Any]): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setMXUndefined: Self = StObject.set(x, "MX", js.undefined)
      
      inline def setMXVarargs(value: Any*): Self = StObject.set(x, "MX", js.Array(value*))
      
      inline def setMY(value: js.Array[Any]): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      inline def setMYUndefined: Self = StObject.set(x, "MY", js.undefined)
      
      inline def setMYVarargs(value: Any*): Self = StObject.set(x, "MY", js.Array(value*))
      
      inline def setMZ(value: js.Array[Any]): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      inline def setMZUndefined: Self = StObject.set(x, "MZ", js.undefined)
      
      inline def setMZVarargs(value: Any*): Self = StObject.set(x, "MZ", js.Array(value*))
      
      inline def setNA(value: js.Array[Any]): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      inline def setNAUndefined: Self = StObject.set(x, "NA", js.undefined)
      
      inline def setNAVarargs(value: Any*): Self = StObject.set(x, "NA", js.Array(value*))
      
      inline def setNC(value: js.Array[Any]): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      inline def setNCUndefined: Self = StObject.set(x, "NC", js.undefined)
      
      inline def setNCVarargs(value: Any*): Self = StObject.set(x, "NC", js.Array(value*))
      
      inline def setNE(value: js.Array[Any]): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNEUndefined: Self = StObject.set(x, "NE", js.undefined)
      
      inline def setNEVarargs(value: Any*): Self = StObject.set(x, "NE", js.Array(value*))
      
      inline def setNF(value: js.Array[Any]): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      inline def setNFUndefined: Self = StObject.set(x, "NF", js.undefined)
      
      inline def setNFVarargs(value: Any*): Self = StObject.set(x, "NF", js.Array(value*))
      
      inline def setNG(value: js.Array[Any]): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      inline def setNGUndefined: Self = StObject.set(x, "NG", js.undefined)
      
      inline def setNGVarargs(value: Any*): Self = StObject.set(x, "NG", js.Array(value*))
      
      inline def setNI(value: js.Array[Any]): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      inline def setNIUndefined: Self = StObject.set(x, "NI", js.undefined)
      
      inline def setNIVarargs(value: Any*): Self = StObject.set(x, "NI", js.Array(value*))
      
      inline def setNL(value: js.Array[Any]): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      inline def setNLUndefined: Self = StObject.set(x, "NL", js.undefined)
      
      inline def setNLVarargs(value: Any*): Self = StObject.set(x, "NL", js.Array(value*))
      
      inline def setNO(value: js.Array[Any]): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      inline def setNOUndefined: Self = StObject.set(x, "NO", js.undefined)
      
      inline def setNOVarargs(value: Any*): Self = StObject.set(x, "NO", js.Array(value*))
      
      inline def setNP(value: js.Array[Any]): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      inline def setNPUndefined: Self = StObject.set(x, "NP", js.undefined)
      
      inline def setNPVarargs(value: Any*): Self = StObject.set(x, "NP", js.Array(value*))
      
      inline def setNR(value: js.Array[Any]): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      inline def setNRUndefined: Self = StObject.set(x, "NR", js.undefined)
      
      inline def setNRVarargs(value: Any*): Self = StObject.set(x, "NR", js.Array(value*))
      
      inline def setNU(value: js.Array[Any]): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      inline def setNUUndefined: Self = StObject.set(x, "NU", js.undefined)
      
      inline def setNUVarargs(value: Any*): Self = StObject.set(x, "NU", js.Array(value*))
      
      inline def setNZ(value: js.Array[Any]): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      inline def setNZUndefined: Self = StObject.set(x, "NZ", js.undefined)
      
      inline def setNZVarargs(value: Any*): Self = StObject.set(x, "NZ", js.Array(value*))
      
      inline def setOM(value: js.Array[Any]): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      inline def setOMUndefined: Self = StObject.set(x, "OM", js.undefined)
      
      inline def setOMVarargs(value: Any*): Self = StObject.set(x, "OM", js.Array(value*))
      
      inline def setPA(value: js.Array[Any]): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      inline def setPAUndefined: Self = StObject.set(x, "PA", js.undefined)
      
      inline def setPAVarargs(value: Any*): Self = StObject.set(x, "PA", js.Array(value*))
      
      inline def setPE(value: js.Array[Any]): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      inline def setPEUndefined: Self = StObject.set(x, "PE", js.undefined)
      
      inline def setPEVarargs(value: Any*): Self = StObject.set(x, "PE", js.Array(value*))
      
      inline def setPF(value: js.Array[Any]): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      inline def setPFUndefined: Self = StObject.set(x, "PF", js.undefined)
      
      inline def setPFVarargs(value: Any*): Self = StObject.set(x, "PF", js.Array(value*))
      
      inline def setPG(value: js.Array[Any]): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      inline def setPGUndefined: Self = StObject.set(x, "PG", js.undefined)
      
      inline def setPGVarargs(value: Any*): Self = StObject.set(x, "PG", js.Array(value*))
      
      inline def setPH(value: js.Array[Any]): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      inline def setPHUndefined: Self = StObject.set(x, "PH", js.undefined)
      
      inline def setPHVarargs(value: Any*): Self = StObject.set(x, "PH", js.Array(value*))
      
      inline def setPK(value: js.Array[Any]): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      inline def setPKUndefined: Self = StObject.set(x, "PK", js.undefined)
      
      inline def setPKVarargs(value: Any*): Self = StObject.set(x, "PK", js.Array(value*))
      
      inline def setPL(value: js.Array[Any]): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      inline def setPLUndefined: Self = StObject.set(x, "PL", js.undefined)
      
      inline def setPLVarargs(value: Any*): Self = StObject.set(x, "PL", js.Array(value*))
      
      inline def setPM(value: js.Array[Any]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPMUndefined: Self = StObject.set(x, "PM", js.undefined)
      
      inline def setPMVarargs(value: Any*): Self = StObject.set(x, "PM", js.Array(value*))
      
      inline def setPR(value: js.Array[Any]): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      inline def setPRUndefined: Self = StObject.set(x, "PR", js.undefined)
      
      inline def setPRVarargs(value: Any*): Self = StObject.set(x, "PR", js.Array(value*))
      
      inline def setPS(value: js.Array[Any]): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      inline def setPSUndefined: Self = StObject.set(x, "PS", js.undefined)
      
      inline def setPSVarargs(value: Any*): Self = StObject.set(x, "PS", js.Array(value*))
      
      inline def setPT(value: js.Array[Any]): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      inline def setPTUndefined: Self = StObject.set(x, "PT", js.undefined)
      
      inline def setPTVarargs(value: Any*): Self = StObject.set(x, "PT", js.Array(value*))
      
      inline def setPW(value: js.Array[Any]): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      inline def setPWUndefined: Self = StObject.set(x, "PW", js.undefined)
      
      inline def setPWVarargs(value: Any*): Self = StObject.set(x, "PW", js.Array(value*))
      
      inline def setPY(value: js.Array[Any]): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      inline def setPYUndefined: Self = StObject.set(x, "PY", js.undefined)
      
      inline def setPYVarargs(value: Any*): Self = StObject.set(x, "PY", js.Array(value*))
      
      inline def setQA(value: js.Array[Any]): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      inline def setQAUndefined: Self = StObject.set(x, "QA", js.undefined)
      
      inline def setQAVarargs(value: Any*): Self = StObject.set(x, "QA", js.Array(value*))
      
      inline def setRE(value: js.Array[Any]): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      inline def setREUndefined: Self = StObject.set(x, "RE", js.undefined)
      
      inline def setREVarargs(value: Any*): Self = StObject.set(x, "RE", js.Array(value*))
      
      inline def setRO(value: js.Array[Any]): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      inline def setROUndefined: Self = StObject.set(x, "RO", js.undefined)
      
      inline def setROVarargs(value: Any*): Self = StObject.set(x, "RO", js.Array(value*))
      
      inline def setRS(value: js.Array[Any]): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
      
      inline def setRSVarargs(value: Any*): Self = StObject.set(x, "RS", js.Array(value*))
      
      inline def setRU(value: js.Array[Any]): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      inline def setRUUndefined: Self = StObject.set(x, "RU", js.undefined)
      
      inline def setRUVarargs(value: Any*): Self = StObject.set(x, "RU", js.Array(value*))
      
      inline def setRW(value: js.Array[Any]): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      inline def setRWUndefined: Self = StObject.set(x, "RW", js.undefined)
      
      inline def setRWVarargs(value: Any*): Self = StObject.set(x, "RW", js.Array(value*))
      
      inline def setSA(value: js.Array[Any]): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      inline def setSAUndefined: Self = StObject.set(x, "SA", js.undefined)
      
      inline def setSAVarargs(value: Any*): Self = StObject.set(x, "SA", js.Array(value*))
      
      inline def setSB(value: js.Array[Any]): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      inline def setSBUndefined: Self = StObject.set(x, "SB", js.undefined)
      
      inline def setSBVarargs(value: Any*): Self = StObject.set(x, "SB", js.Array(value*))
      
      inline def setSC(value: js.Array[Any]): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      inline def setSCUndefined: Self = StObject.set(x, "SC", js.undefined)
      
      inline def setSCVarargs(value: Any*): Self = StObject.set(x, "SC", js.Array(value*))
      
      inline def setSD(value: js.Array[Any]): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      inline def setSDUndefined: Self = StObject.set(x, "SD", js.undefined)
      
      inline def setSDVarargs(value: Any*): Self = StObject.set(x, "SD", js.Array(value*))
      
      inline def setSE(value: js.Array[Any]): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSEUndefined: Self = StObject.set(x, "SE", js.undefined)
      
      inline def setSEVarargs(value: Any*): Self = StObject.set(x, "SE", js.Array(value*))
      
      inline def setSG(value: js.Array[Any]): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      inline def setSGUndefined: Self = StObject.set(x, "SG", js.undefined)
      
      inline def setSGVarargs(value: Any*): Self = StObject.set(x, "SG", js.Array(value*))
      
      inline def setSH(value: js.Array[Any]): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      inline def setSHUndefined: Self = StObject.set(x, "SH", js.undefined)
      
      inline def setSHVarargs(value: Any*): Self = StObject.set(x, "SH", js.Array(value*))
      
      inline def setSI(value: js.Array[Any]): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      inline def setSIUndefined: Self = StObject.set(x, "SI", js.undefined)
      
      inline def setSIVarargs(value: Any*): Self = StObject.set(x, "SI", js.Array(value*))
      
      inline def setSJ(value: js.Array[Any]): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      inline def setSJUndefined: Self = StObject.set(x, "SJ", js.undefined)
      
      inline def setSJVarargs(value: Any*): Self = StObject.set(x, "SJ", js.Array(value*))
      
      inline def setSK(value: js.Array[Any]): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      inline def setSKUndefined: Self = StObject.set(x, "SK", js.undefined)
      
      inline def setSKVarargs(value: Any*): Self = StObject.set(x, "SK", js.Array(value*))
      
      inline def setSL(value: js.Array[Any]): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      inline def setSLUndefined: Self = StObject.set(x, "SL", js.undefined)
      
      inline def setSLVarargs(value: Any*): Self = StObject.set(x, "SL", js.Array(value*))
      
      inline def setSM(value: js.Array[Any]): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      inline def setSMUndefined: Self = StObject.set(x, "SM", js.undefined)
      
      inline def setSMVarargs(value: Any*): Self = StObject.set(x, "SM", js.Array(value*))
      
      inline def setSN(value: js.Array[Any]): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      inline def setSNUndefined: Self = StObject.set(x, "SN", js.undefined)
      
      inline def setSNVarargs(value: Any*): Self = StObject.set(x, "SN", js.Array(value*))
      
      inline def setSO(value: js.Array[Any]): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      inline def setSOUndefined: Self = StObject.set(x, "SO", js.undefined)
      
      inline def setSOVarargs(value: Any*): Self = StObject.set(x, "SO", js.Array(value*))
      
      inline def setSR(value: js.Array[Any]): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      inline def setSRUndefined: Self = StObject.set(x, "SR", js.undefined)
      
      inline def setSRVarargs(value: Any*): Self = StObject.set(x, "SR", js.Array(value*))
      
      inline def setSS(value: js.Array[Any]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setSSVarargs(value: Any*): Self = StObject.set(x, "SS", js.Array(value*))
      
      inline def setST(value: js.Array[Any]): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSTUndefined: Self = StObject.set(x, "ST", js.undefined)
      
      inline def setSTVarargs(value: Any*): Self = StObject.set(x, "ST", js.Array(value*))
      
      inline def setSV(value: js.Array[Any]): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      inline def setSVUndefined: Self = StObject.set(x, "SV", js.undefined)
      
      inline def setSVVarargs(value: Any*): Self = StObject.set(x, "SV", js.Array(value*))
      
      inline def setSX(value: js.Array[Any]): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      inline def setSXUndefined: Self = StObject.set(x, "SX", js.undefined)
      
      inline def setSXVarargs(value: Any*): Self = StObject.set(x, "SX", js.Array(value*))
      
      inline def setSY(value: js.Array[Any]): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      inline def setSYUndefined: Self = StObject.set(x, "SY", js.undefined)
      
      inline def setSYVarargs(value: Any*): Self = StObject.set(x, "SY", js.Array(value*))
      
      inline def setSZ(value: js.Array[Any]): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      inline def setSZUndefined: Self = StObject.set(x, "SZ", js.undefined)
      
      inline def setSZVarargs(value: Any*): Self = StObject.set(x, "SZ", js.Array(value*))
      
      inline def setTA(value: js.Array[Any]): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      inline def setTAUndefined: Self = StObject.set(x, "TA", js.undefined)
      
      inline def setTAVarargs(value: Any*): Self = StObject.set(x, "TA", js.Array(value*))
      
      inline def setTC(value: js.Array[Any]): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      inline def setTCUndefined: Self = StObject.set(x, "TC", js.undefined)
      
      inline def setTCVarargs(value: Any*): Self = StObject.set(x, "TC", js.Array(value*))
      
      inline def setTD(value: js.Array[Any]): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      inline def setTDUndefined: Self = StObject.set(x, "TD", js.undefined)
      
      inline def setTDVarargs(value: Any*): Self = StObject.set(x, "TD", js.Array(value*))
      
      inline def setTG(value: js.Array[Any]): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      inline def setTGUndefined: Self = StObject.set(x, "TG", js.undefined)
      
      inline def setTGVarargs(value: Any*): Self = StObject.set(x, "TG", js.Array(value*))
      
      inline def setTH(value: js.Array[Any]): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTHUndefined: Self = StObject.set(x, "TH", js.undefined)
      
      inline def setTHVarargs(value: Any*): Self = StObject.set(x, "TH", js.Array(value*))
      
      inline def setTJ(value: js.Array[Any]): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      inline def setTJUndefined: Self = StObject.set(x, "TJ", js.undefined)
      
      inline def setTJVarargs(value: Any*): Self = StObject.set(x, "TJ", js.Array(value*))
      
      inline def setTK(value: js.Array[Any]): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      inline def setTKUndefined: Self = StObject.set(x, "TK", js.undefined)
      
      inline def setTKVarargs(value: Any*): Self = StObject.set(x, "TK", js.Array(value*))
      
      inline def setTL(value: js.Array[Any]): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      inline def setTLUndefined: Self = StObject.set(x, "TL", js.undefined)
      
      inline def setTLVarargs(value: Any*): Self = StObject.set(x, "TL", js.Array(value*))
      
      inline def setTM(value: js.Array[Any]): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      inline def setTMUndefined: Self = StObject.set(x, "TM", js.undefined)
      
      inline def setTMVarargs(value: Any*): Self = StObject.set(x, "TM", js.Array(value*))
      
      inline def setTN(value: js.Array[Any]): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      inline def setTNUndefined: Self = StObject.set(x, "TN", js.undefined)
      
      inline def setTNVarargs(value: Any*): Self = StObject.set(x, "TN", js.Array(value*))
      
      inline def setTO(value: js.Array[Any]): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTOUndefined: Self = StObject.set(x, "TO", js.undefined)
      
      inline def setTOVarargs(value: Any*): Self = StObject.set(x, "TO", js.Array(value*))
      
      inline def setTR(value: js.Array[Any]): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      inline def setTRUndefined: Self = StObject.set(x, "TR", js.undefined)
      
      inline def setTRVarargs(value: Any*): Self = StObject.set(x, "TR", js.Array(value*))
      
      inline def setTT(value: js.Array[Any]): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      inline def setTTUndefined: Self = StObject.set(x, "TT", js.undefined)
      
      inline def setTTVarargs(value: Any*): Self = StObject.set(x, "TT", js.Array(value*))
      
      inline def setTV(value: js.Array[Any]): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      inline def setTVUndefined: Self = StObject.set(x, "TV", js.undefined)
      
      inline def setTVVarargs(value: Any*): Self = StObject.set(x, "TV", js.Array(value*))
      
      inline def setTW(value: js.Array[Any]): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      inline def setTWUndefined: Self = StObject.set(x, "TW", js.undefined)
      
      inline def setTWVarargs(value: Any*): Self = StObject.set(x, "TW", js.Array(value*))
      
      inline def setTZ(value: js.Array[Any]): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      inline def setTZUndefined: Self = StObject.set(x, "TZ", js.undefined)
      
      inline def setTZVarargs(value: Any*): Self = StObject.set(x, "TZ", js.Array(value*))
      
      inline def setUA(value: js.Array[Any]): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      inline def setUAUndefined: Self = StObject.set(x, "UA", js.undefined)
      
      inline def setUAVarargs(value: Any*): Self = StObject.set(x, "UA", js.Array(value*))
      
      inline def setUG(value: js.Array[Any]): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      inline def setUGUndefined: Self = StObject.set(x, "UG", js.undefined)
      
      inline def setUGVarargs(value: Any*): Self = StObject.set(x, "UG", js.Array(value*))
      
      inline def setUS(value: js.Array[Any]): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      inline def setUSUndefined: Self = StObject.set(x, "US", js.undefined)
      
      inline def setUSVarargs(value: Any*): Self = StObject.set(x, "US", js.Array(value*))
      
      inline def setUY(value: js.Array[Any]): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      inline def setUYUndefined: Self = StObject.set(x, "UY", js.undefined)
      
      inline def setUYVarargs(value: Any*): Self = StObject.set(x, "UY", js.Array(value*))
      
      inline def setUZ(value: js.Array[Any]): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      inline def setUZUndefined: Self = StObject.set(x, "UZ", js.undefined)
      
      inline def setUZVarargs(value: Any*): Self = StObject.set(x, "UZ", js.Array(value*))
      
      inline def setVA(value: js.Array[Any]): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      inline def setVAUndefined: Self = StObject.set(x, "VA", js.undefined)
      
      inline def setVAVarargs(value: Any*): Self = StObject.set(x, "VA", js.Array(value*))
      
      inline def setVC(value: js.Array[Any]): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      inline def setVCUndefined: Self = StObject.set(x, "VC", js.undefined)
      
      inline def setVCVarargs(value: Any*): Self = StObject.set(x, "VC", js.Array(value*))
      
      inline def setVE(value: js.Array[Any]): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      inline def setVEUndefined: Self = StObject.set(x, "VE", js.undefined)
      
      inline def setVEVarargs(value: Any*): Self = StObject.set(x, "VE", js.Array(value*))
      
      inline def setVG(value: js.Array[Any]): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      inline def setVGUndefined: Self = StObject.set(x, "VG", js.undefined)
      
      inline def setVGVarargs(value: Any*): Self = StObject.set(x, "VG", js.Array(value*))
      
      inline def setVI(value: js.Array[Any]): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      inline def setVIUndefined: Self = StObject.set(x, "VI", js.undefined)
      
      inline def setVIVarargs(value: Any*): Self = StObject.set(x, "VI", js.Array(value*))
      
      inline def setVN(value: js.Array[Any]): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      inline def setVNUndefined: Self = StObject.set(x, "VN", js.undefined)
      
      inline def setVNVarargs(value: Any*): Self = StObject.set(x, "VN", js.Array(value*))
      
      inline def setVU(value: js.Array[Any]): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      inline def setVUUndefined: Self = StObject.set(x, "VU", js.undefined)
      
      inline def setVUVarargs(value: Any*): Self = StObject.set(x, "VU", js.Array(value*))
      
      inline def setWF(value: js.Array[Any]): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      inline def setWFUndefined: Self = StObject.set(x, "WF", js.undefined)
      
      inline def setWFVarargs(value: Any*): Self = StObject.set(x, "WF", js.Array(value*))
      
      inline def setWS(value: js.Array[Any]): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setWSUndefined: Self = StObject.set(x, "WS", js.undefined)
      
      inline def setWSVarargs(value: Any*): Self = StObject.set(x, "WS", js.Array(value*))
      
      inline def setXK(value: js.Array[Any]): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      inline def setXKUndefined: Self = StObject.set(x, "XK", js.undefined)
      
      inline def setXKVarargs(value: Any*): Self = StObject.set(x, "XK", js.Array(value*))
      
      inline def setYE(value: js.Array[Any]): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      inline def setYEUndefined: Self = StObject.set(x, "YE", js.undefined)
      
      inline def setYEVarargs(value: Any*): Self = StObject.set(x, "YE", js.Array(value*))
      
      inline def setYT(value: js.Array[Any]): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      inline def setYTUndefined: Self = StObject.set(x, "YT", js.undefined)
      
      inline def setYTVarargs(value: Any*): Self = StObject.set(x, "YT", js.Array(value*))
      
      inline def setZA(value: js.Array[Any]): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      inline def setZAUndefined: Self = StObject.set(x, "ZA", js.undefined)
      
      inline def setZAVarargs(value: Any*): Self = StObject.set(x, "ZA", js.Array(value*))
      
      inline def setZM(value: js.Array[Any]): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      inline def setZMUndefined: Self = StObject.set(x, "ZM", js.undefined)
      
      inline def setZMVarargs(value: Any*): Self = StObject.set(x, "ZM", js.Array(value*))
      
      inline def setZW(value: js.Array[Any]): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
      
      inline def setZWUndefined: Self = StObject.set(x, "ZW", js.undefined)
      
      inline def setZWVarargs(value: Any*): Self = StObject.set(x, "ZW", js.Array(value*))
    }
  }
  
  type CountryCallingCode = Tagged[String, typings.libphonenumberJs.libphonenumberJsStrings.CountryCallingCode]
  
  type CountryCallingCodes = StringDictionary[js.Array[CountryCode]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.libphonenumberJsStrings.AC
    - typings.libphonenumberJs.libphonenumberJsStrings.AD
    - typings.libphonenumberJs.libphonenumberJsStrings.AE
    - typings.libphonenumberJs.libphonenumberJsStrings.AF
    - typings.libphonenumberJs.libphonenumberJsStrings.AG
    - typings.libphonenumberJs.libphonenumberJsStrings.AI
    - typings.libphonenumberJs.libphonenumberJsStrings.AL
    - typings.libphonenumberJs.libphonenumberJsStrings.AM
    - typings.libphonenumberJs.libphonenumberJsStrings.AO
    - typings.libphonenumberJs.libphonenumberJsStrings.AR
    - typings.libphonenumberJs.libphonenumberJsStrings.AS
    - typings.libphonenumberJs.libphonenumberJsStrings.AT
    - typings.libphonenumberJs.libphonenumberJsStrings.AU
    - typings.libphonenumberJs.libphonenumberJsStrings.AW
    - typings.libphonenumberJs.libphonenumberJsStrings.AX
    - typings.libphonenumberJs.libphonenumberJsStrings.AZ
    - typings.libphonenumberJs.libphonenumberJsStrings.BA
    - typings.libphonenumberJs.libphonenumberJsStrings.BB
    - typings.libphonenumberJs.libphonenumberJsStrings.BD
    - typings.libphonenumberJs.libphonenumberJsStrings.BE
    - typings.libphonenumberJs.libphonenumberJsStrings.BF
    - typings.libphonenumberJs.libphonenumberJsStrings.BG
    - typings.libphonenumberJs.libphonenumberJsStrings.BH
    - typings.libphonenumberJs.libphonenumberJsStrings.BI
    - typings.libphonenumberJs.libphonenumberJsStrings.BJ
    - typings.libphonenumberJs.libphonenumberJsStrings.BL
    - typings.libphonenumberJs.libphonenumberJsStrings.BM
    - typings.libphonenumberJs.libphonenumberJsStrings.BN
    - typings.libphonenumberJs.libphonenumberJsStrings.BO
    - typings.libphonenumberJs.libphonenumberJsStrings.BQ
    - typings.libphonenumberJs.libphonenumberJsStrings.BR
    - typings.libphonenumberJs.libphonenumberJsStrings.BS
    - typings.libphonenumberJs.libphonenumberJsStrings.BT
    - typings.libphonenumberJs.libphonenumberJsStrings.BW
    - typings.libphonenumberJs.libphonenumberJsStrings.BY
    - typings.libphonenumberJs.libphonenumberJsStrings.BZ
    - typings.libphonenumberJs.libphonenumberJsStrings.CA
    - typings.libphonenumberJs.libphonenumberJsStrings.CC
    - typings.libphonenumberJs.libphonenumberJsStrings.CD
    - typings.libphonenumberJs.libphonenumberJsStrings.CF
    - typings.libphonenumberJs.libphonenumberJsStrings.CG
    - typings.libphonenumberJs.libphonenumberJsStrings.CH
    - typings.libphonenumberJs.libphonenumberJsStrings.CI
    - typings.libphonenumberJs.libphonenumberJsStrings.CK
    - typings.libphonenumberJs.libphonenumberJsStrings.CL
    - typings.libphonenumberJs.libphonenumberJsStrings.CM
    - typings.libphonenumberJs.libphonenumberJsStrings.CN
    - typings.libphonenumberJs.libphonenumberJsStrings.CO
    - typings.libphonenumberJs.libphonenumberJsStrings.CR
    - typings.libphonenumberJs.libphonenumberJsStrings.CU
    - typings.libphonenumberJs.libphonenumberJsStrings.CV
    - typings.libphonenumberJs.libphonenumberJsStrings.CW
    - typings.libphonenumberJs.libphonenumberJsStrings.CX
    - typings.libphonenumberJs.libphonenumberJsStrings.CY
    - typings.libphonenumberJs.libphonenumberJsStrings.CZ
    - typings.libphonenumberJs.libphonenumberJsStrings.DE
    - typings.libphonenumberJs.libphonenumberJsStrings.DJ
    - typings.libphonenumberJs.libphonenumberJsStrings.DK
    - typings.libphonenumberJs.libphonenumberJsStrings.DM
    - typings.libphonenumberJs.libphonenumberJsStrings.DO
    - typings.libphonenumberJs.libphonenumberJsStrings.DZ
    - typings.libphonenumberJs.libphonenumberJsStrings.EC
    - typings.libphonenumberJs.libphonenumberJsStrings.EE
    - typings.libphonenumberJs.libphonenumberJsStrings.EG
    - typings.libphonenumberJs.libphonenumberJsStrings.EH
    - typings.libphonenumberJs.libphonenumberJsStrings.ER
    - typings.libphonenumberJs.libphonenumberJsStrings.ES
    - typings.libphonenumberJs.libphonenumberJsStrings.ET
    - typings.libphonenumberJs.libphonenumberJsStrings.FI
    - typings.libphonenumberJs.libphonenumberJsStrings.FJ
    - typings.libphonenumberJs.libphonenumberJsStrings.FK
    - typings.libphonenumberJs.libphonenumberJsStrings.FM
    - typings.libphonenumberJs.libphonenumberJsStrings.FO
    - typings.libphonenumberJs.libphonenumberJsStrings.FR
    - typings.libphonenumberJs.libphonenumberJsStrings.GA
    - typings.libphonenumberJs.libphonenumberJsStrings.GB
    - typings.libphonenumberJs.libphonenumberJsStrings.GD
    - typings.libphonenumberJs.libphonenumberJsStrings.GE
    - typings.libphonenumberJs.libphonenumberJsStrings.GF
    - typings.libphonenumberJs.libphonenumberJsStrings.GG
    - typings.libphonenumberJs.libphonenumberJsStrings.GH
    - typings.libphonenumberJs.libphonenumberJsStrings.GI
    - typings.libphonenumberJs.libphonenumberJsStrings.GL
    - typings.libphonenumberJs.libphonenumberJsStrings.GM
    - typings.libphonenumberJs.libphonenumberJsStrings.GN
    - typings.libphonenumberJs.libphonenumberJsStrings.GP
    - typings.libphonenumberJs.libphonenumberJsStrings.GQ
    - typings.libphonenumberJs.libphonenumberJsStrings.GR
    - typings.libphonenumberJs.libphonenumberJsStrings.GT
    - typings.libphonenumberJs.libphonenumberJsStrings.GU
    - typings.libphonenumberJs.libphonenumberJsStrings.GW
    - typings.libphonenumberJs.libphonenumberJsStrings.GY
    - typings.libphonenumberJs.libphonenumberJsStrings.HK
    - typings.libphonenumberJs.libphonenumberJsStrings.HN
    - typings.libphonenumberJs.libphonenumberJsStrings.HR
    - typings.libphonenumberJs.libphonenumberJsStrings.HT
    - typings.libphonenumberJs.libphonenumberJsStrings.HU
    - typings.libphonenumberJs.libphonenumberJsStrings.ID
    - typings.libphonenumberJs.libphonenumberJsStrings.IE
    - typings.libphonenumberJs.libphonenumberJsStrings.IL
    - typings.libphonenumberJs.libphonenumberJsStrings.IM
    - typings.libphonenumberJs.libphonenumberJsStrings.IN
    - typings.libphonenumberJs.libphonenumberJsStrings.IO
    - typings.libphonenumberJs.libphonenumberJsStrings.IQ
    - typings.libphonenumberJs.libphonenumberJsStrings.IR
    - typings.libphonenumberJs.libphonenumberJsStrings.IS
    - typings.libphonenumberJs.libphonenumberJsStrings.IT
    - typings.libphonenumberJs.libphonenumberJsStrings.JE
    - typings.libphonenumberJs.libphonenumberJsStrings.JM
    - typings.libphonenumberJs.libphonenumberJsStrings.JO
    - typings.libphonenumberJs.libphonenumberJsStrings.JP
    - typings.libphonenumberJs.libphonenumberJsStrings.KE
    - typings.libphonenumberJs.libphonenumberJsStrings.KG
    - typings.libphonenumberJs.libphonenumberJsStrings.KH
    - typings.libphonenumberJs.libphonenumberJsStrings.KI
    - typings.libphonenumberJs.libphonenumberJsStrings.KM
    - typings.libphonenumberJs.libphonenumberJsStrings.KN
    - typings.libphonenumberJs.libphonenumberJsStrings.KP
    - typings.libphonenumberJs.libphonenumberJsStrings.KR
    - typings.libphonenumberJs.libphonenumberJsStrings.KW
    - typings.libphonenumberJs.libphonenumberJsStrings.KY
    - typings.libphonenumberJs.libphonenumberJsStrings.KZ
    - typings.libphonenumberJs.libphonenumberJsStrings.LA
    - typings.libphonenumberJs.libphonenumberJsStrings.LB
    - typings.libphonenumberJs.libphonenumberJsStrings.LC
    - typings.libphonenumberJs.libphonenumberJsStrings.LI
    - typings.libphonenumberJs.libphonenumberJsStrings.LK
    - typings.libphonenumberJs.libphonenumberJsStrings.LR
    - typings.libphonenumberJs.libphonenumberJsStrings.LS
    - typings.libphonenumberJs.libphonenumberJsStrings.LT
    - typings.libphonenumberJs.libphonenumberJsStrings.LU
    - typings.libphonenumberJs.libphonenumberJsStrings.LV
    - typings.libphonenumberJs.libphonenumberJsStrings.LY
    - typings.libphonenumberJs.libphonenumberJsStrings.MA
    - typings.libphonenumberJs.libphonenumberJsStrings.MC
    - typings.libphonenumberJs.libphonenumberJsStrings.MD
    - typings.libphonenumberJs.libphonenumberJsStrings.ME
    - typings.libphonenumberJs.libphonenumberJsStrings.MF
    - typings.libphonenumberJs.libphonenumberJsStrings.MG
    - typings.libphonenumberJs.libphonenumberJsStrings.MH
    - typings.libphonenumberJs.libphonenumberJsStrings.MK
    - typings.libphonenumberJs.libphonenumberJsStrings.ML
    - typings.libphonenumberJs.libphonenumberJsStrings.MM
    - typings.libphonenumberJs.libphonenumberJsStrings.MN
    - typings.libphonenumberJs.libphonenumberJsStrings.MO
    - typings.libphonenumberJs.libphonenumberJsStrings.MP
    - typings.libphonenumberJs.libphonenumberJsStrings.MQ
    - typings.libphonenumberJs.libphonenumberJsStrings.MR
    - typings.libphonenumberJs.libphonenumberJsStrings.MS
    - typings.libphonenumberJs.libphonenumberJsStrings.MT
    - typings.libphonenumberJs.libphonenumberJsStrings.MU
    - typings.libphonenumberJs.libphonenumberJsStrings.MV
    - typings.libphonenumberJs.libphonenumberJsStrings.MW
    - typings.libphonenumberJs.libphonenumberJsStrings.MX
    - typings.libphonenumberJs.libphonenumberJsStrings.MY
    - typings.libphonenumberJs.libphonenumberJsStrings.MZ
    - typings.libphonenumberJs.libphonenumberJsStrings.NA
    - typings.libphonenumberJs.libphonenumberJsStrings.NC
    - typings.libphonenumberJs.libphonenumberJsStrings.NE
    - typings.libphonenumberJs.libphonenumberJsStrings.NF
    - typings.libphonenumberJs.libphonenumberJsStrings.NG
    - typings.libphonenumberJs.libphonenumberJsStrings.NI
    - typings.libphonenumberJs.libphonenumberJsStrings.NL
    - typings.libphonenumberJs.libphonenumberJsStrings.NO
    - typings.libphonenumberJs.libphonenumberJsStrings.NP
    - typings.libphonenumberJs.libphonenumberJsStrings.NR
    - typings.libphonenumberJs.libphonenumberJsStrings.NU
    - typings.libphonenumberJs.libphonenumberJsStrings.NZ
    - typings.libphonenumberJs.libphonenumberJsStrings.OM
    - typings.libphonenumberJs.libphonenumberJsStrings.PA
    - typings.libphonenumberJs.libphonenumberJsStrings.PE
    - typings.libphonenumberJs.libphonenumberJsStrings.PF
    - typings.libphonenumberJs.libphonenumberJsStrings.PG
    - typings.libphonenumberJs.libphonenumberJsStrings.PH
    - typings.libphonenumberJs.libphonenumberJsStrings.PK
    - typings.libphonenumberJs.libphonenumberJsStrings.PL
    - typings.libphonenumberJs.libphonenumberJsStrings.PM
    - typings.libphonenumberJs.libphonenumberJsStrings.PR
    - typings.libphonenumberJs.libphonenumberJsStrings.PS
    - typings.libphonenumberJs.libphonenumberJsStrings.PT
    - typings.libphonenumberJs.libphonenumberJsStrings.PW
    - typings.libphonenumberJs.libphonenumberJsStrings.PY
    - typings.libphonenumberJs.libphonenumberJsStrings.QA
    - typings.libphonenumberJs.libphonenumberJsStrings.RE
    - typings.libphonenumberJs.libphonenumberJsStrings.RO
    - typings.libphonenumberJs.libphonenumberJsStrings.RS
    - typings.libphonenumberJs.libphonenumberJsStrings.RU
    - typings.libphonenumberJs.libphonenumberJsStrings.RW
    - typings.libphonenumberJs.libphonenumberJsStrings.SA
    - typings.libphonenumberJs.libphonenumberJsStrings.SB
    - typings.libphonenumberJs.libphonenumberJsStrings.SC
    - typings.libphonenumberJs.libphonenumberJsStrings.SD
    - typings.libphonenumberJs.libphonenumberJsStrings.SE
    - typings.libphonenumberJs.libphonenumberJsStrings.SG
    - typings.libphonenumberJs.libphonenumberJsStrings.SH
    - typings.libphonenumberJs.libphonenumberJsStrings.SI
    - typings.libphonenumberJs.libphonenumberJsStrings.SJ
    - typings.libphonenumberJs.libphonenumberJsStrings.SK
    - typings.libphonenumberJs.libphonenumberJsStrings.SL
    - typings.libphonenumberJs.libphonenumberJsStrings.SM
    - typings.libphonenumberJs.libphonenumberJsStrings.SN
    - typings.libphonenumberJs.libphonenumberJsStrings.SO
    - typings.libphonenumberJs.libphonenumberJsStrings.SR
    - typings.libphonenumberJs.libphonenumberJsStrings.SS
    - typings.libphonenumberJs.libphonenumberJsStrings.ST
    - typings.libphonenumberJs.libphonenumberJsStrings.SV
    - typings.libphonenumberJs.libphonenumberJsStrings.SX
    - typings.libphonenumberJs.libphonenumberJsStrings.SY
    - typings.libphonenumberJs.libphonenumberJsStrings.SZ
    - typings.libphonenumberJs.libphonenumberJsStrings.TA
    - typings.libphonenumberJs.libphonenumberJsStrings.TC
    - typings.libphonenumberJs.libphonenumberJsStrings.TD
    - typings.libphonenumberJs.libphonenumberJsStrings.TG
    - typings.libphonenumberJs.libphonenumberJsStrings.TH
    - typings.libphonenumberJs.libphonenumberJsStrings.TJ
    - typings.libphonenumberJs.libphonenumberJsStrings.TK
    - typings.libphonenumberJs.libphonenumberJsStrings.TL
    - typings.libphonenumberJs.libphonenumberJsStrings.TM
    - typings.libphonenumberJs.libphonenumberJsStrings.TN
    - typings.libphonenumberJs.libphonenumberJsStrings.TO
    - typings.libphonenumberJs.libphonenumberJsStrings.TR
    - typings.libphonenumberJs.libphonenumberJsStrings.TT
    - typings.libphonenumberJs.libphonenumberJsStrings.TV
    - typings.libphonenumberJs.libphonenumberJsStrings.TW
    - typings.libphonenumberJs.libphonenumberJsStrings.TZ
    - typings.libphonenumberJs.libphonenumberJsStrings.UA
    - typings.libphonenumberJs.libphonenumberJsStrings.UG
    - typings.libphonenumberJs.libphonenumberJsStrings.US
    - typings.libphonenumberJs.libphonenumberJsStrings.UY
    - typings.libphonenumberJs.libphonenumberJsStrings.UZ
    - typings.libphonenumberJs.libphonenumberJsStrings.VA
    - typings.libphonenumberJs.libphonenumberJsStrings.VC
    - typings.libphonenumberJs.libphonenumberJsStrings.VE
    - typings.libphonenumberJs.libphonenumberJsStrings.VG
    - typings.libphonenumberJs.libphonenumberJsStrings.VI
    - typings.libphonenumberJs.libphonenumberJsStrings.VN
    - typings.libphonenumberJs.libphonenumberJsStrings.VU
    - typings.libphonenumberJs.libphonenumberJsStrings.WF
    - typings.libphonenumberJs.libphonenumberJsStrings.WS
    - typings.libphonenumberJs.libphonenumberJsStrings.XK
    - typings.libphonenumberJs.libphonenumberJsStrings.YE
    - typings.libphonenumberJs.libphonenumberJsStrings.YT
    - typings.libphonenumberJs.libphonenumberJsStrings.ZA
    - typings.libphonenumberJs.libphonenumberJsStrings.ZM
    - typings.libphonenumberJs.libphonenumberJsStrings.ZW
  */
  trait CountryCode extends StObject
  object CountryCode {
    
    inline def AC: typings.libphonenumberJs.libphonenumberJsStrings.AC = "AC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AC]
    
    inline def AD: typings.libphonenumberJs.libphonenumberJsStrings.AD = "AD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AD]
    
    inline def AE: typings.libphonenumberJs.libphonenumberJsStrings.AE = "AE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AE]
    
    inline def AF: typings.libphonenumberJs.libphonenumberJsStrings.AF = "AF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AF]
    
    inline def AG: typings.libphonenumberJs.libphonenumberJsStrings.AG = "AG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AG]
    
    inline def AI: typings.libphonenumberJs.libphonenumberJsStrings.AI = "AI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AI]
    
    inline def AL: typings.libphonenumberJs.libphonenumberJsStrings.AL = "AL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AL]
    
    inline def AM: typings.libphonenumberJs.libphonenumberJsStrings.AM = "AM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AM]
    
    inline def AO: typings.libphonenumberJs.libphonenumberJsStrings.AO = "AO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AO]
    
    inline def AR: typings.libphonenumberJs.libphonenumberJsStrings.AR = "AR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AR]
    
    inline def AS: typings.libphonenumberJs.libphonenumberJsStrings.AS = "AS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AS]
    
    inline def AT: typings.libphonenumberJs.libphonenumberJsStrings.AT = "AT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AT]
    
    inline def AU: typings.libphonenumberJs.libphonenumberJsStrings.AU = "AU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AU]
    
    inline def AW: typings.libphonenumberJs.libphonenumberJsStrings.AW = "AW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AW]
    
    inline def AX: typings.libphonenumberJs.libphonenumberJsStrings.AX = "AX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AX]
    
    inline def AZ: typings.libphonenumberJs.libphonenumberJsStrings.AZ = "AZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AZ]
    
    inline def BA: typings.libphonenumberJs.libphonenumberJsStrings.BA = "BA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BA]
    
    inline def BB: typings.libphonenumberJs.libphonenumberJsStrings.BB = "BB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BB]
    
    inline def BD: typings.libphonenumberJs.libphonenumberJsStrings.BD = "BD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BD]
    
    inline def BE: typings.libphonenumberJs.libphonenumberJsStrings.BE = "BE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BE]
    
    inline def BF: typings.libphonenumberJs.libphonenumberJsStrings.BF = "BF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BF]
    
    inline def BG: typings.libphonenumberJs.libphonenumberJsStrings.BG = "BG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BG]
    
    inline def BH: typings.libphonenumberJs.libphonenumberJsStrings.BH = "BH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BH]
    
    inline def BI: typings.libphonenumberJs.libphonenumberJsStrings.BI = "BI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BI]
    
    inline def BJ: typings.libphonenumberJs.libphonenumberJsStrings.BJ = "BJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BJ]
    
    inline def BL: typings.libphonenumberJs.libphonenumberJsStrings.BL = "BL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BL]
    
    inline def BM: typings.libphonenumberJs.libphonenumberJsStrings.BM = "BM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BM]
    
    inline def BN: typings.libphonenumberJs.libphonenumberJsStrings.BN = "BN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BN]
    
    inline def BO: typings.libphonenumberJs.libphonenumberJsStrings.BO = "BO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BO]
    
    inline def BQ: typings.libphonenumberJs.libphonenumberJsStrings.BQ = "BQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BQ]
    
    inline def BR: typings.libphonenumberJs.libphonenumberJsStrings.BR = "BR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BR]
    
    inline def BS: typings.libphonenumberJs.libphonenumberJsStrings.BS = "BS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BS]
    
    inline def BT: typings.libphonenumberJs.libphonenumberJsStrings.BT = "BT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BT]
    
    inline def BW: typings.libphonenumberJs.libphonenumberJsStrings.BW = "BW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BW]
    
    inline def BY: typings.libphonenumberJs.libphonenumberJsStrings.BY = "BY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BY]
    
    inline def BZ: typings.libphonenumberJs.libphonenumberJsStrings.BZ = "BZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BZ]
    
    inline def CA: typings.libphonenumberJs.libphonenumberJsStrings.CA = "CA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CA]
    
    inline def CC: typings.libphonenumberJs.libphonenumberJsStrings.CC = "CC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CC]
    
    inline def CD: typings.libphonenumberJs.libphonenumberJsStrings.CD = "CD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CD]
    
    inline def CF: typings.libphonenumberJs.libphonenumberJsStrings.CF = "CF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CF]
    
    inline def CG: typings.libphonenumberJs.libphonenumberJsStrings.CG = "CG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CG]
    
    inline def CH: typings.libphonenumberJs.libphonenumberJsStrings.CH = "CH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CH]
    
    inline def CI: typings.libphonenumberJs.libphonenumberJsStrings.CI = "CI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CI]
    
    inline def CK: typings.libphonenumberJs.libphonenumberJsStrings.CK = "CK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CK]
    
    inline def CL: typings.libphonenumberJs.libphonenumberJsStrings.CL = "CL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CL]
    
    inline def CM: typings.libphonenumberJs.libphonenumberJsStrings.CM = "CM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CM]
    
    inline def CN: typings.libphonenumberJs.libphonenumberJsStrings.CN = "CN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CN]
    
    inline def CO: typings.libphonenumberJs.libphonenumberJsStrings.CO = "CO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CO]
    
    inline def CR: typings.libphonenumberJs.libphonenumberJsStrings.CR = "CR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CR]
    
    inline def CU: typings.libphonenumberJs.libphonenumberJsStrings.CU = "CU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CU]
    
    inline def CV: typings.libphonenumberJs.libphonenumberJsStrings.CV = "CV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CV]
    
    inline def CW: typings.libphonenumberJs.libphonenumberJsStrings.CW = "CW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CW]
    
    inline def CX: typings.libphonenumberJs.libphonenumberJsStrings.CX = "CX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CX]
    
    inline def CY: typings.libphonenumberJs.libphonenumberJsStrings.CY = "CY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CY]
    
    inline def CZ: typings.libphonenumberJs.libphonenumberJsStrings.CZ = "CZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CZ]
    
    inline def DE: typings.libphonenumberJs.libphonenumberJsStrings.DE = "DE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DE]
    
    inline def DJ: typings.libphonenumberJs.libphonenumberJsStrings.DJ = "DJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DJ]
    
    inline def DK: typings.libphonenumberJs.libphonenumberJsStrings.DK = "DK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DK]
    
    inline def DM: typings.libphonenumberJs.libphonenumberJsStrings.DM = "DM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DM]
    
    inline def DO: typings.libphonenumberJs.libphonenumberJsStrings.DO = "DO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DO]
    
    inline def DZ: typings.libphonenumberJs.libphonenumberJsStrings.DZ = "DZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DZ]
    
    inline def EC: typings.libphonenumberJs.libphonenumberJsStrings.EC = "EC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EC]
    
    inline def EE: typings.libphonenumberJs.libphonenumberJsStrings.EE = "EE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EE]
    
    inline def EG: typings.libphonenumberJs.libphonenumberJsStrings.EG = "EG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EG]
    
    inline def EH: typings.libphonenumberJs.libphonenumberJsStrings.EH = "EH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EH]
    
    inline def ER: typings.libphonenumberJs.libphonenumberJsStrings.ER = "ER".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ER]
    
    inline def ES: typings.libphonenumberJs.libphonenumberJsStrings.ES = "ES".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ES]
    
    inline def ET: typings.libphonenumberJs.libphonenumberJsStrings.ET = "ET".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ET]
    
    inline def FI: typings.libphonenumberJs.libphonenumberJsStrings.FI = "FI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FI]
    
    inline def FJ: typings.libphonenumberJs.libphonenumberJsStrings.FJ = "FJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FJ]
    
    inline def FK: typings.libphonenumberJs.libphonenumberJsStrings.FK = "FK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FK]
    
    inline def FM: typings.libphonenumberJs.libphonenumberJsStrings.FM = "FM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FM]
    
    inline def FO: typings.libphonenumberJs.libphonenumberJsStrings.FO = "FO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FO]
    
    inline def FR: typings.libphonenumberJs.libphonenumberJsStrings.FR = "FR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FR]
    
    inline def GA: typings.libphonenumberJs.libphonenumberJsStrings.GA = "GA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GA]
    
    inline def GB: typings.libphonenumberJs.libphonenumberJsStrings.GB = "GB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GB]
    
    inline def GD: typings.libphonenumberJs.libphonenumberJsStrings.GD = "GD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GD]
    
    inline def GE: typings.libphonenumberJs.libphonenumberJsStrings.GE = "GE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GE]
    
    inline def GF: typings.libphonenumberJs.libphonenumberJsStrings.GF = "GF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GF]
    
    inline def GG: typings.libphonenumberJs.libphonenumberJsStrings.GG = "GG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GG]
    
    inline def GH: typings.libphonenumberJs.libphonenumberJsStrings.GH = "GH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GH]
    
    inline def GI: typings.libphonenumberJs.libphonenumberJsStrings.GI = "GI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GI]
    
    inline def GL: typings.libphonenumberJs.libphonenumberJsStrings.GL = "GL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GL]
    
    inline def GM: typings.libphonenumberJs.libphonenumberJsStrings.GM = "GM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GM]
    
    inline def GN: typings.libphonenumberJs.libphonenumberJsStrings.GN = "GN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GN]
    
    inline def GP: typings.libphonenumberJs.libphonenumberJsStrings.GP = "GP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GP]
    
    inline def GQ: typings.libphonenumberJs.libphonenumberJsStrings.GQ = "GQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GQ]
    
    inline def GR: typings.libphonenumberJs.libphonenumberJsStrings.GR = "GR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GR]
    
    inline def GT: typings.libphonenumberJs.libphonenumberJsStrings.GT = "GT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GT]
    
    inline def GU: typings.libphonenumberJs.libphonenumberJsStrings.GU = "GU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GU]
    
    inline def GW: typings.libphonenumberJs.libphonenumberJsStrings.GW = "GW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GW]
    
    inline def GY: typings.libphonenumberJs.libphonenumberJsStrings.GY = "GY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GY]
    
    inline def HK: typings.libphonenumberJs.libphonenumberJsStrings.HK = "HK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HK]
    
    inline def HN: typings.libphonenumberJs.libphonenumberJsStrings.HN = "HN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HN]
    
    inline def HR: typings.libphonenumberJs.libphonenumberJsStrings.HR = "HR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HR]
    
    inline def HT: typings.libphonenumberJs.libphonenumberJsStrings.HT = "HT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HT]
    
    inline def HU: typings.libphonenumberJs.libphonenumberJsStrings.HU = "HU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HU]
    
    inline def ID: typings.libphonenumberJs.libphonenumberJsStrings.ID = "ID".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ID]
    
    inline def IE: typings.libphonenumberJs.libphonenumberJsStrings.IE = "IE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IE]
    
    inline def IL: typings.libphonenumberJs.libphonenumberJsStrings.IL = "IL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IL]
    
    inline def IM: typings.libphonenumberJs.libphonenumberJsStrings.IM = "IM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IM]
    
    inline def IN: typings.libphonenumberJs.libphonenumberJsStrings.IN = "IN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IN]
    
    inline def IO: typings.libphonenumberJs.libphonenumberJsStrings.IO = "IO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IO]
    
    inline def IQ: typings.libphonenumberJs.libphonenumberJsStrings.IQ = "IQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IQ]
    
    inline def IR: typings.libphonenumberJs.libphonenumberJsStrings.IR = "IR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IR]
    
    inline def IS: typings.libphonenumberJs.libphonenumberJsStrings.IS = "IS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IS]
    
    inline def IT: typings.libphonenumberJs.libphonenumberJsStrings.IT = "IT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IT]
    
    inline def JE: typings.libphonenumberJs.libphonenumberJsStrings.JE = "JE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JE]
    
    inline def JM: typings.libphonenumberJs.libphonenumberJsStrings.JM = "JM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JM]
    
    inline def JO: typings.libphonenumberJs.libphonenumberJsStrings.JO = "JO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JO]
    
    inline def JP: typings.libphonenumberJs.libphonenumberJsStrings.JP = "JP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JP]
    
    inline def KE: typings.libphonenumberJs.libphonenumberJsStrings.KE = "KE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KE]
    
    inline def KG: typings.libphonenumberJs.libphonenumberJsStrings.KG = "KG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KG]
    
    inline def KH: typings.libphonenumberJs.libphonenumberJsStrings.KH = "KH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KH]
    
    inline def KI: typings.libphonenumberJs.libphonenumberJsStrings.KI = "KI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KI]
    
    inline def KM: typings.libphonenumberJs.libphonenumberJsStrings.KM = "KM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KM]
    
    inline def KN: typings.libphonenumberJs.libphonenumberJsStrings.KN = "KN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KN]
    
    inline def KP: typings.libphonenumberJs.libphonenumberJsStrings.KP = "KP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KP]
    
    inline def KR: typings.libphonenumberJs.libphonenumberJsStrings.KR = "KR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KR]
    
    inline def KW: typings.libphonenumberJs.libphonenumberJsStrings.KW = "KW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KW]
    
    inline def KY: typings.libphonenumberJs.libphonenumberJsStrings.KY = "KY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KY]
    
    inline def KZ: typings.libphonenumberJs.libphonenumberJsStrings.KZ = "KZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KZ]
    
    inline def LA: typings.libphonenumberJs.libphonenumberJsStrings.LA = "LA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LA]
    
    inline def LB: typings.libphonenumberJs.libphonenumberJsStrings.LB = "LB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LB]
    
    inline def LC: typings.libphonenumberJs.libphonenumberJsStrings.LC = "LC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LC]
    
    inline def LI: typings.libphonenumberJs.libphonenumberJsStrings.LI = "LI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LI]
    
    inline def LK: typings.libphonenumberJs.libphonenumberJsStrings.LK = "LK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LK]
    
    inline def LR: typings.libphonenumberJs.libphonenumberJsStrings.LR = "LR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LR]
    
    inline def LS: typings.libphonenumberJs.libphonenumberJsStrings.LS = "LS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LS]
    
    inline def LT: typings.libphonenumberJs.libphonenumberJsStrings.LT = "LT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LT]
    
    inline def LU: typings.libphonenumberJs.libphonenumberJsStrings.LU = "LU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LU]
    
    inline def LV: typings.libphonenumberJs.libphonenumberJsStrings.LV = "LV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LV]
    
    inline def LY: typings.libphonenumberJs.libphonenumberJsStrings.LY = "LY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LY]
    
    inline def MA: typings.libphonenumberJs.libphonenumberJsStrings.MA = "MA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MA]
    
    inline def MC: typings.libphonenumberJs.libphonenumberJsStrings.MC = "MC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MC]
    
    inline def MD: typings.libphonenumberJs.libphonenumberJsStrings.MD = "MD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MD]
    
    inline def ME: typings.libphonenumberJs.libphonenumberJsStrings.ME = "ME".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ME]
    
    inline def MF: typings.libphonenumberJs.libphonenumberJsStrings.MF = "MF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MF]
    
    inline def MG: typings.libphonenumberJs.libphonenumberJsStrings.MG = "MG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MG]
    
    inline def MH: typings.libphonenumberJs.libphonenumberJsStrings.MH = "MH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MH]
    
    inline def MK: typings.libphonenumberJs.libphonenumberJsStrings.MK = "MK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MK]
    
    inline def ML: typings.libphonenumberJs.libphonenumberJsStrings.ML = "ML".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ML]
    
    inline def MM: typings.libphonenumberJs.libphonenumberJsStrings.MM = "MM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MM]
    
    inline def MN: typings.libphonenumberJs.libphonenumberJsStrings.MN = "MN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MN]
    
    inline def MO: typings.libphonenumberJs.libphonenumberJsStrings.MO = "MO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MO]
    
    inline def MP: typings.libphonenumberJs.libphonenumberJsStrings.MP = "MP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MP]
    
    inline def MQ: typings.libphonenumberJs.libphonenumberJsStrings.MQ = "MQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MQ]
    
    inline def MR: typings.libphonenumberJs.libphonenumberJsStrings.MR = "MR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MR]
    
    inline def MS: typings.libphonenumberJs.libphonenumberJsStrings.MS = "MS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MS]
    
    inline def MT: typings.libphonenumberJs.libphonenumberJsStrings.MT = "MT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MT]
    
    inline def MU: typings.libphonenumberJs.libphonenumberJsStrings.MU = "MU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MU]
    
    inline def MV: typings.libphonenumberJs.libphonenumberJsStrings.MV = "MV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MV]
    
    inline def MW: typings.libphonenumberJs.libphonenumberJsStrings.MW = "MW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MW]
    
    inline def MX: typings.libphonenumberJs.libphonenumberJsStrings.MX = "MX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MX]
    
    inline def MY: typings.libphonenumberJs.libphonenumberJsStrings.MY = "MY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MY]
    
    inline def MZ: typings.libphonenumberJs.libphonenumberJsStrings.MZ = "MZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MZ]
    
    inline def NA: typings.libphonenumberJs.libphonenumberJsStrings.NA = "NA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NA]
    
    inline def NC: typings.libphonenumberJs.libphonenumberJsStrings.NC = "NC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NC]
    
    inline def NE: typings.libphonenumberJs.libphonenumberJsStrings.NE = "NE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NE]
    
    inline def NF: typings.libphonenumberJs.libphonenumberJsStrings.NF = "NF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NF]
    
    inline def NG: typings.libphonenumberJs.libphonenumberJsStrings.NG = "NG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NG]
    
    inline def NI: typings.libphonenumberJs.libphonenumberJsStrings.NI = "NI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NI]
    
    inline def NL: typings.libphonenumberJs.libphonenumberJsStrings.NL = "NL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NL]
    
    inline def NO: typings.libphonenumberJs.libphonenumberJsStrings.NO = "NO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NO]
    
    inline def NP: typings.libphonenumberJs.libphonenumberJsStrings.NP = "NP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NP]
    
    inline def NR: typings.libphonenumberJs.libphonenumberJsStrings.NR = "NR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NR]
    
    inline def NU: typings.libphonenumberJs.libphonenumberJsStrings.NU = "NU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NU]
    
    inline def NZ: typings.libphonenumberJs.libphonenumberJsStrings.NZ = "NZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NZ]
    
    inline def OM: typings.libphonenumberJs.libphonenumberJsStrings.OM = "OM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.OM]
    
    inline def PA: typings.libphonenumberJs.libphonenumberJsStrings.PA = "PA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PA]
    
    inline def PE: typings.libphonenumberJs.libphonenumberJsStrings.PE = "PE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PE]
    
    inline def PF: typings.libphonenumberJs.libphonenumberJsStrings.PF = "PF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PF]
    
    inline def PG: typings.libphonenumberJs.libphonenumberJsStrings.PG = "PG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PG]
    
    inline def PH: typings.libphonenumberJs.libphonenumberJsStrings.PH = "PH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PH]
    
    inline def PK: typings.libphonenumberJs.libphonenumberJsStrings.PK = "PK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PK]
    
    inline def PL: typings.libphonenumberJs.libphonenumberJsStrings.PL = "PL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PL]
    
    inline def PM: typings.libphonenumberJs.libphonenumberJsStrings.PM = "PM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PM]
    
    inline def PR: typings.libphonenumberJs.libphonenumberJsStrings.PR = "PR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PR]
    
    inline def PS: typings.libphonenumberJs.libphonenumberJsStrings.PS = "PS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PS]
    
    inline def PT: typings.libphonenumberJs.libphonenumberJsStrings.PT = "PT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PT]
    
    inline def PW: typings.libphonenumberJs.libphonenumberJsStrings.PW = "PW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PW]
    
    inline def PY: typings.libphonenumberJs.libphonenumberJsStrings.PY = "PY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PY]
    
    inline def QA: typings.libphonenumberJs.libphonenumberJsStrings.QA = "QA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.QA]
    
    inline def RE: typings.libphonenumberJs.libphonenumberJsStrings.RE = "RE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RE]
    
    inline def RO: typings.libphonenumberJs.libphonenumberJsStrings.RO = "RO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RO]
    
    inline def RS: typings.libphonenumberJs.libphonenumberJsStrings.RS = "RS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RS]
    
    inline def RU: typings.libphonenumberJs.libphonenumberJsStrings.RU = "RU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RU]
    
    inline def RW: typings.libphonenumberJs.libphonenumberJsStrings.RW = "RW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RW]
    
    inline def SA: typings.libphonenumberJs.libphonenumberJsStrings.SA = "SA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SA]
    
    inline def SB: typings.libphonenumberJs.libphonenumberJsStrings.SB = "SB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SB]
    
    inline def SC: typings.libphonenumberJs.libphonenumberJsStrings.SC = "SC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SC]
    
    inline def SD: typings.libphonenumberJs.libphonenumberJsStrings.SD = "SD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SD]
    
    inline def SE: typings.libphonenumberJs.libphonenumberJsStrings.SE = "SE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SE]
    
    inline def SG: typings.libphonenumberJs.libphonenumberJsStrings.SG = "SG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SG]
    
    inline def SH: typings.libphonenumberJs.libphonenumberJsStrings.SH = "SH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SH]
    
    inline def SI: typings.libphonenumberJs.libphonenumberJsStrings.SI = "SI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SI]
    
    inline def SJ: typings.libphonenumberJs.libphonenumberJsStrings.SJ = "SJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SJ]
    
    inline def SK: typings.libphonenumberJs.libphonenumberJsStrings.SK = "SK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SK]
    
    inline def SL: typings.libphonenumberJs.libphonenumberJsStrings.SL = "SL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SL]
    
    inline def SM: typings.libphonenumberJs.libphonenumberJsStrings.SM = "SM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SM]
    
    inline def SN: typings.libphonenumberJs.libphonenumberJsStrings.SN = "SN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SN]
    
    inline def SO: typings.libphonenumberJs.libphonenumberJsStrings.SO = "SO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SO]
    
    inline def SR: typings.libphonenumberJs.libphonenumberJsStrings.SR = "SR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SR]
    
    inline def SS: typings.libphonenumberJs.libphonenumberJsStrings.SS = "SS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SS]
    
    inline def ST: typings.libphonenumberJs.libphonenumberJsStrings.ST = "ST".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ST]
    
    inline def SV: typings.libphonenumberJs.libphonenumberJsStrings.SV = "SV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SV]
    
    inline def SX: typings.libphonenumberJs.libphonenumberJsStrings.SX = "SX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SX]
    
    inline def SY: typings.libphonenumberJs.libphonenumberJsStrings.SY = "SY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SY]
    
    inline def SZ: typings.libphonenumberJs.libphonenumberJsStrings.SZ = "SZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SZ]
    
    inline def TA: typings.libphonenumberJs.libphonenumberJsStrings.TA = "TA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TA]
    
    inline def TC: typings.libphonenumberJs.libphonenumberJsStrings.TC = "TC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TC]
    
    inline def TD: typings.libphonenumberJs.libphonenumberJsStrings.TD = "TD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TD]
    
    inline def TG: typings.libphonenumberJs.libphonenumberJsStrings.TG = "TG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TG]
    
    inline def TH: typings.libphonenumberJs.libphonenumberJsStrings.TH = "TH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TH]
    
    inline def TJ: typings.libphonenumberJs.libphonenumberJsStrings.TJ = "TJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TJ]
    
    inline def TK: typings.libphonenumberJs.libphonenumberJsStrings.TK = "TK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TK]
    
    inline def TL: typings.libphonenumberJs.libphonenumberJsStrings.TL = "TL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TL]
    
    inline def TM: typings.libphonenumberJs.libphonenumberJsStrings.TM = "TM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TM]
    
    inline def TN: typings.libphonenumberJs.libphonenumberJsStrings.TN = "TN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TN]
    
    inline def TO: typings.libphonenumberJs.libphonenumberJsStrings.TO = "TO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TO]
    
    inline def TR: typings.libphonenumberJs.libphonenumberJsStrings.TR = "TR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TR]
    
    inline def TT: typings.libphonenumberJs.libphonenumberJsStrings.TT = "TT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TT]
    
    inline def TV: typings.libphonenumberJs.libphonenumberJsStrings.TV = "TV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TV]
    
    inline def TW: typings.libphonenumberJs.libphonenumberJsStrings.TW = "TW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TW]
    
    inline def TZ: typings.libphonenumberJs.libphonenumberJsStrings.TZ = "TZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TZ]
    
    inline def UA: typings.libphonenumberJs.libphonenumberJsStrings.UA = "UA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UA]
    
    inline def UG: typings.libphonenumberJs.libphonenumberJsStrings.UG = "UG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UG]
    
    inline def US: typings.libphonenumberJs.libphonenumberJsStrings.US = "US".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.US]
    
    inline def UY: typings.libphonenumberJs.libphonenumberJsStrings.UY = "UY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UY]
    
    inline def UZ: typings.libphonenumberJs.libphonenumberJsStrings.UZ = "UZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UZ]
    
    inline def VA: typings.libphonenumberJs.libphonenumberJsStrings.VA = "VA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VA]
    
    inline def VC: typings.libphonenumberJs.libphonenumberJsStrings.VC = "VC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VC]
    
    inline def VE: typings.libphonenumberJs.libphonenumberJsStrings.VE = "VE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VE]
    
    inline def VG: typings.libphonenumberJs.libphonenumberJsStrings.VG = "VG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VG]
    
    inline def VI: typings.libphonenumberJs.libphonenumberJsStrings.VI = "VI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VI]
    
    inline def VN: typings.libphonenumberJs.libphonenumberJsStrings.VN = "VN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VN]
    
    inline def VU: typings.libphonenumberJs.libphonenumberJsStrings.VU = "VU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VU]
    
    inline def WF: typings.libphonenumberJs.libphonenumberJsStrings.WF = "WF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.WF]
    
    inline def WS: typings.libphonenumberJs.libphonenumberJsStrings.WS = "WS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.WS]
    
    inline def XK: typings.libphonenumberJs.libphonenumberJsStrings.XK = "XK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.XK]
    
    inline def YE: typings.libphonenumberJs.libphonenumberJsStrings.YE = "YE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.YE]
    
    inline def YT: typings.libphonenumberJs.libphonenumberJsStrings.YT = "YT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.YT]
    
    inline def ZA: typings.libphonenumberJs.libphonenumberJsStrings.ZA = "ZA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZA]
    
    inline def ZM: typings.libphonenumberJs.libphonenumberJsStrings.ZM = "ZM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZM]
    
    inline def ZW: typings.libphonenumberJs.libphonenumberJsStrings.ZW = "ZW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZW]
  }
  
  type E164Number = Tagged[String, typings.libphonenumberJs.libphonenumberJsStrings.E164Number]
  
  /* Inlined {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: libphonenumber-js.libphonenumber-js/types.NationalNumber} */
  trait Examples extends StObject {
    
    var AC: NationalNumber
    
    var AD: NationalNumber
    
    var AE: NationalNumber
    
    var AF: NationalNumber
    
    var AG: NationalNumber
    
    var AI: NationalNumber
    
    var AL: NationalNumber
    
    var AM: NationalNumber
    
    var AO: NationalNumber
    
    var AR: NationalNumber
    
    var AS: NationalNumber
    
    var AT: NationalNumber
    
    var AU: NationalNumber
    
    var AW: NationalNumber
    
    var AX: NationalNumber
    
    var AZ: NationalNumber
    
    var BA: NationalNumber
    
    var BB: NationalNumber
    
    var BD: NationalNumber
    
    var BE: NationalNumber
    
    var BF: NationalNumber
    
    var BG: NationalNumber
    
    var BH: NationalNumber
    
    var BI: NationalNumber
    
    var BJ: NationalNumber
    
    var BL: NationalNumber
    
    var BM: NationalNumber
    
    var BN: NationalNumber
    
    var BO: NationalNumber
    
    var BQ: NationalNumber
    
    var BR: NationalNumber
    
    var BS: NationalNumber
    
    var BT: NationalNumber
    
    var BW: NationalNumber
    
    var BY: NationalNumber
    
    var BZ: NationalNumber
    
    var CA: NationalNumber
    
    var CC: NationalNumber
    
    var CD: NationalNumber
    
    var CF: NationalNumber
    
    var CG: NationalNumber
    
    var CH: NationalNumber
    
    var CI: NationalNumber
    
    var CK: NationalNumber
    
    var CL: NationalNumber
    
    var CM: NationalNumber
    
    var CN: NationalNumber
    
    var CO: NationalNumber
    
    var CR: NationalNumber
    
    var CU: NationalNumber
    
    var CV: NationalNumber
    
    var CW: NationalNumber
    
    var CX: NationalNumber
    
    var CY: NationalNumber
    
    var CZ: NationalNumber
    
    var DE: NationalNumber
    
    var DJ: NationalNumber
    
    var DK: NationalNumber
    
    var DM: NationalNumber
    
    var DO: NationalNumber
    
    var DZ: NationalNumber
    
    var EC: NationalNumber
    
    var EE: NationalNumber
    
    var EG: NationalNumber
    
    var EH: NationalNumber
    
    var ER: NationalNumber
    
    var ES: NationalNumber
    
    var ET: NationalNumber
    
    var FI: NationalNumber
    
    var FJ: NationalNumber
    
    var FK: NationalNumber
    
    var FM: NationalNumber
    
    var FO: NationalNumber
    
    var FR: NationalNumber
    
    var GA: NationalNumber
    
    var GB: NationalNumber
    
    var GD: NationalNumber
    
    var GE: NationalNumber
    
    var GF: NationalNumber
    
    var GG: NationalNumber
    
    var GH: NationalNumber
    
    var GI: NationalNumber
    
    var GL: NationalNumber
    
    var GM: NationalNumber
    
    var GN: NationalNumber
    
    var GP: NationalNumber
    
    var GQ: NationalNumber
    
    var GR: NationalNumber
    
    var GT: NationalNumber
    
    var GU: NationalNumber
    
    var GW: NationalNumber
    
    var GY: NationalNumber
    
    var HK: NationalNumber
    
    var HN: NationalNumber
    
    var HR: NationalNumber
    
    var HT: NationalNumber
    
    var HU: NationalNumber
    
    var ID: NationalNumber
    
    var IE: NationalNumber
    
    var IL: NationalNumber
    
    var IM: NationalNumber
    
    var IN: NationalNumber
    
    var IO: NationalNumber
    
    var IQ: NationalNumber
    
    var IR: NationalNumber
    
    var IS: NationalNumber
    
    var IT: NationalNumber
    
    var JE: NationalNumber
    
    var JM: NationalNumber
    
    var JO: NationalNumber
    
    var JP: NationalNumber
    
    var KE: NationalNumber
    
    var KG: NationalNumber
    
    var KH: NationalNumber
    
    var KI: NationalNumber
    
    var KM: NationalNumber
    
    var KN: NationalNumber
    
    var KP: NationalNumber
    
    var KR: NationalNumber
    
    var KW: NationalNumber
    
    var KY: NationalNumber
    
    var KZ: NationalNumber
    
    var LA: NationalNumber
    
    var LB: NationalNumber
    
    var LC: NationalNumber
    
    var LI: NationalNumber
    
    var LK: NationalNumber
    
    var LR: NationalNumber
    
    var LS: NationalNumber
    
    var LT: NationalNumber
    
    var LU: NationalNumber
    
    var LV: NationalNumber
    
    var LY: NationalNumber
    
    var MA: NationalNumber
    
    var MC: NationalNumber
    
    var MD: NationalNumber
    
    var ME: NationalNumber
    
    var MF: NationalNumber
    
    var MG: NationalNumber
    
    var MH: NationalNumber
    
    var MK: NationalNumber
    
    var ML: NationalNumber
    
    var MM: NationalNumber
    
    var MN: NationalNumber
    
    var MO: NationalNumber
    
    var MP: NationalNumber
    
    var MQ: NationalNumber
    
    var MR: NationalNumber
    
    var MS: NationalNumber
    
    var MT: NationalNumber
    
    var MU: NationalNumber
    
    var MV: NationalNumber
    
    var MW: NationalNumber
    
    var MX: NationalNumber
    
    var MY: NationalNumber
    
    var MZ: NationalNumber
    
    var NA: NationalNumber
    
    var NC: NationalNumber
    
    var NE: NationalNumber
    
    var NF: NationalNumber
    
    var NG: NationalNumber
    
    var NI: NationalNumber
    
    var NL: NationalNumber
    
    var NO: NationalNumber
    
    var NP: NationalNumber
    
    var NR: NationalNumber
    
    var NU: NationalNumber
    
    var NZ: NationalNumber
    
    var OM: NationalNumber
    
    var PA: NationalNumber
    
    var PE: NationalNumber
    
    var PF: NationalNumber
    
    var PG: NationalNumber
    
    var PH: NationalNumber
    
    var PK: NationalNumber
    
    var PL: NationalNumber
    
    var PM: NationalNumber
    
    var PR: NationalNumber
    
    var PS: NationalNumber
    
    var PT: NationalNumber
    
    var PW: NationalNumber
    
    var PY: NationalNumber
    
    var QA: NationalNumber
    
    var RE: NationalNumber
    
    var RO: NationalNumber
    
    var RS: NationalNumber
    
    var RU: NationalNumber
    
    var RW: NationalNumber
    
    var SA: NationalNumber
    
    var SB: NationalNumber
    
    var SC: NationalNumber
    
    var SD: NationalNumber
    
    var SE: NationalNumber
    
    var SG: NationalNumber
    
    var SH: NationalNumber
    
    var SI: NationalNumber
    
    var SJ: NationalNumber
    
    var SK: NationalNumber
    
    var SL: NationalNumber
    
    var SM: NationalNumber
    
    var SN: NationalNumber
    
    var SO: NationalNumber
    
    var SR: NationalNumber
    
    var SS: NationalNumber
    
    var ST: NationalNumber
    
    var SV: NationalNumber
    
    var SX: NationalNumber
    
    var SY: NationalNumber
    
    var SZ: NationalNumber
    
    var TA: NationalNumber
    
    var TC: NationalNumber
    
    var TD: NationalNumber
    
    var TG: NationalNumber
    
    var TH: NationalNumber
    
    var TJ: NationalNumber
    
    var TK: NationalNumber
    
    var TL: NationalNumber
    
    var TM: NationalNumber
    
    var TN: NationalNumber
    
    var TO: NationalNumber
    
    var TR: NationalNumber
    
    var TT: NationalNumber
    
    var TV: NationalNumber
    
    var TW: NationalNumber
    
    var TZ: NationalNumber
    
    var UA: NationalNumber
    
    var UG: NationalNumber
    
    var US: NationalNumber
    
    var UY: NationalNumber
    
    var UZ: NationalNumber
    
    var VA: NationalNumber
    
    var VC: NationalNumber
    
    var VE: NationalNumber
    
    var VG: NationalNumber
    
    var VI: NationalNumber
    
    var VN: NationalNumber
    
    var VU: NationalNumber
    
    var WF: NationalNumber
    
    var WS: NationalNumber
    
    var XK: NationalNumber
    
    var YE: NationalNumber
    
    var YT: NationalNumber
    
    var ZA: NationalNumber
    
    var ZM: NationalNumber
    
    var ZW: NationalNumber
  }
  object Examples {
    
    inline def apply(
      AC: NationalNumber,
      AD: NationalNumber,
      AE: NationalNumber,
      AF: NationalNumber,
      AG: NationalNumber,
      AI: NationalNumber,
      AL: NationalNumber,
      AM: NationalNumber,
      AO: NationalNumber,
      AR: NationalNumber,
      AS: NationalNumber,
      AT: NationalNumber,
      AU: NationalNumber,
      AW: NationalNumber,
      AX: NationalNumber,
      AZ: NationalNumber,
      BA: NationalNumber,
      BB: NationalNumber,
      BD: NationalNumber,
      BE: NationalNumber,
      BF: NationalNumber,
      BG: NationalNumber,
      BH: NationalNumber,
      BI: NationalNumber,
      BJ: NationalNumber,
      BL: NationalNumber,
      BM: NationalNumber,
      BN: NationalNumber,
      BO: NationalNumber,
      BQ: NationalNumber,
      BR: NationalNumber,
      BS: NationalNumber,
      BT: NationalNumber,
      BW: NationalNumber,
      BY: NationalNumber,
      BZ: NationalNumber,
      CA: NationalNumber,
      CC: NationalNumber,
      CD: NationalNumber,
      CF: NationalNumber,
      CG: NationalNumber,
      CH: NationalNumber,
      CI: NationalNumber,
      CK: NationalNumber,
      CL: NationalNumber,
      CM: NationalNumber,
      CN: NationalNumber,
      CO: NationalNumber,
      CR: NationalNumber,
      CU: NationalNumber,
      CV: NationalNumber,
      CW: NationalNumber,
      CX: NationalNumber,
      CY: NationalNumber,
      CZ: NationalNumber,
      DE: NationalNumber,
      DJ: NationalNumber,
      DK: NationalNumber,
      DM: NationalNumber,
      DO: NationalNumber,
      DZ: NationalNumber,
      EC: NationalNumber,
      EE: NationalNumber,
      EG: NationalNumber,
      EH: NationalNumber,
      ER: NationalNumber,
      ES: NationalNumber,
      ET: NationalNumber,
      FI: NationalNumber,
      FJ: NationalNumber,
      FK: NationalNumber,
      FM: NationalNumber,
      FO: NationalNumber,
      FR: NationalNumber,
      GA: NationalNumber,
      GB: NationalNumber,
      GD: NationalNumber,
      GE: NationalNumber,
      GF: NationalNumber,
      GG: NationalNumber,
      GH: NationalNumber,
      GI: NationalNumber,
      GL: NationalNumber,
      GM: NationalNumber,
      GN: NationalNumber,
      GP: NationalNumber,
      GQ: NationalNumber,
      GR: NationalNumber,
      GT: NationalNumber,
      GU: NationalNumber,
      GW: NationalNumber,
      GY: NationalNumber,
      HK: NationalNumber,
      HN: NationalNumber,
      HR: NationalNumber,
      HT: NationalNumber,
      HU: NationalNumber,
      ID: NationalNumber,
      IE: NationalNumber,
      IL: NationalNumber,
      IM: NationalNumber,
      IN: NationalNumber,
      IO: NationalNumber,
      IQ: NationalNumber,
      IR: NationalNumber,
      IS: NationalNumber,
      IT: NationalNumber,
      JE: NationalNumber,
      JM: NationalNumber,
      JO: NationalNumber,
      JP: NationalNumber,
      KE: NationalNumber,
      KG: NationalNumber,
      KH: NationalNumber,
      KI: NationalNumber,
      KM: NationalNumber,
      KN: NationalNumber,
      KP: NationalNumber,
      KR: NationalNumber,
      KW: NationalNumber,
      KY: NationalNumber,
      KZ: NationalNumber,
      LA: NationalNumber,
      LB: NationalNumber,
      LC: NationalNumber,
      LI: NationalNumber,
      LK: NationalNumber,
      LR: NationalNumber,
      LS: NationalNumber,
      LT: NationalNumber,
      LU: NationalNumber,
      LV: NationalNumber,
      LY: NationalNumber,
      MA: NationalNumber,
      MC: NationalNumber,
      MD: NationalNumber,
      ME: NationalNumber,
      MF: NationalNumber,
      MG: NationalNumber,
      MH: NationalNumber,
      MK: NationalNumber,
      ML: NationalNumber,
      MM: NationalNumber,
      MN: NationalNumber,
      MO: NationalNumber,
      MP: NationalNumber,
      MQ: NationalNumber,
      MR: NationalNumber,
      MS: NationalNumber,
      MT: NationalNumber,
      MU: NationalNumber,
      MV: NationalNumber,
      MW: NationalNumber,
      MX: NationalNumber,
      MY: NationalNumber,
      MZ: NationalNumber,
      NA: NationalNumber,
      NC: NationalNumber,
      NE: NationalNumber,
      NF: NationalNumber,
      NG: NationalNumber,
      NI: NationalNumber,
      NL: NationalNumber,
      NO: NationalNumber,
      NP: NationalNumber,
      NR: NationalNumber,
      NU: NationalNumber,
      NZ: NationalNumber,
      OM: NationalNumber,
      PA: NationalNumber,
      PE: NationalNumber,
      PF: NationalNumber,
      PG: NationalNumber,
      PH: NationalNumber,
      PK: NationalNumber,
      PL: NationalNumber,
      PM: NationalNumber,
      PR: NationalNumber,
      PS: NationalNumber,
      PT: NationalNumber,
      PW: NationalNumber,
      PY: NationalNumber,
      QA: NationalNumber,
      RE: NationalNumber,
      RO: NationalNumber,
      RS: NationalNumber,
      RU: NationalNumber,
      RW: NationalNumber,
      SA: NationalNumber,
      SB: NationalNumber,
      SC: NationalNumber,
      SD: NationalNumber,
      SE: NationalNumber,
      SG: NationalNumber,
      SH: NationalNumber,
      SI: NationalNumber,
      SJ: NationalNumber,
      SK: NationalNumber,
      SL: NationalNumber,
      SM: NationalNumber,
      SN: NationalNumber,
      SO: NationalNumber,
      SR: NationalNumber,
      SS: NationalNumber,
      ST: NationalNumber,
      SV: NationalNumber,
      SX: NationalNumber,
      SY: NationalNumber,
      SZ: NationalNumber,
      TA: NationalNumber,
      TC: NationalNumber,
      TD: NationalNumber,
      TG: NationalNumber,
      TH: NationalNumber,
      TJ: NationalNumber,
      TK: NationalNumber,
      TL: NationalNumber,
      TM: NationalNumber,
      TN: NationalNumber,
      TO: NationalNumber,
      TR: NationalNumber,
      TT: NationalNumber,
      TV: NationalNumber,
      TW: NationalNumber,
      TZ: NationalNumber,
      UA: NationalNumber,
      UG: NationalNumber,
      US: NationalNumber,
      UY: NationalNumber,
      UZ: NationalNumber,
      VA: NationalNumber,
      VC: NationalNumber,
      VE: NationalNumber,
      VG: NationalNumber,
      VI: NationalNumber,
      VN: NationalNumber,
      VU: NationalNumber,
      WF: NationalNumber,
      WS: NationalNumber,
      XK: NationalNumber,
      YE: NationalNumber,
      YT: NationalNumber,
      ZA: NationalNumber,
      ZM: NationalNumber,
      ZW: NationalNumber
    ): Examples = {
      val __obj = js.Dynamic.literal(AC = AC.asInstanceOf[js.Any], AD = AD.asInstanceOf[js.Any], AE = AE.asInstanceOf[js.Any], AF = AF.asInstanceOf[js.Any], AG = AG.asInstanceOf[js.Any], AI = AI.asInstanceOf[js.Any], AL = AL.asInstanceOf[js.Any], AM = AM.asInstanceOf[js.Any], AO = AO.asInstanceOf[js.Any], AR = AR.asInstanceOf[js.Any], AS = AS.asInstanceOf[js.Any], AT = AT.asInstanceOf[js.Any], AU = AU.asInstanceOf[js.Any], AW = AW.asInstanceOf[js.Any], AX = AX.asInstanceOf[js.Any], AZ = AZ.asInstanceOf[js.Any], BA = BA.asInstanceOf[js.Any], BB = BB.asInstanceOf[js.Any], BD = BD.asInstanceOf[js.Any], BE = BE.asInstanceOf[js.Any], BF = BF.asInstanceOf[js.Any], BG = BG.asInstanceOf[js.Any], BH = BH.asInstanceOf[js.Any], BI = BI.asInstanceOf[js.Any], BJ = BJ.asInstanceOf[js.Any], BL = BL.asInstanceOf[js.Any], BM = BM.asInstanceOf[js.Any], BN = BN.asInstanceOf[js.Any], BO = BO.asInstanceOf[js.Any], BQ = BQ.asInstanceOf[js.Any], BR = BR.asInstanceOf[js.Any], BS = BS.asInstanceOf[js.Any], BT = BT.asInstanceOf[js.Any], BW = BW.asInstanceOf[js.Any], BY = BY.asInstanceOf[js.Any], BZ = BZ.asInstanceOf[js.Any], CA = CA.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], CD = CD.asInstanceOf[js.Any], CF = CF.asInstanceOf[js.Any], CG = CG.asInstanceOf[js.Any], CH = CH.asInstanceOf[js.Any], CI = CI.asInstanceOf[js.Any], CK = CK.asInstanceOf[js.Any], CL = CL.asInstanceOf[js.Any], CM = CM.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], CO = CO.asInstanceOf[js.Any], CR = CR.asInstanceOf[js.Any], CU = CU.asInstanceOf[js.Any], CV = CV.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any], CX = CX.asInstanceOf[js.Any], CY = CY.asInstanceOf[js.Any], CZ = CZ.asInstanceOf[js.Any], DE = DE.asInstanceOf[js.Any], DJ = DJ.asInstanceOf[js.Any], DK = DK.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DO = DO.asInstanceOf[js.Any], DZ = DZ.asInstanceOf[js.Any], EC = EC.asInstanceOf[js.Any], EE = EE.asInstanceOf[js.Any], EG = EG.asInstanceOf[js.Any], EH = EH.asInstanceOf[js.Any], ER = ER.asInstanceOf[js.Any], ES = ES.asInstanceOf[js.Any], ET = ET.asInstanceOf[js.Any], FI = FI.asInstanceOf[js.Any], FJ = FJ.asInstanceOf[js.Any], FK = FK.asInstanceOf[js.Any], FM = FM.asInstanceOf[js.Any], FO = FO.asInstanceOf[js.Any], FR = FR.asInstanceOf[js.Any], GA = GA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], GD = GD.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GF = GF.asInstanceOf[js.Any], GG = GG.asInstanceOf[js.Any], GH = GH.asInstanceOf[js.Any], GI = GI.asInstanceOf[js.Any], GL = GL.asInstanceOf[js.Any], GM = GM.asInstanceOf[js.Any], GN = GN.asInstanceOf[js.Any], GP = GP.asInstanceOf[js.Any], GQ = GQ.asInstanceOf[js.Any], GR = GR.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], GU = GU.asInstanceOf[js.Any], GW = GW.asInstanceOf[js.Any], GY = GY.asInstanceOf[js.Any], HK = HK.asInstanceOf[js.Any], HN = HN.asInstanceOf[js.Any], HR = HR.asInstanceOf[js.Any], HT = HT.asInstanceOf[js.Any], HU = HU.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], IL = IL.asInstanceOf[js.Any], IM = IM.asInstanceOf[js.Any], IN = IN.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], IQ = IQ.asInstanceOf[js.Any], IR = IR.asInstanceOf[js.Any], IS = IS.asInstanceOf[js.Any], IT = IT.asInstanceOf[js.Any], JE = JE.asInstanceOf[js.Any], JM = JM.asInstanceOf[js.Any], JO = JO.asInstanceOf[js.Any], JP = JP.asInstanceOf[js.Any], KE = KE.asInstanceOf[js.Any], KG = KG.asInstanceOf[js.Any], KH = KH.asInstanceOf[js.Any], KI = KI.asInstanceOf[js.Any], KM = KM.asInstanceOf[js.Any], KN = KN.asInstanceOf[js.Any], KP = KP.asInstanceOf[js.Any], KR = KR.asInstanceOf[js.Any], KW = KW.asInstanceOf[js.Any], KY = KY.asInstanceOf[js.Any], KZ = KZ.asInstanceOf[js.Any], LA = LA.asInstanceOf[js.Any], LB = LB.asInstanceOf[js.Any], LC = LC.asInstanceOf[js.Any], LI = LI.asInstanceOf[js.Any], LK = LK.asInstanceOf[js.Any], LR = LR.asInstanceOf[js.Any], LS = LS.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LU = LU.asInstanceOf[js.Any], LV = LV.asInstanceOf[js.Any], LY = LY.asInstanceOf[js.Any], MA = MA.asInstanceOf[js.Any], MC = MC.asInstanceOf[js.Any], MD = MD.asInstanceOf[js.Any], ME = ME.asInstanceOf[js.Any], MF = MF.asInstanceOf[js.Any], MG = MG.asInstanceOf[js.Any], MH = MH.asInstanceOf[js.Any], MK = MK.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MN = MN.asInstanceOf[js.Any], MO = MO.asInstanceOf[js.Any], MP = MP.asInstanceOf[js.Any], MQ = MQ.asInstanceOf[js.Any], MR = MR.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any], MT = MT.asInstanceOf[js.Any], MU = MU.asInstanceOf[js.Any], MV = MV.asInstanceOf[js.Any], MW = MW.asInstanceOf[js.Any], MX = MX.asInstanceOf[js.Any], MY = MY.asInstanceOf[js.Any], MZ = MZ.asInstanceOf[js.Any], NA = NA.asInstanceOf[js.Any], NC = NC.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], NF = NF.asInstanceOf[js.Any], NG = NG.asInstanceOf[js.Any], NI = NI.asInstanceOf[js.Any], NL = NL.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], NP = NP.asInstanceOf[js.Any], NR = NR.asInstanceOf[js.Any], NU = NU.asInstanceOf[js.Any], NZ = NZ.asInstanceOf[js.Any], OM = OM.asInstanceOf[js.Any], PA = PA.asInstanceOf[js.Any], PE = PE.asInstanceOf[js.Any], PF = PF.asInstanceOf[js.Any], PG = PG.asInstanceOf[js.Any], PH = PH.asInstanceOf[js.Any], PK = PK.asInstanceOf[js.Any], PL = PL.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], PR = PR.asInstanceOf[js.Any], PS = PS.asInstanceOf[js.Any], PT = PT.asInstanceOf[js.Any], PW = PW.asInstanceOf[js.Any], PY = PY.asInstanceOf[js.Any], QA = QA.asInstanceOf[js.Any], RE = RE.asInstanceOf[js.Any], RO = RO.asInstanceOf[js.Any], RS = RS.asInstanceOf[js.Any], RU = RU.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], SA = SA.asInstanceOf[js.Any], SB = SB.asInstanceOf[js.Any], SC = SC.asInstanceOf[js.Any], SD = SD.asInstanceOf[js.Any], SE = SE.asInstanceOf[js.Any], SG = SG.asInstanceOf[js.Any], SH = SH.asInstanceOf[js.Any], SI = SI.asInstanceOf[js.Any], SJ = SJ.asInstanceOf[js.Any], SK = SK.asInstanceOf[js.Any], SL = SL.asInstanceOf[js.Any], SM = SM.asInstanceOf[js.Any], SN = SN.asInstanceOf[js.Any], SO = SO.asInstanceOf[js.Any], SR = SR.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any], SV = SV.asInstanceOf[js.Any], SX = SX.asInstanceOf[js.Any], SY = SY.asInstanceOf[js.Any], SZ = SZ.asInstanceOf[js.Any], TA = TA.asInstanceOf[js.Any], TC = TC.asInstanceOf[js.Any], TD = TD.asInstanceOf[js.Any], TG = TG.asInstanceOf[js.Any], TH = TH.asInstanceOf[js.Any], TJ = TJ.asInstanceOf[js.Any], TK = TK.asInstanceOf[js.Any], TL = TL.asInstanceOf[js.Any], TM = TM.asInstanceOf[js.Any], TN = TN.asInstanceOf[js.Any], TO = TO.asInstanceOf[js.Any], TR = TR.asInstanceOf[js.Any], TT = TT.asInstanceOf[js.Any], TV = TV.asInstanceOf[js.Any], TW = TW.asInstanceOf[js.Any], TZ = TZ.asInstanceOf[js.Any], UA = UA.asInstanceOf[js.Any], UG = UG.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any], UY = UY.asInstanceOf[js.Any], UZ = UZ.asInstanceOf[js.Any], VA = VA.asInstanceOf[js.Any], VC = VC.asInstanceOf[js.Any], VE = VE.asInstanceOf[js.Any], VG = VG.asInstanceOf[js.Any], VI = VI.asInstanceOf[js.Any], VN = VN.asInstanceOf[js.Any], VU = VU.asInstanceOf[js.Any], WF = WF.asInstanceOf[js.Any], WS = WS.asInstanceOf[js.Any], XK = XK.asInstanceOf[js.Any], YE = YE.asInstanceOf[js.Any], YT = YT.asInstanceOf[js.Any], ZA = ZA.asInstanceOf[js.Any], ZM = ZM.asInstanceOf[js.Any], ZW = ZW.asInstanceOf[js.Any])
      __obj.asInstanceOf[Examples]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Examples] (val x: Self) extends AnyVal {
      
      inline def setAC(value: NationalNumber): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      inline def setAD(value: NationalNumber): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      inline def setAE(value: NationalNumber): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      inline def setAF(value: NationalNumber): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      inline def setAG(value: NationalNumber): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      inline def setAI(value: NationalNumber): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      inline def setAL(value: NationalNumber): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      inline def setAM(value: NationalNumber): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      inline def setAO(value: NationalNumber): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      inline def setAR(value: NationalNumber): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      inline def setAS(value: NationalNumber): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      inline def setAT(value: NationalNumber): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      inline def setAU(value: NationalNumber): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      inline def setAW(value: NationalNumber): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      inline def setAX(value: NationalNumber): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      inline def setAZ(value: NationalNumber): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      inline def setBA(value: NationalNumber): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      inline def setBB(value: NationalNumber): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      inline def setBD(value: NationalNumber): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      inline def setBE(value: NationalNumber): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      inline def setBF(value: NationalNumber): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      inline def setBG(value: NationalNumber): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      inline def setBH(value: NationalNumber): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      inline def setBI(value: NationalNumber): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      inline def setBJ(value: NationalNumber): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      inline def setBL(value: NationalNumber): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      inline def setBM(value: NationalNumber): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      inline def setBN(value: NationalNumber): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      inline def setBO(value: NationalNumber): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      inline def setBQ(value: NationalNumber): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      inline def setBR(value: NationalNumber): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      inline def setBS(value: NationalNumber): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBT(value: NationalNumber): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      inline def setBW(value: NationalNumber): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      inline def setBY(value: NationalNumber): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      inline def setBZ(value: NationalNumber): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      inline def setCA(value: NationalNumber): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      inline def setCC(value: NationalNumber): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      inline def setCD(value: NationalNumber): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      inline def setCF(value: NationalNumber): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      inline def setCG(value: NationalNumber): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      inline def setCH(value: NationalNumber): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCI(value: NationalNumber): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      inline def setCK(value: NationalNumber): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      inline def setCL(value: NationalNumber): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      inline def setCM(value: NationalNumber): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      inline def setCN(value: NationalNumber): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      inline def setCO(value: NationalNumber): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      inline def setCR(value: NationalNumber): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      inline def setCU(value: NationalNumber): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      inline def setCV(value: NationalNumber): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      inline def setCW(value: NationalNumber): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      inline def setCX(value: NationalNumber): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      inline def setCY(value: NationalNumber): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      inline def setCZ(value: NationalNumber): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      inline def setDE(value: NationalNumber): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      inline def setDJ(value: NationalNumber): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      inline def setDK(value: NationalNumber): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      inline def setDM(value: NationalNumber): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      inline def setDO(value: NationalNumber): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      inline def setDZ(value: NationalNumber): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      inline def setEC(value: NationalNumber): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      inline def setEE(value: NationalNumber): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      inline def setEG(value: NationalNumber): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      inline def setEH(value: NationalNumber): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      inline def setER(value: NationalNumber): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      inline def setES(value: NationalNumber): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      inline def setET(value: NationalNumber): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      inline def setFI(value: NationalNumber): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      inline def setFJ(value: NationalNumber): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      inline def setFK(value: NationalNumber): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      inline def setFM(value: NationalNumber): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      inline def setFO(value: NationalNumber): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      inline def setFR(value: NationalNumber): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      inline def setGA(value: NationalNumber): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      inline def setGB(value: NationalNumber): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      inline def setGD(value: NationalNumber): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      inline def setGE(value: NationalNumber): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      inline def setGF(value: NationalNumber): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      inline def setGG(value: NationalNumber): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      inline def setGH(value: NationalNumber): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      inline def setGI(value: NationalNumber): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      inline def setGL(value: NationalNumber): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      inline def setGM(value: NationalNumber): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      inline def setGN(value: NationalNumber): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      inline def setGP(value: NationalNumber): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      inline def setGQ(value: NationalNumber): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      inline def setGR(value: NationalNumber): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      inline def setGT(value: NationalNumber): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      inline def setGU(value: NationalNumber): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      inline def setGW(value: NationalNumber): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      inline def setGY(value: NationalNumber): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      inline def setHK(value: NationalNumber): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      inline def setHN(value: NationalNumber): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      inline def setHR(value: NationalNumber): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      inline def setHT(value: NationalNumber): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      inline def setHU(value: NationalNumber): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      inline def setID(value: NationalNumber): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIE(value: NationalNumber): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      inline def setIL(value: NationalNumber): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      inline def setIM(value: NationalNumber): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      inline def setIN(value: NationalNumber): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      inline def setIO(value: NationalNumber): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      inline def setIQ(value: NationalNumber): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      inline def setIR(value: NationalNumber): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      inline def setIS(value: NationalNumber): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      inline def setIT(value: NationalNumber): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      inline def setJE(value: NationalNumber): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      inline def setJM(value: NationalNumber): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      inline def setJO(value: NationalNumber): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      inline def setJP(value: NationalNumber): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      inline def setKE(value: NationalNumber): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      inline def setKG(value: NationalNumber): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      inline def setKH(value: NationalNumber): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      inline def setKI(value: NationalNumber): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      inline def setKM(value: NationalNumber): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      inline def setKN(value: NationalNumber): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      inline def setKP(value: NationalNumber): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      inline def setKR(value: NationalNumber): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      inline def setKW(value: NationalNumber): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      inline def setKY(value: NationalNumber): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      inline def setKZ(value: NationalNumber): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      inline def setLA(value: NationalNumber): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      inline def setLB(value: NationalNumber): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      inline def setLC(value: NationalNumber): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      inline def setLI(value: NationalNumber): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      inline def setLK(value: NationalNumber): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      inline def setLR(value: NationalNumber): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      inline def setLS(value: NationalNumber): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      inline def setLT(value: NationalNumber): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      inline def setLU(value: NationalNumber): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      inline def setLV(value: NationalNumber): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      inline def setLY(value: NationalNumber): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      inline def setMA(value: NationalNumber): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      inline def setMC(value: NationalNumber): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      inline def setMD(value: NationalNumber): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setME(value: NationalNumber): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      inline def setMF(value: NationalNumber): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMG(value: NationalNumber): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMH(value: NationalNumber): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      inline def setMK(value: NationalNumber): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      inline def setML(value: NationalNumber): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      inline def setMM(value: NationalNumber): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      inline def setMN(value: NationalNumber): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      inline def setMO(value: NationalNumber): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      inline def setMP(value: NationalNumber): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      inline def setMQ(value: NationalNumber): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      inline def setMR(value: NationalNumber): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMS(value: NationalNumber): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      inline def setMT(value: NationalNumber): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      inline def setMU(value: NationalNumber): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      inline def setMV(value: NationalNumber): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      inline def setMW(value: NationalNumber): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      inline def setMX(value: NationalNumber): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setMY(value: NationalNumber): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      inline def setMZ(value: NationalNumber): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      inline def setNA(value: NationalNumber): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      inline def setNC(value: NationalNumber): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      inline def setNE(value: NationalNumber): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNF(value: NationalNumber): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      inline def setNG(value: NationalNumber): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      inline def setNI(value: NationalNumber): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      inline def setNL(value: NationalNumber): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      inline def setNO(value: NationalNumber): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      inline def setNP(value: NationalNumber): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      inline def setNR(value: NationalNumber): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      inline def setNU(value: NationalNumber): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      inline def setNZ(value: NationalNumber): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      inline def setOM(value: NationalNumber): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      inline def setPA(value: NationalNumber): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      inline def setPE(value: NationalNumber): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      inline def setPF(value: NationalNumber): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      inline def setPG(value: NationalNumber): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      inline def setPH(value: NationalNumber): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      inline def setPK(value: NationalNumber): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      inline def setPL(value: NationalNumber): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      inline def setPM(value: NationalNumber): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      inline def setPR(value: NationalNumber): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      inline def setPS(value: NationalNumber): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      inline def setPT(value: NationalNumber): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      inline def setPW(value: NationalNumber): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      inline def setPY(value: NationalNumber): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      inline def setQA(value: NationalNumber): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      inline def setRE(value: NationalNumber): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      inline def setRO(value: NationalNumber): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      inline def setRS(value: NationalNumber): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      inline def setRU(value: NationalNumber): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      inline def setRW(value: NationalNumber): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      inline def setSA(value: NationalNumber): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      inline def setSB(value: NationalNumber): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      inline def setSC(value: NationalNumber): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      inline def setSD(value: NationalNumber): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      inline def setSE(value: NationalNumber): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSG(value: NationalNumber): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      inline def setSH(value: NationalNumber): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      inline def setSI(value: NationalNumber): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      inline def setSJ(value: NationalNumber): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      inline def setSK(value: NationalNumber): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      inline def setSL(value: NationalNumber): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      inline def setSM(value: NationalNumber): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      inline def setSN(value: NationalNumber): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      inline def setSO(value: NationalNumber): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      inline def setSR(value: NationalNumber): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      inline def setSS(value: NationalNumber): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setST(value: NationalNumber): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      inline def setSV(value: NationalNumber): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      inline def setSX(value: NationalNumber): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      inline def setSY(value: NationalNumber): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      inline def setSZ(value: NationalNumber): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      inline def setTA(value: NationalNumber): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      inline def setTC(value: NationalNumber): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      inline def setTD(value: NationalNumber): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      inline def setTG(value: NationalNumber): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      inline def setTH(value: NationalNumber): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      inline def setTJ(value: NationalNumber): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      inline def setTK(value: NationalNumber): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      inline def setTL(value: NationalNumber): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      inline def setTM(value: NationalNumber): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      inline def setTN(value: NationalNumber): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      inline def setTO(value: NationalNumber): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTR(value: NationalNumber): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      inline def setTT(value: NationalNumber): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      inline def setTV(value: NationalNumber): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      inline def setTW(value: NationalNumber): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      inline def setTZ(value: NationalNumber): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      inline def setUA(value: NationalNumber): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      inline def setUG(value: NationalNumber): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      inline def setUS(value: NationalNumber): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      inline def setUY(value: NationalNumber): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      inline def setUZ(value: NationalNumber): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      inline def setVA(value: NationalNumber): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      inline def setVC(value: NationalNumber): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      inline def setVE(value: NationalNumber): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      inline def setVG(value: NationalNumber): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      inline def setVI(value: NationalNumber): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      inline def setVN(value: NationalNumber): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      inline def setVU(value: NationalNumber): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      inline def setWF(value: NationalNumber): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      inline def setWS(value: NationalNumber): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setXK(value: NationalNumber): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      inline def setYE(value: NationalNumber): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      inline def setYT(value: NationalNumber): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      inline def setZA(value: NationalNumber): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      inline def setZM(value: NationalNumber): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      inline def setZW(value: NationalNumber): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
    }
  }
  
  type Extension = Tagged[String, typings.libphonenumberJs.libphonenumberJsStrings.Extension]
  
  type FormatExtension = js.Function3[
    /* formattedNumber */ String, 
    /* extension */ Extension, 
    /* metadata */ MetadataJson, 
    String
  ]
  
  trait FormatNumberOptions extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var fromCountry: js.UndefOr[CountryCode] = js.undefined
    
    var humanReadable: js.UndefOr[Boolean] = js.undefined
    
    var nationalPrefix: js.UndefOr[Boolean] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptions {
    
    inline def apply(): FormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatNumberOptions] (val x: Self) extends AnyVal {
      
      inline def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ MetadataJson) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      inline def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      inline def setFromCountry(value: CountryCode): Self = StObject.set(x, "fromCountry", value.asInstanceOf[js.Any])
      
      inline def setFromCountryUndefined: Self = StObject.set(x, "fromCountry", js.undefined)
      
      inline def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
      
      inline def setHumanReadableUndefined: Self = StObject.set(x, "humanReadable", js.undefined)
      
      inline def setNationalPrefix(value: Boolean): Self = StObject.set(x, "nationalPrefix", value.asInstanceOf[js.Any])
      
      inline def setNationalPrefixUndefined: Self = StObject.set(x, "nationalPrefix", js.undefined)
      
      inline def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      inline def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait FormatNumberOptionsWithoutIDD extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptionsWithoutIDD {
    
    inline def apply(): FormatNumberOptionsWithoutIDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatNumberOptionsWithoutIDD] (val x: Self) extends AnyVal {
      
      inline def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ MetadataJson) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      inline def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      inline def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      inline def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait MetadataJson extends StObject {
    
    var countries: Countries
    
    var country_calling_codes: CountryCallingCodes
  }
  object MetadataJson {
    
    inline def apply(countries: Countries, country_calling_codes: CountryCallingCodes): MetadataJson = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country_calling_codes = country_calling_codes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataJson] (val x: Self) extends AnyVal {
      
      inline def setCountries(value: Countries): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountry_calling_codes(value: CountryCallingCodes): Self = StObject.set(x, "country_calling_codes", value.asInstanceOf[js.Any])
    }
  }
  
  type NationalNumber = Tagged[String, typings.libphonenumberJs.libphonenumberJsStrings.NationalNumber]
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL
    - typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
    - typings.libphonenumberJs.libphonenumberJsStrings.EDot164
    - typings.libphonenumberJs.libphonenumberJsStrings.RFC3966
    - typings.libphonenumberJs.libphonenumberJsStrings.IDD
  */
  trait NumberFormat extends StObject
  object NumberFormat {
    
    inline def EDot164: typings.libphonenumberJs.libphonenumberJsStrings.EDot164 = "E.164".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EDot164]
    
    inline def IDD: typings.libphonenumberJs.libphonenumberJsStrings.IDD = "IDD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IDD]
    
    inline def INTERNATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = "INTERNATIONAL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL]
    
    inline def NATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL = "NATIONAL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL]
    
    inline def RFC3966: typings.libphonenumberJs.libphonenumberJsStrings.RFC3966 = "RFC3966".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RFC3966]
  }
  
  trait NumberFound extends StObject {
    
    var endsAt: Double
    
    var number: PhoneNumber
    
    var startsAt: Double
  }
  object NumberFound {
    
    inline def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
      val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFound]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFound] (val x: Self) extends AnyVal {
      
      inline def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: PhoneNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberFoundLegacy extends StObject {
    
    var country: CountryCode
    
    var endsAt: Double
    
    var ext: js.UndefOr[Extension] = js.undefined
    
    var phone: NationalNumber
    
    var startsAt: Double
  }
  object NumberFoundLegacy {
    
    inline def apply(country: CountryCode, endsAt: Double, phone: NationalNumber, startsAt: Double): NumberFoundLegacy = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], endsAt = endsAt.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFoundLegacy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFoundLegacy] (val x: Self) extends AnyVal {
      
      inline def setCountry(value: CountryCode): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      inline def setExt(value: Extension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setPhone(value: NationalNumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.libphonenumberJs.libphonenumberJsStrings.PREMIUM_RATE
    - typings.libphonenumberJs.libphonenumberJsStrings.TOLL_FREE
    - typings.libphonenumberJs.libphonenumberJsStrings.SHARED_COST
    - typings.libphonenumberJs.libphonenumberJsStrings.VOIP
    - typings.libphonenumberJs.libphonenumberJsStrings.PERSONAL_NUMBER
    - typings.libphonenumberJs.libphonenumberJsStrings.PAGER
    - typings.libphonenumberJs.libphonenumberJsStrings.UAN
    - typings.libphonenumberJs.libphonenumberJsStrings.VOICEMAIL
    - typings.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE_OR_MOBILE
    - typings.libphonenumberJs.libphonenumberJsStrings.FIXED_LINE
    - typings.libphonenumberJs.libphonenumberJsStrings.MOBILE
  */
  type NumberType = js.UndefOr[_NumberType]
  
  trait NumberingPlan extends StObject {
    
    def IDDPrefix(): String
    
    def defaultIDDPrefix(): js.UndefOr[String]
    
    def leadingDigits(): js.UndefOr[String]
    
    def possibleLengths(): js.Array[Double]
  }
  object NumberingPlan {
    
    inline def apply(
      IDDPrefix: () => String,
      defaultIDDPrefix: () => js.UndefOr[String],
      leadingDigits: () => js.UndefOr[String],
      possibleLengths: () => js.Array[Double]
    ): NumberingPlan = {
      val __obj = js.Dynamic.literal(IDDPrefix = js.Any.fromFunction0(IDDPrefix), defaultIDDPrefix = js.Any.fromFunction0(defaultIDDPrefix), leadingDigits = js.Any.fromFunction0(leadingDigits), possibleLengths = js.Any.fromFunction0(possibleLengths))
      __obj.asInstanceOf[NumberingPlan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberingPlan] (val x: Self) extends AnyVal {
      
      inline def setDefaultIDDPrefix(value: () => js.UndefOr[String]): Self = StObject.set(x, "defaultIDDPrefix", js.Any.fromFunction0(value))
      
      inline def setIDDPrefix(value: () => String): Self = StObject.set(x, "IDDPrefix", js.Any.fromFunction0(value))
      
      inline def setLeadingDigits(value: () => js.UndefOr[String]): Self = StObject.set(x, "leadingDigits", js.Any.fromFunction0(value))
      
      inline def setPossibleLengths(value: () => js.Array[Double]): Self = StObject.set(x, "possibleLengths", js.Any.fromFunction0(value))
    }
  }
  
  type Tagged[A, T] = A & Tag[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY
    - typings.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER
    - typings.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT
    - typings.libphonenumberJs.libphonenumberJsStrings.TOO_LONG
    - typings.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH
  */
  trait ValidatePhoneNumberLengthResult extends StObject
  object ValidatePhoneNumberLengthResult {
    
    inline def INVALID_COUNTRY: typings.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY = "INVALID_COUNTRY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.INVALID_COUNTRY]
    
    inline def INVALID_LENGTH: typings.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH = "INVALID_LENGTH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.INVALID_LENGTH]
    
    inline def NOT_A_NUMBER: typings.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER = "NOT_A_NUMBER".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NOT_A_NUMBER]
    
    inline def TOO_LONG: typings.libphonenumberJs.libphonenumberJsStrings.TOO_LONG = "TOO_LONG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TOO_LONG]
    
    inline def TOO_SHORT: typings.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT = "TOO_SHORT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TOO_SHORT]
  }
  
  trait _NumberType extends StObject
}
