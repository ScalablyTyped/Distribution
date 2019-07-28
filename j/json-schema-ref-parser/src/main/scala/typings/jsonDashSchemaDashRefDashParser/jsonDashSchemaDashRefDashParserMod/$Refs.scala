package typings.jsonDashSchemaDashRefDashParser.jsonDashSchemaDashRefDashParserMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4Type
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-schema-ref-parser", "$Refs")
@js.native
class $Refs () extends js.Object {
  /**
    * This property is true if the schema contains any circular references. You may want to check this property before serializing the dereferenced schema as JSON, since JSON.stringify() does not support circular references by default.
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/refs.md#circular
    */
  var circular: Boolean = js.native
  /**
    * Returns `true` if the given path exists in the schema; otherwise, returns `false`
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/refs.md#existsref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def exists($ref: String): Boolean = js.native
  /**
    * Gets the value at the given path in the schema. Throws an error if the path does not exist.
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/refs.md#getref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def get($ref: String): JSONSchema4Type | JSONSchema6Type = js.native
  /**
    * Returns the paths/URLs of all the files in your schema (including the main schema file).
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/refs.md#pathstypes
    *
    * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
    */
  def paths(types: String*): js.Array[String] = js.native
  /**
    * Sets the value at the given path in the schema. If the property, or any of its parents, don't exist, they will be created.
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    * @param value The value to assign. Can be anything (object, string, number, etc.)
    */
  def set($ref: String, value: JSONSchema4Type | JSONSchema6Type): Unit = js.native
  /**
    * Returns a map of paths/URLs and their correspond values.
    *
    * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/refs.md#valuestypes
    *
    * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
    */
  def values(types: String*): StringDictionary[JSONSchema] = js.native
}

