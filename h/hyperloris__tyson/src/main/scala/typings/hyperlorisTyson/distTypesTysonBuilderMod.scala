package typings.hyperlorisTyson

import typings.hyperlorisTyson.distTypesReflectTypeTokenMod.ClassType
import typings.hyperlorisTyson.distTypesTypeAdapterFactoryMod.TypeAdapterFactory
import typings.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import typings.hyperlorisTyson.mod.Tyson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTysonBuilderMod {
  
  @JSImport("@hyperloris/tyson/dist/types/tysonBuilder", "TysonBuilder")
  @js.native
  open class TysonBuilder () extends StObject {
    
    /* private */ var _factories: Any = js.native
    
    /* private */ var _serializeNulls: Any = js.native
    
    /**
      * Returns a new instance of Tyson configured with the options currently set in this builder.
      *
      * @returns {Tyson} a Tyson instance
      * @memberof TysonBuilder
      */
    def build(): Tyson = js.native
    
    /**
      * Configure Tyson to serialize null fields. By default, Tyson omits all fields that are null
      * during serialization.
      *
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def enableNullsSerialization(): TysonBuilder = js.native
    
    val factories: js.Array[TypeAdapterFactory] = js.native
    
    /**
      * This method register a new type adapter for a specific type.
      * You can use this to configure Tyson for custom serialization or deserialization.
      * If a type adapter was previously registered for the specified type,
      * it is overwritten (even the built-in).
      *
      * @template T
      * @param {ClassType<T>} type the type for the type adapter being registered
      * @param {TypeAdapter<T>} typeAdapter
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def registerTypeAdapter[T](`type`: ClassType[T], typeAdapter: TypeAdapter[T]): TysonBuilder = js.native
    
    /**
      * Register a factory.
      *
      * @param {TypeAdapterFactory} factory
      * @returns {TysonBuilder} a reference to this TysonBuilder
      * @memberof TysonBuilder
      */
    def registerTypeAdapterFactory(factory: TypeAdapterFactory): TysonBuilder = js.native
    
    val serializeNulls: Boolean = js.native
  }
}
