package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.matrixAppserviceBridge.anon.Placeholder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thirdpartyMod {
  
  @js.native
  trait ProtocolInstance extends StObject {
    
    var desc: String = js.native
    
    var fields: js.UndefOr[Record[String, _]] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var network_id: String = js.native
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
      def setFields(value: Record[String, _]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait ThirdpartyLocationResponse extends StObject {
    
    var alias: String = js.native
    
    var fields: Record[String, _] = js.native
    
    var protocol: String = js.native
  }
  object ThirdpartyLocationResponse {
    
    @scala.inline
    def apply(alias: String, fields: Record[String, _], protocol: String): ThirdpartyLocationResponse = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyLocationResponse]
    }
    
    @scala.inline
    implicit class ThirdpartyLocationResponseMutableBuilder[Self <: ThirdpartyLocationResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: Record[String, _]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ThirdpartyProtocolResponse extends StObject {
    
    var field_types: StringDictionary[Placeholder] = js.native
    
    var icon: String = js.native
    
    var instances: js.Array[ProtocolInstance] = js.native
    
    var location_fields: js.Array[String] = js.native
    
    var user_fields: js.Array[String] = js.native
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
  
  @js.native
  trait ThirdpartyUserResponse extends StObject {
    
    var fields: Record[String, _] = js.native
    
    var protocol: String = js.native
    
    var userid: String = js.native
  }
  object ThirdpartyUserResponse {
    
    @scala.inline
    def apply(fields: Record[String, _], protocol: String, userid: String): ThirdpartyUserResponse = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], userid = userid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdpartyUserResponse]
    }
    
    @scala.inline
    implicit class ThirdpartyUserResponseMutableBuilder[Self <: ThirdpartyUserResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Record[String, _]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserid(value: String): Self = StObject.set(x, "userid", value.asInstanceOf[js.Any])
    }
  }
}
