package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VarargLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.VarargLiteral] {
  
  var raw: String = js.native
  
  var value: String = js.native
}
object VarargLiteral {
  
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.VarargLiteral, value: String): VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarargLiteral]
  }
  
  @scala.inline
  implicit class VarargLiteralMutableBuilder[Self <: VarargLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
