package typings.jsonschema.jsonschemaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaContext extends js.Object {
  var base: String
  var options: Options
  var propertyPath: String
  var schema: Schema
  var schemas: StringDictionary[Schema]
}

object SchemaContext {
  @scala.inline
  def apply(
    base: String,
    options: Options,
    propertyPath: String,
    schema: Schema,
    schemas: StringDictionary[Schema]
  ): SchemaContext = {
    val __obj = js.Dynamic.literal(base = base, options = options, propertyPath = propertyPath, schema = schema, schemas = schemas)
  
    __obj.asInstanceOf[SchemaContext]
  }
}

