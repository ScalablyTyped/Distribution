package typings.lambdaPhi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathParamModelMod {
  
  @JSImport("lambda-phi/lib/path-param-model", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PathParamModel {
    
    /* private */ /* CompleteClass */
    var _defaultValue: Any = js.native
    
    /* private */ /* CompleteClass */
    var _index: Any = js.native
    
    /* private */ /* CompleteClass */
    var _methodName: Any = js.native
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
    
    /* CompleteClass */
    var defaultValue: Any = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var methodName: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait PathParamModel extends StObject {
    
    /* private */ var _defaultValue: Any
    
    /* private */ var _index: Any
    
    /* private */ var _methodName: Any
    
    /* private */ var _name: Any
    
    var defaultValue: Any
    
    var index: Double
    
    var methodName: String
    
    var name: String
  }
  object PathParamModel {
    
    inline def apply(
      _defaultValue: Any,
      _index: Any,
      _methodName: Any,
      _name: Any,
      defaultValue: Any,
      index: Double,
      methodName: String,
      name: String
    ): PathParamModel = {
      val __obj = js.Dynamic.literal(_defaultValue = _defaultValue.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _methodName = _methodName.asInstanceOf[js.Any], _name = _name.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathParamModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PathParamModel] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_defaultValue(value: Any): Self = StObject.set(x, "_defaultValue", value.asInstanceOf[js.Any])
      
      inline def set_index(value: Any): Self = StObject.set(x, "_index", value.asInstanceOf[js.Any])
      
      inline def set_methodName(value: Any): Self = StObject.set(x, "_methodName", value.asInstanceOf[js.Any])
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
