package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableKey
  extends Base[typings.luaparse.luaparseStrings.TableKey]
     with _Node {
  
  var key: Expression = js.native
  
  var value: Expression = js.native
}
object TableKey {
  
  @scala.inline
  def apply(key: Expression, `type`: typings.luaparse.luaparseStrings.TableKey, value: Expression): TableKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKey]
  }
  
  @scala.inline
  implicit class TableKeyMutableBuilder[Self <: TableKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
