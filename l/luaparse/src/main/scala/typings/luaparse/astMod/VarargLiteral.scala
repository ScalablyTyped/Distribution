package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VarargLiteral
  extends StObject
     with Base[typings.luaparse.luaparseStrings.VarargLiteral]
     with Expression {
  
  var raw: String
  
  var value: String
}
object VarargLiteral {
  
  @scala.inline
  def apply(raw: String, value: String): VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VarargLiteral")
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
