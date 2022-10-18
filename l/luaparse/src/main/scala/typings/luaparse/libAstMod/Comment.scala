package typings.luaparse.libAstMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment
  extends StObject
     with Base[typings.luaparse.luaparseStrings.Comment]
     with _Node {
  
  var raw: String
  
  var value: String
}
object Comment {
  
  inline def apply(raw: String, value: String): Comment = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Comment")
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
