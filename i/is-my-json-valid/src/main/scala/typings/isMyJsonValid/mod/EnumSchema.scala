package typings.isMyJsonValid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumSchema[Enum] extends StObject {
  
  var `enum`: js.Array[Enum]
}
object EnumSchema {
  
  @scala.inline
  def apply[Enum](`enum`: js.Array[Enum]): EnumSchema[Enum] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumSchema[Enum]]
  }
  
  @scala.inline
  implicit class EnumSchemaMutableBuilder[Self <: EnumSchema[?], Enum] (val x: Self & EnumSchema[Enum]) extends AnyVal {
    
    @scala.inline
    def setEnum(value: js.Array[Enum]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: Enum*): Self = StObject.set(x, "enum", js.Array(value :_*))
  }
}
