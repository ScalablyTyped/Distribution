package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnnotationsJsonPropertyMod {
  
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Access extends StObject
  @JSImport("@hyperloris/tyson/dist/types/annotations/jsonProperty", "Access")
  @js.native
  object Access extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Access & String] = js.native
    
    /**
      * Access setting that means that the property may only be used
      * for deserialization: json -> class
      */
    @js.native
    sealed trait FROMJSON_ONLY
      extends StObject
         with Access
    /* "FROMJSON_ONLY" */ val FROMJSON_ONLY: typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.FROMJSON_ONLY & String = js.native
    
    /**
      * Access setting that means that the property may only be used
      * for serialization: class -> json
      */
    @js.native
    sealed trait TOJSON_ONLY
      extends StObject
         with Access
    /* "TOJSON_ONLY" */ val TOJSON_ONLY: typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.TOJSON_ONLY & String = js.native
  }
  
  inline def JsonProperty(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")().asInstanceOf[Any]
  inline def JsonProperty(options: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def JsonProperty(options: JsonPropertyOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait JsonPropertyOptions extends StObject {
    
    /**
      * It can be used to force Tyson to ignore this property during
      * the serialization or deserialization process.
      */
    var access: js.UndefOr[Access] = js.undefined
    
    /**
      * Ignore the type of this property.
      * This means that during the deserialization process the content of the
      * json will be copied directly without any kind of check. The same thing
      * during serialization.
      * Default value: false
      */
    var ignoreType: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates the name of the key on the JSON, this is very useful
      * if you need to have a different name on the class.
      * Eg. If you mark your private property with "_"
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Property that indicates whether a value is expected for property
      * during deserialization or not. If the value is missing on the JSON,
      * an exception is thrown.
      * Default value: false
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a type of the property.
      * This is mandatory for arrays (single and multi-type).
      * NOTE: if it's a Date object, you MUST specify the type!
      */
    var `type`: js.UndefOr[ClassType[Any] | js.Array[Any]] = js.undefined
  }
  object JsonPropertyOptions {
    
    inline def apply(): JsonPropertyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonPropertyOptions]
    }
    
    extension [Self <: JsonPropertyOptions](x: Self) {
      
      inline def setAccess(value: Access): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
      
      inline def setIgnoreType(value: Boolean): Self = StObject.set(x, "ignoreType", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTypeUndefined: Self = StObject.set(x, "ignoreType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: ClassType[Any] | js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
}
