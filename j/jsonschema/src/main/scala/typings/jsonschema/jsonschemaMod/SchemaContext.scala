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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaContext]
  }
}

