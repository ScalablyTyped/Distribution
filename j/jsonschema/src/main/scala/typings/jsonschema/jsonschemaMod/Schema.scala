package typings.jsonschema.jsonschemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var additionalItems: js.UndefOr[Boolean | Schema] = js.native
  var additionalProperties: js.UndefOr[Boolean | Schema] = js.native
  var allOf: js.UndefOr[js.Array[Schema]] = js.native
  var anyOf: js.UndefOr[js.Array[Schema]] = js.native
  var definitions: js.UndefOr[StringDictionary[Schema]] = js.native
  var dependencies: js.UndefOr[StringDictionary[Schema | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  var enum: js.UndefOr[js.Array[_]] = js.native
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[Schema | js.Array[Schema]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[Schema] = js.native
  var oneOf: js.UndefOr[js.Array[Schema]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[Schema]] = js.native
  var properties: js.UndefOr[StringDictionary[Schema]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

