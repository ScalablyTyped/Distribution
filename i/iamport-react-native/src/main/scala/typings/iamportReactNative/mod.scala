package typings.iamportReactNative

import typings.iamportReactNative.anon.Cardquota
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("iamport-react-native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("iamport-react-native", "default.Certification")
    @js.native
    def Certification: FC[CertificationProps] = js.native
    inline def Certification_=(x: FC[CertificationProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Certification")(x.asInstanceOf[js.Any])
    
    @JSImport("iamport-react-native", "default.Payment")
    @js.native
    def Payment: FC[PaymentProps] = js.native
    inline def Payment_=(x: FC[PaymentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Payment")(x.asInstanceOf[js.Any])
  }
  
  trait CallbackRsp extends StObject {
    
    var apply_num: js.UndefOr[String] = js.undefined
    
    var buyer_addr: js.UndefOr[String] = js.undefined
    
    var buyer_email: js.UndefOr[String] = js.undefined
    
    var buyer_name: js.UndefOr[String] = js.undefined
    
    var buyer_postcode: js.UndefOr[String] = js.undefined
    
    var buyer_tel: js.UndefOr[String] = js.undefined
    
    var custom_data: js.UndefOr[js.Object] = js.undefined
    
    var error_code: js.UndefOr[String] = js.undefined
    
    var error_msg: js.UndefOr[String] = js.undefined
    
    var imp_success: js.UndefOr[String] = js.undefined
    
    var imp_uid: js.UndefOr[String] = js.undefined
    
    var merchant_uid: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var paid_amount: js.UndefOr[String] = js.undefined
    
    var paid_at: js.UndefOr[Double] = js.undefined
    
    var pay_method: js.UndefOr[String] = js.undefined
    
    var pg_provider: js.UndefOr[String] = js.undefined
    
    var pg_tid: js.UndefOr[String] = js.undefined
    
    var receipt_url: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
    
    var vbank_date: js.UndefOr[Double] = js.undefined
    
    var vbank_holder: js.UndefOr[String] = js.undefined
    
    var vbank_name: js.UndefOr[String] = js.undefined
    
    var vbank_num: js.UndefOr[String] = js.undefined
  }
  object CallbackRsp {
    
    inline def apply(): CallbackRsp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackRsp]
    }
    
    extension [Self <: CallbackRsp](x: Self) {
      
      inline def setApply_num(value: String): Self = StObject.set(x, "apply_num", value.asInstanceOf[js.Any])
      
      inline def setApply_numUndefined: Self = StObject.set(x, "apply_num", js.undefined)
      
      inline def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      inline def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      inline def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      inline def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      inline def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      inline def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      inline def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      inline def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      inline def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      inline def setBuyer_telUndefined: Self = StObject.set(x, "buyer_tel", js.undefined)
      
      inline def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      inline def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_codeUndefined: Self = StObject.set(x, "error_code", js.undefined)
      
      inline def setError_msg(value: String): Self = StObject.set(x, "error_msg", value.asInstanceOf[js.Any])
      
      inline def setError_msgUndefined: Self = StObject.set(x, "error_msg", js.undefined)
      
      inline def setImp_success(value: String): Self = StObject.set(x, "imp_success", value.asInstanceOf[js.Any])
      
      inline def setImp_successUndefined: Self = StObject.set(x, "imp_success", js.undefined)
      
      inline def setImp_uid(value: String): Self = StObject.set(x, "imp_uid", value.asInstanceOf[js.Any])
      
      inline def setImp_uidUndefined: Self = StObject.set(x, "imp_uid", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPaid_amount(value: String): Self = StObject.set(x, "paid_amount", value.asInstanceOf[js.Any])
      
      inline def setPaid_amountUndefined: Self = StObject.set(x, "paid_amount", js.undefined)
      
      inline def setPaid_at(value: Double): Self = StObject.set(x, "paid_at", value.asInstanceOf[js.Any])
      
      inline def setPaid_atUndefined: Self = StObject.set(x, "paid_at", js.undefined)
      
      inline def setPay_method(value: String): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      inline def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      inline def setPg_provider(value: String): Self = StObject.set(x, "pg_provider", value.asInstanceOf[js.Any])
      
      inline def setPg_providerUndefined: Self = StObject.set(x, "pg_provider", js.undefined)
      
      inline def setPg_tid(value: String): Self = StObject.set(x, "pg_tid", value.asInstanceOf[js.Any])
      
      inline def setPg_tidUndefined: Self = StObject.set(x, "pg_tid", js.undefined)
      
      inline def setReceipt_url(value: String): Self = StObject.set(x, "receipt_url", value.asInstanceOf[js.Any])
      
      inline def setReceipt_urlUndefined: Self = StObject.set(x, "receipt_url", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setVbank_date(value: Double): Self = StObject.set(x, "vbank_date", value.asInstanceOf[js.Any])
      
      inline def setVbank_dateUndefined: Self = StObject.set(x, "vbank_date", js.undefined)
      
      inline def setVbank_holder(value: String): Self = StObject.set(x, "vbank_holder", value.asInstanceOf[js.Any])
      
      inline def setVbank_holderUndefined: Self = StObject.set(x, "vbank_holder", js.undefined)
      
      inline def setVbank_name(value: String): Self = StObject.set(x, "vbank_name", value.asInstanceOf[js.Any])
      
      inline def setVbank_nameUndefined: Self = StObject.set(x, "vbank_name", js.undefined)
      
      inline def setVbank_num(value: String): Self = StObject.set(x, "vbank_num", value.asInstanceOf[js.Any])
      
      inline def setVbank_numUndefined: Self = StObject.set(x, "vbank_num", js.undefined)
    }
  }
  
  trait CertificationData extends StObject {
    
    var app_scheme: js.UndefOr[String] = js.undefined
    
    var carrier: js.UndefOr[IMP_CARRIERS] = js.undefined
    
    var company: js.UndefOr[String] = js.undefined
    
    var merchant_uid: js.UndefOr[String] = js.undefined
    
    var min_age: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object CertificationData {
    
    inline def apply(): CertificationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificationData]
    }
    
    extension [Self <: CertificationData](x: Self) {
      
      inline def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      inline def setApp_schemeUndefined: Self = StObject.set(x, "app_scheme", js.undefined)
      
      inline def setCarrier(value: IMP_CARRIERS): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
      
      inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
      
      inline def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setMerchant_uidUndefined: Self = StObject.set(x, "merchant_uid", js.undefined)
      
      inline def setMin_age(value: String): Self = StObject.set(x, "min_age", value.asInstanceOf[js.Any])
      
      inline def setMin_ageUndefined: Self = StObject.set(x, "min_age", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  trait CertificationProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit
    
    var data: CertificationData
    
    var loading: js.UndefOr[js.Object] = js.undefined
    
    var tierCode: js.UndefOr[String] = js.undefined
    
    var userCode: String
  }
  object CertificationProps {
    
    inline def apply(callback: CallbackRsp => Unit, data: CertificationData, userCode: String): CertificationProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificationProps]
    }
    
    extension [Self <: CertificationProps](x: Self) {
      
      inline def setCallback(value: CallbackRsp => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setData(value: CertificationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      inline def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iamportReactNative.iamportReactNativeStrings.SKT
    - typings.iamportReactNative.iamportReactNativeStrings.KTF
    - typings.iamportReactNative.iamportReactNativeStrings.LGT
    - typings.iamportReactNative.iamportReactNativeStrings.MVNO
  */
  trait IMP_CARRIERS extends StObject
  object IMP_CARRIERS {
    
    inline def KTF: typings.iamportReactNative.iamportReactNativeStrings.KTF = "KTF".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.KTF]
    
    inline def LGT: typings.iamportReactNative.iamportReactNativeStrings.LGT = "LGT".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.LGT]
    
    inline def MVNO: typings.iamportReactNative.iamportReactNativeStrings.MVNO = "MVNO".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.MVNO]
    
    inline def SKT: typings.iamportReactNative.iamportReactNativeStrings.SKT = "SKT".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.SKT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iamportReactNative.iamportReactNativeStrings.KRW
    - typings.iamportReactNative.iamportReactNativeStrings.USD
    - typings.iamportReactNative.iamportReactNativeStrings.EUR
    - typings.iamportReactNative.iamportReactNativeStrings.JPY
  */
  trait IMP_CURRENCY extends StObject
  object IMP_CURRENCY {
    
    inline def EUR: typings.iamportReactNative.iamportReactNativeStrings.EUR = "EUR".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.EUR]
    
    inline def JPY: typings.iamportReactNative.iamportReactNativeStrings.JPY = "JPY".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.JPY]
    
    inline def KRW: typings.iamportReactNative.iamportReactNativeStrings.KRW = "KRW".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.KRW]
    
    inline def USD: typings.iamportReactNative.iamportReactNativeStrings.USD = "USD".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.USD]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iamportReactNative.iamportReactNativeStrings.card
    - typings.iamportReactNative.iamportReactNativeStrings.trans
    - typings.iamportReactNative.iamportReactNativeStrings.vbank
    - typings.iamportReactNative.iamportReactNativeStrings.phone
    - typings.iamportReactNative.iamportReactNativeStrings.samsung
    - typings.iamportReactNative.iamportReactNativeStrings.kpay
    - typings.iamportReactNative.iamportReactNativeStrings.cultureland
    - typings.iamportReactNative.iamportReactNativeStrings.smartculture
    - typings.iamportReactNative.iamportReactNativeStrings.happymoney
    - typings.iamportReactNative.iamportReactNativeStrings.booknlife
    - typings.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typings.iamportReactNative.iamportReactNativeStrings.lpay
    - typings.iamportReactNative.iamportReactNativeStrings.payco
    - typings.iamportReactNative.iamportReactNativeStrings.ssgpay
    - typings.iamportReactNative.iamportReactNativeStrings.tosspay
  */
  trait IMP_PAY_METHOD extends StObject
  object IMP_PAY_METHOD {
    
    inline def booknlife: typings.iamportReactNative.iamportReactNativeStrings.booknlife = "booknlife".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.booknlife]
    
    inline def card: typings.iamportReactNative.iamportReactNativeStrings.card = "card".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.card]
    
    inline def cultureland: typings.iamportReactNative.iamportReactNativeStrings.cultureland = "cultureland".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.cultureland]
    
    inline def happymoney: typings.iamportReactNative.iamportReactNativeStrings.happymoney = "happymoney".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.happymoney]
    
    inline def kakaopay: typings.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    inline def kpay: typings.iamportReactNative.iamportReactNativeStrings.kpay = "kpay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kpay]
    
    inline def lpay: typings.iamportReactNative.iamportReactNativeStrings.lpay = "lpay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.lpay]
    
    inline def payco: typings.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.payco]
    
    inline def phone: typings.iamportReactNative.iamportReactNativeStrings.phone = "phone".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.phone]
    
    inline def samsung: typings.iamportReactNative.iamportReactNativeStrings.samsung = "samsung".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.samsung]
    
    inline def smartculture: typings.iamportReactNative.iamportReactNativeStrings.smartculture = "smartculture".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.smartculture]
    
    inline def ssgpay: typings.iamportReactNative.iamportReactNativeStrings.ssgpay = "ssgpay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.ssgpay]
    
    inline def tosspay: typings.iamportReactNative.iamportReactNativeStrings.tosspay = "tosspay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.tosspay]
    
    inline def trans: typings.iamportReactNative.iamportReactNativeStrings.trans = "trans".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.trans]
    
    inline def vbank: typings.iamportReactNative.iamportReactNativeStrings.vbank = "vbank".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.vbank]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iamportReactNative.iamportReactNativeStrings.html5_inicis
    - typings.iamportReactNative.iamportReactNativeStrings.inicis
    - typings.iamportReactNative.iamportReactNativeStrings.uplus
    - typings.iamportReactNative.iamportReactNativeStrings.kcp
    - typings.iamportReactNative.iamportReactNativeStrings.kcp_billing
    - typings.iamportReactNative.iamportReactNativeStrings.nice
    - typings.iamportReactNative.iamportReactNativeStrings.jtnet
    - typings.iamportReactNative.iamportReactNativeStrings.kakao
    - typings.iamportReactNative.iamportReactNativeStrings.kakaopay
    - typings.iamportReactNative.iamportReactNativeStrings.danal
    - typings.iamportReactNative.iamportReactNativeStrings.danal_tpay
    - typings.iamportReactNative.iamportReactNativeStrings.kicc
    - typings.iamportReactNative.iamportReactNativeStrings.settle
    - typings.iamportReactNative.iamportReactNativeStrings.mobilians
    - typings.iamportReactNative.iamportReactNativeStrings.payco
    - typings.iamportReactNative.iamportReactNativeStrings.eximbay
    - typings.iamportReactNative.iamportReactNativeStrings.paypal
    - typings.iamportReactNative.iamportReactNativeStrings.naverco
    - typings.iamportReactNative.iamportReactNativeStrings.naverpay
    - typings.iamportReactNative.iamportReactNativeStrings.smilepay
    - typings.iamportReactNative.iamportReactNativeStrings.chai
    - typings.iamportReactNative.iamportReactNativeStrings.payple
    - typings.iamportReactNative.iamportReactNativeStrings.alipay
  */
  trait IMP_PG extends StObject
  object IMP_PG {
    
    inline def alipay: typings.iamportReactNative.iamportReactNativeStrings.alipay = "alipay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.alipay]
    
    inline def chai: typings.iamportReactNative.iamportReactNativeStrings.chai = "chai".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.chai]
    
    inline def danal: typings.iamportReactNative.iamportReactNativeStrings.danal = "danal".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.danal]
    
    inline def danal_tpay: typings.iamportReactNative.iamportReactNativeStrings.danal_tpay = "danal_tpay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.danal_tpay]
    
    inline def eximbay: typings.iamportReactNative.iamportReactNativeStrings.eximbay = "eximbay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.eximbay]
    
    inline def html5_inicis: typings.iamportReactNative.iamportReactNativeStrings.html5_inicis = "html5_inicis".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.html5_inicis]
    
    inline def inicis: typings.iamportReactNative.iamportReactNativeStrings.inicis = "inicis".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.inicis]
    
    inline def jtnet: typings.iamportReactNative.iamportReactNativeStrings.jtnet = "jtnet".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.jtnet]
    
    inline def kakao: typings.iamportReactNative.iamportReactNativeStrings.kakao = "kakao".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kakao]
    
    inline def kakaopay: typings.iamportReactNative.iamportReactNativeStrings.kakaopay = "kakaopay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kakaopay]
    
    inline def kcp: typings.iamportReactNative.iamportReactNativeStrings.kcp = "kcp".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kcp]
    
    inline def kcp_billing: typings.iamportReactNative.iamportReactNativeStrings.kcp_billing = "kcp_billing".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kcp_billing]
    
    inline def kicc: typings.iamportReactNative.iamportReactNativeStrings.kicc = "kicc".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.kicc]
    
    inline def mobilians: typings.iamportReactNative.iamportReactNativeStrings.mobilians = "mobilians".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.mobilians]
    
    inline def naverco: typings.iamportReactNative.iamportReactNativeStrings.naverco = "naverco".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.naverco]
    
    inline def naverpay: typings.iamportReactNative.iamportReactNativeStrings.naverpay = "naverpay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.naverpay]
    
    inline def nice: typings.iamportReactNative.iamportReactNativeStrings.nice = "nice".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.nice]
    
    inline def payco: typings.iamportReactNative.iamportReactNativeStrings.payco = "payco".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.payco]
    
    inline def paypal: typings.iamportReactNative.iamportReactNativeStrings.paypal = "paypal".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.paypal]
    
    inline def payple: typings.iamportReactNative.iamportReactNativeStrings.payple = "payple".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.payple]
    
    inline def settle: typings.iamportReactNative.iamportReactNativeStrings.settle = "settle".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.settle]
    
    inline def smilepay: typings.iamportReactNative.iamportReactNativeStrings.smilepay = "smilepay".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.smilepay]
    
    inline def uplus: typings.iamportReactNative.iamportReactNativeStrings.uplus = "uplus".asInstanceOf[typings.iamportReactNative.iamportReactNativeStrings.uplus]
  }
  
  trait PaymentData extends StObject {
    
    var amount: Double
    
    var app_scheme: String
    
    var biz_num: js.UndefOr[String] = js.undefined
    
    var buyer_addr: js.UndefOr[String] = js.undefined
    
    var buyer_email: js.UndefOr[String] = js.undefined
    
    var buyer_name: js.UndefOr[String] = js.undefined
    
    var buyer_postcode: js.UndefOr[String] = js.undefined
    
    var buyer_tel: String
    
    var currency: js.UndefOr[IMP_CURRENCY] = js.undefined
    
    var custom_data: js.UndefOr[js.Object] = js.undefined
    
    var digital: js.UndefOr[Boolean] = js.undefined
    
    var display: js.UndefOr[Cardquota] = js.undefined
    
    var escrow: js.UndefOr[Boolean] = js.undefined
    
    var m_redirect_url: js.UndefOr[String] = js.undefined
    
    var merchant_uid: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var notice_url: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var pay_method: js.UndefOr[IMP_PAY_METHOD] = js.undefined
    
    var pg: js.UndefOr[IMP_PG] = js.undefined
    
    var popup: js.UndefOr[Boolean] = js.undefined
    
    var tax_free: js.UndefOr[Double] = js.undefined
    
    var vbank_due: js.UndefOr[String] = js.undefined
  }
  object PaymentData {
    
    inline def apply(amount: Double, app_scheme: String, buyer_tel: String, merchant_uid: String): PaymentData = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], app_scheme = app_scheme.asInstanceOf[js.Any], buyer_tel = buyer_tel.asInstanceOf[js.Any], merchant_uid = merchant_uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentData]
    }
    
    extension [Self <: PaymentData](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setApp_scheme(value: String): Self = StObject.set(x, "app_scheme", value.asInstanceOf[js.Any])
      
      inline def setBiz_num(value: String): Self = StObject.set(x, "biz_num", value.asInstanceOf[js.Any])
      
      inline def setBiz_numUndefined: Self = StObject.set(x, "biz_num", js.undefined)
      
      inline def setBuyer_addr(value: String): Self = StObject.set(x, "buyer_addr", value.asInstanceOf[js.Any])
      
      inline def setBuyer_addrUndefined: Self = StObject.set(x, "buyer_addr", js.undefined)
      
      inline def setBuyer_email(value: String): Self = StObject.set(x, "buyer_email", value.asInstanceOf[js.Any])
      
      inline def setBuyer_emailUndefined: Self = StObject.set(x, "buyer_email", js.undefined)
      
      inline def setBuyer_name(value: String): Self = StObject.set(x, "buyer_name", value.asInstanceOf[js.Any])
      
      inline def setBuyer_nameUndefined: Self = StObject.set(x, "buyer_name", js.undefined)
      
      inline def setBuyer_postcode(value: String): Self = StObject.set(x, "buyer_postcode", value.asInstanceOf[js.Any])
      
      inline def setBuyer_postcodeUndefined: Self = StObject.set(x, "buyer_postcode", js.undefined)
      
      inline def setBuyer_tel(value: String): Self = StObject.set(x, "buyer_tel", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: IMP_CURRENCY): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setCustom_data(value: js.Object): Self = StObject.set(x, "custom_data", value.asInstanceOf[js.Any])
      
      inline def setCustom_dataUndefined: Self = StObject.set(x, "custom_data", js.undefined)
      
      inline def setDigital(value: Boolean): Self = StObject.set(x, "digital", value.asInstanceOf[js.Any])
      
      inline def setDigitalUndefined: Self = StObject.set(x, "digital", js.undefined)
      
      inline def setDisplay(value: Cardquota): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setEscrow(value: Boolean): Self = StObject.set(x, "escrow", value.asInstanceOf[js.Any])
      
      inline def setEscrowUndefined: Self = StObject.set(x, "escrow", js.undefined)
      
      inline def setM_redirect_url(value: String): Self = StObject.set(x, "m_redirect_url", value.asInstanceOf[js.Any])
      
      inline def setM_redirect_urlUndefined: Self = StObject.set(x, "m_redirect_url", js.undefined)
      
      inline def setMerchant_uid(value: String): Self = StObject.set(x, "merchant_uid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNotice_url(value: String | js.Array[String]): Self = StObject.set(x, "notice_url", value.asInstanceOf[js.Any])
      
      inline def setNotice_urlUndefined: Self = StObject.set(x, "notice_url", js.undefined)
      
      inline def setNotice_urlVarargs(value: String*): Self = StObject.set(x, "notice_url", js.Array(value*))
      
      inline def setPay_method(value: IMP_PAY_METHOD): Self = StObject.set(x, "pay_method", value.asInstanceOf[js.Any])
      
      inline def setPay_methodUndefined: Self = StObject.set(x, "pay_method", js.undefined)
      
      inline def setPg(value: IMP_PG): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      inline def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setTax_free(value: Double): Self = StObject.set(x, "tax_free", value.asInstanceOf[js.Any])
      
      inline def setTax_freeUndefined: Self = StObject.set(x, "tax_free", js.undefined)
      
      inline def setVbank_due(value: String): Self = StObject.set(x, "vbank_due", value.asInstanceOf[js.Any])
      
      inline def setVbank_dueUndefined: Self = StObject.set(x, "vbank_due", js.undefined)
    }
  }
  
  trait PaymentProps extends StObject {
    
    def callback(rsp: CallbackRsp): Unit
    
    var data: PaymentData
    
    var handleInicisTrans: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var loading: js.UndefOr[js.Object] = js.undefined
    
    var open3rdPartyApp: js.UndefOr[js.Function1[/* iamportUrl */ Any, Unit]] = js.undefined
    
    var tierCode: js.UndefOr[String] = js.undefined
    
    var userCode: String
  }
  object PaymentProps {
    
    inline def apply(callback: CallbackRsp => Unit, data: PaymentData, userCode: String): PaymentProps = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), data = data.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaymentProps]
    }
    
    extension [Self <: PaymentProps](x: Self) {
      
      inline def setCallback(value: CallbackRsp => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setData(value: PaymentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandleInicisTrans(value: /* event */ Any => Unit): Self = StObject.set(x, "handleInicisTrans", js.Any.fromFunction1(value))
      
      inline def setHandleInicisTransUndefined: Self = StObject.set(x, "handleInicisTrans", js.undefined)
      
      inline def setLoading(value: js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOpen3rdPartyApp(value: /* iamportUrl */ Any => Unit): Self = StObject.set(x, "open3rdPartyApp", js.Any.fromFunction1(value))
      
      inline def setOpen3rdPartyAppUndefined: Self = StObject.set(x, "open3rdPartyApp", js.undefined)
      
      inline def setTierCode(value: String): Self = StObject.set(x, "tierCode", value.asInstanceOf[js.Any])
      
      inline def setTierCodeUndefined: Self = StObject.set(x, "tierCode", js.undefined)
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    }
  }
}
