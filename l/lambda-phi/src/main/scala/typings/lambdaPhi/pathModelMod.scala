package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathModelMod {
  
  @JSImport("lambda-phi/lib/path-model", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PathModel {
    
    /* CompleteClass */
    var _httpMethods: js.Any = js.native
    
    /* CompleteClass */
    var _methodName: js.Any = js.native
    
    /* CompleteClass */
    var _pattern: js.Any = js.native
    
    /* CompleteClass */
    var httpMethods: js.Array[String] = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var pattern: String = js.native
  }
  
  trait PathModel extends StObject {
    
    var _httpMethods: js.Any
    
    var _methodName: js.Any
    
    var _pattern: js.Any
    
    var httpMethods: js.Array[String]
    
    var methodName: String
    
    var pattern: String
  }
  object PathModel {
    
    @scala.inline
    def apply(
      _httpMethods: js.Any,
      _methodName: js.Any,
      _pattern: js.Any,
      httpMethods: js.Array[String],
      methodName: String,
      pattern: String
    ): PathModel = {
      val __obj = js.Dynamic.literal(_httpMethods = _httpMethods.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _pattern = _pattern.asInstanceOf[js.Any], httpMethods = httpMethods.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathModel]
    }
    
    @scala.inline
    implicit class PathModelMutableBuilder[Self <: PathModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpMethods(value: js.Array[String]): Self = StObject.set(x, "httpMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodsVarargs(value: String*): Self = StObject.set(x, "httpMethods", js.Array(value :_*))
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_httpMethods(value: js.Any): Self = StObject.set(x, "_httpMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_methodName(value: js.Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_pattern(value: js.Any): Self = StObject.set(x, "_pattern", value.asInstanceOf[js.Any])
    }
  }
}
