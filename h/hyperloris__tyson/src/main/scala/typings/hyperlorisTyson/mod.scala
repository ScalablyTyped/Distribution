package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.JsonPropertyOptions
import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hyperloris/tyson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hyperloris/tyson", "Access")
  @js.native
  object Access extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access & String] = js.native
    
    /* "FROMJSON_ONLY" */ val FROMJSON_ONLY: typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.FROMJSON_ONLY & String = js.native
    
    /* "TOJSON_ONLY" */ val TOJSON_ONLY: typings.hyperlorisTyson.distTypesAnnotationsJsonPropertyMod.Access.TOJSON_ONLY & String = js.native
  }
  
  inline def JsonProperty(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")().asInstanceOf[Any]
  inline def JsonProperty(options: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def JsonProperty(options: JsonPropertyOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonProperty")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* note: abstract class */ @JSImport("@hyperloris/tyson", "TypeAdapter")
  @js.native
  open class TypeAdapter[T] ()
    extends typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter[T]
  
  @JSImport("@hyperloris/tyson", "Tyson")
  @js.native
  /**
    * Creates an instance of Tyson.
    *
    * @param {TysonBuilder} [builder]
    * @memberof Tyson
    */
  open class Tyson () extends StObject {
    def this(builder: typings.hyperlorisTyson.distTypesTysonBuilderMod.TysonBuilder) = this()
    
    /* private */ var _factories: Any = js.native
    
    /* private */ var _serializeNulls: Any = js.native
    
    /* private */ var _typeTokenCache: Any = js.native
    
    /**
      * This method deserializes the specified JSON into an object|array of the specified type.
      *
      * @template T the type of the desired object|array
      * @param json the JSON object|array used during deserialization
      * @param type a class|array of T
      * @returns an object|array of type T. Returns undefined if json or type are undefined.
      * @memberof Tyson
      */
    def fromJson[T](json: js.Array[Any], `type`: js.Array[Any]): js.Array[Any] = js.native
    def fromJson[T](json: js.Array[Any], `type`: ClassType[T]): js.Array[T] = js.native
    def fromJson[T](json: js.Object, `type`: ClassType[T]): T = js.native
    
    /**
      * Returns the type adapter for the specified typeToken.
      * This method uses a cache to avoid re-creating a new adapter
      * for a previously requested TypeToken.
      *
      * @template T
      * @param {TypeToken<T>} typeToken
      * @returns {TypeAdapter<T>} a TypeAdapter of T
      * @throws Will throw an error if Tyson cannot deserialize / serialize typeToken
      * @memberof Tyson
      */
    def getAdapter[T](typeToken: TypeToken[T]): typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter[T] = js.native
    
    val serializeNulls: Boolean = js.native
    
    def toJson(src: js.Array[Any], `type`: js.Array[Any]): js.Array[Any] = js.native
    /**
      * This method serializes the specified object, into its equivalent JSON representation.
      *
      * @param src the object|array for which JSON representation is to be created
      * @param type the specific type of src (required for arrays)
      * @returns JSON representation of src
      * @memberof Tyson
      */
    def toJson(src: js.Array[Any], `type`: ClassType[Any]): js.Array[Any] = js.native
    def toJson(src: js.Object): Any = js.native
    def toJson(src: js.Object, `type`: ClassType[Any]): Any = js.native
  }
  
  @JSImport("@hyperloris/tyson", "TysonBuilder")
  @js.native
  open class TysonBuilder ()
    extends typings.hyperlorisTyson.distTypesTysonBuilderMod.TysonBuilder
}
