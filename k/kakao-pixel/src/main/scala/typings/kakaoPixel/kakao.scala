package typings.kakaoPixel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kakao {
  
  object Pixel {
    
    trait AddToCartParameters extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object AddToCartParameters {
      
      inline def apply(): AddToCartParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddToCartParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddToCartParameters] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    trait AddWishListParameters extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object AddWishListParameters {
      
      inline def apply(): AddWishListParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AddWishListParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AddWishListParameters] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.kakaoPixel.kakaoPixelStrings.AED
      - typings.kakaoPixel.kakaoPixelStrings.AFN
      - typings.kakaoPixel.kakaoPixelStrings.ALL
      - typings.kakaoPixel.kakaoPixelStrings.AMD
      - typings.kakaoPixel.kakaoPixelStrings.ANG
      - typings.kakaoPixel.kakaoPixelStrings.AOA
      - typings.kakaoPixel.kakaoPixelStrings.ARS
      - typings.kakaoPixel.kakaoPixelStrings.AUD
      - typings.kakaoPixel.kakaoPixelStrings.AWG
      - typings.kakaoPixel.kakaoPixelStrings.AZN
      - typings.kakaoPixel.kakaoPixelStrings.BAM
      - typings.kakaoPixel.kakaoPixelStrings.BBD
      - typings.kakaoPixel.kakaoPixelStrings.BDT
      - typings.kakaoPixel.kakaoPixelStrings.BGN
      - typings.kakaoPixel.kakaoPixelStrings.BHD
      - typings.kakaoPixel.kakaoPixelStrings.BIF
      - typings.kakaoPixel.kakaoPixelStrings.BMD
      - typings.kakaoPixel.kakaoPixelStrings.BND
      - typings.kakaoPixel.kakaoPixelStrings.BOB
      - typings.kakaoPixel.kakaoPixelStrings.BOV
      - typings.kakaoPixel.kakaoPixelStrings.BRL
      - typings.kakaoPixel.kakaoPixelStrings.BSD
      - typings.kakaoPixel.kakaoPixelStrings.BTN
      - typings.kakaoPixel.kakaoPixelStrings.BWP
      - typings.kakaoPixel.kakaoPixelStrings.BYR
      - typings.kakaoPixel.kakaoPixelStrings.BZD
      - typings.kakaoPixel.kakaoPixelStrings.CAD
      - typings.kakaoPixel.kakaoPixelStrings.CDF
      - typings.kakaoPixel.kakaoPixelStrings.CHE
      - typings.kakaoPixel.kakaoPixelStrings.CHF
      - typings.kakaoPixel.kakaoPixelStrings.CHW
      - typings.kakaoPixel.kakaoPixelStrings.CLF
      - typings.kakaoPixel.kakaoPixelStrings.CLP
      - typings.kakaoPixel.kakaoPixelStrings.CNY
      - typings.kakaoPixel.kakaoPixelStrings.COP
      - typings.kakaoPixel.kakaoPixelStrings.COU
      - typings.kakaoPixel.kakaoPixelStrings.CRC
      - typings.kakaoPixel.kakaoPixelStrings.CUC
      - typings.kakaoPixel.kakaoPixelStrings.CUP
      - typings.kakaoPixel.kakaoPixelStrings.CVE
      - typings.kakaoPixel.kakaoPixelStrings.CZK
      - typings.kakaoPixel.kakaoPixelStrings.DJF
      - typings.kakaoPixel.kakaoPixelStrings.DKK
      - typings.kakaoPixel.kakaoPixelStrings.DOP
      - typings.kakaoPixel.kakaoPixelStrings.DZD
      - typings.kakaoPixel.kakaoPixelStrings.EGP
      - typings.kakaoPixel.kakaoPixelStrings.ERN
      - typings.kakaoPixel.kakaoPixelStrings.ETB
      - typings.kakaoPixel.kakaoPixelStrings.EUR
      - typings.kakaoPixel.kakaoPixelStrings.FJD
      - typings.kakaoPixel.kakaoPixelStrings.FKP
      - typings.kakaoPixel.kakaoPixelStrings.GBP
      - typings.kakaoPixel.kakaoPixelStrings.GEL
      - typings.kakaoPixel.kakaoPixelStrings.GHS
      - typings.kakaoPixel.kakaoPixelStrings.GIP
      - typings.kakaoPixel.kakaoPixelStrings.GMD
      - typings.kakaoPixel.kakaoPixelStrings.GNF
      - typings.kakaoPixel.kakaoPixelStrings.GTQ
      - typings.kakaoPixel.kakaoPixelStrings.GYD
      - typings.kakaoPixel.kakaoPixelStrings.HKD
      - typings.kakaoPixel.kakaoPixelStrings.HNL
      - typings.kakaoPixel.kakaoPixelStrings.HRK
      - typings.kakaoPixel.kakaoPixelStrings.HTG
      - typings.kakaoPixel.kakaoPixelStrings.HUF
      - typings.kakaoPixel.kakaoPixelStrings.IDR
      - typings.kakaoPixel.kakaoPixelStrings.ILS
      - typings.kakaoPixel.kakaoPixelStrings.INR
      - typings.kakaoPixel.kakaoPixelStrings.IQD
      - typings.kakaoPixel.kakaoPixelStrings.IRR
      - typings.kakaoPixel.kakaoPixelStrings.ISK
      - typings.kakaoPixel.kakaoPixelStrings.JMD
      - typings.kakaoPixel.kakaoPixelStrings.JOD
      - typings.kakaoPixel.kakaoPixelStrings.JPY
      - typings.kakaoPixel.kakaoPixelStrings.KES
      - typings.kakaoPixel.kakaoPixelStrings.KGS
      - typings.kakaoPixel.kakaoPixelStrings.KHR
      - typings.kakaoPixel.kakaoPixelStrings.KMF
      - typings.kakaoPixel.kakaoPixelStrings.KPW
      - typings.kakaoPixel.kakaoPixelStrings.KRW
      - typings.kakaoPixel.kakaoPixelStrings.KWD
      - typings.kakaoPixel.kakaoPixelStrings.KYD
      - typings.kakaoPixel.kakaoPixelStrings.KZT
      - typings.kakaoPixel.kakaoPixelStrings.LAK
      - typings.kakaoPixel.kakaoPixelStrings.LBP
      - typings.kakaoPixel.kakaoPixelStrings.LKR
      - typings.kakaoPixel.kakaoPixelStrings.LRD
      - typings.kakaoPixel.kakaoPixelStrings.LSL
      - typings.kakaoPixel.kakaoPixelStrings.LTL
      - typings.kakaoPixel.kakaoPixelStrings.LVL
      - typings.kakaoPixel.kakaoPixelStrings.LYD
      - typings.kakaoPixel.kakaoPixelStrings.MAD
      - typings.kakaoPixel.kakaoPixelStrings.MDL
      - typings.kakaoPixel.kakaoPixelStrings.MGA
      - typings.kakaoPixel.kakaoPixelStrings.MKD
      - typings.kakaoPixel.kakaoPixelStrings.MMK
      - typings.kakaoPixel.kakaoPixelStrings.MNT
      - typings.kakaoPixel.kakaoPixelStrings.MOP
      - typings.kakaoPixel.kakaoPixelStrings.MRO
      - typings.kakaoPixel.kakaoPixelStrings.MUR
      - typings.kakaoPixel.kakaoPixelStrings.MVR
      - typings.kakaoPixel.kakaoPixelStrings.MWK
      - typings.kakaoPixel.kakaoPixelStrings.MXN
      - typings.kakaoPixel.kakaoPixelStrings.MXV
      - typings.kakaoPixel.kakaoPixelStrings.MYR
      - typings.kakaoPixel.kakaoPixelStrings.MZN
      - typings.kakaoPixel.kakaoPixelStrings.NAD
      - typings.kakaoPixel.kakaoPixelStrings.NGN
      - typings.kakaoPixel.kakaoPixelStrings.NIO
      - typings.kakaoPixel.kakaoPixelStrings.NOK
      - typings.kakaoPixel.kakaoPixelStrings.NPR
      - typings.kakaoPixel.kakaoPixelStrings.NZD
      - typings.kakaoPixel.kakaoPixelStrings.OMR
      - typings.kakaoPixel.kakaoPixelStrings.PAB
      - typings.kakaoPixel.kakaoPixelStrings.PEN
      - typings.kakaoPixel.kakaoPixelStrings.PGK
      - typings.kakaoPixel.kakaoPixelStrings.PHP
      - typings.kakaoPixel.kakaoPixelStrings.PKR
      - typings.kakaoPixel.kakaoPixelStrings.PLN
      - typings.kakaoPixel.kakaoPixelStrings.PYG
      - typings.kakaoPixel.kakaoPixelStrings.QAR
      - typings.kakaoPixel.kakaoPixelStrings.RON
      - typings.kakaoPixel.kakaoPixelStrings.RSD
      - typings.kakaoPixel.kakaoPixelStrings.RUB
      - typings.kakaoPixel.kakaoPixelStrings.RWF
      - typings.kakaoPixel.kakaoPixelStrings.SAR
      - typings.kakaoPixel.kakaoPixelStrings.SBD
      - typings.kakaoPixel.kakaoPixelStrings.SCR
      - typings.kakaoPixel.kakaoPixelStrings.SDG
      - typings.kakaoPixel.kakaoPixelStrings.SEK
      - typings.kakaoPixel.kakaoPixelStrings.SGD
      - typings.kakaoPixel.kakaoPixelStrings.SHP
      - typings.kakaoPixel.kakaoPixelStrings.SLL
      - typings.kakaoPixel.kakaoPixelStrings.SOS
      - typings.kakaoPixel.kakaoPixelStrings.SRD
      - typings.kakaoPixel.kakaoPixelStrings.SSP
      - typings.kakaoPixel.kakaoPixelStrings.STD
      - typings.kakaoPixel.kakaoPixelStrings.SYP
      - typings.kakaoPixel.kakaoPixelStrings.SZL
      - typings.kakaoPixel.kakaoPixelStrings.THB
      - typings.kakaoPixel.kakaoPixelStrings.TJS
      - typings.kakaoPixel.kakaoPixelStrings.TMT
      - typings.kakaoPixel.kakaoPixelStrings.TND
      - typings.kakaoPixel.kakaoPixelStrings.TOP
      - typings.kakaoPixel.kakaoPixelStrings.TRY
      - typings.kakaoPixel.kakaoPixelStrings.TTD
      - typings.kakaoPixel.kakaoPixelStrings.TWD
      - typings.kakaoPixel.kakaoPixelStrings.TZS
      - typings.kakaoPixel.kakaoPixelStrings.UAH
      - typings.kakaoPixel.kakaoPixelStrings.UGX
      - typings.kakaoPixel.kakaoPixelStrings.USD
      - typings.kakaoPixel.kakaoPixelStrings.USN
      - typings.kakaoPixel.kakaoPixelStrings.USS
      - typings.kakaoPixel.kakaoPixelStrings.UYI
      - typings.kakaoPixel.kakaoPixelStrings.UYU
      - typings.kakaoPixel.kakaoPixelStrings.UZS
      - typings.kakaoPixel.kakaoPixelStrings.VEF
      - typings.kakaoPixel.kakaoPixelStrings.VND
      - typings.kakaoPixel.kakaoPixelStrings.VUV
      - typings.kakaoPixel.kakaoPixelStrings.WST
      - typings.kakaoPixel.kakaoPixelStrings.XAF
      - typings.kakaoPixel.kakaoPixelStrings.XAG
      - typings.kakaoPixel.kakaoPixelStrings.XAU
      - typings.kakaoPixel.kakaoPixelStrings.XBA
      - typings.kakaoPixel.kakaoPixelStrings.XBB
      - typings.kakaoPixel.kakaoPixelStrings.XBC
      - typings.kakaoPixel.kakaoPixelStrings.XBD
      - typings.kakaoPixel.kakaoPixelStrings.XCD
      - typings.kakaoPixel.kakaoPixelStrings.XDR
      - typings.kakaoPixel.kakaoPixelStrings.XOF
      - typings.kakaoPixel.kakaoPixelStrings.XPD
      - typings.kakaoPixel.kakaoPixelStrings.XPF
      - typings.kakaoPixel.kakaoPixelStrings.XPT
      - typings.kakaoPixel.kakaoPixelStrings.XTS
      - typings.kakaoPixel.kakaoPixelStrings.XXX
      - typings.kakaoPixel.kakaoPixelStrings.YER
      - typings.kakaoPixel.kakaoPixelStrings.ZAR
      - typings.kakaoPixel.kakaoPixelStrings.ZMW
    */
    trait Currency extends StObject
    object Currency {
      
      inline def AED: typings.kakaoPixel.kakaoPixelStrings.AED = "AED".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AED]
      
      inline def AFN: typings.kakaoPixel.kakaoPixelStrings.AFN = "AFN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AFN]
      
      inline def ALL: typings.kakaoPixel.kakaoPixelStrings.ALL = "ALL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ALL]
      
      inline def AMD: typings.kakaoPixel.kakaoPixelStrings.AMD = "AMD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AMD]
      
      inline def ANG: typings.kakaoPixel.kakaoPixelStrings.ANG = "ANG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ANG]
      
      inline def AOA: typings.kakaoPixel.kakaoPixelStrings.AOA = "AOA".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AOA]
      
      inline def ARS: typings.kakaoPixel.kakaoPixelStrings.ARS = "ARS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ARS]
      
      inline def AUD: typings.kakaoPixel.kakaoPixelStrings.AUD = "AUD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AUD]
      
      inline def AWG: typings.kakaoPixel.kakaoPixelStrings.AWG = "AWG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AWG]
      
      inline def AZN: typings.kakaoPixel.kakaoPixelStrings.AZN = "AZN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.AZN]
      
      inline def BAM: typings.kakaoPixel.kakaoPixelStrings.BAM = "BAM".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BAM]
      
      inline def BBD: typings.kakaoPixel.kakaoPixelStrings.BBD = "BBD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BBD]
      
      inline def BDT: typings.kakaoPixel.kakaoPixelStrings.BDT = "BDT".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BDT]
      
      inline def BGN: typings.kakaoPixel.kakaoPixelStrings.BGN = "BGN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BGN]
      
      inline def BHD: typings.kakaoPixel.kakaoPixelStrings.BHD = "BHD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BHD]
      
      inline def BIF: typings.kakaoPixel.kakaoPixelStrings.BIF = "BIF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BIF]
      
      inline def BMD: typings.kakaoPixel.kakaoPixelStrings.BMD = "BMD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BMD]
      
      inline def BND: typings.kakaoPixel.kakaoPixelStrings.BND = "BND".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BND]
      
      inline def BOB: typings.kakaoPixel.kakaoPixelStrings.BOB = "BOB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BOB]
      
      inline def BOV: typings.kakaoPixel.kakaoPixelStrings.BOV = "BOV".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BOV]
      
      inline def BRL: typings.kakaoPixel.kakaoPixelStrings.BRL = "BRL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BRL]
      
      inline def BSD: typings.kakaoPixel.kakaoPixelStrings.BSD = "BSD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BSD]
      
      inline def BTN: typings.kakaoPixel.kakaoPixelStrings.BTN = "BTN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BTN]
      
      inline def BWP: typings.kakaoPixel.kakaoPixelStrings.BWP = "BWP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BWP]
      
      inline def BYR: typings.kakaoPixel.kakaoPixelStrings.BYR = "BYR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BYR]
      
      inline def BZD: typings.kakaoPixel.kakaoPixelStrings.BZD = "BZD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.BZD]
      
      inline def CAD: typings.kakaoPixel.kakaoPixelStrings.CAD = "CAD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CAD]
      
      inline def CDF: typings.kakaoPixel.kakaoPixelStrings.CDF = "CDF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CDF]
      
      inline def CHE: typings.kakaoPixel.kakaoPixelStrings.CHE = "CHE".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CHE]
      
      inline def CHF: typings.kakaoPixel.kakaoPixelStrings.CHF = "CHF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CHF]
      
      inline def CHW: typings.kakaoPixel.kakaoPixelStrings.CHW = "CHW".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CHW]
      
      inline def CLF: typings.kakaoPixel.kakaoPixelStrings.CLF = "CLF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CLF]
      
      inline def CLP: typings.kakaoPixel.kakaoPixelStrings.CLP = "CLP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CLP]
      
      inline def CNY: typings.kakaoPixel.kakaoPixelStrings.CNY = "CNY".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CNY]
      
      inline def COP: typings.kakaoPixel.kakaoPixelStrings.COP = "COP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.COP]
      
      inline def COU: typings.kakaoPixel.kakaoPixelStrings.COU = "COU".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.COU]
      
      inline def CRC: typings.kakaoPixel.kakaoPixelStrings.CRC = "CRC".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CRC]
      
      inline def CUC: typings.kakaoPixel.kakaoPixelStrings.CUC = "CUC".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CUC]
      
      inline def CUP: typings.kakaoPixel.kakaoPixelStrings.CUP = "CUP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CUP]
      
      inline def CVE: typings.kakaoPixel.kakaoPixelStrings.CVE = "CVE".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CVE]
      
      inline def CZK: typings.kakaoPixel.kakaoPixelStrings.CZK = "CZK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.CZK]
      
      inline def DJF: typings.kakaoPixel.kakaoPixelStrings.DJF = "DJF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.DJF]
      
      inline def DKK: typings.kakaoPixel.kakaoPixelStrings.DKK = "DKK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.DKK]
      
      inline def DOP: typings.kakaoPixel.kakaoPixelStrings.DOP = "DOP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.DOP]
      
      inline def DZD: typings.kakaoPixel.kakaoPixelStrings.DZD = "DZD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.DZD]
      
      inline def EGP: typings.kakaoPixel.kakaoPixelStrings.EGP = "EGP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.EGP]
      
      inline def ERN: typings.kakaoPixel.kakaoPixelStrings.ERN = "ERN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ERN]
      
      inline def ETB: typings.kakaoPixel.kakaoPixelStrings.ETB = "ETB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ETB]
      
      inline def EUR: typings.kakaoPixel.kakaoPixelStrings.EUR = "EUR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.EUR]
      
      inline def FJD: typings.kakaoPixel.kakaoPixelStrings.FJD = "FJD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.FJD]
      
      inline def FKP: typings.kakaoPixel.kakaoPixelStrings.FKP = "FKP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.FKP]
      
      inline def GBP: typings.kakaoPixel.kakaoPixelStrings.GBP = "GBP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GBP]
      
      inline def GEL: typings.kakaoPixel.kakaoPixelStrings.GEL = "GEL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GEL]
      
      inline def GHS: typings.kakaoPixel.kakaoPixelStrings.GHS = "GHS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GHS]
      
      inline def GIP: typings.kakaoPixel.kakaoPixelStrings.GIP = "GIP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GIP]
      
      inline def GMD: typings.kakaoPixel.kakaoPixelStrings.GMD = "GMD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GMD]
      
      inline def GNF: typings.kakaoPixel.kakaoPixelStrings.GNF = "GNF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GNF]
      
      inline def GTQ: typings.kakaoPixel.kakaoPixelStrings.GTQ = "GTQ".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GTQ]
      
      inline def GYD: typings.kakaoPixel.kakaoPixelStrings.GYD = "GYD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.GYD]
      
      inline def HKD: typings.kakaoPixel.kakaoPixelStrings.HKD = "HKD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.HKD]
      
      inline def HNL: typings.kakaoPixel.kakaoPixelStrings.HNL = "HNL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.HNL]
      
      inline def HRK: typings.kakaoPixel.kakaoPixelStrings.HRK = "HRK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.HRK]
      
      inline def HTG: typings.kakaoPixel.kakaoPixelStrings.HTG = "HTG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.HTG]
      
      inline def HUF: typings.kakaoPixel.kakaoPixelStrings.HUF = "HUF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.HUF]
      
      inline def IDR: typings.kakaoPixel.kakaoPixelStrings.IDR = "IDR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.IDR]
      
      inline def ILS: typings.kakaoPixel.kakaoPixelStrings.ILS = "ILS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ILS]
      
      inline def INR: typings.kakaoPixel.kakaoPixelStrings.INR = "INR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.INR]
      
      inline def IQD: typings.kakaoPixel.kakaoPixelStrings.IQD = "IQD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.IQD]
      
      inline def IRR: typings.kakaoPixel.kakaoPixelStrings.IRR = "IRR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.IRR]
      
      inline def ISK: typings.kakaoPixel.kakaoPixelStrings.ISK = "ISK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ISK]
      
      inline def JMD: typings.kakaoPixel.kakaoPixelStrings.JMD = "JMD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.JMD]
      
      inline def JOD: typings.kakaoPixel.kakaoPixelStrings.JOD = "JOD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.JOD]
      
      inline def JPY: typings.kakaoPixel.kakaoPixelStrings.JPY = "JPY".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.JPY]
      
      inline def KES: typings.kakaoPixel.kakaoPixelStrings.KES = "KES".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KES]
      
      inline def KGS: typings.kakaoPixel.kakaoPixelStrings.KGS = "KGS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KGS]
      
      inline def KHR: typings.kakaoPixel.kakaoPixelStrings.KHR = "KHR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KHR]
      
      inline def KMF: typings.kakaoPixel.kakaoPixelStrings.KMF = "KMF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KMF]
      
      inline def KPW: typings.kakaoPixel.kakaoPixelStrings.KPW = "KPW".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KPW]
      
      inline def KRW: typings.kakaoPixel.kakaoPixelStrings.KRW = "KRW".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KRW]
      
      inline def KWD: typings.kakaoPixel.kakaoPixelStrings.KWD = "KWD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KWD]
      
      inline def KYD: typings.kakaoPixel.kakaoPixelStrings.KYD = "KYD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KYD]
      
      inline def KZT: typings.kakaoPixel.kakaoPixelStrings.KZT = "KZT".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.KZT]
      
      inline def LAK: typings.kakaoPixel.kakaoPixelStrings.LAK = "LAK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LAK]
      
      inline def LBP: typings.kakaoPixel.kakaoPixelStrings.LBP = "LBP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LBP]
      
      inline def LKR: typings.kakaoPixel.kakaoPixelStrings.LKR = "LKR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LKR]
      
      inline def LRD: typings.kakaoPixel.kakaoPixelStrings.LRD = "LRD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LRD]
      
      inline def LSL: typings.kakaoPixel.kakaoPixelStrings.LSL = "LSL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LSL]
      
      inline def LTL: typings.kakaoPixel.kakaoPixelStrings.LTL = "LTL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LTL]
      
      inline def LVL: typings.kakaoPixel.kakaoPixelStrings.LVL = "LVL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LVL]
      
      inline def LYD: typings.kakaoPixel.kakaoPixelStrings.LYD = "LYD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.LYD]
      
      inline def MAD: typings.kakaoPixel.kakaoPixelStrings.MAD = "MAD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MAD]
      
      inline def MDL: typings.kakaoPixel.kakaoPixelStrings.MDL = "MDL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MDL]
      
      inline def MGA: typings.kakaoPixel.kakaoPixelStrings.MGA = "MGA".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MGA]
      
      inline def MKD: typings.kakaoPixel.kakaoPixelStrings.MKD = "MKD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MKD]
      
      inline def MMK: typings.kakaoPixel.kakaoPixelStrings.MMK = "MMK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MMK]
      
      inline def MNT: typings.kakaoPixel.kakaoPixelStrings.MNT = "MNT".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MNT]
      
      inline def MOP: typings.kakaoPixel.kakaoPixelStrings.MOP = "MOP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MOP]
      
      inline def MRO: typings.kakaoPixel.kakaoPixelStrings.MRO = "MRO".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MRO]
      
      inline def MUR: typings.kakaoPixel.kakaoPixelStrings.MUR = "MUR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MUR]
      
      inline def MVR: typings.kakaoPixel.kakaoPixelStrings.MVR = "MVR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MVR]
      
      inline def MWK: typings.kakaoPixel.kakaoPixelStrings.MWK = "MWK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MWK]
      
      inline def MXN: typings.kakaoPixel.kakaoPixelStrings.MXN = "MXN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MXN]
      
      inline def MXV: typings.kakaoPixel.kakaoPixelStrings.MXV = "MXV".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MXV]
      
      inline def MYR: typings.kakaoPixel.kakaoPixelStrings.MYR = "MYR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MYR]
      
      inline def MZN: typings.kakaoPixel.kakaoPixelStrings.MZN = "MZN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.MZN]
      
      inline def NAD: typings.kakaoPixel.kakaoPixelStrings.NAD = "NAD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NAD]
      
      inline def NGN: typings.kakaoPixel.kakaoPixelStrings.NGN = "NGN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NGN]
      
      inline def NIO: typings.kakaoPixel.kakaoPixelStrings.NIO = "NIO".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NIO]
      
      inline def NOK: typings.kakaoPixel.kakaoPixelStrings.NOK = "NOK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NOK]
      
      inline def NPR: typings.kakaoPixel.kakaoPixelStrings.NPR = "NPR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NPR]
      
      inline def NZD: typings.kakaoPixel.kakaoPixelStrings.NZD = "NZD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.NZD]
      
      inline def OMR: typings.kakaoPixel.kakaoPixelStrings.OMR = "OMR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.OMR]
      
      inline def PAB: typings.kakaoPixel.kakaoPixelStrings.PAB = "PAB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PAB]
      
      inline def PEN: typings.kakaoPixel.kakaoPixelStrings.PEN = "PEN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PEN]
      
      inline def PGK: typings.kakaoPixel.kakaoPixelStrings.PGK = "PGK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PGK]
      
      inline def PHP: typings.kakaoPixel.kakaoPixelStrings.PHP = "PHP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PHP]
      
      inline def PKR: typings.kakaoPixel.kakaoPixelStrings.PKR = "PKR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PKR]
      
      inline def PLN: typings.kakaoPixel.kakaoPixelStrings.PLN = "PLN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PLN]
      
      inline def PYG: typings.kakaoPixel.kakaoPixelStrings.PYG = "PYG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.PYG]
      
      inline def QAR: typings.kakaoPixel.kakaoPixelStrings.QAR = "QAR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.QAR]
      
      inline def RON: typings.kakaoPixel.kakaoPixelStrings.RON = "RON".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.RON]
      
      inline def RSD: typings.kakaoPixel.kakaoPixelStrings.RSD = "RSD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.RSD]
      
      inline def RUB: typings.kakaoPixel.kakaoPixelStrings.RUB = "RUB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.RUB]
      
      inline def RWF: typings.kakaoPixel.kakaoPixelStrings.RWF = "RWF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.RWF]
      
      inline def SAR: typings.kakaoPixel.kakaoPixelStrings.SAR = "SAR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SAR]
      
      inline def SBD: typings.kakaoPixel.kakaoPixelStrings.SBD = "SBD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SBD]
      
      inline def SCR: typings.kakaoPixel.kakaoPixelStrings.SCR = "SCR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SCR]
      
      inline def SDG: typings.kakaoPixel.kakaoPixelStrings.SDG = "SDG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SDG]
      
      inline def SEK: typings.kakaoPixel.kakaoPixelStrings.SEK = "SEK".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SEK]
      
      inline def SGD: typings.kakaoPixel.kakaoPixelStrings.SGD = "SGD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SGD]
      
      inline def SHP: typings.kakaoPixel.kakaoPixelStrings.SHP = "SHP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SHP]
      
      inline def SLL: typings.kakaoPixel.kakaoPixelStrings.SLL = "SLL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SLL]
      
      inline def SOS: typings.kakaoPixel.kakaoPixelStrings.SOS = "SOS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SOS]
      
      inline def SRD: typings.kakaoPixel.kakaoPixelStrings.SRD = "SRD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SRD]
      
      inline def SSP: typings.kakaoPixel.kakaoPixelStrings.SSP = "SSP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SSP]
      
      inline def STD: typings.kakaoPixel.kakaoPixelStrings.STD = "STD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.STD]
      
      inline def SYP: typings.kakaoPixel.kakaoPixelStrings.SYP = "SYP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SYP]
      
      inline def SZL: typings.kakaoPixel.kakaoPixelStrings.SZL = "SZL".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.SZL]
      
      inline def THB: typings.kakaoPixel.kakaoPixelStrings.THB = "THB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.THB]
      
      inline def TJS: typings.kakaoPixel.kakaoPixelStrings.TJS = "TJS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TJS]
      
      inline def TMT: typings.kakaoPixel.kakaoPixelStrings.TMT = "TMT".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TMT]
      
      inline def TND: typings.kakaoPixel.kakaoPixelStrings.TND = "TND".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TND]
      
      inline def TOP: typings.kakaoPixel.kakaoPixelStrings.TOP = "TOP".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TOP]
      
      inline def TRY: typings.kakaoPixel.kakaoPixelStrings.TRY = "TRY".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TRY]
      
      inline def TTD: typings.kakaoPixel.kakaoPixelStrings.TTD = "TTD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TTD]
      
      inline def TWD: typings.kakaoPixel.kakaoPixelStrings.TWD = "TWD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TWD]
      
      inline def TZS: typings.kakaoPixel.kakaoPixelStrings.TZS = "TZS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.TZS]
      
      inline def UAH: typings.kakaoPixel.kakaoPixelStrings.UAH = "UAH".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.UAH]
      
      inline def UGX: typings.kakaoPixel.kakaoPixelStrings.UGX = "UGX".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.UGX]
      
      inline def USD: typings.kakaoPixel.kakaoPixelStrings.USD = "USD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.USD]
      
      inline def USN: typings.kakaoPixel.kakaoPixelStrings.USN = "USN".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.USN]
      
      inline def USS: typings.kakaoPixel.kakaoPixelStrings.USS = "USS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.USS]
      
      inline def UYI: typings.kakaoPixel.kakaoPixelStrings.UYI = "UYI".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.UYI]
      
      inline def UYU: typings.kakaoPixel.kakaoPixelStrings.UYU = "UYU".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.UYU]
      
      inline def UZS: typings.kakaoPixel.kakaoPixelStrings.UZS = "UZS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.UZS]
      
      inline def VEF: typings.kakaoPixel.kakaoPixelStrings.VEF = "VEF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.VEF]
      
      inline def VND: typings.kakaoPixel.kakaoPixelStrings.VND = "VND".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.VND]
      
      inline def VUV: typings.kakaoPixel.kakaoPixelStrings.VUV = "VUV".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.VUV]
      
      inline def WST: typings.kakaoPixel.kakaoPixelStrings.WST = "WST".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.WST]
      
      inline def XAF: typings.kakaoPixel.kakaoPixelStrings.XAF = "XAF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XAF]
      
      inline def XAG: typings.kakaoPixel.kakaoPixelStrings.XAG = "XAG".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XAG]
      
      inline def XAU: typings.kakaoPixel.kakaoPixelStrings.XAU = "XAU".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XAU]
      
      inline def XBA: typings.kakaoPixel.kakaoPixelStrings.XBA = "XBA".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XBA]
      
      inline def XBB: typings.kakaoPixel.kakaoPixelStrings.XBB = "XBB".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XBB]
      
      inline def XBC: typings.kakaoPixel.kakaoPixelStrings.XBC = "XBC".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XBC]
      
      inline def XBD: typings.kakaoPixel.kakaoPixelStrings.XBD = "XBD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XBD]
      
      inline def XCD: typings.kakaoPixel.kakaoPixelStrings.XCD = "XCD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XCD]
      
      inline def XDR: typings.kakaoPixel.kakaoPixelStrings.XDR = "XDR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XDR]
      
      inline def XOF: typings.kakaoPixel.kakaoPixelStrings.XOF = "XOF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XOF]
      
      inline def XPD: typings.kakaoPixel.kakaoPixelStrings.XPD = "XPD".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XPD]
      
      inline def XPF: typings.kakaoPixel.kakaoPixelStrings.XPF = "XPF".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XPF]
      
      inline def XPT: typings.kakaoPixel.kakaoPixelStrings.XPT = "XPT".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XPT]
      
      inline def XTS: typings.kakaoPixel.kakaoPixelStrings.XTS = "XTS".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XTS]
      
      inline def XXX: typings.kakaoPixel.kakaoPixelStrings.XXX = "XXX".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.XXX]
      
      inline def YER: typings.kakaoPixel.kakaoPixelStrings.YER = "YER".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.YER]
      
      inline def ZAR: typings.kakaoPixel.kakaoPixelStrings.ZAR = "ZAR".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ZAR]
      
      inline def ZMW: typings.kakaoPixel.kakaoPixelStrings.ZMW = "ZMW".asInstanceOf[typings.kakaoPixel.kakaoPixelStrings.ZMW]
    }
    
    @js.native
    trait Event extends StObject {
      
      def addToCart(): Unit = js.native
      def addToCart(parameters: AddToCartParameters): Unit = js.native
      
      def addToWishList(): Unit = js.native
      def addToWishList(parameters: AddWishListParameters): Unit = js.native
      
      def completeRegistration(): Unit = js.native
      def completeRegistration(tag: String): Unit = js.native
      
      def pageView(): Unit = js.native
      def pageView(tag: String): Unit = js.native
      
      def participation(): Unit = js.native
      def participation(tag: String): Unit = js.native
      
      def purchase(): Unit = js.native
      def purchase(parameters: PurchaseParameters): Unit = js.native
      
      def search(): Unit = js.native
      def search(parameters: SearchParameters): Unit = js.native
      
      def signUp(): Unit = js.native
      def signUp(tag: String): Unit = js.native
      
      def viewCart(): Unit = js.native
      def viewCart(tag: String): Unit = js.native
      
      def viewContent(): Unit = js.native
      def viewContent(parameters: ViewContentParameters): Unit = js.native
    }
    
    trait Product extends StObject {
      
      var id: String
      
      var name: String
      
      var price: String
      
      var quantity: String
    }
    object Product {
      
      inline def apply(id: String, name: String, price: String, quantity: String): Product = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any])
        __obj.asInstanceOf[Product]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
        
        inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      }
    }
    
    trait PurchaseParameters extends StObject {
      
      var currency: js.UndefOr[Currency] = js.undefined
      
      var products: js.UndefOr[js.Array[Product]] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
      
      var total_price: js.UndefOr[String] = js.undefined
      
      var total_quantity: js.UndefOr[String] = js.undefined
    }
    object PurchaseParameters {
      
      inline def apply(): PurchaseParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PurchaseParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PurchaseParameters] (val x: Self) extends AnyVal {
        
        inline def setCurrency(value: Currency): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
        
        inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        
        inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
        
        inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
        
        inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
        
        inline def setTotal_price(value: String): Self = StObject.set(x, "total_price", value.asInstanceOf[js.Any])
        
        inline def setTotal_priceUndefined: Self = StObject.set(x, "total_price", js.undefined)
        
        inline def setTotal_quantity(value: String): Self = StObject.set(x, "total_quantity", value.asInstanceOf[js.Any])
        
        inline def setTotal_quantityUndefined: Self = StObject.set(x, "total_quantity", js.undefined)
      }
    }
    
    trait SearchParameters extends StObject {
      
      var keyword: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object SearchParameters {
      
      inline def apply(): SearchParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SearchParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SearchParameters] (val x: Self) extends AnyVal {
        
        inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
        
        inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
    
    trait ViewContentParameters extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var tag: js.UndefOr[String] = js.undefined
    }
    object ViewContentParameters {
      
      inline def apply(): ViewContentParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ViewContentParameters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ViewContentParameters] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      }
    }
  }
}
