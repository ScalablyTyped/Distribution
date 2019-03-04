package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaContext extends js.Object {
  var base: java.lang.String
  var options: Options
  var propertyPath: java.lang.String
  var schema: Schema
  var schemas: org.scalablytyped.runtime.StringDictionary[Schema]
}

object SchemaContext {
  @scala.inline
  def apply(
    base: java.lang.String,
    options: Options,
    propertyPath: java.lang.String,
    schema: Schema,
    schemas: org.scalablytyped.runtime.StringDictionary[Schema]
  ): SchemaContext = {
    val __obj = js.Dynamic.literal(base = base, options = options, propertyPath = propertyPath, schema = schema, schemas = schemas)
  
    __obj.asInstanceOf[SchemaContext]
  }
}

