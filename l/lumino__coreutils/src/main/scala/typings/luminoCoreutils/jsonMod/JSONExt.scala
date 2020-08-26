package typings.luminoCoreutils.jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/coreutils/types/json", "JSONExt")
@js.native
object JSONExt extends js.Object {
  /**
    * A shared frozen empty JSONArray
    */
  val emptyArray: ReadonlyJSONArray = js.native
  /**
    * A shared frozen empty JSONObject
    */
  val emptyObject: ReadonlyJSONObject = js.native
  def deepCopy(value: String): String = js.native
  def deepCopy(value: js.Array[ReadonlyPartialJSONValue]): js.Array[ReadonlyPartialJSONValue] = js.native
  /**
    * Create a deep copy of a JSON value.
    *
    * @param value - The JSON value to copy.
    *
    * @returns A deep copy of the given JSON value.
    */
  def deepCopy(value: Boolean): Boolean = js.native
  def deepCopy(value: Double): Double = js.native
  def deepCopy(value: Null): Null = js.native
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
  def deepEqual(first: ReadonlyPartialJSONValue, second: ReadonlyPartialJSONValue): Boolean = js.native
  /**
    * Test whether a JSON value is an array.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a an array, `false` otherwise.
    */
  def isArray(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONArray */ Boolean = js.native
  /**
    * Test whether a JSON value is an object.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a an object, `false` otherwise.
    */
  def isObject(value: JSONValue | PartialJSONValue | ReadonlyJSONValue | ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONObject */ Boolean = js.native
  /**
    * Test whether a JSON value is a primitive.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a primitive,`false` otherwise.
    */
  def isPrimitive(value: ReadonlyPartialJSONValue): /* is @lumino/coreutils.@lumino/coreutils/types/json.JSONPrimitive */ Boolean = js.native
}

