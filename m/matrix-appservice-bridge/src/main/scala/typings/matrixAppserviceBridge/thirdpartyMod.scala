package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.anon.Placeholder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thirdpartyMod {
  
  trait ProtocolInstance extends StObject {
    
    var desc: String
    
    var fields: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var network_id: String
  }
  object ProtocolInstance {
    
    @scala.inline
    def apply(desc: String, network_id: String): ProtocolInstance = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], network_id = network_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtocolInstance]
    }
    
    @scala.inline
    implicit class ProtocolInstanceMutableBuilder[Self <: ProtocolInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: Record[String, js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setNetwork_id(value: String): Self = StObject.set(x, "network_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdpartyLocationResponse extends StObject {
    
    var alias: String
    
    var fields: Record[String, js.Any]
    
    var protocol: String
  }
  object ThirdpartyLocationResponse {
    
    @scala.inline
    def apply(alias: String, fields: Record[String, js.Any], protocol: String): ThirdpartyLocationResponse = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyLocationResponse]
    }
    
    @scala.inline
    implicit class ThirdpartyLocationResponseMutableBuilder[Self <: ThirdpartyLocationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: Record[String, js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdpartyProtocolResponse extends StObject {
    
    var field_types: StringDictionary[Placeholder]
    
    var icon: String
    
    var instances: js.Array[ProtocolInstance]
    
    var location_fields: js.Array[String]
    
    var user_fields: js.Array[String]
  }
  object ThirdpartyProtocolResponse {
    
    @scala.inline
    def apply(
      field_types: StringDictionary[Placeholder],
      icon: String,
      instances: js.Array[ProtocolInstance],
      location_fields: js.Array[String],
      user_fields: js.Array[String]
    ): ThirdpartyProtocolResponse = {
      val __obj = js.Dynamic.literal(field_types = field_types.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], location_fields = location_fields.asInstanceOf[js.Any], user_fields = user_fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyProtocolResponse]
    }
    
    @scala.inline
    implicit class ThirdpartyProtocolResponseMutableBuilder[Self <: ThirdpartyProtocolResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField_types(value: StringDictionary[Placeholder]): Self = StObject.set(x, "field_types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstances(value: js.Array[ProtocolInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesVarargs(value: ProtocolInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setLocation_fields(value: js.Array[String]): Self = StObject.set(x, "location_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation_fieldsVarargs(value: String*): Self = StObject.set(x, "location_fields", js.Array(value :_*))
      
      @scala.inline
      def setUser_fields(value: js.Array[String]): Self = StObject.set(x, "user_fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_fieldsVarargs(value: String*): Self = StObject.set(x, "user_fields", js.Array(value :_*))
    }
  }
  
  trait ThirdpartyUserResponse extends StObject {
    
    var fields: Record[String, js.Any]
    
    var protocol: String
    
    var userid: String
  }
  object ThirdpartyUserResponse {
    
    @scala.inline
    def apply(fields: Record[String, js.Any], protocol: String, userid: String): ThirdpartyUserResponse = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyUserResponse]
    }
    
    @scala.inline
    implicit class ThirdpartyUserResponseMutableBuilder[Self <: ThirdpartyUserResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Record[String, js.Any]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    }
  }
}
