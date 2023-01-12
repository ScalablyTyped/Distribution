package typings.jsonTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultValue extends StObject {
    
    var defaultValue: String
    
    var key: String
  }
  object DefaultValue {
    
    inline def apply(defaultValue: String, key: String): DefaultValue = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parameters extends StObject {
    
    var parameters: js.Array[DefaultValue]
  }
  object Parameters {
    
    inline def apply(parameters: js.Array[DefaultValue]): Parameters = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      inline def setParameters(value: js.Array[DefaultValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: DefaultValue*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
}
