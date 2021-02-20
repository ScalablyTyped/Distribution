package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.LabelStatement] {
  
  var label: Identifier = js.native
}
object LabelStatement {
  
  @scala.inline
  def apply(label: Identifier, `type`: typings.luaparse.luaparseStrings.LabelStatement): LabelStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelStatement]
  }
  
  @scala.inline
  implicit class LabelStatementMutableBuilder[Self <: LabelStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
