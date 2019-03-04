package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait $Refs extends js.Object {
  /**
    * This property is true if the schema contains any circular references. You may want to check this property before serializing the dereferenced schema as JSON, since JSON.stringify() does not support circular references by default.
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#circular
    */
  var circular: scala.Boolean
  /**
    * Returns `true` if the given path exists in the schema; otherwise, returns `false`
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#existsref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def exists($ref: java.lang.String): scala.Boolean
  /**
    * Gets the value at the given path in the schema. Throws an error if the path does not exist.
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#getref
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    */
  def get($ref: java.lang.String): jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4Type
  /**
    * Returns the paths/URLs of all the files in your schema (including the main schema file).
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#pathstypes
    *
    * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
    */
  def paths(types: java.lang.String*): js.Array[java.lang.String]
  /**
    * Sets the value at the given path in the schema. If the property, or any of its parents, don't exist, they will be created.
    *
    * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
    * @param value The value to assign. Can be anything (object, string, number, etc.)
    */
  def set($ref: java.lang.String, value: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4Type): scala.Unit
  /**
    * Returns a map of paths/URLs and their correspond values.
    *
    * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/refs.md#valuestypes
    *
    * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
    */
  def values(types: java.lang.String*): org.scalablytyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
}

object $Refs {
  @scala.inline
  def apply(
    circular: scala.Boolean,
    exists: js.Function1[java.lang.String, scala.Boolean],
    get: js.Function1[java.lang.String, jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4Type],
    paths: js.Function1[/* repeated */ java.lang.String, js.Array[java.lang.String]],
    set: js.Function2[java.lang.String, jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4Type, scala.Unit],
    values: js.Function1[
      /* repeated */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4]
    ]
  ): $Refs = {
    val __obj = js.Dynamic.literal(circular = circular, exists = exists, get = get, paths = paths, set = set, values = values)
  
    __obj.asInstanceOf[$Refs]
  }
}

