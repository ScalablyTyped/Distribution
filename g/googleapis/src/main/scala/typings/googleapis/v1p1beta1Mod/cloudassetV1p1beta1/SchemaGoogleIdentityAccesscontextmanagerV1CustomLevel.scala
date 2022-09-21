package typings.googleapis.v1p1beta1Mod.cloudassetV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1CustomLevel extends StObject {
  
  /**
    * Required. A Cloud CEL expression evaluating to a boolean.
    */
  var expr: js.UndefOr[SchemaExpr] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1CustomLevel {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1CustomLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1CustomLevel]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1CustomLevel](x: Self) {
    
    inline def setExpr(value: SchemaExpr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
  }
}
