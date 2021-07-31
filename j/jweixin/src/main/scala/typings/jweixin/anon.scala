package typings.jweixin

import org.scalablytyped.runtime.StringDictionary
import typings.jweixin.mod.ApiMethod
import typings.jweixin.mod.jsApiList
import typings.jweixin.mod.networkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accuracy extends StObject {
    
    // 速度，以米/每秒计
    var accuracy: Double
    
    var latitude: Double
    
    // 纬度，浮点数，范围为90 ~ -90
    var longitude: Double
    
    // 经度，浮点数，范围为180 ~ -180。
    var speed: Double
  }
  object Accuracy {
    
    @scala.inline
    def apply(accuracy: Double, latitude: Double, longitude: Double, speed: Double): Accuracy = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accuracy]
    }
    
    @scala.inline
    implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppId extends StObject {
    
    // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    var appId: String
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    // 必填，签名，见附录1
    var jsApiList: typings.jweixin.mod.jsApiList
    
    // 必填，生成签名的时间戳
    var nonceStr: String
    
    // 必填，生成签名的随机串
    var signature: String
    
    // 必填，公众号的唯一标识
    var timestamp: Double
  }
  object AppId {
    
    @scala.inline
    def apply(appId: String, jsApiList: jsApiList, nonceStr: String, signature: String, timestamp: Double): AppId = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppId]
    }
    
    @scala.inline
    implicit class AppIdMutableBuilder[Self <: AppId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setJsApiList(value: jsApiList): Self = StObject.set(x, "jsApiList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsApiListVarargs(value: ApiMethod*): Self = StObject.set(x, "jsApiList", js.Array(value :_*))
      
      @scala.inline
      def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardExt extends StObject {
    
    var cardExt: String
    
    var cardId: String
  }
  object CardExt {
    
    @scala.inline
    def apply(cardExt: String, cardId: String): CardExt = {
      val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardExt]
    }
    
    @scala.inline
    implicit class CardExtMutableBuilder[Self <: CardExt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardId extends StObject {
    
    var cardId: String
    
    var code: String
  }
  object CardId {
    
    @scala.inline
    def apply(cardId: String, code: String): CardId = {
      val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardId]
    }
    
    @scala.inline
    implicit class CardIdMutableBuilder[Self <: CardId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardList extends StObject {
    
    var cardList: js.Array[String]
  }
  object CardList {
    
    @scala.inline
    def apply(cardList: js.Array[String]): CardList = {
      val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardList]
    }
    
    @scala.inline
    implicit class CardListMutableBuilder[Self <: CardList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardList(value: js.Array[String]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardListVarargs(value: String*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    }
  }
  
  trait CheckResult extends StObject {
    
    var checkResult: StringDictionary[Boolean]
    
    var errMsg: String
  }
  object CheckResult {
    
    @scala.inline
    def apply(checkResult: StringDictionary[Boolean], errMsg: String): CheckResult = {
      val __obj = js.Dynamic.literal(checkResult = checkResult.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckResult]
    }
    
    @scala.inline
    implicit class CheckResultMutableBuilder[Self <: CheckResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckResult(value: StringDictionary[Boolean]): Self = StObject.set(x, "checkResult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrMsg extends StObject {
    
    var errMsg: String
  }
  object ErrMsg {
    
    @scala.inline
    def apply(errMsg: String): ErrMsg = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrMsg]
    }
    
    @scala.inline
    implicit class ErrMsgMutableBuilder[Self <: ErrMsg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalData extends StObject {
    
    var localData: String
  }
  object LocalData {
    
    @scala.inline
    def apply(localData: String): LocalData = {
      val __obj = js.Dynamic.literal(localData = localData.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalData]
    }
    
    @scala.inline
    implicit class LocalDataMutableBuilder[Self <: LocalData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalData(value: String): Self = StObject.set(x, "localData", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalIds extends StObject {
    
    var errMsg: String
    
    // weixin album camera
    var localIds: js.Array[String]
    
    var sourceType: String
  }
  object LocalIds {
    
    @scala.inline
    def apply(errMsg: String, localIds: js.Array[String], sourceType: String): LocalIds = {
      val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], localIds = localIds.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalIds]
    }
    
    @scala.inline
    implicit class LocalIdsMutableBuilder[Self <: LocalIds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalIds(value: js.Array[String]): Self = StObject.set(x, "localIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalIdsVarargs(value: String*): Self = StObject.set(x, "localIds", js.Array(value :_*))
      
      @scala.inline
      def setSourceType(value: String): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkType extends StObject {
    
    var networkType: typings.jweixin.mod.networkType
  }
  object NetworkType {
    
    @scala.inline
    def apply(networkType: networkType): NetworkType = {
      val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkType]
    }
    
    @scala.inline
    implicit class NetworkTypeMutableBuilder[Self <: NetworkType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNetworkType(value: networkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultStr extends StObject {
    
    var resultStr: String
  }
  object ResultStr {
    
    @scala.inline
    def apply(resultStr: String): ResultStr = {
      val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultStr]
    }
    
    @scala.inline
    implicit class ResultStrMutableBuilder[Self <: ResultStr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResultStr(value: String): Self = StObject.set(x, "resultStr", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerId extends StObject {
    
    var serverId: String
  }
  object ServerId {
    
    @scala.inline
    def apply(serverId: String): ServerId = {
      val __obj = js.Dynamic.literal(serverId = serverId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerId]
    }
    
    @scala.inline
    implicit class ServerIdMutableBuilder[Self <: ServerId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerId(value: String): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranslateResult extends StObject {
    
    var translateResult: String
  }
  object TranslateResult {
    
    @scala.inline
    def apply(translateResult: String): TranslateResult = {
      val __obj = js.Dynamic.literal(translateResult = translateResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateResult]
    }
    
    @scala.inline
    implicit class TranslateResultMutableBuilder[Self <: TranslateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslateResult(value: String): Self = StObject.set(x, "translateResult", value.asInstanceOf[js.Any])
    }
  }
}
