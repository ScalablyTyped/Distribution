package typings.hyperformula.astMod

import typings.hyperformula.astMod.AstNodeType.CELL_REFERENCE
import typings.hyperformula.cellAddressMod.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellReferenceAst
  extends StObject
     with AstWithWhitespace
     with Ast {
  
  var reference: CellAddress
  
  var `type`: CELL_REFERENCE
}
object CellReferenceAst {
  
  inline def apply(reference: CellAddress, `type`: CELL_REFERENCE): CellReferenceAst = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellReferenceAst]
  }
  
  extension [Self <: CellReferenceAst](x: Self) {
    
    inline def setReference(value: CellAddress): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setType(value: CELL_REFERENCE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
