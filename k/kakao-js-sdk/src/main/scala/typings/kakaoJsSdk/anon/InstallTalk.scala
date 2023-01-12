package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.Kakao.Link.LinkCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallTalk extends StObject {
  
  // default false
  var callback: js.UndefOr[LinkCallback] = js.undefined
  
  var container: String | HTMLElement
  
  var installTalk: js.UndefOr[Boolean] = js.undefined
  
  var requestUrl: String
  
  var serverCallbackArgs: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  
  var templateArgs: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var templateId: js.UndefOr[Double] = js.undefined
}
object InstallTalk {
  
  inline def apply(container: String | HTMLElement, requestUrl: String): InstallTalk = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], requestUrl = requestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallTalk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallTalk] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: LinkCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
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
