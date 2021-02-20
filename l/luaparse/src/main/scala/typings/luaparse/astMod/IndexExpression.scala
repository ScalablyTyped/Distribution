package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexExpression
  extends Expression
     with Base[typings.luaparse.luaparseStrings.IndexExpression] {
  
  var base: Expression = js.native
  
  var index: Expression = js.native
}
object IndexExpression {
  
  @scala.inline
  def apply(base: Expression, index: Expression, `type`: typings.luaparse.luaparseStrings.IndexExpression): IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexExpression]
  }
  
  @scala.inline
  implicit class IndexExpressionMutableBuilder[Self <: IndexExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Expression): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
