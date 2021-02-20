package typings.jsonTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DefaultValue extends StObject {
    
    var defaultValue: String = js.native
    
    var key: String = js.native
  }
  object DefaultValue {
    
    @scala.inline
    def apply(defaultValue: String, key: String): DefaultValue = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultValue]
    }
    
    @scala.inline
    implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Parameters extends StObject {
    
    var parameters: js.Array[DefaultValue] = js.native
  }
  object Parameters {
    
    @scala.inline
    def apply(parameters: js.Array[DefaultValue]): Parameters = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: js.Array[DefaultValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersVarargs(value: DefaultValue*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    }
  }
}
