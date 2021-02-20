package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.StringLiteral] {
  
  var raw: String = js.native
  
  var value: String = js.native
}
object StringLiteral {
  
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.StringLiteral, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
  
  @scala.inline
  implicit class StringLiteralMutableBuilder[Self <: StringLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
