package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.TemplateHead
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValueString
  extends StObject
     with Token {
  
  var `type`: TemplateHead
  
  var value: String
}
object TypeValueString {
  
  inline def apply(value: String): TypeValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateHead")
    __obj.asInstanceOf[TypeValueString]
  }
  
  extension [Self <: TypeValueString](x: Self) {
    
    inline def setType(value: TemplateHead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
