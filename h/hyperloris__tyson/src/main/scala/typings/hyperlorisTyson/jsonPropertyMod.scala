package typings.hyperlorisTyson

import typings.hyperlorisTyson.typeTokenMod.ClassType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonPropertyMod {
  
  @js.native
  sealed trait Access extends StObject
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "Access")
  @js.native
  object Access extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Access with String] = js.native
    
    /**
      * Access setting that means that the property may only be used
      * for deserialization: json -> class
      */
    @js.native
    sealed trait FROMJSON_ONLY extends Access
    /* "FROMJSON_ONLY" */ val FROMJSON_ONLY: typings.hyperlorisTyson.jsonPropertyMod.Access.FROMJSON_ONLY with String = js.native
    
    /**
      * Access setting that means that the property may only be used
      * for serialization: class -> json
      */
    @js.native
    sealed trait TOJSON_ONLY extends Access
    /* "TOJSON_ONLY" */ val TOJSON_ONLY: typings.hyperlorisTyson.jsonPropertyMod.Access.TOJSON_ONLY with String = js.native
  }
  
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "JsonProperty")
  @js.native
  def JsonProperty(): js.Any = js.native
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "JsonProperty")
  @js.native
  def JsonProperty(options: String): js.Any = js.native
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "JsonProperty")
  @js.native
  def JsonProperty(options: JsonPropertyOptions): js.Any = js.native
  
  @js.native
  trait JsonPropertyOptions extends StObject {
    
    /**
      * It can be used to force Tyson to ignore this property during
      * the serialization or deserialization process.
      */
    var access: js.UndefOr[Access] = js.native
    
    /**
      * Ignore the type of this property.
      * This means that during the deserialization process the content of the
      * json will be copied directly without any kind of check. The same thing
      * during serialization.
      * Default value: false
      */
    var ignoreType: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the name of the key on the JSON, this is very useful
      * if you need to have a different name on the class.
      * Eg. If you mark your private property with "_"
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Property that indicates whether a value is expected for property
      * during deserialization or not. If the value is missing on the JSON,
      * an exception is thrown.
      * Default value: false
      */
    var required: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies a type of the property.
      * This is mandatory for arrays (single and multi-type).
      * NOTE: if it's a Date object, you MUST specify the type!
      */
    var `type`: js.UndefOr[ClassType[_] | js.Array[_]] = js.native
  }
  object JsonPropertyOptions {
    
    @scala.inline
    def apply(): JsonPropertyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonPropertyOptions]
    }
    
    @scala.inline
    implicit class JsonPropertyOptionsMutableBuilder[Self <: JsonPropertyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess(value: Access): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
      
      @scala.inline
      def setIgnoreType(value: Boolean): Self = StObject.set(x, "ignoreType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTypeUndefined: Self = StObject.set(x, "ignoreType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: ClassType[_] | js.Array[_]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: js.Any*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
}
