package typings.luaparse.astMod

import typings.luaparse.luaparseStrings.Colon
import typings.luaparse.luaparseStrings.Dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression
  extends StObject
     with Base[typings.luaparse.luaparseStrings.MemberExpression]
     with Expression {
  
  var base: Expression
  
  var identifier: Identifier
  
  var indexer: Dot | Colon
}
object MemberExpression {
  
  inline def apply(base: Expression, identifier: Identifier, indexer: Dot | Colon): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression]
  }
  
  extension [Self <: MemberExpression](x: Self) {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIndexer(value: Dot | Colon): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
  }
}
