package typings.kavenegar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receptor extends StObject {
  
  var receptor: String
  
  var template: js.UndefOr[String] = js.undefined
  
  var token: String
  
  var token2: js.UndefOr[String] = js.undefined
  
  var token3: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Receptor {
  
  inline def apply(receptor: String, token: String): Receptor = {
    val __obj = js.Dynamic.literal(receptor = receptor.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receptor]
  }
  
  extension [Self <: Receptor](x: Self) {
    
    inline def setReceptor(value: String): Self = StObject.set(x, "receptor", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setToken2(value: String): Self = StObject.set(x, "token2", value.asInstanceOf[js.Any])
    
    inline def setToken2Undefined: Self = StObject.set(x, "token2", js.undefined)
    
    inline def setToken3(value: String): Self = StObject.set(x, "token3", value.asInstanceOf[js.Any])
    
    inline def setToken3Undefined: Self = StObject.set(x, "token3", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
