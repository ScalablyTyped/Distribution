package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "SchemaError")
@js.native
class SchemaError protected ()
  extends stdLib.Error {
  def this(msg: java.lang.String, schema: Schema) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var schema: Schema = js.native
}

