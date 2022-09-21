package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWafExpressionSetExpression extends StObject {
  
  /**
    * Expression ID should uniquely identify the origin of the expression. E.g. owasp-crs-v020901-id973337 identifies Owasp core rule set version 2.9.1 rule id 973337. The ID could be used to determine the individual attack definition that has been detected. It could also be used to exclude it from the policy in case of false positive. required
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaWafExpressionSetExpression {
  
  inline def apply(): SchemaWafExpressionSetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWafExpressionSetExpression]
  }
  
  extension [Self <: SchemaWafExpressionSetExpression](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
