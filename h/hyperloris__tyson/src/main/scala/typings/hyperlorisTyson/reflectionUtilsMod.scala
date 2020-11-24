package typings.hyperlorisTyson

import typings.hyperlorisTyson.jsonPropertyMetadataMod.JsonPropertyMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hyperloris/tyson/dist/types/reflect/reflectionUtils", JSImport.Namespace)
@js.native
object reflectionUtilsMod extends js.Object {
  
  @js.native
  class ReflectionUtils () extends js.Object
  /* static members */
  @js.native
  object ReflectionUtils extends js.Object {
    
    /**
      * Returns the {@link JsonProperty} metadata of the specified property, or undefined if they are not present.
      *
      * @static
      * @param {*} target the target object on which the metadata is defined
      * @param {string} propertyKey the property key for the target
      * @returns the metadata value for the metadata key if found; otherwise, undefined.
      * @memberof ReflectionUtils
      */
    def getJsonPropertyMetadata(target: js.Any, propertyKey: String): js.UndefOr[JsonPropertyMetadata] = js.native
    
    /**
      * This method returns the type of the specified object as injected by the compiler at design-time.
      *
      * @static
      * @param {*} target the target object
      * @param {string} propertyKey the property key for the target
      * @returns the injected type
      * @memberof ReflectionUtils
      */
    def getType(target: js.Any, propertyKey: String): js.Any = js.native
    
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
    def getTypeHash(target: js.Any): String = js.native
    
    /**
      * This method returns the type name of the specified object.
      * A little hack, because some browsers do not support constructor.name (guess who?).
      *
      * @static
      * @param {*} target the target object
      * @returns the type name
      * @memberof ReflectionUtils
      */
    def getTypeName(target: js.Any): String = js.native
  }
}
