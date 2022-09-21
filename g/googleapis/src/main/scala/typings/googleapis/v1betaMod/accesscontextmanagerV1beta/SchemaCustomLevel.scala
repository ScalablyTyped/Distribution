package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomLevel extends StObject {
  
  /**
    * Required. A Cloud CEL expression evaluating to a boolean.
    */
  var expr: js.UndefOr[SchemaExpr] = js.undefined
}
object SchemaCustomLevel {
  
  inline def apply(): SchemaCustomLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomLevel]
  }
  
  extension [Self <: SchemaCustomLevel](x: Self) {
    
    inline def setExpr(value: SchemaExpr): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
  }
}
