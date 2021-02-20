package typings.luaparse.astMod

import typings.luaparse.luaparseStrings.Colon
import typings.luaparse.luaparseStrings.Dot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.MemberExpression] {
  
  var base: Expression = js.native
  
  var identifier: Identifier = js.native
  
  var indexer: Dot | Colon = js.native
}
object MemberExpression {
  
  @scala.inline
  def apply(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typings.luaparse.luaparseStrings.MemberExpression
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberExpression]
  }
  
  @scala.inline
  implicit class MemberExpressionMutableBuilder[Self <: MemberExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexer(value: Dot | Colon): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
  }
}
