package typings.libphonenumberJs

import org.scalablytyped.runtime.StringDictionary
import typings.libphonenumberJs.libphonenumberJsStrings.International_
import typings.libphonenumberJs.libphonenumberJsStrings.National_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("libphonenumber-js/types", "ParseError")
  @js.native
  class ParseError () extends StObject {
    
    var message: String = js.native
  }
  
  @JSImport("libphonenumber-js/types", "PhoneNumber")
  @js.native
  class PhoneNumber protected () extends StObject {
    def this(
      countryCallingCodeOrCountry: CountryCallingCode,
      nationalNumber: NationalNumber,
      metadata: Metadata
    ) = this()
    def this(countryCallingCodeOrCountry: CountryCode, nationalNumber: NationalNumber, metadata: Metadata) = this()
    
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
  }
  
  type CarrierCode = String
  
  /* Inlined {[ country in libphonenumber-js.libphonenumber-js/types.CountryCode ]: std.Array<any>} */
  trait Countries extends StObject {
    
    var `001`: js.Array[js.Any]
    
    var AC: js.Array[js.Any]
    
    var AD: js.Array[js.Any]
    
    var AE: js.Array[js.Any]
    
    var AF: js.Array[js.Any]
    
    var AG: js.Array[js.Any]
    
    var AI: js.Array[js.Any]
    
    var AL: js.Array[js.Any]
    
    var AM: js.Array[js.Any]
    
    var AO: js.Array[js.Any]
    
    var AR: js.Array[js.Any]
    
    var AS: js.Array[js.Any]
    
    var AT: js.Array[js.Any]
    
    var AU: js.Array[js.Any]
    
    var AW: js.Array[js.Any]
    
    var AX: js.Array[js.Any]
    
    var AZ: js.Array[js.Any]
    
    var BA: js.Array[js.Any]
    
    var BB: js.Array[js.Any]
    
    var BD: js.Array[js.Any]
    
    var BE: js.Array[js.Any]
    
    var BF: js.Array[js.Any]
    
    var BG: js.Array[js.Any]
    
    var BH: js.Array[js.Any]
    
    var BI: js.Array[js.Any]
    
    var BJ: js.Array[js.Any]
    
    var BL: js.Array[js.Any]
    
    var BM: js.Array[js.Any]
    
    var BN: js.Array[js.Any]
    
    var BO: js.Array[js.Any]
    
    var BQ: js.Array[js.Any]
    
    var BR: js.Array[js.Any]
    
    var BS: js.Array[js.Any]
    
    var BT: js.Array[js.Any]
    
    var BW: js.Array[js.Any]
    
    var BY: js.Array[js.Any]
    
    var BZ: js.Array[js.Any]
    
    var CA: js.Array[js.Any]
    
    var CC: js.Array[js.Any]
    
    var CD: js.Array[js.Any]
    
    var CF: js.Array[js.Any]
    
    var CG: js.Array[js.Any]
    
    var CH: js.Array[js.Any]
    
    var CI: js.Array[js.Any]
    
    var CK: js.Array[js.Any]
    
    var CL: js.Array[js.Any]
    
    var CM: js.Array[js.Any]
    
    var CN: js.Array[js.Any]
    
    var CO: js.Array[js.Any]
    
    var CR: js.Array[js.Any]
    
    var CU: js.Array[js.Any]
    
    var CV: js.Array[js.Any]
    
    var CW: js.Array[js.Any]
    
    var CX: js.Array[js.Any]
    
    var CY: js.Array[js.Any]
    
    var CZ: js.Array[js.Any]
    
    var DE: js.Array[js.Any]
    
    var DJ: js.Array[js.Any]
    
    var DK: js.Array[js.Any]
    
    var DM: js.Array[js.Any]
    
    var DO: js.Array[js.Any]
    
    var DZ: js.Array[js.Any]
    
    var EC: js.Array[js.Any]
    
    var EE: js.Array[js.Any]
    
    var EG: js.Array[js.Any]
    
    var EH: js.Array[js.Any]
    
    var ER: js.Array[js.Any]
    
    var ES: js.Array[js.Any]
    
    var ET: js.Array[js.Any]
    
    var FI: js.Array[js.Any]
    
    var FJ: js.Array[js.Any]
    
    var FK: js.Array[js.Any]
    
    var FM: js.Array[js.Any]
    
    var FO: js.Array[js.Any]
    
    var FR: js.Array[js.Any]
    
    var GA: js.Array[js.Any]
    
    var GB: js.Array[js.Any]
    
    var GD: js.Array[js.Any]
    
    var GE: js.Array[js.Any]
    
    var GF: js.Array[js.Any]
    
    var GG: js.Array[js.Any]
    
    var GH: js.Array[js.Any]
    
    var GI: js.Array[js.Any]
    
    var GL: js.Array[js.Any]
    
    var GM: js.Array[js.Any]
    
    var GN: js.Array[js.Any]
    
    var GP: js.Array[js.Any]
    
    var GQ: js.Array[js.Any]
    
    var GR: js.Array[js.Any]
    
    var GT: js.Array[js.Any]
    
    var GU: js.Array[js.Any]
    
    var GW: js.Array[js.Any]
    
    var GY: js.Array[js.Any]
    
    var HK: js.Array[js.Any]
    
    var HN: js.Array[js.Any]
    
    var HR: js.Array[js.Any]
    
    var HT: js.Array[js.Any]
    
    var HU: js.Array[js.Any]
    
    var ID: js.Array[js.Any]
    
    var IE: js.Array[js.Any]
    
    var IL: js.Array[js.Any]
    
    var IM: js.Array[js.Any]
    
    var IN: js.Array[js.Any]
    
    var IO: js.Array[js.Any]
    
    var IQ: js.Array[js.Any]
    
    var IR: js.Array[js.Any]
    
    var IS: js.Array[js.Any]
    
    var IT: js.Array[js.Any]
    
    var JE: js.Array[js.Any]
    
    var JM: js.Array[js.Any]
    
    var JO: js.Array[js.Any]
    
    var JP: js.Array[js.Any]
    
    var KE: js.Array[js.Any]
    
    var KG: js.Array[js.Any]
    
    var KH: js.Array[js.Any]
    
    var KI: js.Array[js.Any]
    
    var KM: js.Array[js.Any]
    
    var KN: js.Array[js.Any]
    
    var KP: js.Array[js.Any]
    
    var KR: js.Array[js.Any]
    
    var KW: js.Array[js.Any]
    
    var KY: js.Array[js.Any]
    
    var KZ: js.Array[js.Any]
    
    var LA: js.Array[js.Any]
    
    var LB: js.Array[js.Any]
    
    var LC: js.Array[js.Any]
    
    var LI: js.Array[js.Any]
    
    var LK: js.Array[js.Any]
    
    var LR: js.Array[js.Any]
    
    var LS: js.Array[js.Any]
    
    var LT: js.Array[js.Any]
    
    var LU: js.Array[js.Any]
    
    var LV: js.Array[js.Any]
    
    var LY: js.Array[js.Any]
    
    var MA: js.Array[js.Any]
    
    var MC: js.Array[js.Any]
    
    var MD: js.Array[js.Any]
    
    var ME: js.Array[js.Any]
    
    var MF: js.Array[js.Any]
    
    var MG: js.Array[js.Any]
    
    var MH: js.Array[js.Any]
    
    var MK: js.Array[js.Any]
    
    var ML: js.Array[js.Any]
    
    var MM: js.Array[js.Any]
    
    var MN: js.Array[js.Any]
    
    var MO: js.Array[js.Any]
    
    var MP: js.Array[js.Any]
    
    var MQ: js.Array[js.Any]
    
    var MR: js.Array[js.Any]
    
    var MS: js.Array[js.Any]
    
    var MT: js.Array[js.Any]
    
    var MU: js.Array[js.Any]
    
    var MV: js.Array[js.Any]
    
    var MW: js.Array[js.Any]
    
    var MX: js.Array[js.Any]
    
    var MY: js.Array[js.Any]
    
    var MZ: js.Array[js.Any]
    
    var NA: js.Array[js.Any]
    
    var NC: js.Array[js.Any]
    
    var NE: js.Array[js.Any]
    
    var NF: js.Array[js.Any]
    
    var NG: js.Array[js.Any]
    
    var NI: js.Array[js.Any]
    
    var NL: js.Array[js.Any]
    
    var NO: js.Array[js.Any]
    
    var NP: js.Array[js.Any]
    
    var NR: js.Array[js.Any]
    
    var NU: js.Array[js.Any]
    
    var NZ: js.Array[js.Any]
    
    var OM: js.Array[js.Any]
    
    var PA: js.Array[js.Any]
    
    var PE: js.Array[js.Any]
    
    var PF: js.Array[js.Any]
    
    var PG: js.Array[js.Any]
    
    var PH: js.Array[js.Any]
    
    var PK: js.Array[js.Any]
    
    var PL: js.Array[js.Any]
    
    var PM: js.Array[js.Any]
    
    var PR: js.Array[js.Any]
    
    var PS: js.Array[js.Any]
    
    var PT: js.Array[js.Any]
    
    var PW: js.Array[js.Any]
    
    var PY: js.Array[js.Any]
    
    var QA: js.Array[js.Any]
    
    var RE: js.Array[js.Any]
    
    var RO: js.Array[js.Any]
    
    var RS: js.Array[js.Any]
    
    var RU: js.Array[js.Any]
    
    var RW: js.Array[js.Any]
    
    var SA: js.Array[js.Any]
    
    var SB: js.Array[js.Any]
    
    var SC: js.Array[js.Any]
    
    var SD: js.Array[js.Any]
    
    var SE: js.Array[js.Any]
    
    var SG: js.Array[js.Any]
    
    var SH: js.Array[js.Any]
    
    var SI: js.Array[js.Any]
    
    var SJ: js.Array[js.Any]
    
    var SK: js.Array[js.Any]
    
    var SL: js.Array[js.Any]
    
    var SM: js.Array[js.Any]
    
    var SN: js.Array[js.Any]
    
    var SO: js.Array[js.Any]
    
    var SR: js.Array[js.Any]
    
    var SS: js.Array[js.Any]
    
    var ST: js.Array[js.Any]
    
    var SV: js.Array[js.Any]
    
    var SX: js.Array[js.Any]
    
    var SY: js.Array[js.Any]
    
    var SZ: js.Array[js.Any]
    
    var TA: js.Array[js.Any]
    
    var TC: js.Array[js.Any]
    
    var TD: js.Array[js.Any]
    
    var TG: js.Array[js.Any]
    
    var TH: js.Array[js.Any]
    
    var TJ: js.Array[js.Any]
    
    var TK: js.Array[js.Any]
    
    var TL: js.Array[js.Any]
    
    var TM: js.Array[js.Any]
    
    var TN: js.Array[js.Any]
    
    var TO: js.Array[js.Any]
    
    var TR: js.Array[js.Any]
    
    var TT: js.Array[js.Any]
    
    var TV: js.Array[js.Any]
    
    var TW: js.Array[js.Any]
    
    var TZ: js.Array[js.Any]
    
    var UA: js.Array[js.Any]
    
    var UG: js.Array[js.Any]
    
    var US: js.Array[js.Any]
    
    var UY: js.Array[js.Any]
    
    var UZ: js.Array[js.Any]
    
    var VA: js.Array[js.Any]
    
    var VC: js.Array[js.Any]
    
    var VE: js.Array[js.Any]
    
    var VG: js.Array[js.Any]
    
    var VI: js.Array[js.Any]
    
    var VN: js.Array[js.Any]
    
    var VU: js.Array[js.Any]
    
    var WF: js.Array[js.Any]
    
    var WS: js.Array[js.Any]
    
    var XK: js.Array[js.Any]
    
    var YE: js.Array[js.Any]
    
    var YT: js.Array[js.Any]
    
    var ZA: js.Array[js.Any]
    
    var ZM: js.Array[js.Any]
    
    var ZW: js.Array[js.Any]
  }
  object Countries {
    
    @scala.inline
    def apply(
      `001`: js.Array[js.Any],
      AC: js.Array[js.Any],
      AD: js.Array[js.Any],
      AE: js.Array[js.Any],
      AF: js.Array[js.Any],
      AG: js.Array[js.Any],
      AI: js.Array[js.Any],
      AL: js.Array[js.Any],
      AM: js.Array[js.Any],
      AO: js.Array[js.Any],
      AR: js.Array[js.Any],
      AS: js.Array[js.Any],
      AT: js.Array[js.Any],
      AU: js.Array[js.Any],
      AW: js.Array[js.Any],
      AX: js.Array[js.Any],
      AZ: js.Array[js.Any],
      BA: js.Array[js.Any],
      BB: js.Array[js.Any],
      BD: js.Array[js.Any],
      BE: js.Array[js.Any],
      BF: js.Array[js.Any],
      BG: js.Array[js.Any],
      BH: js.Array[js.Any],
      BI: js.Array[js.Any],
      BJ: js.Array[js.Any],
      BL: js.Array[js.Any],
      BM: js.Array[js.Any],
      BN: js.Array[js.Any],
      BO: js.Array[js.Any],
      BQ: js.Array[js.Any],
      BR: js.Array[js.Any],
      BS: js.Array[js.Any],
      BT: js.Array[js.Any],
      BW: js.Array[js.Any],
      BY: js.Array[js.Any],
      BZ: js.Array[js.Any],
      CA: js.Array[js.Any],
      CC: js.Array[js.Any],
      CD: js.Array[js.Any],
      CF: js.Array[js.Any],
      CG: js.Array[js.Any],
      CH: js.Array[js.Any],
      CI: js.Array[js.Any],
      CK: js.Array[js.Any],
      CL: js.Array[js.Any],
      CM: js.Array[js.Any],
      CN: js.Array[js.Any],
      CO: js.Array[js.Any],
      CR: js.Array[js.Any],
      CU: js.Array[js.Any],
      CV: js.Array[js.Any],
      CW: js.Array[js.Any],
      CX: js.Array[js.Any],
      CY: js.Array[js.Any],
      CZ: js.Array[js.Any],
      DE: js.Array[js.Any],
      DJ: js.Array[js.Any],
      DK: js.Array[js.Any],
      DM: js.Array[js.Any],
      DO: js.Array[js.Any],
      DZ: js.Array[js.Any],
      EC: js.Array[js.Any],
      EE: js.Array[js.Any],
      EG: js.Array[js.Any],
      EH: js.Array[js.Any],
      ER: js.Array[js.Any],
      ES: js.Array[js.Any],
      ET: js.Array[js.Any],
      FI: js.Array[js.Any],
      FJ: js.Array[js.Any],
      FK: js.Array[js.Any],
      FM: js.Array[js.Any],
      FO: js.Array[js.Any],
      FR: js.Array[js.Any],
      GA: js.Array[js.Any],
      GB: js.Array[js.Any],
      GD: js.Array[js.Any],
      GE: js.Array[js.Any],
      GF: js.Array[js.Any],
      GG: js.Array[js.Any],
      GH: js.Array[js.Any],
      GI: js.Array[js.Any],
      GL: js.Array[js.Any],
      GM: js.Array[js.Any],
      GN: js.Array[js.Any],
      GP: js.Array[js.Any],
      GQ: js.Array[js.Any],
      GR: js.Array[js.Any],
      GT: js.Array[js.Any],
      GU: js.Array[js.Any],
      GW: js.Array[js.Any],
      GY: js.Array[js.Any],
      HK: js.Array[js.Any],
      HN: js.Array[js.Any],
      HR: js.Array[js.Any],
      HT: js.Array[js.Any],
      HU: js.Array[js.Any],
      ID: js.Array[js.Any],
      IE: js.Array[js.Any],
      IL: js.Array[js.Any],
      IM: js.Array[js.Any],
      IN: js.Array[js.Any],
      IO: js.Array[js.Any],
      IQ: js.Array[js.Any],
      IR: js.Array[js.Any],
      IS: js.Array[js.Any],
      IT: js.Array[js.Any],
      JE: js.Array[js.Any],
      JM: js.Array[js.Any],
      JO: js.Array[js.Any],
      JP: js.Array[js.Any],
      KE: js.Array[js.Any],
      KG: js.Array[js.Any],
      KH: js.Array[js.Any],
      KI: js.Array[js.Any],
      KM: js.Array[js.Any],
      KN: js.Array[js.Any],
      KP: js.Array[js.Any],
      KR: js.Array[js.Any],
      KW: js.Array[js.Any],
      KY: js.Array[js.Any],
      KZ: js.Array[js.Any],
      LA: js.Array[js.Any],
      LB: js.Array[js.Any],
      LC: js.Array[js.Any],
      LI: js.Array[js.Any],
      LK: js.Array[js.Any],
      LR: js.Array[js.Any],
      LS: js.Array[js.Any],
      LT: js.Array[js.Any],
      LU: js.Array[js.Any],
      LV: js.Array[js.Any],
      LY: js.Array[js.Any],
      MA: js.Array[js.Any],
      MC: js.Array[js.Any],
      MD: js.Array[js.Any],
      ME: js.Array[js.Any],
      MF: js.Array[js.Any],
      MG: js.Array[js.Any],
      MH: js.Array[js.Any],
      MK: js.Array[js.Any],
      ML: js.Array[js.Any],
      MM: js.Array[js.Any],
      MN: js.Array[js.Any],
      MO: js.Array[js.Any],
      MP: js.Array[js.Any],
      MQ: js.Array[js.Any],
      MR: js.Array[js.Any],
      MS: js.Array[js.Any],
      MT: js.Array[js.Any],
      MU: js.Array[js.Any],
      MV: js.Array[js.Any],
      MW: js.Array[js.Any],
      MX: js.Array[js.Any],
      MY: js.Array[js.Any],
      MZ: js.Array[js.Any],
      NA: js.Array[js.Any],
      NC: js.Array[js.Any],
      NE: js.Array[js.Any],
      NF: js.Array[js.Any],
      NG: js.Array[js.Any],
      NI: js.Array[js.Any],
      NL: js.Array[js.Any],
      NO: js.Array[js.Any],
      NP: js.Array[js.Any],
      NR: js.Array[js.Any],
      NU: js.Array[js.Any],
      NZ: js.Array[js.Any],
      OM: js.Array[js.Any],
      PA: js.Array[js.Any],
      PE: js.Array[js.Any],
      PF: js.Array[js.Any],
      PG: js.Array[js.Any],
      PH: js.Array[js.Any],
      PK: js.Array[js.Any],
      PL: js.Array[js.Any],
      PM: js.Array[js.Any],
      PR: js.Array[js.Any],
      PS: js.Array[js.Any],
      PT: js.Array[js.Any],
      PW: js.Array[js.Any],
      PY: js.Array[js.Any],
      QA: js.Array[js.Any],
      RE: js.Array[js.Any],
      RO: js.Array[js.Any],
      RS: js.Array[js.Any],
      RU: js.Array[js.Any],
      RW: js.Array[js.Any],
      SA: js.Array[js.Any],
      SB: js.Array[js.Any],
      SC: js.Array[js.Any],
      SD: js.Array[js.Any],
      SE: js.Array[js.Any],
      SG: js.Array[js.Any],
      SH: js.Array[js.Any],
      SI: js.Array[js.Any],
      SJ: js.Array[js.Any],
      SK: js.Array[js.Any],
      SL: js.Array[js.Any],
      SM: js.Array[js.Any],
      SN: js.Array[js.Any],
      SO: js.Array[js.Any],
      SR: js.Array[js.Any],
      SS: js.Array[js.Any],
      ST: js.Array[js.Any],
      SV: js.Array[js.Any],
      SX: js.Array[js.Any],
      SY: js.Array[js.Any],
      SZ: js.Array[js.Any],
      TA: js.Array[js.Any],
      TC: js.Array[js.Any],
      TD: js.Array[js.Any],
      TG: js.Array[js.Any],
      TH: js.Array[js.Any],
      TJ: js.Array[js.Any],
      TK: js.Array[js.Any],
      TL: js.Array[js.Any],
      TM: js.Array[js.Any],
      TN: js.Array[js.Any],
      TO: js.Array[js.Any],
      TR: js.Array[js.Any],
      TT: js.Array[js.Any],
      TV: js.Array[js.Any],
      TW: js.Array[js.Any],
      TZ: js.Array[js.Any],
      UA: js.Array[js.Any],
      UG: js.Array[js.Any],
      US: js.Array[js.Any],
      UY: js.Array[js.Any],
      UZ: js.Array[js.Any],
      VA: js.Array[js.Any],
      VC: js.Array[js.Any],
      VE: js.Array[js.Any],
      VG: js.Array[js.Any],
      VI: js.Array[js.Any],
      VN: js.Array[js.Any],
      VU: js.Array[js.Any],
      WF: js.Array[js.Any],
      WS: js.Array[js.Any],
      XK: js.Array[js.Any],
      YE: js.Array[js.Any],
      YT: js.Array[js.Any],
      ZA: js.Array[js.Any],
      ZM: js.Array[js.Any],
      ZW: js.Array[js.Any]
    ): Countries = {
      val __obj = js.Dynamic.literal(AC = AC.asInstanceOf[js.Any], AD = AD.asInstanceOf[js.Any], AE = AE.asInstanceOf[js.Any], AF = AF.asInstanceOf[js.Any], AG = AG.asInstanceOf[js.Any], AI = AI.asInstanceOf[js.Any], AL = AL.asInstanceOf[js.Any], AM = AM.asInstanceOf[js.Any], AO = AO.asInstanceOf[js.Any], AR = AR.asInstanceOf[js.Any], AS = AS.asInstanceOf[js.Any], AT = AT.asInstanceOf[js.Any], AU = AU.asInstanceOf[js.Any], AW = AW.asInstanceOf[js.Any], AX = AX.asInstanceOf[js.Any], AZ = AZ.asInstanceOf[js.Any], BA = BA.asInstanceOf[js.Any], BB = BB.asInstanceOf[js.Any], BD = BD.asInstanceOf[js.Any], BE = BE.asInstanceOf[js.Any], BF = BF.asInstanceOf[js.Any], BG = BG.asInstanceOf[js.Any], BH = BH.asInstanceOf[js.Any], BI = BI.asInstanceOf[js.Any], BJ = BJ.asInstanceOf[js.Any], BL = BL.asInstanceOf[js.Any], BM = BM.asInstanceOf[js.Any], BN = BN.asInstanceOf[js.Any], BO = BO.asInstanceOf[js.Any], BQ = BQ.asInstanceOf[js.Any], BR = BR.asInstanceOf[js.Any], BS = BS.asInstanceOf[js.Any], BT = BT.asInstanceOf[js.Any], BW = BW.asInstanceOf[js.Any], BY = BY.asInstanceOf[js.Any], BZ = BZ.asInstanceOf[js.Any], CA = CA.asInstanceOf[js.Any], CC = CC.asInstanceOf[js.Any], CD = CD.asInstanceOf[js.Any], CF = CF.asInstanceOf[js.Any], CG = CG.asInstanceOf[js.Any], CH = CH.asInstanceOf[js.Any], CI = CI.asInstanceOf[js.Any], CK = CK.asInstanceOf[js.Any], CL = CL.asInstanceOf[js.Any], CM = CM.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], CO = CO.asInstanceOf[js.Any], CR = CR.asInstanceOf[js.Any], CU = CU.asInstanceOf[js.Any], CV = CV.asInstanceOf[js.Any], CW = CW.asInstanceOf[js.Any], CX = CX.asInstanceOf[js.Any], CY = CY.asInstanceOf[js.Any], CZ = CZ.asInstanceOf[js.Any], DE = DE.asInstanceOf[js.Any], DJ = DJ.asInstanceOf[js.Any], DK = DK.asInstanceOf[js.Any], DM = DM.asInstanceOf[js.Any], DO = DO.asInstanceOf[js.Any], DZ = DZ.asInstanceOf[js.Any], EC = EC.asInstanceOf[js.Any], EE = EE.asInstanceOf[js.Any], EG = EG.asInstanceOf[js.Any], EH = EH.asInstanceOf[js.Any], ER = ER.asInstanceOf[js.Any], ES = ES.asInstanceOf[js.Any], ET = ET.asInstanceOf[js.Any], FI = FI.asInstanceOf[js.Any], FJ = FJ.asInstanceOf[js.Any], FK = FK.asInstanceOf[js.Any], FM = FM.asInstanceOf[js.Any], FO = FO.asInstanceOf[js.Any], FR = FR.asInstanceOf[js.Any], GA = GA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], GD = GD.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GF = GF.asInstanceOf[js.Any], GG = GG.asInstanceOf[js.Any], GH = GH.asInstanceOf[js.Any], GI = GI.asInstanceOf[js.Any], GL = GL.asInstanceOf[js.Any], GM = GM.asInstanceOf[js.Any], GN = GN.asInstanceOf[js.Any], GP = GP.asInstanceOf[js.Any], GQ = GQ.asInstanceOf[js.Any], GR = GR.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], GU = GU.asInstanceOf[js.Any], GW = GW.asInstanceOf[js.Any], GY = GY.asInstanceOf[js.Any], HK = HK.asInstanceOf[js.Any], HN = HN.asInstanceOf[js.Any], HR = HR.asInstanceOf[js.Any], HT = HT.asInstanceOf[js.Any], HU = HU.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IE = IE.asInstanceOf[js.Any], IL = IL.asInstanceOf[js.Any], IM = IM.asInstanceOf[js.Any], IN = IN.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], IQ = IQ.asInstanceOf[js.Any], IR = IR.asInstanceOf[js.Any], IS = IS.asInstanceOf[js.Any], IT = IT.asInstanceOf[js.Any], JE = JE.asInstanceOf[js.Any], JM = JM.asInstanceOf[js.Any], JO = JO.asInstanceOf[js.Any], JP = JP.asInstanceOf[js.Any], KE = KE.asInstanceOf[js.Any], KG = KG.asInstanceOf[js.Any], KH = KH.asInstanceOf[js.Any], KI = KI.asInstanceOf[js.Any], KM = KM.asInstanceOf[js.Any], KN = KN.asInstanceOf[js.Any], KP = KP.asInstanceOf[js.Any], KR = KR.asInstanceOf[js.Any], KW = KW.asInstanceOf[js.Any], KY = KY.asInstanceOf[js.Any], KZ = KZ.asInstanceOf[js.Any], LA = LA.asInstanceOf[js.Any], LB = LB.asInstanceOf[js.Any], LC = LC.asInstanceOf[js.Any], LI = LI.asInstanceOf[js.Any], LK = LK.asInstanceOf[js.Any], LR = LR.asInstanceOf[js.Any], LS = LS.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LU = LU.asInstanceOf[js.Any], LV = LV.asInstanceOf[js.Any], LY = LY.asInstanceOf[js.Any], MA = MA.asInstanceOf[js.Any], MC = MC.asInstanceOf[js.Any], MD = MD.asInstanceOf[js.Any], ME = ME.asInstanceOf[js.Any], MF = MF.asInstanceOf[js.Any], MG = MG.asInstanceOf[js.Any], MH = MH.asInstanceOf[js.Any], MK = MK.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MN = MN.asInstanceOf[js.Any], MO = MO.asInstanceOf[js.Any], MP = MP.asInstanceOf[js.Any], MQ = MQ.asInstanceOf[js.Any], MR = MR.asInstanceOf[js.Any], MS = MS.asInstanceOf[js.Any], MT = MT.asInstanceOf[js.Any], MU = MU.asInstanceOf[js.Any], MV = MV.asInstanceOf[js.Any], MW = MW.asInstanceOf[js.Any], MX = MX.asInstanceOf[js.Any], MY = MY.asInstanceOf[js.Any], MZ = MZ.asInstanceOf[js.Any], NA = NA.asInstanceOf[js.Any], NC = NC.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], NF = NF.asInstanceOf[js.Any], NG = NG.asInstanceOf[js.Any], NI = NI.asInstanceOf[js.Any], NL = NL.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], NP = NP.asInstanceOf[js.Any], NR = NR.asInstanceOf[js.Any], NU = NU.asInstanceOf[js.Any], NZ = NZ.asInstanceOf[js.Any], OM = OM.asInstanceOf[js.Any], PA = PA.asInstanceOf[js.Any], PE = PE.asInstanceOf[js.Any], PF = PF.asInstanceOf[js.Any], PG = PG.asInstanceOf[js.Any], PH = PH.asInstanceOf[js.Any], PK = PK.asInstanceOf[js.Any], PL = PL.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], PR = PR.asInstanceOf[js.Any], PS = PS.asInstanceOf[js.Any], PT = PT.asInstanceOf[js.Any], PW = PW.asInstanceOf[js.Any], PY = PY.asInstanceOf[js.Any], QA = QA.asInstanceOf[js.Any], RE = RE.asInstanceOf[js.Any], RO = RO.asInstanceOf[js.Any], RS = RS.asInstanceOf[js.Any], RU = RU.asInstanceOf[js.Any], RW = RW.asInstanceOf[js.Any], SA = SA.asInstanceOf[js.Any], SB = SB.asInstanceOf[js.Any], SC = SC.asInstanceOf[js.Any], SD = SD.asInstanceOf[js.Any], SE = SE.asInstanceOf[js.Any], SG = SG.asInstanceOf[js.Any], SH = SH.asInstanceOf[js.Any], SI = SI.asInstanceOf[js.Any], SJ = SJ.asInstanceOf[js.Any], SK = SK.asInstanceOf[js.Any], SL = SL.asInstanceOf[js.Any], SM = SM.asInstanceOf[js.Any], SN = SN.asInstanceOf[js.Any], SO = SO.asInstanceOf[js.Any], SR = SR.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any], SV = SV.asInstanceOf[js.Any], SX = SX.asInstanceOf[js.Any], SY = SY.asInstanceOf[js.Any], SZ = SZ.asInstanceOf[js.Any], TA = TA.asInstanceOf[js.Any], TC = TC.asInstanceOf[js.Any], TD = TD.asInstanceOf[js.Any], TG = TG.asInstanceOf[js.Any], TH = TH.asInstanceOf[js.Any], TJ = TJ.asInstanceOf[js.Any], TK = TK.asInstanceOf[js.Any], TL = TL.asInstanceOf[js.Any], TM = TM.asInstanceOf[js.Any], TN = TN.asInstanceOf[js.Any], TO = TO.asInstanceOf[js.Any], TR = TR.asInstanceOf[js.Any], TT = TT.asInstanceOf[js.Any], TV = TV.asInstanceOf[js.Any], TW = TW.asInstanceOf[js.Any], TZ = TZ.asInstanceOf[js.Any], UA = UA.asInstanceOf[js.Any], UG = UG.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any], UY = UY.asInstanceOf[js.Any], UZ = UZ.asInstanceOf[js.Any], VA = VA.asInstanceOf[js.Any], VC = VC.asInstanceOf[js.Any], VE = VE.asInstanceOf[js.Any], VG = VG.asInstanceOf[js.Any], VI = VI.asInstanceOf[js.Any], VN = VN.asInstanceOf[js.Any], VU = VU.asInstanceOf[js.Any], WF = WF.asInstanceOf[js.Any], WS = WS.asInstanceOf[js.Any], XK = XK.asInstanceOf[js.Any], YE = YE.asInstanceOf[js.Any], YT = YT.asInstanceOf[js.Any], ZA = ZA.asInstanceOf[js.Any], ZM = ZM.asInstanceOf[js.Any], ZW = ZW.asInstanceOf[js.Any])
      __obj.updateDynamic("001")(`001`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Countries]
    }
    
    @scala.inline
    implicit class CountriesMutableBuilder[Self <: Countries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set001(value: js.Array[js.Any]): Self = StObject.set(x, "001", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set001Varargs(value: js.Any*): Self = StObject.set(x, "001", js.Array(value :_*))
      
      @scala.inline
      def setAC(value: js.Array[js.Any]): Self = StObject.set(x, "AC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setACVarargs(value: js.Any*): Self = StObject.set(x, "AC", js.Array(value :_*))
      
      @scala.inline
      def setAD(value: js.Array[js.Any]): Self = StObject.set(x, "AD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADVarargs(value: js.Any*): Self = StObject.set(x, "AD", js.Array(value :_*))
      
      @scala.inline
      def setAE(value: js.Array[js.Any]): Self = StObject.set(x, "AE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAEVarargs(value: js.Any*): Self = StObject.set(x, "AE", js.Array(value :_*))
      
      @scala.inline
      def setAF(value: js.Array[js.Any]): Self = StObject.set(x, "AF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAFVarargs(value: js.Any*): Self = StObject.set(x, "AF", js.Array(value :_*))
      
      @scala.inline
      def setAG(value: js.Array[js.Any]): Self = StObject.set(x, "AG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAGVarargs(value: js.Any*): Self = StObject.set(x, "AG", js.Array(value :_*))
      
      @scala.inline
      def setAI(value: js.Array[js.Any]): Self = StObject.set(x, "AI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAIVarargs(value: js.Any*): Self = StObject.set(x, "AI", js.Array(value :_*))
      
      @scala.inline
      def setAL(value: js.Array[js.Any]): Self = StObject.set(x, "AL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALVarargs(value: js.Any*): Self = StObject.set(x, "AL", js.Array(value :_*))
      
      @scala.inline
      def setAM(value: js.Array[js.Any]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAMVarargs(value: js.Any*): Self = StObject.set(x, "AM", js.Array(value :_*))
      
      @scala.inline
      def setAO(value: js.Array[js.Any]): Self = StObject.set(x, "AO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAOVarargs(value: js.Any*): Self = StObject.set(x, "AO", js.Array(value :_*))
      
      @scala.inline
      def setAR(value: js.Array[js.Any]): Self = StObject.set(x, "AR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setARVarargs(value: js.Any*): Self = StObject.set(x, "AR", js.Array(value :_*))
      
      @scala.inline
      def setAS(value: js.Array[js.Any]): Self = StObject.set(x, "AS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setASVarargs(value: js.Any*): Self = StObject.set(x, "AS", js.Array(value :_*))
      
      @scala.inline
      def setAT(value: js.Array[js.Any]): Self = StObject.set(x, "AT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setATVarargs(value: js.Any*): Self = StObject.set(x, "AT", js.Array(value :_*))
      
      @scala.inline
      def setAU(value: js.Array[js.Any]): Self = StObject.set(x, "AU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUVarargs(value: js.Any*): Self = StObject.set(x, "AU", js.Array(value :_*))
      
      @scala.inline
      def setAW(value: js.Array[js.Any]): Self = StObject.set(x, "AW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWVarargs(value: js.Any*): Self = StObject.set(x, "AW", js.Array(value :_*))
      
      @scala.inline
      def setAX(value: js.Array[js.Any]): Self = StObject.set(x, "AX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAXVarargs(value: js.Any*): Self = StObject.set(x, "AX", js.Array(value :_*))
      
      @scala.inline
      def setAZ(value: js.Array[js.Any]): Self = StObject.set(x, "AZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAZVarargs(value: js.Any*): Self = StObject.set(x, "AZ", js.Array(value :_*))
      
      @scala.inline
      def setBA(value: js.Array[js.Any]): Self = StObject.set(x, "BA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBAVarargs(value: js.Any*): Self = StObject.set(x, "BA", js.Array(value :_*))
      
      @scala.inline
      def setBB(value: js.Array[js.Any]): Self = StObject.set(x, "BB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBBVarargs(value: js.Any*): Self = StObject.set(x, "BB", js.Array(value :_*))
      
      @scala.inline
      def setBD(value: js.Array[js.Any]): Self = StObject.set(x, "BD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBDVarargs(value: js.Any*): Self = StObject.set(x, "BD", js.Array(value :_*))
      
      @scala.inline
      def setBE(value: js.Array[js.Any]): Self = StObject.set(x, "BE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBEVarargs(value: js.Any*): Self = StObject.set(x, "BE", js.Array(value :_*))
      
      @scala.inline
      def setBF(value: js.Array[js.Any]): Self = StObject.set(x, "BF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBFVarargs(value: js.Any*): Self = StObject.set(x, "BF", js.Array(value :_*))
      
      @scala.inline
      def setBG(value: js.Array[js.Any]): Self = StObject.set(x, "BG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBGVarargs(value: js.Any*): Self = StObject.set(x, "BG", js.Array(value :_*))
      
      @scala.inline
      def setBH(value: js.Array[js.Any]): Self = StObject.set(x, "BH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBHVarargs(value: js.Any*): Self = StObject.set(x, "BH", js.Array(value :_*))
      
      @scala.inline
      def setBI(value: js.Array[js.Any]): Self = StObject.set(x, "BI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBIVarargs(value: js.Any*): Self = StObject.set(x, "BI", js.Array(value :_*))
      
      @scala.inline
      def setBJ(value: js.Array[js.Any]): Self = StObject.set(x, "BJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBJVarargs(value: js.Any*): Self = StObject.set(x, "BJ", js.Array(value :_*))
      
      @scala.inline
      def setBL(value: js.Array[js.Any]): Self = StObject.set(x, "BL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBLVarargs(value: js.Any*): Self = StObject.set(x, "BL", js.Array(value :_*))
      
      @scala.inline
      def setBM(value: js.Array[js.Any]): Self = StObject.set(x, "BM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBMVarargs(value: js.Any*): Self = StObject.set(x, "BM", js.Array(value :_*))
      
      @scala.inline
      def setBN(value: js.Array[js.Any]): Self = StObject.set(x, "BN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBNVarargs(value: js.Any*): Self = StObject.set(x, "BN", js.Array(value :_*))
      
      @scala.inline
      def setBO(value: js.Array[js.Any]): Self = StObject.set(x, "BO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOVarargs(value: js.Any*): Self = StObject.set(x, "BO", js.Array(value :_*))
      
      @scala.inline
      def setBQ(value: js.Array[js.Any]): Self = StObject.set(x, "BQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBQVarargs(value: js.Any*): Self = StObject.set(x, "BQ", js.Array(value :_*))
      
      @scala.inline
      def setBR(value: js.Array[js.Any]): Self = StObject.set(x, "BR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBRVarargs(value: js.Any*): Self = StObject.set(x, "BR", js.Array(value :_*))
      
      @scala.inline
      def setBS(value: js.Array[js.Any]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSVarargs(value: js.Any*): Self = StObject.set(x, "BS", js.Array(value :_*))
      
      @scala.inline
      def setBT(value: js.Array[js.Any]): Self = StObject.set(x, "BT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBTVarargs(value: js.Any*): Self = StObject.set(x, "BT", js.Array(value :_*))
      
      @scala.inline
      def setBW(value: js.Array[js.Any]): Self = StObject.set(x, "BW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBWVarargs(value: js.Any*): Self = StObject.set(x, "BW", js.Array(value :_*))
      
      @scala.inline
      def setBY(value: js.Array[js.Any]): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBYVarargs(value: js.Any*): Self = StObject.set(x, "BY", js.Array(value :_*))
      
      @scala.inline
      def setBZ(value: js.Array[js.Any]): Self = StObject.set(x, "BZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBZVarargs(value: js.Any*): Self = StObject.set(x, "BZ", js.Array(value :_*))
      
      @scala.inline
      def setCA(value: js.Array[js.Any]): Self = StObject.set(x, "CA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAVarargs(value: js.Any*): Self = StObject.set(x, "CA", js.Array(value :_*))
      
      @scala.inline
      def setCC(value: js.Array[js.Any]): Self = StObject.set(x, "CC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCCVarargs(value: js.Any*): Self = StObject.set(x, "CC", js.Array(value :_*))
      
      @scala.inline
      def setCD(value: js.Array[js.Any]): Self = StObject.set(x, "CD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCDVarargs(value: js.Any*): Self = StObject.set(x, "CD", js.Array(value :_*))
      
      @scala.inline
      def setCF(value: js.Array[js.Any]): Self = StObject.set(x, "CF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCFVarargs(value: js.Any*): Self = StObject.set(x, "CF", js.Array(value :_*))
      
      @scala.inline
      def setCG(value: js.Array[js.Any]): Self = StObject.set(x, "CG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCGVarargs(value: js.Any*): Self = StObject.set(x, "CG", js.Array(value :_*))
      
      @scala.inline
      def setCH(value: js.Array[js.Any]): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCHVarargs(value: js.Any*): Self = StObject.set(x, "CH", js.Array(value :_*))
      
      @scala.inline
      def setCI(value: js.Array[js.Any]): Self = StObject.set(x, "CI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCIVarargs(value: js.Any*): Self = StObject.set(x, "CI", js.Array(value :_*))
      
      @scala.inline
      def setCK(value: js.Array[js.Any]): Self = StObject.set(x, "CK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCKVarargs(value: js.Any*): Self = StObject.set(x, "CK", js.Array(value :_*))
      
      @scala.inline
      def setCL(value: js.Array[js.Any]): Self = StObject.set(x, "CL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLVarargs(value: js.Any*): Self = StObject.set(x, "CL", js.Array(value :_*))
      
      @scala.inline
      def setCM(value: js.Array[js.Any]): Self = StObject.set(x, "CM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCMVarargs(value: js.Any*): Self = StObject.set(x, "CM", js.Array(value :_*))
      
      @scala.inline
      def setCN(value: js.Array[js.Any]): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCNVarargs(value: js.Any*): Self = StObject.set(x, "CN", js.Array(value :_*))
      
      @scala.inline
      def setCO(value: js.Array[js.Any]): Self = StObject.set(x, "CO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOVarargs(value: js.Any*): Self = StObject.set(x, "CO", js.Array(value :_*))
      
      @scala.inline
      def setCR(value: js.Array[js.Any]): Self = StObject.set(x, "CR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCRVarargs(value: js.Any*): Self = StObject.set(x, "CR", js.Array(value :_*))
      
      @scala.inline
      def setCU(value: js.Array[js.Any]): Self = StObject.set(x, "CU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUVarargs(value: js.Any*): Self = StObject.set(x, "CU", js.Array(value :_*))
      
      @scala.inline
      def setCV(value: js.Array[js.Any]): Self = StObject.set(x, "CV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCVVarargs(value: js.Any*): Self = StObject.set(x, "CV", js.Array(value :_*))
      
      @scala.inline
      def setCW(value: js.Array[js.Any]): Self = StObject.set(x, "CW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCWVarargs(value: js.Any*): Self = StObject.set(x, "CW", js.Array(value :_*))
      
      @scala.inline
      def setCX(value: js.Array[js.Any]): Self = StObject.set(x, "CX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCXVarargs(value: js.Any*): Self = StObject.set(x, "CX", js.Array(value :_*))
      
      @scala.inline
      def setCY(value: js.Array[js.Any]): Self = StObject.set(x, "CY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCYVarargs(value: js.Any*): Self = StObject.set(x, "CY", js.Array(value :_*))
      
      @scala.inline
      def setCZ(value: js.Array[js.Any]): Self = StObject.set(x, "CZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCZVarargs(value: js.Any*): Self = StObject.set(x, "CZ", js.Array(value :_*))
      
      @scala.inline
      def setDE(value: js.Array[js.Any]): Self = StObject.set(x, "DE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDEVarargs(value: js.Any*): Self = StObject.set(x, "DE", js.Array(value :_*))
      
      @scala.inline
      def setDJ(value: js.Array[js.Any]): Self = StObject.set(x, "DJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDJVarargs(value: js.Any*): Self = StObject.set(x, "DJ", js.Array(value :_*))
      
      @scala.inline
      def setDK(value: js.Array[js.Any]): Self = StObject.set(x, "DK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDKVarargs(value: js.Any*): Self = StObject.set(x, "DK", js.Array(value :_*))
      
      @scala.inline
      def setDM(value: js.Array[js.Any]): Self = StObject.set(x, "DM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDMVarargs(value: js.Any*): Self = StObject.set(x, "DM", js.Array(value :_*))
      
      @scala.inline
      def setDO(value: js.Array[js.Any]): Self = StObject.set(x, "DO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOVarargs(value: js.Any*): Self = StObject.set(x, "DO", js.Array(value :_*))
      
      @scala.inline
      def setDZ(value: js.Array[js.Any]): Self = StObject.set(x, "DZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDZVarargs(value: js.Any*): Self = StObject.set(x, "DZ", js.Array(value :_*))
      
      @scala.inline
      def setEC(value: js.Array[js.Any]): Self = StObject.set(x, "EC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setECVarargs(value: js.Any*): Self = StObject.set(x, "EC", js.Array(value :_*))
      
      @scala.inline
      def setEE(value: js.Array[js.Any]): Self = StObject.set(x, "EE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEEVarargs(value: js.Any*): Self = StObject.set(x, "EE", js.Array(value :_*))
      
      @scala.inline
      def setEG(value: js.Array[js.Any]): Self = StObject.set(x, "EG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEGVarargs(value: js.Any*): Self = StObject.set(x, "EG", js.Array(value :_*))
      
      @scala.inline
      def setEH(value: js.Array[js.Any]): Self = StObject.set(x, "EH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEHVarargs(value: js.Any*): Self = StObject.set(x, "EH", js.Array(value :_*))
      
      @scala.inline
      def setER(value: js.Array[js.Any]): Self = StObject.set(x, "ER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERVarargs(value: js.Any*): Self = StObject.set(x, "ER", js.Array(value :_*))
      
      @scala.inline
      def setES(value: js.Array[js.Any]): Self = StObject.set(x, "ES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setESVarargs(value: js.Any*): Self = StObject.set(x, "ES", js.Array(value :_*))
      
      @scala.inline
      def setET(value: js.Array[js.Any]): Self = StObject.set(x, "ET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setETVarargs(value: js.Any*): Self = StObject.set(x, "ET", js.Array(value :_*))
      
      @scala.inline
      def setFI(value: js.Array[js.Any]): Self = StObject.set(x, "FI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIVarargs(value: js.Any*): Self = StObject.set(x, "FI", js.Array(value :_*))
      
      @scala.inline
      def setFJ(value: js.Array[js.Any]): Self = StObject.set(x, "FJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFJVarargs(value: js.Any*): Self = StObject.set(x, "FJ", js.Array(value :_*))
      
      @scala.inline
      def setFK(value: js.Array[js.Any]): Self = StObject.set(x, "FK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFKVarargs(value: js.Any*): Self = StObject.set(x, "FK", js.Array(value :_*))
      
      @scala.inline
      def setFM(value: js.Array[js.Any]): Self = StObject.set(x, "FM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFMVarargs(value: js.Any*): Self = StObject.set(x, "FM", js.Array(value :_*))
      
      @scala.inline
      def setFO(value: js.Array[js.Any]): Self = StObject.set(x, "FO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFOVarargs(value: js.Any*): Self = StObject.set(x, "FO", js.Array(value :_*))
      
      @scala.inline
      def setFR(value: js.Array[js.Any]): Self = StObject.set(x, "FR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFRVarargs(value: js.Any*): Self = StObject.set(x, "FR", js.Array(value :_*))
      
      @scala.inline
      def setGA(value: js.Array[js.Any]): Self = StObject.set(x, "GA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGAVarargs(value: js.Any*): Self = StObject.set(x, "GA", js.Array(value :_*))
      
      @scala.inline
      def setGB(value: js.Array[js.Any]): Self = StObject.set(x, "GB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGBVarargs(value: js.Any*): Self = StObject.set(x, "GB", js.Array(value :_*))
      
      @scala.inline
      def setGD(value: js.Array[js.Any]): Self = StObject.set(x, "GD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGDVarargs(value: js.Any*): Self = StObject.set(x, "GD", js.Array(value :_*))
      
      @scala.inline
      def setGE(value: js.Array[js.Any]): Self = StObject.set(x, "GE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGEVarargs(value: js.Any*): Self = StObject.set(x, "GE", js.Array(value :_*))
      
      @scala.inline
      def setGF(value: js.Array[js.Any]): Self = StObject.set(x, "GF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGFVarargs(value: js.Any*): Self = StObject.set(x, "GF", js.Array(value :_*))
      
      @scala.inline
      def setGG(value: js.Array[js.Any]): Self = StObject.set(x, "GG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGGVarargs(value: js.Any*): Self = StObject.set(x, "GG", js.Array(value :_*))
      
      @scala.inline
      def setGH(value: js.Array[js.Any]): Self = StObject.set(x, "GH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGHVarargs(value: js.Any*): Self = StObject.set(x, "GH", js.Array(value :_*))
      
      @scala.inline
      def setGI(value: js.Array[js.Any]): Self = StObject.set(x, "GI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGIVarargs(value: js.Any*): Self = StObject.set(x, "GI", js.Array(value :_*))
      
      @scala.inline
      def setGL(value: js.Array[js.Any]): Self = StObject.set(x, "GL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGLVarargs(value: js.Any*): Self = StObject.set(x, "GL", js.Array(value :_*))
      
      @scala.inline
      def setGM(value: js.Array[js.Any]): Self = StObject.set(x, "GM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGMVarargs(value: js.Any*): Self = StObject.set(x, "GM", js.Array(value :_*))
      
      @scala.inline
      def setGN(value: js.Array[js.Any]): Self = StObject.set(x, "GN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGNVarargs(value: js.Any*): Self = StObject.set(x, "GN", js.Array(value :_*))
      
      @scala.inline
      def setGP(value: js.Array[js.Any]): Self = StObject.set(x, "GP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGPVarargs(value: js.Any*): Self = StObject.set(x, "GP", js.Array(value :_*))
      
      @scala.inline
      def setGQ(value: js.Array[js.Any]): Self = StObject.set(x, "GQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGQVarargs(value: js.Any*): Self = StObject.set(x, "GQ", js.Array(value :_*))
      
      @scala.inline
      def setGR(value: js.Array[js.Any]): Self = StObject.set(x, "GR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRVarargs(value: js.Any*): Self = StObject.set(x, "GR", js.Array(value :_*))
      
      @scala.inline
      def setGT(value: js.Array[js.Any]): Self = StObject.set(x, "GT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGTVarargs(value: js.Any*): Self = StObject.set(x, "GT", js.Array(value :_*))
      
      @scala.inline
      def setGU(value: js.Array[js.Any]): Self = StObject.set(x, "GU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGUVarargs(value: js.Any*): Self = StObject.set(x, "GU", js.Array(value :_*))
      
      @scala.inline
      def setGW(value: js.Array[js.Any]): Self = StObject.set(x, "GW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGWVarargs(value: js.Any*): Self = StObject.set(x, "GW", js.Array(value :_*))
      
      @scala.inline
      def setGY(value: js.Array[js.Any]): Self = StObject.set(x, "GY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGYVarargs(value: js.Any*): Self = StObject.set(x, "GY", js.Array(value :_*))
      
      @scala.inline
      def setHK(value: js.Array[js.Any]): Self = StObject.set(x, "HK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHKVarargs(value: js.Any*): Self = StObject.set(x, "HK", js.Array(value :_*))
      
      @scala.inline
      def setHN(value: js.Array[js.Any]): Self = StObject.set(x, "HN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHNVarargs(value: js.Any*): Self = StObject.set(x, "HN", js.Array(value :_*))
      
      @scala.inline
      def setHR(value: js.Array[js.Any]): Self = StObject.set(x, "HR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHRVarargs(value: js.Any*): Self = StObject.set(x, "HR", js.Array(value :_*))
      
      @scala.inline
      def setHT(value: js.Array[js.Any]): Self = StObject.set(x, "HT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHTVarargs(value: js.Any*): Self = StObject.set(x, "HT", js.Array(value :_*))
      
      @scala.inline
      def setHU(value: js.Array[js.Any]): Self = StObject.set(x, "HU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUVarargs(value: js.Any*): Self = StObject.set(x, "HU", js.Array(value :_*))
      
      @scala.inline
      def setID(value: js.Array[js.Any]): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDVarargs(value: js.Any*): Self = StObject.set(x, "ID", js.Array(value :_*))
      
      @scala.inline
      def setIE(value: js.Array[js.Any]): Self = StObject.set(x, "IE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIEVarargs(value: js.Any*): Self = StObject.set(x, "IE", js.Array(value :_*))
      
      @scala.inline
      def setIL(value: js.Array[js.Any]): Self = StObject.set(x, "IL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setILVarargs(value: js.Any*): Self = StObject.set(x, "IL", js.Array(value :_*))
      
      @scala.inline
      def setIM(value: js.Array[js.Any]): Self = StObject.set(x, "IM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMVarargs(value: js.Any*): Self = StObject.set(x, "IM", js.Array(value :_*))
      
      @scala.inline
      def setIN(value: js.Array[js.Any]): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINVarargs(value: js.Any*): Self = StObject.set(x, "IN", js.Array(value :_*))
      
      @scala.inline
      def setIO(value: js.Array[js.Any]): Self = StObject.set(x, "IO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIOVarargs(value: js.Any*): Self = StObject.set(x, "IO", js.Array(value :_*))
      
      @scala.inline
      def setIQ(value: js.Array[js.Any]): Self = StObject.set(x, "IQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIQVarargs(value: js.Any*): Self = StObject.set(x, "IQ", js.Array(value :_*))
      
      @scala.inline
      def setIR(value: js.Array[js.Any]): Self = StObject.set(x, "IR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIRVarargs(value: js.Any*): Self = StObject.set(x, "IR", js.Array(value :_*))
      
      @scala.inline
      def setIS(value: js.Array[js.Any]): Self = StObject.set(x, "IS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISVarargs(value: js.Any*): Self = StObject.set(x, "IS", js.Array(value :_*))
      
      @scala.inline
      def setIT(value: js.Array[js.Any]): Self = StObject.set(x, "IT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setITVarargs(value: js.Any*): Self = StObject.set(x, "IT", js.Array(value :_*))
      
      @scala.inline
      def setJE(value: js.Array[js.Any]): Self = StObject.set(x, "JE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJEVarargs(value: js.Any*): Self = StObject.set(x, "JE", js.Array(value :_*))
      
      @scala.inline
      def setJM(value: js.Array[js.Any]): Self = StObject.set(x, "JM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJMVarargs(value: js.Any*): Self = StObject.set(x, "JM", js.Array(value :_*))
      
      @scala.inline
      def setJO(value: js.Array[js.Any]): Self = StObject.set(x, "JO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJOVarargs(value: js.Any*): Self = StObject.set(x, "JO", js.Array(value :_*))
      
      @scala.inline
      def setJP(value: js.Array[js.Any]): Self = StObject.set(x, "JP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJPVarargs(value: js.Any*): Self = StObject.set(x, "JP", js.Array(value :_*))
      
      @scala.inline
      def setKE(value: js.Array[js.Any]): Self = StObject.set(x, "KE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKEVarargs(value: js.Any*): Self = StObject.set(x, "KE", js.Array(value :_*))
      
      @scala.inline
      def setKG(value: js.Array[js.Any]): Self = StObject.set(x, "KG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKGVarargs(value: js.Any*): Self = StObject.set(x, "KG", js.Array(value :_*))
      
      @scala.inline
      def setKH(value: js.Array[js.Any]): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKHVarargs(value: js.Any*): Self = StObject.set(x, "KH", js.Array(value :_*))
      
      @scala.inline
      def setKI(value: js.Array[js.Any]): Self = StObject.set(x, "KI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKIVarargs(value: js.Any*): Self = StObject.set(x, "KI", js.Array(value :_*))
      
      @scala.inline
      def setKM(value: js.Array[js.Any]): Self = StObject.set(x, "KM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKMVarargs(value: js.Any*): Self = StObject.set(x, "KM", js.Array(value :_*))
      
      @scala.inline
      def setKN(value: js.Array[js.Any]): Self = StObject.set(x, "KN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKNVarargs(value: js.Any*): Self = StObject.set(x, "KN", js.Array(value :_*))
      
      @scala.inline
      def setKP(value: js.Array[js.Any]): Self = StObject.set(x, "KP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKPVarargs(value: js.Any*): Self = StObject.set(x, "KP", js.Array(value :_*))
      
      @scala.inline
      def setKR(value: js.Array[js.Any]): Self = StObject.set(x, "KR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKRVarargs(value: js.Any*): Self = StObject.set(x, "KR", js.Array(value :_*))
      
      @scala.inline
      def setKW(value: js.Array[js.Any]): Self = StObject.set(x, "KW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKWVarargs(value: js.Any*): Self = StObject.set(x, "KW", js.Array(value :_*))
      
      @scala.inline
      def setKY(value: js.Array[js.Any]): Self = StObject.set(x, "KY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKYVarargs(value: js.Any*): Self = StObject.set(x, "KY", js.Array(value :_*))
      
      @scala.inline
      def setKZ(value: js.Array[js.Any]): Self = StObject.set(x, "KZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKZVarargs(value: js.Any*): Self = StObject.set(x, "KZ", js.Array(value :_*))
      
      @scala.inline
      def setLA(value: js.Array[js.Any]): Self = StObject.set(x, "LA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLAVarargs(value: js.Any*): Self = StObject.set(x, "LA", js.Array(value :_*))
      
      @scala.inline
      def setLB(value: js.Array[js.Any]): Self = StObject.set(x, "LB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLBVarargs(value: js.Any*): Self = StObject.set(x, "LB", js.Array(value :_*))
      
      @scala.inline
      def setLC(value: js.Array[js.Any]): Self = StObject.set(x, "LC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLCVarargs(value: js.Any*): Self = StObject.set(x, "LC", js.Array(value :_*))
      
      @scala.inline
      def setLI(value: js.Array[js.Any]): Self = StObject.set(x, "LI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLIVarargs(value: js.Any*): Self = StObject.set(x, "LI", js.Array(value :_*))
      
      @scala.inline
      def setLK(value: js.Array[js.Any]): Self = StObject.set(x, "LK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLKVarargs(value: js.Any*): Self = StObject.set(x, "LK", js.Array(value :_*))
      
      @scala.inline
      def setLR(value: js.Array[js.Any]): Self = StObject.set(x, "LR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLRVarargs(value: js.Any*): Self = StObject.set(x, "LR", js.Array(value :_*))
      
      @scala.inline
      def setLS(value: js.Array[js.Any]): Self = StObject.set(x, "LS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLSVarargs(value: js.Any*): Self = StObject.set(x, "LS", js.Array(value :_*))
      
      @scala.inline
      def setLT(value: js.Array[js.Any]): Self = StObject.set(x, "LT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLTVarargs(value: js.Any*): Self = StObject.set(x, "LT", js.Array(value :_*))
      
      @scala.inline
      def setLU(value: js.Array[js.Any]): Self = StObject.set(x, "LU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUVarargs(value: js.Any*): Self = StObject.set(x, "LU", js.Array(value :_*))
      
      @scala.inline
      def setLV(value: js.Array[js.Any]): Self = StObject.set(x, "LV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLVVarargs(value: js.Any*): Self = StObject.set(x, "LV", js.Array(value :_*))
      
      @scala.inline
      def setLY(value: js.Array[js.Any]): Self = StObject.set(x, "LY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLYVarargs(value: js.Any*): Self = StObject.set(x, "LY", js.Array(value :_*))
      
      @scala.inline
      def setMA(value: js.Array[js.Any]): Self = StObject.set(x, "MA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAVarargs(value: js.Any*): Self = StObject.set(x, "MA", js.Array(value :_*))
      
      @scala.inline
      def setMC(value: js.Array[js.Any]): Self = StObject.set(x, "MC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMCVarargs(value: js.Any*): Self = StObject.set(x, "MC", js.Array(value :_*))
      
      @scala.inline
      def setMD(value: js.Array[js.Any]): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMDVarargs(value: js.Any*): Self = StObject.set(x, "MD", js.Array(value :_*))
      
      @scala.inline
      def setME(value: js.Array[js.Any]): Self = StObject.set(x, "ME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEVarargs(value: js.Any*): Self = StObject.set(x, "ME", js.Array(value :_*))
      
      @scala.inline
      def setMF(value: js.Array[js.Any]): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMFVarargs(value: js.Any*): Self = StObject.set(x, "MF", js.Array(value :_*))
      
      @scala.inline
      def setMG(value: js.Array[js.Any]): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMGVarargs(value: js.Any*): Self = StObject.set(x, "MG", js.Array(value :_*))
      
      @scala.inline
      def setMH(value: js.Array[js.Any]): Self = StObject.set(x, "MH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMHVarargs(value: js.Any*): Self = StObject.set(x, "MH", js.Array(value :_*))
      
      @scala.inline
      def setMK(value: js.Array[js.Any]): Self = StObject.set(x, "MK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMKVarargs(value: js.Any*): Self = StObject.set(x, "MK", js.Array(value :_*))
      
      @scala.inline
      def setML(value: js.Array[js.Any]): Self = StObject.set(x, "ML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMLVarargs(value: js.Any*): Self = StObject.set(x, "ML", js.Array(value :_*))
      
      @scala.inline
      def setMM(value: js.Array[js.Any]): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMMVarargs(value: js.Any*): Self = StObject.set(x, "MM", js.Array(value :_*))
      
      @scala.inline
      def setMN(value: js.Array[js.Any]): Self = StObject.set(x, "MN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMNVarargs(value: js.Any*): Self = StObject.set(x, "MN", js.Array(value :_*))
      
      @scala.inline
      def setMO(value: js.Array[js.Any]): Self = StObject.set(x, "MO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOVarargs(value: js.Any*): Self = StObject.set(x, "MO", js.Array(value :_*))
      
      @scala.inline
      def setMP(value: js.Array[js.Any]): Self = StObject.set(x, "MP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPVarargs(value: js.Any*): Self = StObject.set(x, "MP", js.Array(value :_*))
      
      @scala.inline
      def setMQ(value: js.Array[js.Any]): Self = StObject.set(x, "MQ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMQVarargs(value: js.Any*): Self = StObject.set(x, "MQ", js.Array(value :_*))
      
      @scala.inline
      def setMR(value: js.Array[js.Any]): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMRVarargs(value: js.Any*): Self = StObject.set(x, "MR", js.Array(value :_*))
      
      @scala.inline
      def setMS(value: js.Array[js.Any]): Self = StObject.set(x, "MS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSVarargs(value: js.Any*): Self = StObject.set(x, "MS", js.Array(value :_*))
      
      @scala.inline
      def setMT(value: js.Array[js.Any]): Self = StObject.set(x, "MT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMTVarargs(value: js.Any*): Self = StObject.set(x, "MT", js.Array(value :_*))
      
      @scala.inline
      def setMU(value: js.Array[js.Any]): Self = StObject.set(x, "MU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUVarargs(value: js.Any*): Self = StObject.set(x, "MU", js.Array(value :_*))
      
      @scala.inline
      def setMV(value: js.Array[js.Any]): Self = StObject.set(x, "MV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMVVarargs(value: js.Any*): Self = StObject.set(x, "MV", js.Array(value :_*))
      
      @scala.inline
      def setMW(value: js.Array[js.Any]): Self = StObject.set(x, "MW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMWVarargs(value: js.Any*): Self = StObject.set(x, "MW", js.Array(value :_*))
      
      @scala.inline
      def setMX(value: js.Array[js.Any]): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMXVarargs(value: js.Any*): Self = StObject.set(x, "MX", js.Array(value :_*))
      
      @scala.inline
      def setMY(value: js.Array[js.Any]): Self = StObject.set(x, "MY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMYVarargs(value: js.Any*): Self = StObject.set(x, "MY", js.Array(value :_*))
      
      @scala.inline
      def setMZ(value: js.Array[js.Any]): Self = StObject.set(x, "MZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMZVarargs(value: js.Any*): Self = StObject.set(x, "MZ", js.Array(value :_*))
      
      @scala.inline
      def setNA(value: js.Array[js.Any]): Self = StObject.set(x, "NA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNAVarargs(value: js.Any*): Self = StObject.set(x, "NA", js.Array(value :_*))
      
      @scala.inline
      def setNC(value: js.Array[js.Any]): Self = StObject.set(x, "NC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNCVarargs(value: js.Any*): Self = StObject.set(x, "NC", js.Array(value :_*))
      
      @scala.inline
      def setNE(value: js.Array[js.Any]): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNEVarargs(value: js.Any*): Self = StObject.set(x, "NE", js.Array(value :_*))
      
      @scala.inline
      def setNF(value: js.Array[js.Any]): Self = StObject.set(x, "NF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNFVarargs(value: js.Any*): Self = StObject.set(x, "NF", js.Array(value :_*))
      
      @scala.inline
      def setNG(value: js.Array[js.Any]): Self = StObject.set(x, "NG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNGVarargs(value: js.Any*): Self = StObject.set(x, "NG", js.Array(value :_*))
      
      @scala.inline
      def setNI(value: js.Array[js.Any]): Self = StObject.set(x, "NI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNIVarargs(value: js.Any*): Self = StObject.set(x, "NI", js.Array(value :_*))
      
      @scala.inline
      def setNL(value: js.Array[js.Any]): Self = StObject.set(x, "NL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNLVarargs(value: js.Any*): Self = StObject.set(x, "NL", js.Array(value :_*))
      
      @scala.inline
      def setNO(value: js.Array[js.Any]): Self = StObject.set(x, "NO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOVarargs(value: js.Any*): Self = StObject.set(x, "NO", js.Array(value :_*))
      
      @scala.inline
      def setNP(value: js.Array[js.Any]): Self = StObject.set(x, "NP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNPVarargs(value: js.Any*): Self = StObject.set(x, "NP", js.Array(value :_*))
      
      @scala.inline
      def setNR(value: js.Array[js.Any]): Self = StObject.set(x, "NR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNRVarargs(value: js.Any*): Self = StObject.set(x, "NR", js.Array(value :_*))
      
      @scala.inline
      def setNU(value: js.Array[js.Any]): Self = StObject.set(x, "NU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUVarargs(value: js.Any*): Self = StObject.set(x, "NU", js.Array(value :_*))
      
      @scala.inline
      def setNZ(value: js.Array[js.Any]): Self = StObject.set(x, "NZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNZVarargs(value: js.Any*): Self = StObject.set(x, "NZ", js.Array(value :_*))
      
      @scala.inline
      def setOM(value: js.Array[js.Any]): Self = StObject.set(x, "OM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOMVarargs(value: js.Any*): Self = StObject.set(x, "OM", js.Array(value :_*))
      
      @scala.inline
      def setPA(value: js.Array[js.Any]): Self = StObject.set(x, "PA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPAVarargs(value: js.Any*): Self = StObject.set(x, "PA", js.Array(value :_*))
      
      @scala.inline
      def setPE(value: js.Array[js.Any]): Self = StObject.set(x, "PE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPEVarargs(value: js.Any*): Self = StObject.set(x, "PE", js.Array(value :_*))
      
      @scala.inline
      def setPF(value: js.Array[js.Any]): Self = StObject.set(x, "PF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPFVarargs(value: js.Any*): Self = StObject.set(x, "PF", js.Array(value :_*))
      
      @scala.inline
      def setPG(value: js.Array[js.Any]): Self = StObject.set(x, "PG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPGVarargs(value: js.Any*): Self = StObject.set(x, "PG", js.Array(value :_*))
      
      @scala.inline
      def setPH(value: js.Array[js.Any]): Self = StObject.set(x, "PH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPHVarargs(value: js.Any*): Self = StObject.set(x, "PH", js.Array(value :_*))
      
      @scala.inline
      def setPK(value: js.Array[js.Any]): Self = StObject.set(x, "PK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPKVarargs(value: js.Any*): Self = StObject.set(x, "PK", js.Array(value :_*))
      
      @scala.inline
      def setPL(value: js.Array[js.Any]): Self = StObject.set(x, "PL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLVarargs(value: js.Any*): Self = StObject.set(x, "PL", js.Array(value :_*))
      
      @scala.inline
      def setPM(value: js.Array[js.Any]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPMVarargs(value: js.Any*): Self = StObject.set(x, "PM", js.Array(value :_*))
      
      @scala.inline
      def setPR(value: js.Array[js.Any]): Self = StObject.set(x, "PR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPRVarargs(value: js.Any*): Self = StObject.set(x, "PR", js.Array(value :_*))
      
      @scala.inline
      def setPS(value: js.Array[js.Any]): Self = StObject.set(x, "PS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPSVarargs(value: js.Any*): Self = StObject.set(x, "PS", js.Array(value :_*))
      
      @scala.inline
      def setPT(value: js.Array[js.Any]): Self = StObject.set(x, "PT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPTVarargs(value: js.Any*): Self = StObject.set(x, "PT", js.Array(value :_*))
      
      @scala.inline
      def setPW(value: js.Array[js.Any]): Self = StObject.set(x, "PW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPWVarargs(value: js.Any*): Self = StObject.set(x, "PW", js.Array(value :_*))
      
      @scala.inline
      def setPY(value: js.Array[js.Any]): Self = StObject.set(x, "PY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPYVarargs(value: js.Any*): Self = StObject.set(x, "PY", js.Array(value :_*))
      
      @scala.inline
      def setQA(value: js.Array[js.Any]): Self = StObject.set(x, "QA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQAVarargs(value: js.Any*): Self = StObject.set(x, "QA", js.Array(value :_*))
      
      @scala.inline
      def setRE(value: js.Array[js.Any]): Self = StObject.set(x, "RE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREVarargs(value: js.Any*): Self = StObject.set(x, "RE", js.Array(value :_*))
      
      @scala.inline
      def setRO(value: js.Array[js.Any]): Self = StObject.set(x, "RO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setROVarargs(value: js.Any*): Self = StObject.set(x, "RO", js.Array(value :_*))
      
      @scala.inline
      def setRS(value: js.Array[js.Any]): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRSVarargs(value: js.Any*): Self = StObject.set(x, "RS", js.Array(value :_*))
      
      @scala.inline
      def setRU(value: js.Array[js.Any]): Self = StObject.set(x, "RU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUVarargs(value: js.Any*): Self = StObject.set(x, "RU", js.Array(value :_*))
      
      @scala.inline
      def setRW(value: js.Array[js.Any]): Self = StObject.set(x, "RW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRWVarargs(value: js.Any*): Self = StObject.set(x, "RW", js.Array(value :_*))
      
      @scala.inline
      def setSA(value: js.Array[js.Any]): Self = StObject.set(x, "SA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSAVarargs(value: js.Any*): Self = StObject.set(x, "SA", js.Array(value :_*))
      
      @scala.inline
      def setSB(value: js.Array[js.Any]): Self = StObject.set(x, "SB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSBVarargs(value: js.Any*): Self = StObject.set(x, "SB", js.Array(value :_*))
      
      @scala.inline
      def setSC(value: js.Array[js.Any]): Self = StObject.set(x, "SC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCVarargs(value: js.Any*): Self = StObject.set(x, "SC", js.Array(value :_*))
      
      @scala.inline
      def setSD(value: js.Array[js.Any]): Self = StObject.set(x, "SD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSDVarargs(value: js.Any*): Self = StObject.set(x, "SD", js.Array(value :_*))
      
      @scala.inline
      def setSE(value: js.Array[js.Any]): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEVarargs(value: js.Any*): Self = StObject.set(x, "SE", js.Array(value :_*))
      
      @scala.inline
      def setSG(value: js.Array[js.Any]): Self = StObject.set(x, "SG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSGVarargs(value: js.Any*): Self = StObject.set(x, "SG", js.Array(value :_*))
      
      @scala.inline
      def setSH(value: js.Array[js.Any]): Self = StObject.set(x, "SH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSHVarargs(value: js.Any*): Self = StObject.set(x, "SH", js.Array(value :_*))
      
      @scala.inline
      def setSI(value: js.Array[js.Any]): Self = StObject.set(x, "SI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIVarargs(value: js.Any*): Self = StObject.set(x, "SI", js.Array(value :_*))
      
      @scala.inline
      def setSJ(value: js.Array[js.Any]): Self = StObject.set(x, "SJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSJVarargs(value: js.Any*): Self = StObject.set(x, "SJ", js.Array(value :_*))
      
      @scala.inline
      def setSK(value: js.Array[js.Any]): Self = StObject.set(x, "SK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSKVarargs(value: js.Any*): Self = StObject.set(x, "SK", js.Array(value :_*))
      
      @scala.inline
      def setSL(value: js.Array[js.Any]): Self = StObject.set(x, "SL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSLVarargs(value: js.Any*): Self = StObject.set(x, "SL", js.Array(value :_*))
      
      @scala.inline
      def setSM(value: js.Array[js.Any]): Self = StObject.set(x, "SM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMVarargs(value: js.Any*): Self = StObject.set(x, "SM", js.Array(value :_*))
      
      @scala.inline
      def setSN(value: js.Array[js.Any]): Self = StObject.set(x, "SN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSNVarargs(value: js.Any*): Self = StObject.set(x, "SN", js.Array(value :_*))
      
      @scala.inline
      def setSO(value: js.Array[js.Any]): Self = StObject.set(x, "SO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSOVarargs(value: js.Any*): Self = StObject.set(x, "SO", js.Array(value :_*))
      
      @scala.inline
      def setSR(value: js.Array[js.Any]): Self = StObject.set(x, "SR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSRVarargs(value: js.Any*): Self = StObject.set(x, "SR", js.Array(value :_*))
      
      @scala.inline
      def setSS(value: js.Array[js.Any]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSVarargs(value: js.Any*): Self = StObject.set(x, "SS", js.Array(value :_*))
      
      @scala.inline
      def setST(value: js.Array[js.Any]): Self = StObject.set(x, "ST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTVarargs(value: js.Any*): Self = StObject.set(x, "ST", js.Array(value :_*))
      
      @scala.inline
      def setSV(value: js.Array[js.Any]): Self = StObject.set(x, "SV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSVVarargs(value: js.Any*): Self = StObject.set(x, "SV", js.Array(value :_*))
      
      @scala.inline
      def setSX(value: js.Array[js.Any]): Self = StObject.set(x, "SX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSXVarargs(value: js.Any*): Self = StObject.set(x, "SX", js.Array(value :_*))
      
      @scala.inline
      def setSY(value: js.Array[js.Any]): Self = StObject.set(x, "SY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSYVarargs(value: js.Any*): Self = StObject.set(x, "SY", js.Array(value :_*))
      
      @scala.inline
      def setSZ(value: js.Array[js.Any]): Self = StObject.set(x, "SZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSZVarargs(value: js.Any*): Self = StObject.set(x, "SZ", js.Array(value :_*))
      
      @scala.inline
      def setTA(value: js.Array[js.Any]): Self = StObject.set(x, "TA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTAVarargs(value: js.Any*): Self = StObject.set(x, "TA", js.Array(value :_*))
      
      @scala.inline
      def setTC(value: js.Array[js.Any]): Self = StObject.set(x, "TC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTCVarargs(value: js.Any*): Self = StObject.set(x, "TC", js.Array(value :_*))
      
      @scala.inline
      def setTD(value: js.Array[js.Any]): Self = StObject.set(x, "TD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTDVarargs(value: js.Any*): Self = StObject.set(x, "TD", js.Array(value :_*))
      
      @scala.inline
      def setTG(value: js.Array[js.Any]): Self = StObject.set(x, "TG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTGVarargs(value: js.Any*): Self = StObject.set(x, "TG", js.Array(value :_*))
      
      @scala.inline
      def setTH(value: js.Array[js.Any]): Self = StObject.set(x, "TH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTHVarargs(value: js.Any*): Self = StObject.set(x, "TH", js.Array(value :_*))
      
      @scala.inline
      def setTJ(value: js.Array[js.Any]): Self = StObject.set(x, "TJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTJVarargs(value: js.Any*): Self = StObject.set(x, "TJ", js.Array(value :_*))
      
      @scala.inline
      def setTK(value: js.Array[js.Any]): Self = StObject.set(x, "TK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTKVarargs(value: js.Any*): Self = StObject.set(x, "TK", js.Array(value :_*))
      
      @scala.inline
      def setTL(value: js.Array[js.Any]): Self = StObject.set(x, "TL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTLVarargs(value: js.Any*): Self = StObject.set(x, "TL", js.Array(value :_*))
      
      @scala.inline
      def setTM(value: js.Array[js.Any]): Self = StObject.set(x, "TM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTMVarargs(value: js.Any*): Self = StObject.set(x, "TM", js.Array(value :_*))
      
      @scala.inline
      def setTN(value: js.Array[js.Any]): Self = StObject.set(x, "TN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTNVarargs(value: js.Any*): Self = StObject.set(x, "TN", js.Array(value :_*))
      
      @scala.inline
      def setTO(value: js.Array[js.Any]): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOVarargs(value: js.Any*): Self = StObject.set(x, "TO", js.Array(value :_*))
      
      @scala.inline
      def setTR(value: js.Array[js.Any]): Self = StObject.set(x, "TR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRVarargs(value: js.Any*): Self = StObject.set(x, "TR", js.Array(value :_*))
      
      @scala.inline
      def setTT(value: js.Array[js.Any]): Self = StObject.set(x, "TT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTTVarargs(value: js.Any*): Self = StObject.set(x, "TT", js.Array(value :_*))
      
      @scala.inline
      def setTV(value: js.Array[js.Any]): Self = StObject.set(x, "TV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTVVarargs(value: js.Any*): Self = StObject.set(x, "TV", js.Array(value :_*))
      
      @scala.inline
      def setTW(value: js.Array[js.Any]): Self = StObject.set(x, "TW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTWVarargs(value: js.Any*): Self = StObject.set(x, "TW", js.Array(value :_*))
      
      @scala.inline
      def setTZ(value: js.Array[js.Any]): Self = StObject.set(x, "TZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTZVarargs(value: js.Any*): Self = StObject.set(x, "TZ", js.Array(value :_*))
      
      @scala.inline
      def setUA(value: js.Array[js.Any]): Self = StObject.set(x, "UA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUAVarargs(value: js.Any*): Self = StObject.set(x, "UA", js.Array(value :_*))
      
      @scala.inline
      def setUG(value: js.Array[js.Any]): Self = StObject.set(x, "UG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUGVarargs(value: js.Any*): Self = StObject.set(x, "UG", js.Array(value :_*))
      
      @scala.inline
      def setUS(value: js.Array[js.Any]): Self = StObject.set(x, "US", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUSVarargs(value: js.Any*): Self = StObject.set(x, "US", js.Array(value :_*))
      
      @scala.inline
      def setUY(value: js.Array[js.Any]): Self = StObject.set(x, "UY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUYVarargs(value: js.Any*): Self = StObject.set(x, "UY", js.Array(value :_*))
      
      @scala.inline
      def setUZ(value: js.Array[js.Any]): Self = StObject.set(x, "UZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUZVarargs(value: js.Any*): Self = StObject.set(x, "UZ", js.Array(value :_*))
      
      @scala.inline
      def setVA(value: js.Array[js.Any]): Self = StObject.set(x, "VA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAVarargs(value: js.Any*): Self = StObject.set(x, "VA", js.Array(value :_*))
      
      @scala.inline
      def setVC(value: js.Array[js.Any]): Self = StObject.set(x, "VC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVCVarargs(value: js.Any*): Self = StObject.set(x, "VC", js.Array(value :_*))
      
      @scala.inline
      def setVE(value: js.Array[js.Any]): Self = StObject.set(x, "VE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVEVarargs(value: js.Any*): Self = StObject.set(x, "VE", js.Array(value :_*))
      
      @scala.inline
      def setVG(value: js.Array[js.Any]): Self = StObject.set(x, "VG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVGVarargs(value: js.Any*): Self = StObject.set(x, "VG", js.Array(value :_*))
      
      @scala.inline
      def setVI(value: js.Array[js.Any]): Self = StObject.set(x, "VI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVIVarargs(value: js.Any*): Self = StObject.set(x, "VI", js.Array(value :_*))
      
      @scala.inline
      def setVN(value: js.Array[js.Any]): Self = StObject.set(x, "VN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVNVarargs(value: js.Any*): Self = StObject.set(x, "VN", js.Array(value :_*))
      
      @scala.inline
      def setVU(value: js.Array[js.Any]): Self = StObject.set(x, "VU", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUVarargs(value: js.Any*): Self = StObject.set(x, "VU", js.Array(value :_*))
      
      @scala.inline
      def setWF(value: js.Array[js.Any]): Self = StObject.set(x, "WF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWFVarargs(value: js.Any*): Self = StObject.set(x, "WF", js.Array(value :_*))
      
      @scala.inline
      def setWS(value: js.Array[js.Any]): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWSVarargs(value: js.Any*): Self = StObject.set(x, "WS", js.Array(value :_*))
      
      @scala.inline
      def setXK(value: js.Array[js.Any]): Self = StObject.set(x, "XK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXKVarargs(value: js.Any*): Self = StObject.set(x, "XK", js.Array(value :_*))
      
      @scala.inline
      def setYE(value: js.Array[js.Any]): Self = StObject.set(x, "YE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYEVarargs(value: js.Any*): Self = StObject.set(x, "YE", js.Array(value :_*))
      
      @scala.inline
      def setYT(value: js.Array[js.Any]): Self = StObject.set(x, "YT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYTVarargs(value: js.Any*): Self = StObject.set(x, "YT", js.Array(value :_*))
      
      @scala.inline
      def setZA(value: js.Array[js.Any]): Self = StObject.set(x, "ZA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZAVarargs(value: js.Any*): Self = StObject.set(x, "ZA", js.Array(value :_*))
      
      @scala.inline
      def setZM(value: js.Array[js.Any]): Self = StObject.set(x, "ZM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZMVarargs(value: js.Any*): Self = StObject.set(x, "ZM", js.Array(value :_*))
      
      @scala.inline
      def setZW(value: js.Array[js.Any]): Self = StObject.set(x, "ZW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZWVarargs(value: js.Any*): Self = StObject.set(x, "ZW", js.Array(value :_*))
    }
  }
  
  type CountryCallingCode = String
  
  type CountryCallingCodes = StringDictionary[js.Array[CountryCode]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.libphonenumberJsStrings.`001`
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
    
    @scala.inline
    def `001`: typings.libphonenumberJs.libphonenumberJsStrings.`001` = "001".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.`001`]
    
    @scala.inline
    def AC: typings.libphonenumberJs.libphonenumberJsStrings.AC = "AC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AC]
    
    @scala.inline
    def AD: typings.libphonenumberJs.libphonenumberJsStrings.AD = "AD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AD]
    
    @scala.inline
    def AE: typings.libphonenumberJs.libphonenumberJsStrings.AE = "AE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AE]
    
    @scala.inline
    def AF: typings.libphonenumberJs.libphonenumberJsStrings.AF = "AF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AF]
    
    @scala.inline
    def AG: typings.libphonenumberJs.libphonenumberJsStrings.AG = "AG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AG]
    
    @scala.inline
    def AI: typings.libphonenumberJs.libphonenumberJsStrings.AI = "AI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AI]
    
    @scala.inline
    def AL: typings.libphonenumberJs.libphonenumberJsStrings.AL = "AL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AL]
    
    @scala.inline
    def AM: typings.libphonenumberJs.libphonenumberJsStrings.AM = "AM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AM]
    
    @scala.inline
    def AO: typings.libphonenumberJs.libphonenumberJsStrings.AO = "AO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AO]
    
    @scala.inline
    def AR: typings.libphonenumberJs.libphonenumberJsStrings.AR = "AR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AR]
    
    @scala.inline
    def AS: typings.libphonenumberJs.libphonenumberJsStrings.AS = "AS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AS]
    
    @scala.inline
    def AT: typings.libphonenumberJs.libphonenumberJsStrings.AT = "AT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AT]
    
    @scala.inline
    def AU: typings.libphonenumberJs.libphonenumberJsStrings.AU = "AU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AU]
    
    @scala.inline
    def AW: typings.libphonenumberJs.libphonenumberJsStrings.AW = "AW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AW]
    
    @scala.inline
    def AX: typings.libphonenumberJs.libphonenumberJsStrings.AX = "AX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AX]
    
    @scala.inline
    def AZ: typings.libphonenumberJs.libphonenumberJsStrings.AZ = "AZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.AZ]
    
    @scala.inline
    def BA: typings.libphonenumberJs.libphonenumberJsStrings.BA = "BA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BA]
    
    @scala.inline
    def BB: typings.libphonenumberJs.libphonenumberJsStrings.BB = "BB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BB]
    
    @scala.inline
    def BD: typings.libphonenumberJs.libphonenumberJsStrings.BD = "BD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BD]
    
    @scala.inline
    def BE: typings.libphonenumberJs.libphonenumberJsStrings.BE = "BE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BE]
    
    @scala.inline
    def BF: typings.libphonenumberJs.libphonenumberJsStrings.BF = "BF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BF]
    
    @scala.inline
    def BG: typings.libphonenumberJs.libphonenumberJsStrings.BG = "BG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BG]
    
    @scala.inline
    def BH: typings.libphonenumberJs.libphonenumberJsStrings.BH = "BH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BH]
    
    @scala.inline
    def BI: typings.libphonenumberJs.libphonenumberJsStrings.BI = "BI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BI]
    
    @scala.inline
    def BJ: typings.libphonenumberJs.libphonenumberJsStrings.BJ = "BJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BJ]
    
    @scala.inline
    def BL: typings.libphonenumberJs.libphonenumberJsStrings.BL = "BL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BL]
    
    @scala.inline
    def BM: typings.libphonenumberJs.libphonenumberJsStrings.BM = "BM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BM]
    
    @scala.inline
    def BN: typings.libphonenumberJs.libphonenumberJsStrings.BN = "BN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BN]
    
    @scala.inline
    def BO: typings.libphonenumberJs.libphonenumberJsStrings.BO = "BO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BO]
    
    @scala.inline
    def BQ: typings.libphonenumberJs.libphonenumberJsStrings.BQ = "BQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BQ]
    
    @scala.inline
    def BR: typings.libphonenumberJs.libphonenumberJsStrings.BR = "BR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BR]
    
    @scala.inline
    def BS: typings.libphonenumberJs.libphonenumberJsStrings.BS = "BS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BS]
    
    @scala.inline
    def BT: typings.libphonenumberJs.libphonenumberJsStrings.BT = "BT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BT]
    
    @scala.inline
    def BW: typings.libphonenumberJs.libphonenumberJsStrings.BW = "BW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BW]
    
    @scala.inline
    def BY: typings.libphonenumberJs.libphonenumberJsStrings.BY = "BY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BY]
    
    @scala.inline
    def BZ: typings.libphonenumberJs.libphonenumberJsStrings.BZ = "BZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.BZ]
    
    @scala.inline
    def CA: typings.libphonenumberJs.libphonenumberJsStrings.CA = "CA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CA]
    
    @scala.inline
    def CC: typings.libphonenumberJs.libphonenumberJsStrings.CC = "CC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CC]
    
    @scala.inline
    def CD: typings.libphonenumberJs.libphonenumberJsStrings.CD = "CD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CD]
    
    @scala.inline
    def CF: typings.libphonenumberJs.libphonenumberJsStrings.CF = "CF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CF]
    
    @scala.inline
    def CG: typings.libphonenumberJs.libphonenumberJsStrings.CG = "CG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CG]
    
    @scala.inline
    def CH: typings.libphonenumberJs.libphonenumberJsStrings.CH = "CH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CH]
    
    @scala.inline
    def CI: typings.libphonenumberJs.libphonenumberJsStrings.CI = "CI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CI]
    
    @scala.inline
    def CK: typings.libphonenumberJs.libphonenumberJsStrings.CK = "CK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CK]
    
    @scala.inline
    def CL: typings.libphonenumberJs.libphonenumberJsStrings.CL = "CL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CL]
    
    @scala.inline
    def CM: typings.libphonenumberJs.libphonenumberJsStrings.CM = "CM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CM]
    
    @scala.inline
    def CN: typings.libphonenumberJs.libphonenumberJsStrings.CN = "CN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CN]
    
    @scala.inline
    def CO: typings.libphonenumberJs.libphonenumberJsStrings.CO = "CO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CO]
    
    @scala.inline
    def CR: typings.libphonenumberJs.libphonenumberJsStrings.CR = "CR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CR]
    
    @scala.inline
    def CU: typings.libphonenumberJs.libphonenumberJsStrings.CU = "CU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CU]
    
    @scala.inline
    def CV: typings.libphonenumberJs.libphonenumberJsStrings.CV = "CV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CV]
    
    @scala.inline
    def CW: typings.libphonenumberJs.libphonenumberJsStrings.CW = "CW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CW]
    
    @scala.inline
    def CX: typings.libphonenumberJs.libphonenumberJsStrings.CX = "CX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CX]
    
    @scala.inline
    def CY: typings.libphonenumberJs.libphonenumberJsStrings.CY = "CY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CY]
    
    @scala.inline
    def CZ: typings.libphonenumberJs.libphonenumberJsStrings.CZ = "CZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.CZ]
    
    @scala.inline
    def DE: typings.libphonenumberJs.libphonenumberJsStrings.DE = "DE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DE]
    
    @scala.inline
    def DJ: typings.libphonenumberJs.libphonenumberJsStrings.DJ = "DJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DJ]
    
    @scala.inline
    def DK: typings.libphonenumberJs.libphonenumberJsStrings.DK = "DK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DK]
    
    @scala.inline
    def DM: typings.libphonenumberJs.libphonenumberJsStrings.DM = "DM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DM]
    
    @scala.inline
    def DO: typings.libphonenumberJs.libphonenumberJsStrings.DO = "DO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DO]
    
    @scala.inline
    def DZ: typings.libphonenumberJs.libphonenumberJsStrings.DZ = "DZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.DZ]
    
    @scala.inline
    def EC: typings.libphonenumberJs.libphonenumberJsStrings.EC = "EC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EC]
    
    @scala.inline
    def EE: typings.libphonenumberJs.libphonenumberJsStrings.EE = "EE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EE]
    
    @scala.inline
    def EG: typings.libphonenumberJs.libphonenumberJsStrings.EG = "EG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EG]
    
    @scala.inline
    def EH: typings.libphonenumberJs.libphonenumberJsStrings.EH = "EH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EH]
    
    @scala.inline
    def ER: typings.libphonenumberJs.libphonenumberJsStrings.ER = "ER".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ER]
    
    @scala.inline
    def ES: typings.libphonenumberJs.libphonenumberJsStrings.ES = "ES".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ES]
    
    @scala.inline
    def ET: typings.libphonenumberJs.libphonenumberJsStrings.ET = "ET".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ET]
    
    @scala.inline
    def FI: typings.libphonenumberJs.libphonenumberJsStrings.FI = "FI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FI]
    
    @scala.inline
    def FJ: typings.libphonenumberJs.libphonenumberJsStrings.FJ = "FJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FJ]
    
    @scala.inline
    def FK: typings.libphonenumberJs.libphonenumberJsStrings.FK = "FK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FK]
    
    @scala.inline
    def FM: typings.libphonenumberJs.libphonenumberJsStrings.FM = "FM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FM]
    
    @scala.inline
    def FO: typings.libphonenumberJs.libphonenumberJsStrings.FO = "FO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FO]
    
    @scala.inline
    def FR: typings.libphonenumberJs.libphonenumberJsStrings.FR = "FR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.FR]
    
    @scala.inline
    def GA: typings.libphonenumberJs.libphonenumberJsStrings.GA = "GA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GA]
    
    @scala.inline
    def GB: typings.libphonenumberJs.libphonenumberJsStrings.GB = "GB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GB]
    
    @scala.inline
    def GD: typings.libphonenumberJs.libphonenumberJsStrings.GD = "GD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GD]
    
    @scala.inline
    def GE: typings.libphonenumberJs.libphonenumberJsStrings.GE = "GE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GE]
    
    @scala.inline
    def GF: typings.libphonenumberJs.libphonenumberJsStrings.GF = "GF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GF]
    
    @scala.inline
    def GG: typings.libphonenumberJs.libphonenumberJsStrings.GG = "GG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GG]
    
    @scala.inline
    def GH: typings.libphonenumberJs.libphonenumberJsStrings.GH = "GH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GH]
    
    @scala.inline
    def GI: typings.libphonenumberJs.libphonenumberJsStrings.GI = "GI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GI]
    
    @scala.inline
    def GL: typings.libphonenumberJs.libphonenumberJsStrings.GL = "GL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GL]
    
    @scala.inline
    def GM: typings.libphonenumberJs.libphonenumberJsStrings.GM = "GM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GM]
    
    @scala.inline
    def GN: typings.libphonenumberJs.libphonenumberJsStrings.GN = "GN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GN]
    
    @scala.inline
    def GP: typings.libphonenumberJs.libphonenumberJsStrings.GP = "GP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GP]
    
    @scala.inline
    def GQ: typings.libphonenumberJs.libphonenumberJsStrings.GQ = "GQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GQ]
    
    @scala.inline
    def GR: typings.libphonenumberJs.libphonenumberJsStrings.GR = "GR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GR]
    
    @scala.inline
    def GT: typings.libphonenumberJs.libphonenumberJsStrings.GT = "GT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GT]
    
    @scala.inline
    def GU: typings.libphonenumberJs.libphonenumberJsStrings.GU = "GU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GU]
    
    @scala.inline
    def GW: typings.libphonenumberJs.libphonenumberJsStrings.GW = "GW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GW]
    
    @scala.inline
    def GY: typings.libphonenumberJs.libphonenumberJsStrings.GY = "GY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.GY]
    
    @scala.inline
    def HK: typings.libphonenumberJs.libphonenumberJsStrings.HK = "HK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HK]
    
    @scala.inline
    def HN: typings.libphonenumberJs.libphonenumberJsStrings.HN = "HN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HN]
    
    @scala.inline
    def HR: typings.libphonenumberJs.libphonenumberJsStrings.HR = "HR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HR]
    
    @scala.inline
    def HT: typings.libphonenumberJs.libphonenumberJsStrings.HT = "HT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HT]
    
    @scala.inline
    def HU: typings.libphonenumberJs.libphonenumberJsStrings.HU = "HU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.HU]
    
    @scala.inline
    def ID: typings.libphonenumberJs.libphonenumberJsStrings.ID = "ID".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ID]
    
    @scala.inline
    def IE: typings.libphonenumberJs.libphonenumberJsStrings.IE = "IE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IE]
    
    @scala.inline
    def IL: typings.libphonenumberJs.libphonenumberJsStrings.IL = "IL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IL]
    
    @scala.inline
    def IM: typings.libphonenumberJs.libphonenumberJsStrings.IM = "IM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IM]
    
    @scala.inline
    def IN: typings.libphonenumberJs.libphonenumberJsStrings.IN = "IN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IN]
    
    @scala.inline
    def IO: typings.libphonenumberJs.libphonenumberJsStrings.IO = "IO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IO]
    
    @scala.inline
    def IQ: typings.libphonenumberJs.libphonenumberJsStrings.IQ = "IQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IQ]
    
    @scala.inline
    def IR: typings.libphonenumberJs.libphonenumberJsStrings.IR = "IR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IR]
    
    @scala.inline
    def IS: typings.libphonenumberJs.libphonenumberJsStrings.IS = "IS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IS]
    
    @scala.inline
    def IT: typings.libphonenumberJs.libphonenumberJsStrings.IT = "IT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IT]
    
    @scala.inline
    def JE: typings.libphonenumberJs.libphonenumberJsStrings.JE = "JE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JE]
    
    @scala.inline
    def JM: typings.libphonenumberJs.libphonenumberJsStrings.JM = "JM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JM]
    
    @scala.inline
    def JO: typings.libphonenumberJs.libphonenumberJsStrings.JO = "JO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JO]
    
    @scala.inline
    def JP: typings.libphonenumberJs.libphonenumberJsStrings.JP = "JP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.JP]
    
    @scala.inline
    def KE: typings.libphonenumberJs.libphonenumberJsStrings.KE = "KE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KE]
    
    @scala.inline
    def KG: typings.libphonenumberJs.libphonenumberJsStrings.KG = "KG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KG]
    
    @scala.inline
    def KH: typings.libphonenumberJs.libphonenumberJsStrings.KH = "KH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KH]
    
    @scala.inline
    def KI: typings.libphonenumberJs.libphonenumberJsStrings.KI = "KI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KI]
    
    @scala.inline
    def KM: typings.libphonenumberJs.libphonenumberJsStrings.KM = "KM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KM]
    
    @scala.inline
    def KN: typings.libphonenumberJs.libphonenumberJsStrings.KN = "KN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KN]
    
    @scala.inline
    def KP: typings.libphonenumberJs.libphonenumberJsStrings.KP = "KP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KP]
    
    @scala.inline
    def KR: typings.libphonenumberJs.libphonenumberJsStrings.KR = "KR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KR]
    
    @scala.inline
    def KW: typings.libphonenumberJs.libphonenumberJsStrings.KW = "KW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KW]
    
    @scala.inline
    def KY: typings.libphonenumberJs.libphonenumberJsStrings.KY = "KY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KY]
    
    @scala.inline
    def KZ: typings.libphonenumberJs.libphonenumberJsStrings.KZ = "KZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.KZ]
    
    @scala.inline
    def LA: typings.libphonenumberJs.libphonenumberJsStrings.LA = "LA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LA]
    
    @scala.inline
    def LB: typings.libphonenumberJs.libphonenumberJsStrings.LB = "LB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LB]
    
    @scala.inline
    def LC: typings.libphonenumberJs.libphonenumberJsStrings.LC = "LC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LC]
    
    @scala.inline
    def LI: typings.libphonenumberJs.libphonenumberJsStrings.LI = "LI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LI]
    
    @scala.inline
    def LK: typings.libphonenumberJs.libphonenumberJsStrings.LK = "LK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LK]
    
    @scala.inline
    def LR: typings.libphonenumberJs.libphonenumberJsStrings.LR = "LR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LR]
    
    @scala.inline
    def LS: typings.libphonenumberJs.libphonenumberJsStrings.LS = "LS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LS]
    
    @scala.inline
    def LT: typings.libphonenumberJs.libphonenumberJsStrings.LT = "LT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LT]
    
    @scala.inline
    def LU: typings.libphonenumberJs.libphonenumberJsStrings.LU = "LU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LU]
    
    @scala.inline
    def LV: typings.libphonenumberJs.libphonenumberJsStrings.LV = "LV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LV]
    
    @scala.inline
    def LY: typings.libphonenumberJs.libphonenumberJsStrings.LY = "LY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.LY]
    
    @scala.inline
    def MA: typings.libphonenumberJs.libphonenumberJsStrings.MA = "MA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MA]
    
    @scala.inline
    def MC: typings.libphonenumberJs.libphonenumberJsStrings.MC = "MC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MC]
    
    @scala.inline
    def MD: typings.libphonenumberJs.libphonenumberJsStrings.MD = "MD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MD]
    
    @scala.inline
    def ME: typings.libphonenumberJs.libphonenumberJsStrings.ME = "ME".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ME]
    
    @scala.inline
    def MF: typings.libphonenumberJs.libphonenumberJsStrings.MF = "MF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MF]
    
    @scala.inline
    def MG: typings.libphonenumberJs.libphonenumberJsStrings.MG = "MG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MG]
    
    @scala.inline
    def MH: typings.libphonenumberJs.libphonenumberJsStrings.MH = "MH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MH]
    
    @scala.inline
    def MK: typings.libphonenumberJs.libphonenumberJsStrings.MK = "MK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MK]
    
    @scala.inline
    def ML: typings.libphonenumberJs.libphonenumberJsStrings.ML = "ML".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ML]
    
    @scala.inline
    def MM: typings.libphonenumberJs.libphonenumberJsStrings.MM = "MM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MM]
    
    @scala.inline
    def MN: typings.libphonenumberJs.libphonenumberJsStrings.MN = "MN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MN]
    
    @scala.inline
    def MO: typings.libphonenumberJs.libphonenumberJsStrings.MO = "MO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MO]
    
    @scala.inline
    def MP: typings.libphonenumberJs.libphonenumberJsStrings.MP = "MP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MP]
    
    @scala.inline
    def MQ: typings.libphonenumberJs.libphonenumberJsStrings.MQ = "MQ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MQ]
    
    @scala.inline
    def MR: typings.libphonenumberJs.libphonenumberJsStrings.MR = "MR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MR]
    
    @scala.inline
    def MS: typings.libphonenumberJs.libphonenumberJsStrings.MS = "MS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MS]
    
    @scala.inline
    def MT: typings.libphonenumberJs.libphonenumberJsStrings.MT = "MT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MT]
    
    @scala.inline
    def MU: typings.libphonenumberJs.libphonenumberJsStrings.MU = "MU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MU]
    
    @scala.inline
    def MV: typings.libphonenumberJs.libphonenumberJsStrings.MV = "MV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MV]
    
    @scala.inline
    def MW: typings.libphonenumberJs.libphonenumberJsStrings.MW = "MW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MW]
    
    @scala.inline
    def MX: typings.libphonenumberJs.libphonenumberJsStrings.MX = "MX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MX]
    
    @scala.inline
    def MY: typings.libphonenumberJs.libphonenumberJsStrings.MY = "MY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MY]
    
    @scala.inline
    def MZ: typings.libphonenumberJs.libphonenumberJsStrings.MZ = "MZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.MZ]
    
    @scala.inline
    def NA: typings.libphonenumberJs.libphonenumberJsStrings.NA = "NA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NA]
    
    @scala.inline
    def NC: typings.libphonenumberJs.libphonenumberJsStrings.NC = "NC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NC]
    
    @scala.inline
    def NE: typings.libphonenumberJs.libphonenumberJsStrings.NE = "NE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NE]
    
    @scala.inline
    def NF: typings.libphonenumberJs.libphonenumberJsStrings.NF = "NF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NF]
    
    @scala.inline
    def NG: typings.libphonenumberJs.libphonenumberJsStrings.NG = "NG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NG]
    
    @scala.inline
    def NI: typings.libphonenumberJs.libphonenumberJsStrings.NI = "NI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NI]
    
    @scala.inline
    def NL: typings.libphonenumberJs.libphonenumberJsStrings.NL = "NL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NL]
    
    @scala.inline
    def NO: typings.libphonenumberJs.libphonenumberJsStrings.NO = "NO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NO]
    
    @scala.inline
    def NP: typings.libphonenumberJs.libphonenumberJsStrings.NP = "NP".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NP]
    
    @scala.inline
    def NR: typings.libphonenumberJs.libphonenumberJsStrings.NR = "NR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NR]
    
    @scala.inline
    def NU: typings.libphonenumberJs.libphonenumberJsStrings.NU = "NU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NU]
    
    @scala.inline
    def NZ: typings.libphonenumberJs.libphonenumberJsStrings.NZ = "NZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NZ]
    
    @scala.inline
    def OM: typings.libphonenumberJs.libphonenumberJsStrings.OM = "OM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.OM]
    
    @scala.inline
    def PA: typings.libphonenumberJs.libphonenumberJsStrings.PA = "PA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PA]
    
    @scala.inline
    def PE: typings.libphonenumberJs.libphonenumberJsStrings.PE = "PE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PE]
    
    @scala.inline
    def PF: typings.libphonenumberJs.libphonenumberJsStrings.PF = "PF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PF]
    
    @scala.inline
    def PG: typings.libphonenumberJs.libphonenumberJsStrings.PG = "PG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PG]
    
    @scala.inline
    def PH: typings.libphonenumberJs.libphonenumberJsStrings.PH = "PH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PH]
    
    @scala.inline
    def PK: typings.libphonenumberJs.libphonenumberJsStrings.PK = "PK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PK]
    
    @scala.inline
    def PL: typings.libphonenumberJs.libphonenumberJsStrings.PL = "PL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PL]
    
    @scala.inline
    def PM: typings.libphonenumberJs.libphonenumberJsStrings.PM = "PM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PM]
    
    @scala.inline
    def PR: typings.libphonenumberJs.libphonenumberJsStrings.PR = "PR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PR]
    
    @scala.inline
    def PS: typings.libphonenumberJs.libphonenumberJsStrings.PS = "PS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PS]
    
    @scala.inline
    def PT: typings.libphonenumberJs.libphonenumberJsStrings.PT = "PT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PT]
    
    @scala.inline
    def PW: typings.libphonenumberJs.libphonenumberJsStrings.PW = "PW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PW]
    
    @scala.inline
    def PY: typings.libphonenumberJs.libphonenumberJsStrings.PY = "PY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.PY]
    
    @scala.inline
    def QA: typings.libphonenumberJs.libphonenumberJsStrings.QA = "QA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.QA]
    
    @scala.inline
    def RE: typings.libphonenumberJs.libphonenumberJsStrings.RE = "RE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RE]
    
    @scala.inline
    def RO: typings.libphonenumberJs.libphonenumberJsStrings.RO = "RO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RO]
    
    @scala.inline
    def RS: typings.libphonenumberJs.libphonenumberJsStrings.RS = "RS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RS]
    
    @scala.inline
    def RU: typings.libphonenumberJs.libphonenumberJsStrings.RU = "RU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RU]
    
    @scala.inline
    def RW: typings.libphonenumberJs.libphonenumberJsStrings.RW = "RW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RW]
    
    @scala.inline
    def SA: typings.libphonenumberJs.libphonenumberJsStrings.SA = "SA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SA]
    
    @scala.inline
    def SB: typings.libphonenumberJs.libphonenumberJsStrings.SB = "SB".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SB]
    
    @scala.inline
    def SC: typings.libphonenumberJs.libphonenumberJsStrings.SC = "SC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SC]
    
    @scala.inline
    def SD: typings.libphonenumberJs.libphonenumberJsStrings.SD = "SD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SD]
    
    @scala.inline
    def SE: typings.libphonenumberJs.libphonenumberJsStrings.SE = "SE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SE]
    
    @scala.inline
    def SG: typings.libphonenumberJs.libphonenumberJsStrings.SG = "SG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SG]
    
    @scala.inline
    def SH: typings.libphonenumberJs.libphonenumberJsStrings.SH = "SH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SH]
    
    @scala.inline
    def SI: typings.libphonenumberJs.libphonenumberJsStrings.SI = "SI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SI]
    
    @scala.inline
    def SJ: typings.libphonenumberJs.libphonenumberJsStrings.SJ = "SJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SJ]
    
    @scala.inline
    def SK: typings.libphonenumberJs.libphonenumberJsStrings.SK = "SK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SK]
    
    @scala.inline
    def SL: typings.libphonenumberJs.libphonenumberJsStrings.SL = "SL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SL]
    
    @scala.inline
    def SM: typings.libphonenumberJs.libphonenumberJsStrings.SM = "SM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SM]
    
    @scala.inline
    def SN: typings.libphonenumberJs.libphonenumberJsStrings.SN = "SN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SN]
    
    @scala.inline
    def SO: typings.libphonenumberJs.libphonenumberJsStrings.SO = "SO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SO]
    
    @scala.inline
    def SR: typings.libphonenumberJs.libphonenumberJsStrings.SR = "SR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SR]
    
    @scala.inline
    def SS: typings.libphonenumberJs.libphonenumberJsStrings.SS = "SS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SS]
    
    @scala.inline
    def ST: typings.libphonenumberJs.libphonenumberJsStrings.ST = "ST".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ST]
    
    @scala.inline
    def SV: typings.libphonenumberJs.libphonenumberJsStrings.SV = "SV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SV]
    
    @scala.inline
    def SX: typings.libphonenumberJs.libphonenumberJsStrings.SX = "SX".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SX]
    
    @scala.inline
    def SY: typings.libphonenumberJs.libphonenumberJsStrings.SY = "SY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SY]
    
    @scala.inline
    def SZ: typings.libphonenumberJs.libphonenumberJsStrings.SZ = "SZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.SZ]
    
    @scala.inline
    def TA: typings.libphonenumberJs.libphonenumberJsStrings.TA = "TA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TA]
    
    @scala.inline
    def TC: typings.libphonenumberJs.libphonenumberJsStrings.TC = "TC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TC]
    
    @scala.inline
    def TD: typings.libphonenumberJs.libphonenumberJsStrings.TD = "TD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TD]
    
    @scala.inline
    def TG: typings.libphonenumberJs.libphonenumberJsStrings.TG = "TG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TG]
    
    @scala.inline
    def TH: typings.libphonenumberJs.libphonenumberJsStrings.TH = "TH".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TH]
    
    @scala.inline
    def TJ: typings.libphonenumberJs.libphonenumberJsStrings.TJ = "TJ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TJ]
    
    @scala.inline
    def TK: typings.libphonenumberJs.libphonenumberJsStrings.TK = "TK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TK]
    
    @scala.inline
    def TL: typings.libphonenumberJs.libphonenumberJsStrings.TL = "TL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TL]
    
    @scala.inline
    def TM: typings.libphonenumberJs.libphonenumberJsStrings.TM = "TM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TM]
    
    @scala.inline
    def TN: typings.libphonenumberJs.libphonenumberJsStrings.TN = "TN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TN]
    
    @scala.inline
    def TO: typings.libphonenumberJs.libphonenumberJsStrings.TO = "TO".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TO]
    
    @scala.inline
    def TR: typings.libphonenumberJs.libphonenumberJsStrings.TR = "TR".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TR]
    
    @scala.inline
    def TT: typings.libphonenumberJs.libphonenumberJsStrings.TT = "TT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TT]
    
    @scala.inline
    def TV: typings.libphonenumberJs.libphonenumberJsStrings.TV = "TV".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TV]
    
    @scala.inline
    def TW: typings.libphonenumberJs.libphonenumberJsStrings.TW = "TW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TW]
    
    @scala.inline
    def TZ: typings.libphonenumberJs.libphonenumberJsStrings.TZ = "TZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.TZ]
    
    @scala.inline
    def UA: typings.libphonenumberJs.libphonenumberJsStrings.UA = "UA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UA]
    
    @scala.inline
    def UG: typings.libphonenumberJs.libphonenumberJsStrings.UG = "UG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UG]
    
    @scala.inline
    def US: typings.libphonenumberJs.libphonenumberJsStrings.US = "US".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.US]
    
    @scala.inline
    def UY: typings.libphonenumberJs.libphonenumberJsStrings.UY = "UY".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UY]
    
    @scala.inline
    def UZ: typings.libphonenumberJs.libphonenumberJsStrings.UZ = "UZ".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.UZ]
    
    @scala.inline
    def VA: typings.libphonenumberJs.libphonenumberJsStrings.VA = "VA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VA]
    
    @scala.inline
    def VC: typings.libphonenumberJs.libphonenumberJsStrings.VC = "VC".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VC]
    
    @scala.inline
    def VE: typings.libphonenumberJs.libphonenumberJsStrings.VE = "VE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VE]
    
    @scala.inline
    def VG: typings.libphonenumberJs.libphonenumberJsStrings.VG = "VG".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VG]
    
    @scala.inline
    def VI: typings.libphonenumberJs.libphonenumberJsStrings.VI = "VI".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VI]
    
    @scala.inline
    def VN: typings.libphonenumberJs.libphonenumberJsStrings.VN = "VN".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VN]
    
    @scala.inline
    def VU: typings.libphonenumberJs.libphonenumberJsStrings.VU = "VU".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.VU]
    
    @scala.inline
    def WF: typings.libphonenumberJs.libphonenumberJsStrings.WF = "WF".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.WF]
    
    @scala.inline
    def WS: typings.libphonenumberJs.libphonenumberJsStrings.WS = "WS".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.WS]
    
    @scala.inline
    def XK: typings.libphonenumberJs.libphonenumberJsStrings.XK = "XK".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.XK]
    
    @scala.inline
    def YE: typings.libphonenumberJs.libphonenumberJsStrings.YE = "YE".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.YE]
    
    @scala.inline
    def YT: typings.libphonenumberJs.libphonenumberJsStrings.YT = "YT".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.YT]
    
    @scala.inline
    def ZA: typings.libphonenumberJs.libphonenumberJsStrings.ZA = "ZA".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZA]
    
    @scala.inline
    def ZM: typings.libphonenumberJs.libphonenumberJsStrings.ZM = "ZM".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZM]
    
    @scala.inline
    def ZW: typings.libphonenumberJs.libphonenumberJsStrings.ZW = "ZW".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.ZW]
  }
  
  type E164Number = String
  
  type Extension = String
  
  type FormatExtension = js.Function3[
    /* formattedNumber */ String, 
    /* extension */ Extension, 
    /* metadata */ Metadata, 
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
    
    @scala.inline
    def apply(): FormatNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptions]
    }
    
    @scala.inline
    implicit class FormatNumberOptionsMutableBuilder[Self <: FormatNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ Metadata) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      @scala.inline
      def setFromCountry(value: CountryCode): Self = StObject.set(x, "fromCountry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromCountryUndefined: Self = StObject.set(x, "fromCountry", js.undefined)
      
      @scala.inline
      def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanReadableUndefined: Self = StObject.set(x, "humanReadable", js.undefined)
      
      @scala.inline
      def setNationalPrefix(value: Boolean): Self = StObject.set(x, "nationalPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNationalPrefixUndefined: Self = StObject.set(x, "nationalPrefix", js.undefined)
      
      @scala.inline
      def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait FormatNumberOptionsWithoutIDD extends StObject {
    
    var formatExtension: js.UndefOr[FormatExtension] = js.undefined
    
    var v2: js.UndefOr[Boolean] = js.undefined
  }
  object FormatNumberOptionsWithoutIDD {
    
    @scala.inline
    def apply(): FormatNumberOptionsWithoutIDD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatNumberOptionsWithoutIDD]
    }
    
    @scala.inline
    implicit class FormatNumberOptionsWithoutIDDMutableBuilder[Self <: FormatNumberOptionsWithoutIDD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatExtension(
        value: (/* formattedNumber */ String, /* extension */ Extension, /* metadata */ Metadata) => String
      ): Self = StObject.set(x, "formatExtension", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatExtensionUndefined: Self = StObject.set(x, "formatExtension", js.undefined)
      
      @scala.inline
      def setV2(value: Boolean): Self = StObject.set(x, "v2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV2Undefined: Self = StObject.set(x, "v2", js.undefined)
    }
  }
  
  trait Metadata extends StObject {
    
    var countries: Countries
    
    var country_calling_codes: CountryCallingCodes
  }
  object Metadata {
    
    @scala.inline
    def apply(countries: Countries, country_calling_codes: CountryCallingCodes): Metadata = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], country_calling_codes = country_calling_codes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountries(value: Countries): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry_calling_codes(value: CountryCallingCodes): Self = StObject.set(x, "country_calling_codes", value.asInstanceOf[js.Any])
    }
  }
  
  type NationalNumber = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL
    - typings.libphonenumberJs.libphonenumberJsStrings.National_
    - typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
    - typings.libphonenumberJs.libphonenumberJsStrings.International_
    - typings.libphonenumberJs.libphonenumberJsStrings.EDot164
    - typings.libphonenumberJs.libphonenumberJsStrings.RFC3966
    - typings.libphonenumberJs.libphonenumberJsStrings.IDD
  */
  trait NumberFormat extends StObject
  object NumberFormat {
    
    @scala.inline
    def EDot164: typings.libphonenumberJs.libphonenumberJsStrings.EDot164 = "E.164".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.EDot164]
    
    @scala.inline
    def IDD: typings.libphonenumberJs.libphonenumberJsStrings.IDD = "IDD".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.IDD]
    
    @scala.inline
    def INTERNATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = "INTERNATIONAL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL]
    
    @scala.inline
    def International: International_ = "International".asInstanceOf[International_]
    
    @scala.inline
    def NATIONAL: typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL = "NATIONAL".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.NATIONAL]
    
    @scala.inline
    def National: National_ = "National".asInstanceOf[National_]
    
    @scala.inline
    def RFC3966: typings.libphonenumberJs.libphonenumberJsStrings.RFC3966 = "RFC3966".asInstanceOf[typings.libphonenumberJs.libphonenumberJsStrings.RFC3966]
  }
  
  trait NumberFound extends StObject {
    
    var endsAt: Double
    
    var number: PhoneNumber
    
    var startsAt: Double
  }
  object NumberFound {
    
    @scala.inline
    def apply(endsAt: Double, number: PhoneNumber, startsAt: Double): NumberFound = {
      val __obj = js.Dynamic.literal(endsAt = endsAt.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFound]
    }
    
    @scala.inline
    implicit class NumberFoundMutableBuilder[Self <: NumberFound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: PhoneNumber): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(country: CountryCode, endsAt: Double, phone: NationalNumber, startsAt: Double): NumberFoundLegacy = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], endsAt = endsAt.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], startsAt = startsAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberFoundLegacy]
    }
    
    @scala.inline
    implicit class NumberFoundLegacyMutableBuilder[Self <: NumberFoundLegacy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountry(value: CountryCode): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndsAt(value: Double): Self = StObject.set(x, "endsAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: Extension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setPhone(value: NationalNumber): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartsAt(value: Double): Self = StObject.set(x, "startsAt", value.asInstanceOf[js.Any])
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
  
  trait _NumberType extends StObject
}
