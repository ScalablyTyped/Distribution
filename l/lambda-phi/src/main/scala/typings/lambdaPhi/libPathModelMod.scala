package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathModelMod {
  
  @JSImport("lambda-phi/lib/path-model", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PathModel {
    
    /* private */ /* CompleteClass */
    var _httpMethods: Any = js.native
    
    /* private */ /* CompleteClass */
    var _methodName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _pattern: Any = js.native
    
    /* CompleteClass */
    var httpMethods: js.Array[String] = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var pattern: String = js.native
  }
  
  trait PathModel extends StObject {
    
    /* private */ var _httpMethods: Any
    
    /* private */ var _methodName: Any
    
    /* private */ var _pattern: Any
    
    var httpMethods: js.Array[String]
    
    var methodName: String
    
    var pattern: String
  }
  object PathModel {
    
    inline def apply(
      _httpMethods: Any,
      _methodName: Any,
      _pattern: Any,
      httpMethods: js.Array[String],
      methodName: String,
      pattern: String
    ): PathModel = {
      val __obj = js.Dynamic.literal(_httpMethods = _httpMethods.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _pattern = _pattern.asInstanceOf[js.Any], httpMethods = httpMethods.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathModel] (val x: Self) extends AnyVal {
      
      inline def setHttpMethods(value: js.Array[String]): Self = StObject.set(x, "httpMethods", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodsVarargs(value: String*): Self = StObject.set(x, "httpMethods", js.Array(value*))
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def set_httpMethods(value: Any): Self = StObject.set(x, "_httpMethods", value.asInstanceOf[js.Any])
      
      inline def set_methodName(value: Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
      
      inline def set_pattern(value: Any): Self = StObject.set(x, "_pattern", value.asInstanceOf[js.Any])
    }
  }
}
