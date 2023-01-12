package typings.hyperformula.anon

import typings.hyperformula.typingsClipboardOperationsMod.ClipboardCell
import typings.hyperformula.typingsNamedExpressionsMod.InternalNamedExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedNamedExpressions extends StObject {
  
  var scopedNamedExpressions: js.Array[js.Tuple2[InternalNamedExpression, ClipboardCell]]
  
  var version: Double
}
object ScopedNamedExpressions {
  
  inline def apply(
    scopedNamedExpressions: js.Array[js.Tuple2[InternalNamedExpression, ClipboardCell]],
    version: Double
  ): ScopedNamedExpressions = {
    val __obj = js.Dynamic.literal(scopedNamedExpressions = scopedNamedExpressions.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedNamedExpressions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopedNamedExpressions] (val x: Self) extends AnyVal {
    
    inline def setScopedNamedExpressions(value: js.Array[js.Tuple2[InternalNamedExpression, ClipboardCell]]): Self = StObject.set(x, "scopedNamedExpressions", value.asInstanceOf[js.Any])
    
    inline def setScopedNamedExpressionsVarargs(value: (js.Tuple2[InternalNamedExpression, ClipboardCell])*): Self = StObject.set(x, "scopedNamedExpressions", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
