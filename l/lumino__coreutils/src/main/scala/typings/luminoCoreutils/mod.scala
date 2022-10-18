package typings.luminoCoreutils

import typings.luminoCoreutils.typesJsonMod.JSONValue
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONArray
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONValue
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object JSONExt {
    
    @JSImport("@lumino/coreutils", "JSONExt")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deepCopy(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def deepCopy(value: js.Array[ReadonlyPartialJSONValue]): js.Array[ReadonlyPartialJSONValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReadonlyPartialJSONValue]]
    /**
      * Create a deep copy of a JSON value.
      *
      * @param value - The JSON value to copy.
      *
      * @returns A deep copy of the given JSON value.
      */
    inline def deepCopy(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def deepCopy(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def deepCopy(value: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Null]
    inline def deepCopy(value: ReadonlyPartialJSONObject): ReadonlyPartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[ReadonlyPartialJSONObject]
    
    /**
      * Compare two JSON values for deep equality.
      *
      * @param first - The first JSON value of interest.
      *
      * @param second - The second JSON value of interest.
      *
      * @returns `true` if the values are equivalent, `false` otherwise.
      */
    inline def deepEqual(first: ReadonlyPartialJSONValue, second: ReadonlyPartialJSONValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
    inline def isArray(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean]
    
    /**
      * Test whether a JSON value is an object.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an object, `false` otherwise.
      */
    inline def isObject(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean]
    
    /**
      * Test whether a JSON value is a primitive.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a primitive,`false` otherwise.
      */
    inline def isPrimitive(value: ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean]
  }
  
  @JSImport("@lumino/coreutils", "MimeData")
  @js.native
  open class MimeData ()
    extends typings.luminoCoreutils.typesIndexDotcommonMod.MimeData
  
  @JSImport("@lumino/coreutils", "PromiseDelegate")
  @js.native
  /**
    * Construct a new promise delegate.
    */
  open class PromiseDelegate[T] ()
    extends typings.luminoCoreutils.typesIndexDotcommonMod.PromiseDelegate[T]
  
  object Random {
    
    @JSImport("@lumino/coreutils", "Random")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof fallbackRandomValues` */
    inline def getRandomValues(buffer: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@lumino/coreutils", "Token")
  @js.native
  open class Token[T] protected ()
    extends typings.luminoCoreutils.typesIndexDotcommonMod.Token[T] {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      */
    def this(name: String) = this()
  }
  
  object UUID {
    
    @JSImport("@lumino/coreutils", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  }
}
