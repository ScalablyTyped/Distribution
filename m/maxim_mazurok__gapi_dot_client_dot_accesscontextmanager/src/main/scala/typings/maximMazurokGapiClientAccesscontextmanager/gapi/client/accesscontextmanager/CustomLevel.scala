package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLevel extends StObject {
  
  /** Required. A Cloud CEL expression evaluating to a boolean. */
  var expr: js.UndefOr[Expr] = js.undefined
}
object CustomLevel {
  
  inline def apply(): CustomLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLevel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomLevel] (val x: Self) extends AnyVal {
    
    inline def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
  }
}
