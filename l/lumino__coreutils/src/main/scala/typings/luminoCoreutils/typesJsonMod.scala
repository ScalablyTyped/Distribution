package typings.luminoCoreutils

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJsonMod {
  
  object JSONExt {
    
    @JSImport("@lumino/coreutils/types/json", "JSONExt")
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
  
  type JSONArray = js.Array[JSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONObject = {[key: string] : @lumino/coreutils.@lumino/coreutils/types/json.JSONValue}
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.JSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.JSONObject
  - @lumino/coreutils.@lumino/coreutils/types/json.JSONValue
  */
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[JSONValue]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONPrimitive = Boolean | Double | String | Null
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JSONValue = @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive | @lumino/coreutils.@lumino/coreutils/types/json.JSONObject | @lumino/coreutils.@lumino/coreutils/types/json.JSONArray
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.JSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.JSONValue
  */
  type JSONValue = JSONPrimitive | JSONObject | Any
  
  type PartialJSONArray = js.Array[PartialJSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PartialJSONObject = {[key: string] : @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONValue | undefined}
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONObject
  - @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONValue
  */
  trait PartialJSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[PartialJSONValue]]
  object PartialJSONObject {
    
    inline def apply(): PartialJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJSONObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PartialJSONValue = @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive | @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONObject | @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONArray
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.PartialJSONValue
  */
  type PartialJSONValue = JSONPrimitive | PartialJSONObject | Any
  
  type ReadonlyJSONArray = js.Array[ReadonlyJSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReadonlyJSONObject = {readonly [key: string] : @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONValue}
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONObject
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONValue
  */
  trait ReadonlyJSONObject
    extends StObject
       with /* key */ StringDictionary[ReadonlyJSONValue]
  object ReadonlyJSONObject {
    
    inline def apply(): ReadonlyJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyJSONObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReadonlyJSONValue = @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive | @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONObject | @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONArray
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyJSONValue
  */
  type ReadonlyJSONValue = JSONPrimitive | ReadonlyJSONObject | Any
  
  type ReadonlyPartialJSONArray = js.Array[ReadonlyPartialJSONValue]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReadonlyPartialJSONObject = {readonly [key: string] : @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONValue | undefined}
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONObject
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONValue
  */
  trait ReadonlyPartialJSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[ReadonlyPartialJSONValue]]
  object ReadonlyPartialJSONObject {
    
    inline def apply(): ReadonlyPartialJSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyPartialJSONObject]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ReadonlyPartialJSONValue = @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive | @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONObject | @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONArray
  }}}
  to avoid circular code involving: 
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONArray
  - @lumino/coreutils.@lumino/coreutils/types/json.ReadonlyPartialJSONValue
  */
  type ReadonlyPartialJSONValue = JSONPrimitive | ReadonlyPartialJSONObject | Any
}
