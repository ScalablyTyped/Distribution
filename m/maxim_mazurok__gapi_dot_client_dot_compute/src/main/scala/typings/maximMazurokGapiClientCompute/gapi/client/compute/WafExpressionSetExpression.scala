package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WafExpressionSetExpression extends StObject {
  
  /**
    * Expression ID should uniquely identify the origin of the expression. E.g. owasp-crs-v020901-id973337 identifies Owasp core rule set version 2.9.1 rule id 973337. The ID could be
    * used to determine the individual attack definition that has been detected. It could also be used to exclude it from the policy in case of false positive. required
    */
  var id: js.UndefOr[String] = js.undefined
}
object WafExpressionSetExpression {
  
  inline def apply(): WafExpressionSetExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WafExpressionSetExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WafExpressionSetExpression] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
