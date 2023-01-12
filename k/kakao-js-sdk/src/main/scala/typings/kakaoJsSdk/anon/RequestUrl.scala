package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.Kakao.Link.LinkCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestUrl extends StObject {
  
  // default false
  var callback: js.UndefOr[LinkCallback] = js.undefined
  
  var installTalk: js.UndefOr[Boolean] = js.undefined
  
  var requestUrl: String
  
  var serverCallbackArgs: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  
  var templateArgs: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var templateId: js.UndefOr[Double] = js.undefined
}
object RequestUrl {
  
  inline def apply(requestUrl: String): RequestUrl = {
    val __obj = js.Dynamic.literal(requestUrl = requestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestUrl] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: LinkCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setInstallTalk(value: Boolean): Self = StObject.set(x, "installTalk", value.asInstanceOf[js.Any])
    
    inline def setInstallTalkUndefined: Self = StObject.set(x, "installTalk", js.undefined)
    
    inline def setRequestUrl(value: String): Self = StObject.set(x, "requestUrl", value.asInstanceOf[js.Any])
    
    inline def setServerCallbackArgs(value: StringDictionary[Any] | String): Self = StObject.set(x, "serverCallbackArgs", value.asInstanceOf[js.Any])
    
    inline def setServerCallbackArgsUndefined: Self = StObject.set(x, "serverCallbackArgs", js.undefined)
    
    inline def setTemplateArgs(value: StringDictionary[Any]): Self = StObject.set(x, "templateArgs", value.asInstanceOf[js.Any])
    
    inline def setTemplateArgsUndefined: Self = StObject.set(x, "templateArgs", js.undefined)
    
    inline def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
