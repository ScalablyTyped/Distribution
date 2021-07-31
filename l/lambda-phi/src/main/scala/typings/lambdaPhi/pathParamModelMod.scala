package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathParamModelMod {
  
  @JSImport("lambda-phi/lib/path-param-model", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with PathParamModel {
    
    /* CompleteClass */
    var _defaultValue: js.Any = js.native
    
    /* CompleteClass */
    var _index: js.Any = js.native
    
    /* CompleteClass */
    var _methodName: js.Any = js.native
    
    /* CompleteClass */
    var _name: js.Any = js.native
    
    /* CompleteClass */
    var defaultValue: js.Any = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait PathParamModel extends StObject {
    
    var _defaultValue: js.Any
    
    var _index: js.Any
    
    var _methodName: js.Any
    
    var _name: js.Any
    
    var defaultValue: js.Any
    
    var index: Double
    
    var methodName: String
    
    var name: String
  }
  object PathParamModel {
    
    @scala.inline
    def apply(
      _defaultValue: js.Any,
      _index: js.Any,
      _methodName: js.Any,
      _name: js.Any,
      defaultValue: js.Any,
      index: Double,
      methodName: String,
      name: String
    ): PathParamModel = {
      val __obj = js.Dynamic.literal(_defaultValue = _defaultValue.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathParamModel]
    }
    
    @scala.inline
    implicit class PathParamModelMutableBuilder[Self <: PathParamModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultValue(value: js.Any): Self = StObject.set(x, "_defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_index(value: js.Any): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_methodName(value: js.Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_name(value: js.Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
