package typings
package jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
 *
 * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md
 */
@js.native
trait $RefParser extends js.Object {
  /**
     * The $refs property is a `$Refs` object, which lets you access all of the externally-referenced files in the schema, as well as easily get and set specific values in the schema using JSON pointers.
     *
     * This is the same value that is passed to the callback function (or Promise) when calling the `resolve` method.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#refs
     */
  @JSName("$refs")
  var $refs: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs = js.native
  /**
     * The `schema` property is the parsed/bundled/dereferenced JSON Schema object. This is the same value that is passed to the callback function (or Promise) when calling the parse, bundle, or dereference methods.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#schema
     */
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(schema: java.lang.String): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
     *
     * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#bundleschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the bundled schema object
     */
  def bundle(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(path: java.lang.String): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(
    path: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(
    path: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(path: java.lang.String, schema: java.lang.String): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(
    path: java.lang.String,
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(
    path: java.lang.String,
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(path: java.lang.String, schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(
    path: java.lang.String,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
     *
     * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#dereferenceschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the dereferenced schema object
     */
  def dereference(
    path: java.lang.String,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  def dereference(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(schema: java.lang.String): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#parseschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
     * @param options (optional)
     * @param callback (optional) A callback that will receive the parsed schema object, or an error
     */
  def parse(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* schema */ jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4 | scala.Null, 
      _
    ]
  ): stdLib.Promise[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(schema: java.lang.String): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(
    schema: java.lang.String,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* $refs */ jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs | scala.Null, 
      _
    ]
  ): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options
  ): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
  /**
     * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
     *
     * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
     *
     * See https://github.com/BigstickCarpet/json-schema-ref-parser/blob/master/docs/ref-parser.md#resolveschema-options-callback
     *
     * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
     * @param options (optional)
     * @param callback (optional) A callback that will receive a `$Refs` object
     */
  def resolve(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema4,
    options: jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.Options,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* $refs */ jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs | scala.Null, 
      _
    ]
  ): stdLib.Promise[
    jsonDashSchemaDashRefDashParserLib.jsonDashSchemaDashRefDashParserMod.$RefParserNs.$Refs
  ] = js.native
}

