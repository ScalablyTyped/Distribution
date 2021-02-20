package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableValue
  extends Base[typings.luaparse.luaparseStrings.TableValue]
     with _Node {
  
  var value: Expression = js.native
}
object TableValue {
  
  @scala.inline
  def apply(`type`: typings.luaparse.luaparseStrings.TableValue, value: Expression): TableValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableValue]
  }
  
  @scala.inline
  implicit class TableValueMutableBuilder[Self <: TableValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
