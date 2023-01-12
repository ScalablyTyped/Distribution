package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.Kakao.Link.LinkCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCallbackArgs extends StObject {
  
  // default false
  var callback: js.UndefOr[LinkCallback] = js.undefined
  
  var installTalk: js.UndefOr[Boolean] = js.undefined
  
  var serverCallbackArgs: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  
  var templateArgs: StringDictionary[Any]
  
  var templateId: Double
}
object ServerCallbackArgs {
  
  inline def apply(templateArgs: StringDictionary[Any], templateId: Double): ServerCallbackArgs = {
    val __obj = js.Dynamic.literal(templateArgs = templateArgs.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCallbackArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerCallbackArgs] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: LinkCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setInstallTalk(value: Boolean): Self = StObject.set(x, "installTalk", value.asInstanceOf[js.Any])
    
    inline def setInstallTalkUndefined: Self = StObject.set(x, "installTalk", js.undefined)
    
    inline def setServerCallbackArgs(value: StringDictionary[Any] | String): Self = StObject.set(x, "serverCallbackArgs", value.asInstanceOf[js.Any])
    
    inline def setServerCallbackArgsUndefined: Self = StObject.set(x, "serverCallbackArgs", js.undefined)
    
    inline def setTemplateArgs(value: StringDictionary[Any]): Self = StObject.set(x, "templateArgs", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
