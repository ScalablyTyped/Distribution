package typings.jsonschema.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsonschema", "SchemaError")
@js.native
class SchemaError protected () extends Error {
  def this(msg: String, schema: Schema) = this()
  
  var schema: Schema = js.native
}
