package typings.jsonSchemaMergeAllof.mod

import typings.jsonSchemaMergeAllof.AnonAdditionalProperties
import typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.additionalProperties
import typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.patternProperties
import typings.std.NonNullable
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolvers[Schema /* <: JSONSchema */] extends js.Object {
  @JSName("$id")
  def $id_id(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonId>['$id'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonId>['$id'] */ js.Any
  ] = js.native
  @JSName("$ref")
  def $ref_ref(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['$ref'] */ js.Any
  ] = js.native
  @JSName("$schema")
  def $schema_schema(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['$schema'] */ js.Any
  ] = js.native
  @JSName("additionalItems")
  def additionalItems_additionalItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalItems'] */ js.Any
  ] = js.native
  @JSName("additionalProperties")
  def additionalProperties_additionalProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['additionalProperties'] */ js.Any
  ] = js.native
  @JSName("anyOf")
  def anyOf_anyOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['anyOf'] */ js.Any
  ] = js.native
  @JSName("contains")
  def contains_contains(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonContains>['contains'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonContains>['contains'] */ js.Any
  ] = js.native
  @JSName("default")
  def default_default(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['default'] */ js.Any
  ] = js.native
  @JSName("definitions")
  def definitions_definitions(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['definitions'] */ js.Any
  ] = js.native
  @JSName("dependencies")
  def dependencies_dependencies(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['dependencies'] */ js.Any
  ] = js.native
  @JSName("description")
  def description_description(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['description'] */ js.Any
  ] = js.native
  @JSName("enum")
  def enum_enum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['enum'] */ js.Any
  ] = js.native
  @JSName("examples")
  def examples_examples(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonExamples>['examples'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonExamples>['examples'] */ js.Any
  ] = js.native
  @JSName("exclusiveMaximum")
  def exclusiveMaximum_exclusiveMaximum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMaximum'] */ js.Any
  ] = js.native
  @JSName("exclusiveMinimum")
  def exclusiveMinimum_exclusiveMinimum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['exclusiveMinimum'] */ js.Any
  ] = js.native
  @JSName("items")
  def items_items(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['items'] */ js.Any
  ] = js.native
  @JSName("maxItems")
  def maxItems_maxItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxItems'] */ js.Any
  ] = js.native
  @JSName("maxLength")
  def maxLength_maxLength(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxLength'] */ js.Any
  ] = js.native
  @JSName("maxProperties")
  def maxProperties_maxProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maxProperties'] */ js.Any
  ] = js.native
  @JSName("maximum")
  def maximum_maximum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['maximum'] */ js.Any
  ] = js.native
  @JSName("minItems")
  def minItems_minItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minItems'] */ js.Any
  ] = js.native
  @JSName("minLength")
  def minLength_minLength(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minLength'] */ js.Any
  ] = js.native
  @JSName("minProperties")
  def minProperties_minProperties(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minProperties'] */ js.Any
  ] = js.native
  @JSName("minimum")
  def minimum_minimum(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['minimum'] */ js.Any
  ] = js.native
  @JSName("multipleOf")
  def multipleOf_multipleOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['multipleOf'] */ js.Any
  ] = js.native
  @JSName("not")
  def not_not(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['not'] */ js.Any
  ] = js.native
  @JSName("oneOf")
  def oneOf_oneOf(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['oneOf'] */ js.Any
  ] = js.native
  @JSName("pattern")
  def pattern_pattern(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['pattern'] */ js.Any
  ] = js.native
  /**
    * ### Combined resolvers
    * No separate resolver is called for patternProperties and
    * additionalProperties, only the properties resolver is called. Same
    * for additionalItems, only items resolver is called. This is because
    * those keywords need to be resolved together as they affect each
    * other.
    *
    * Those two resolvers are expected to return an object containing the
    * resolved values of all the associated keywords. The keys must be the
    * name of the keywords. So the properties resolver need to return an
    * object like this containing the resolved values for each keyword:
    *
    * ```js
    * {
    *     properties: ...,
    *     patternProperties: ...,
    *     additionalProperties: ...,
    * }
    * ```
    *
    * Also the resolve function is not passed **mergeSchemas**, but an
    * object **mergers** that contains mergers for each of the related
    * keywords. So properties get passed an object like this:
    *
    * ```js
    * var mergers = {
    *     properties: function mergeSchemas(schemas, childSchemaName){...},
    *     patternProperties: function mergeSchemas(schemas, childSchemaName){...},
    *     additionalProperties: function mergeSchemas(schemas){...},
    * }
    * ```
    *
    * Some of the mergers requires you to supply a string of the name or
    * index of the subschema you are currently merging. This is to make
    * sure the path passed to child resolvers are correct.
    */
  def properties(
    values: js.Array[Schema],
    path: js.Array[String],
    mergers: AnonAdditionalProperties,
    options: Options_[Schema]
  ): Pick[
    Schema, 
    typings.jsonSchemaMergeAllof.jsonSchemaMergeAllofStrings.properties | patternProperties | additionalProperties
  ] = js.native
  @JSName("propertyNames")
  def propertyNames_propertyNames(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonPropertyNames>['propertyNames'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<Schema, json-schema-merge-allof.AnonPropertyNames>['propertyNames'] */ js.Any
  ] = js.native
  @JSName("required")
  def required_required(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['required'] */ js.Any
  ] = js.native
  @JSName("title")
  def title_title(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['title'] */ js.Any
  ] = js.native
  @JSName("type")
  def type_type(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['type'] */ js.Any
  ] = js.native
  @JSName("uniqueItems")
  def uniqueItems_uniqueItems(
    values: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
    ],
    path: js.Array[String],
    mergeSchemas: MergeSchemas,
    options: Options_[Schema]
  ): NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema['uniqueItems'] */ js.Any
  ] = js.native
}

