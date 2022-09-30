package typings.intlifyMessageCompiler.mod

import typings.intlifyMessageCompiler.intlifyMessageCompilerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralNode
  extends StObject
     with Node2 {
  
  var cases: js.Array[MessageNode]
  
  @JSName("type")
  var type_PluralNode: `1`
}
object PluralNode {
  
  inline def apply(cases: js.Array[MessageNode], end: Double, start: Double): PluralNode = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[PluralNode]
  }
  
  extension [Self <: PluralNode](x: Self) {
    
    inline def setCases(value: js.Array[MessageNode]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: MessageNode*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
