package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpResponsesMod {
  
  trait IApplicationServiceProtocol extends StObject {
    
    var field_types: StringDictionary[IFieldType]
    
    var icon: String
    
    var instances: StringDictionary[IProtocolInstance]
    
    var location_fields: js.Array[String]
    
    var user_fields: js.Array[String]
  }
  object IApplicationServiceProtocol {
    
    inline def apply(
      field_types: StringDictionary[IFieldType],
      icon: String,
      instances: StringDictionary[IProtocolInstance],
      location_fields: js.Array[String],
      user_fields: js.Array[String]
    ): IApplicationServiceProtocol = {
      val __obj = js.Dynamic.literal(field_types = field_types.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], location_fields = location_fields.asInstanceOf[js.Any], user_fields = user_fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[IApplicationServiceProtocol]
    }
    
    extension [Self <: IApplicationServiceProtocol](x: Self) {
      
      inline def setField_types(value: StringDictionary[IFieldType]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInstances(value: StringDictionary[IProtocolInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setLocation_fields(value: js.Array[String]): Self = StObject.set(x, "location_fields", value.asInstanceOf[js.Any])
      
      inline def setLocation_fieldsVarargs(value: String*): Self = StObject.set(x, "location_fields", js.Array(value*))
      
      inline def setUser_fields(value: js.Array[String]): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
      
      inline def setUser_fieldsVarargs(value: String*): Self = StObject.set(x, "user_fields", js.Array(value*))
    }
  }
  
  trait IFieldType extends StObject {
    
    var placeholder: String
    
    var regexp: String
  }
  object IFieldType {
    
    inline def apply(placeholder: String, regexp: String): IFieldType = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFieldType]
    }
    
    extension [Self <: IFieldType](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProtocolInstance extends StObject {
    
    var desc: String
    
    var fields: StringDictionary[String]
    
    var icon: String
    
    var network_id: String
  }
  object IProtocolInstance {
    
    inline def apply(desc: String, fields: StringDictionary[String], icon: String, network_id: String): IProtocolInstance = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IProtocolInstance]
    }
    
    extension [Self <: IProtocolInstance](x: Self) {
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setNetwork_id(value: String): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    }
  }
}
