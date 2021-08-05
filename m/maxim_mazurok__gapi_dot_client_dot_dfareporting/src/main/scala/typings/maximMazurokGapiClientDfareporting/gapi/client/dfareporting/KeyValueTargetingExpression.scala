package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValueTargetingExpression extends StObject {
  
  /** Keyword expression being targeted by the ad. */
  var expression: js.UndefOr[String] = js.undefined
}
object KeyValueTargetingExpression {
  
  inline def apply(): KeyValueTargetingExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyValueTargetingExpression]
  }
  
  extension [Self <: KeyValueTargetingExpression](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
