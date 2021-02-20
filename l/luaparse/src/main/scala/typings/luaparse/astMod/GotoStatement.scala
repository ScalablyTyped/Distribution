package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotoStatement
  extends _Statement
     with Base[typings.luaparse.luaparseStrings.GotoStatement] {
  
  var label: Identifier = js.native
}
object GotoStatement {
  
  @scala.inline
  def apply(label: Identifier, `type`: typings.luaparse.luaparseStrings.GotoStatement): GotoStatement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoStatement]
  }
  
  @scala.inline
  implicit class GotoStatementMutableBuilder[Self <: GotoStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
