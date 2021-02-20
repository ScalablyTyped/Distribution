package typings.luminoCoreutils

import typings.luminoCoreutils.jsonMod.JSONValue
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyJSONArray
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object JSONExt {
    
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: String): String = js.native
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: js.Array[ReadonlyPartialJSONValue]): js.Array[ReadonlyPartialJSONValue] = js.native
    /**
      * Create a deep copy of a JSON value.
      *
      * @param value - The JSON value to copy.
      *
      * @returns A deep copy of the given JSON value.
      */
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: Boolean): Boolean = js.native
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: Double): Double = js.native
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: Null): Null = js.native
    @JSImport("@lumino/coreutils", "JSONExt.deepCopy")
    @js.native
    def deepCopy(value: ReadonlyPartialJSONObject): ReadonlyPartialJSONObject = js.native
    
    /**
      * Compare two JSON values for deep equality.
      *
      * @param first - The first JSON value of interest.
      *
      * @param second - The second JSON value of interest.
      *
      * @returns `true` if the values are equivalent, `false` otherwise.
      */
    @JSImport("@lumino/coreutils", "JSONExt.deepEqual")
    @js.native
    def deepEqual(first: ReadonlyPartialJSONValue, second: ReadonlyPartialJSONValue): Boolean = js.native
    
    /**
      * A shared frozen empty JSONArray
      */
    @JSImport("@lumino/coreutils", "JSONExt.emptyArray")
    @js.native
    val emptyArray: ReadonlyJSONArray = js.native
    
    /**
      * A shared frozen empty JSONObject
      */
    @JSImport("@lumino/coreutils", "JSONExt.emptyObject")
    @js.native
    val emptyObject: ReadonlyJSONObject = js.native
    
    /**
      * Test whether a JSON value is an array.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an array, `false` otherwise.
      */
    @JSImport("@lumino/coreutils", "JSONExt.isArray")
    @js.native
    def isArray(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean = js.native
    
    /**
      * Test whether a JSON value is an object.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an object, `false` otherwise.
      */
    @JSImport("@lumino/coreutils", "JSONExt.isObject")
    @js.native
    def isObject(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean = js.native
    
    /**
      * Test whether a JSON value is a primitive.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a primitive,`false` otherwise.
      */
    @JSImport("@lumino/coreutils", "JSONExt.isPrimitive")
    @js.native
    def isPrimitive(value: ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean = js.native
  }
  
  @JSImport("@lumino/coreutils", "MimeData")
  @js.native
  class MimeData ()
    extends typings.luminoCoreutils.mimeMod.MimeData
  
  @JSImport("@lumino/coreutils", "PromiseDelegate")
  @js.native
  /**
    * Construct a new promise delegate.
    */
  class PromiseDelegate[T] ()
    extends typings.luminoCoreutils.promiseMod.PromiseDelegate[T]
  
  object Random {
    
    /**
      * A function which generates random bytes.
      *
      * @param buffer - The `Uint8Array` to fill with random bytes.
      *
      * #### Notes
      * A cryptographically strong random number generator will be used if
      * available. Otherwise, `Math.random` will be used as a fallback for
      * randomness.
      *
      * The following RNGs are supported, listed in order of precedence:
      *   - `window.crypto.getRandomValues`
      *   - `window.msCrypto.getRandomValues`
      *   - `require('crypto').randomFillSync
      *   - `require('crypto').randomBytes
      *   - `Math.random`
      */
    @JSImport("@lumino/coreutils", "Random.getRandomValues")
    @js.native
    def getRandomValues(buffer: Uint8Array): Unit = js.native
  }
  
  @JSImport("@lumino/coreutils", "Token")
  @js.native
  class Token[T] protected ()
    extends typings.luminoCoreutils.tokenMod.Token[T] {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      */
    def this(name: String) = this()
  }
  
  object UUID {
    
    /**
      * A function which generates UUID v4 identifiers.
      *
      * @returns A new UUID v4 string.
      *
      * #### Notes
      * This implementation complies with RFC 4122.
      *
      * This uses `Random.getRandomValues()` for random bytes, which in
      * turn will use the underlying `crypto` module of the platform if
      * it is available. The fallback for randomness is `Math.random`.
      */
    @JSImport("@lumino/coreutils", "UUID.uuid4")
    @js.native
    def uuid4(): String = js.native
  }
}
