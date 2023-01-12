package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetingExpression extends StObject {
  
  /** Expression describing which lists are being targeted by the ad. */
  var expression: js.UndefOr[String] = js.undefined
}
object ListTargetingExpression {
  
  inline def apply(): ListTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetingExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTargetingExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
