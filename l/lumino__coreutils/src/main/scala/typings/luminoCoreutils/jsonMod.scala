package typings.luminoCoreutils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  object JSONExt {
    
    @JSImport("@lumino/coreutils/types/json", "JSONExt")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def deepCopy(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def deepCopy(value: js.Array[ReadonlyPartialJSONValue]): js.Array[ReadonlyPartialJSONValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReadonlyPartialJSONValue]]
    /**
      * Create a deep copy of a JSON value.
      *
      * @param value - The JSON value to copy.
      *
      * @returns A deep copy of the given JSON value.
      */
    @scala.inline
    def deepCopy(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    @scala.inline
    def deepCopy(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def deepCopy(value: Null): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Null]
    @scala.inline
    def deepCopy(value: ReadonlyPartialJSONObject): ReadonlyPartialJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("deepCopy")(value.asInstanceOf[js.Any]).asInstanceOf[ReadonlyPartialJSONObject]
    
    /**
      * Compare two JSON values for deep equality.
      *
      * @param first - The first JSON value of interest.
      *
      * @param second - The second JSON value of interest.
      *
      * @returns `true` if the values are equivalent, `false` otherwise.
      */
    @scala.inline
    def deepEqual(first: ReadonlyPartialJSONValue, second: ReadonlyPartialJSONValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEqual")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * A shared frozen empty JSONArray
      */
    @JSImport("@lumino/coreutils/types/json", "JSONExt.emptyArray")
    @js.native
    val emptyArray: ReadonlyJSONArray = js.native
    
    /**
      * A shared frozen empty JSONObject
      */
    @JSImport("@lumino/coreutils/types/json", "JSONExt.emptyObject")
    @js.native
    val emptyObject: ReadonlyJSONObject = js.native
    
    /**
      * Test whether a JSON value is an array.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an array, `false` otherwise.
      */
    @scala.inline
    def isArray(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean]
    
    /**
      * Test whether a JSON value is an object.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an object, `false` otherwise.
      */
    @scala.inline
    def isObject(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean]
    
    /**
      * Test whether a JSON value is a primitive.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a primitive,`false` otherwise.
      */
    @scala.inline
    def isPrimitive(value: ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean]
  }
  
  @js.native
  trait JSONArray
    extends StObject
       with Array[JSONValue]
       with _JSONValue
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
       with _JSONValue
  object JSONObject {
    
    @scala.inline
    def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONPrimitive = Boolean | Double | String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.JSONObject
    - typings.luminoCoreutils.jsonMod.JSONArray
  */
  type JSONValue = _JSONValue | JSONPrimitive
  
  @js.native
  trait PartialJSONArray
    extends StObject
       with Array[PartialJSONValue]
       with _PartialJSONValue
  
  trait PartialJSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[PartialJSONValue]]
       with _PartialJSONValue
  object PartialJSONObject {
    
    @scala.inline
    def apply(): PartialJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJSONObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.PartialJSONObject
    - typings.luminoCoreutils.jsonMod.PartialJSONArray
  */
  type PartialJSONValue = _PartialJSONValue | JSONPrimitive
  
  @js.native
  trait ReadonlyJSONArray
    extends StObject
       with ReadonlyArray[ReadonlyJSONValue]
       with _ReadonlyJSONValue
  
  trait ReadonlyJSONObject
    extends StObject
       with /* key */ StringDictionary[ReadonlyJSONValue]
       with _ReadonlyJSONValue
  object ReadonlyJSONObject {
    
    @scala.inline
    def apply(): ReadonlyJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyJSONObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
    - typings.luminoCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = _ReadonlyJSONValue | JSONPrimitive
  
  @js.native
  trait ReadonlyPartialJSONArray
    extends StObject
       with ReadonlyArray[ReadonlyPartialJSONValue]
       with _ReadonlyPartialJSONValue
  
  trait ReadonlyPartialJSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[ReadonlyPartialJSONValue]]
       with _ReadonlyPartialJSONValue
  object ReadonlyPartialJSONObject {
    
    @scala.inline
    def apply(): ReadonlyPartialJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialJSONObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luminoCoreutils.jsonMod.JSONPrimitive
    - typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
    - typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONArray
  */
  type ReadonlyPartialJSONValue = _ReadonlyPartialJSONValue | JSONPrimitive
  
  trait _JSONValue extends StObject
  
  trait _PartialJSONValue extends StObject
  
  trait _ReadonlyJSONValue extends StObject
  
  trait _ReadonlyPartialJSONValue extends StObject
}
