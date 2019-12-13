package typings.jsonschema.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "ValidationError")
@js.native
class ValidationError protected () extends js.Object {
  def this(
    message: js.UndefOr[String],
    instance: js.UndefOr[js.Any],
    schema: js.UndefOr[Schema],
    propertyPath: js.UndefOr[js.Any],
    name: js.UndefOr[String],
    argument: js.UndefOr[js.Any]
  ) = this()
  var argument: js.Any = js.native
  var instance: js.Any = js.native
  var message: String = js.native
  var name: String = js.native
  var property: String = js.native
  var schema: String | Schema = js.native
  var stack: String = js.native
}

