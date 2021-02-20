package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NilLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.NilLiteral] {
  
  var raw: String = js.native
  
  var value: Null = js.native
}
object NilLiteral {
  
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.NilLiteral, value: Null): NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NilLiteral]
  }
  
  @scala.inline
  implicit class NilLiteralMutableBuilder[Self <: NilLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Null): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
