package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformResult extends StObject {
  
  var code: String
  
  var originalCode: String
  
  var sourceMapPath: String | Null
}
object TransformResult {
  
  inline def apply(code: String, originalCode: String): TransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], sourceMapPath = null)
    __obj.asInstanceOf[TransformResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformResult] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setOriginalCode(value: String): Self = StObject.set(x, "originalCode", value.asInstanceOf[js.Any])
    
    inline def setSourceMapPath(value: String): Self = StObject.set(x, "sourceMapPath", value.asInstanceOf[js.Any])
    
    inline def setSourceMapPathNull: Self = StObject.set(x, "sourceMapPath", null)
  }
}
