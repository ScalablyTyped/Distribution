package typings.jsonschema.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "Validator")
@js.native
class Validator () extends js.Object {
  var attributes: StringDictionary[CustomProperty] = js.native
  var customFormats: StringDictionary[CustomFormat] = js.native
  var schemas: StringDictionary[Schema] = js.native
  var unresolvedRefs: js.Array[String] = js.native
  def addSchema(): Schema | Unit = js.native
  def addSchema(schema: Schema): Schema | Unit = js.native
  def addSchema(schema: Schema, uri: String): Schema | Unit = js.native
  def validate(instance: js.Any, schema: Schema): ValidatorResult = js.native
  def validate(instance: js.Any, schema: Schema, options: Options): ValidatorResult = js.native
  def validate(instance: js.Any, schema: Schema, options: Options, ctx: SchemaContext): ValidatorResult = js.native
}

