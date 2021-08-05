package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleIdentityAccesscontextmanagerV1CustomLevel extends StObject {
  
  /** Required. A Cloud CEL expression evaluating to a boolean. */
  var expr: js.UndefOr[Expr] = js.undefined
}
object GoogleIdentityAccesscontextmanagerV1CustomLevel {
  
  inline def apply(): GoogleIdentityAccesscontextmanagerV1CustomLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleIdentityAccesscontextmanagerV1CustomLevel]
  }
  
  extension [Self <: GoogleIdentityAccesscontextmanagerV1CustomLevel](x: Self) {
    
    inline def setExpr(value: Expr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
  }
}
