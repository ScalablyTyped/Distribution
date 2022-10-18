package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotoStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.GotoStatement]
     with _Statement {
  
  var label: Identifier
}
object GotoStatement {
  
  inline def apply(label: Identifier): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GotoStatement")
    __obj.asInstanceOf[GotoStatement]
  }
  
  extension [Self <: GotoStatement](x: Self) {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
