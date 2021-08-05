package typings.hyperlorisTyson

import typings.hyperlorisTyson.jsonPropertyMetadataMod.JsonPropertyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionUtilsMod {
  
  @JSImport("@hyperloris/tyson/dist/types/reflect/reflectionUtils", "ReflectionUtils")
  @js.native
  class ReflectionUtils () extends StObject
  /* static members */
  object ReflectionUtils {
    
    @JSImport("@hyperloris/tyson/dist/types/reflect/reflectionUtils", "ReflectionUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the {@link JsonProperty} metadata of the specified property, or undefined if they are not present.
      *
      * @static
      * @param {*} target the target object on which the metadata is defined
      * @param {string} propertyKey the property key for the target
      * @returns the metadata value for the metadata key if found; otherwise, undefined.
      * @memberof ReflectionUtils
      */
    inline def getJsonPropertyMetadata(target: js.Any, propertyKey: String): js.UndefOr[JsonPropertyMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsonPropertyMetadata")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JsonPropertyMetadata]]
    
    /**
      * This method returns the type of the specified object as injected by the compiler at design-time.
      *
      * @static
      * @param {*} target the target object
      * @param {string} propertyKey the property key for the target
      * @returns the injected type
      * @memberof ReflectionUtils
      */
    inline def getType(target: js.Any, propertyKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getType")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    /**
      * This method generate a "readable hash" of the specified object.
      * This hash is used as a key to save type adapters in the cache and to compare {@link TypeToken}.
      * Eg.
      * City -> City
      * [String] -> Array:(String)
      * [Number, Number, Boolean] -> Array:(Number+Number+Boolean)
      * [String, [Number, User], [User]] -> Array:(String+Array:(Number+User))+Array:(User)))
      *
      * This format is very helpful for debugging purposes.
      *
      * @static
      * @param {*} target the target object
      * @returns the generated hash of the target
      * @memberof ReflectionUtils
      */
    inline def getTypeHash(target: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeHash")(target.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * This method returns the type name of the specified object.
      * A little hack, because some browsers do not support constructor.name (guess who?).
      *
      * @static
      * @param {*} target the target object
      * @returns the type name
      * @memberof ReflectionUtils
      */
    inline def getTypeName(target: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeName")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
