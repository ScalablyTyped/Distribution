package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelStatement
  extends StObject
     with Base[typings.luaparse.luaparseStrings.LabelStatement]
     with _Statement {
  
  var label: Identifier
}
object LabelStatement {
  
  inline def apply(label: Identifier): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabelStatement")
    __obj.asInstanceOf[LabelStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelStatement] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
