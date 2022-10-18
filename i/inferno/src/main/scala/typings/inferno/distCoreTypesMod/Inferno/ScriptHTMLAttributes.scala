package typings.inferno.distCoreTypesMod.Inferno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  /** @deprecated */
  var charSet: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var defer: js.UndefOr[Boolean] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var noModule: js.UndefOr[Boolean] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ScriptHTMLAttributes {
  
  inline def apply[T](): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
  
  extension [Self <: ScriptHTMLAttributes[?], T](x: Self & ScriptHTMLAttributes[T]) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setNoModule(value: Boolean): Self = StObject.set(x, "noModule", value.asInstanceOf[js.Any])
    
    inline def setNoModuleUndefined: Self = StObject.set(x, "noModule", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
