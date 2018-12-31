package typings
package atHyperlorisTysonLib.tysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson", "Tyson")
@js.native
/**
  * Creates an instance of Tyson.
  *
  * @param {TysonBuilder} [builder]
  * @memberof Tyson
  */
class Tyson () extends js.Object {
  def this(builder: atHyperlorisTysonLib.distTypesTysonBuilderMod.TysonBuilder) = this()
  var _factories: js.Any = js.native
  var _serializeNulls: js.Any = js.native
  var _typeTokenCache: js.Any = js.native
  val serializeNulls: scala.Boolean = js.native
  def fromJson[T](json: js.Array[_], `type`: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.ClassType[T]): js.Array[T] = js.native
  /**
    * This method deserializes the specified JSON into an object|array of the specified type.
    *
    * @template T the type of the desired object|array
    * @param json the JSON object|array used during deserialization
    * @param type a class|array of T
    * @returns an object|array of type T. Returns undefined if json or type are undefined.
    * @memberof Tyson
    */
  def fromJson[T](json: js.Array[_], `type`: js.Array[_]): js.Array[_] = js.native
  def fromJson[T](json: js.Object, `type`: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.ClassType[T]): T = js.native
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
  def getAdapter[T](typeToken: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.TypeToken[T]): atHyperlorisTysonLib.distTypesTypeAdapterMod.TypeAdapter[T] = js.native
  /**
    * This method serializes the specified object, into its equivalent JSON representation.
    *
    * @param src the object|array for which JSON representation is to be created
    * @param type the specific type of src (required for arrays)
    * @returns JSON representation of src
    * @memberof Tyson
    */
  def toJson(src: js.Array[_], `type`: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.ClassType[_]): js.Array[_] = js.native
  def toJson(src: js.Array[_], `type`: js.Array[_]): js.Array[_] = js.native
  def toJson(src: js.Object): js.Any = js.native
  def toJson(src: js.Object, `type`: atHyperlorisTysonLib.distTypesReflectTypeTokenMod.ClassType[_]): js.Any = js.native
}

