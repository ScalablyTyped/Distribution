package typings.luaparse.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericLiteral
  extends Expression
     with Base[typings.luaparse.luaparseStrings.NumericLiteral] {
  
  var raw: String = js.native
  
  var value: Double = js.native
}
object NumericLiteral {
  
  @scala.inline
  def apply(raw: String, `type`: typings.luaparse.luaparseStrings.NumericLiteral, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumericLiteral]
  }
  
  @scala.inline
  implicit class NumericLiteralMutableBuilder[Self <: NumericLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
