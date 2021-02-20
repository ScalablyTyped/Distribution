package typings.joi.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchema[TSchema] extends AnySchema {
  
  /**
    * Defines an all-or-nothing relationship between keys where if one of the peers is present, all of them are required as well.
    *
    * Optional settings must be the last argument.
    */
  def and(peers: (String | HierarchySeparatorOptions)*): this.type = js.native
  
  /**
    * Appends the allowed object keys. If schema is null, undefined, or {}, no changes will be applied.
    */
  def append(): this.type = js.native
  def append(schema: SchemaMap[TSchema]): this.type = js.native
  
  /**
    * Verifies an assertion where.
    */
  def assert(ref: String, schema: SchemaLike): this.type = js.native
  def assert(ref: String, schema: SchemaLike, message: String): this.type = js.native
  def assert(ref: Reference, schema: SchemaLike): this.type = js.native
  def assert(ref: Reference, schema: SchemaLike, message: String): this.type = js.native
  
  /**
    * Requires the object to be an instance of a given constructor.
    *
    * @param constructor - the constructor function that the object must be an instance of.
    * @param name - an alternate name to use in validation errors. This is useful when the constructor function does not have a name.
    */
  // tslint:disable-next-line:ban-types
  def instance(constructor: js.Function): this.type = js.native
  def instance(constructor: js.Function, name: String): this.type = js.native
  
  /**
    * Sets or extends the allowed object keys.
    */
  def keys(): this.type = js.native
  def keys(schema: SchemaMap[TSchema]): this.type = js.native
  
  /**
    * Specifies the exact number of keys in the object.
    */
  def length(limit: Double): this.type = js.native
  
  /**
    * Specifies the maximum number of keys in the object.
    */
  def max(limit: Double): this.type = js.native
  def max(limit: Reference): this.type = js.native
  
  /**
    * Specifies the minimum number of keys in the object.
    */
  def min(limit: Double): this.type = js.native
  def min(limit: Reference): this.type = js.native
  
  /**
    * Defines a relationship between keys where not all peers can be present at the same time.
    *
    * Optional settings must be the last argument.
    */
  def nand(peers: (String | HierarchySeparatorOptions)*): this.type = js.native
  
  /**
    * Defines a relationship between keys where one of the peers is required (and more than one is allowed).
    *
    * Optional settings must be the last argument.
    */
  def or(peers: (String | HierarchySeparatorOptions)*): this.type = js.native
  
  /**
    * Defines an exclusive relationship between a set of keys where only one is allowed but none are required.
    *
    * Optional settings must be the last argument.
    */
  def oxor(peers: (String | HierarchySeparatorOptions)*): this.type = js.native
  
  def pattern(pattern: SchemaLike, schema: SchemaLike): this.type = js.native
  def pattern(pattern: SchemaLike, schema: SchemaLike, options: ObjectPatternOptions): this.type = js.native
  /**
    * Specify validation rules for unknown keys matching a pattern.
    *
    * @param pattern - a pattern that can be either a regular expression or a joi schema that will be tested against the unknown key names
    * @param schema - the schema object matching keys must validate against
    */
  def pattern(pattern: RegExp, schema: SchemaLike): this.type = js.native
  def pattern(pattern: RegExp, schema: SchemaLike, options: ObjectPatternOptions): this.type = js.native
  
  /**
    * Requires the object to be a Joi reference.
    */
  def ref(): this.type = js.native
  
  /**
    * Requires the object to be a `RegExp` object.
    */
  def regex(): this.type = js.native
  
  /**
    * Renames a key to another name (deletes the renamed key).
    */
  def rename(from: String, to: String): this.type = js.native
  def rename(from: String, to: String, options: RenameOptions): this.type = js.native
  def rename(from: RegExp, to: String): this.type = js.native
  def rename(from: RegExp, to: String, options: RenameOptions): this.type = js.native
  
  /**
    * Requires the object to be a Joi schema instance.
    */
  def schema(): this.type = js.native
  def schema(`type`: SchemaLike): this.type = js.native
  
  /**
    * Overrides the handling of unknown keys for the scope of the current object only (does not apply to children).
    */
  def unknown(): this.type = js.native
  def unknown(allow: Boolean): this.type = js.native
  
  /**
    * Requires the presence of other keys whenever the specified key is present.
    */
  def `with`(key: String, peers: String): this.type = js.native
  def `with`(key: String, peers: String, options: HierarchySeparatorOptions): this.type = js.native
  def `with`(key: String, peers: js.Array[String]): this.type = js.native
  def `with`(key: String, peers: js.Array[String], options: HierarchySeparatorOptions): this.type = js.native
  
  /**
    * Forbids the presence of other keys whenever the specified is present.
    */
  def without(key: String, peers: String): this.type = js.native
  def without(key: String, peers: String, options: HierarchySeparatorOptions): this.type = js.native
  def without(key: String, peers: js.Array[String]): this.type = js.native
  def without(key: String, peers: js.Array[String], options: HierarchySeparatorOptions): this.type = js.native
  
  /**
    * Defines an exclusive relationship between a set of keys. one of them is required but not at the same time.
    *
    * Optional settings must be the last argument.
    */
  def xor(peers: (String | HierarchySeparatorOptions)*): this.type = js.native
}
