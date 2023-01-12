package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prompts extends StObject {
  
  // default true,
  var prompts: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  // additional agreement key ex) account_email,gender
  var throughTalk: js.UndefOr[Boolean] = js.undefined
}
object Prompts {
  
  inline def apply(): Prompts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prompts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prompts] (val x: Self) extends AnyVal {
    
    inline def setPrompts(value: String): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
    
    inline def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setThroughTalk(value: Boolean): Self = StObject.set(x, "throughTalk", value.asInstanceOf[js.Any])
    
    inline def setThroughTalkUndefined: Self = StObject.set(x, "throughTalk", js.undefined)
  }
}
