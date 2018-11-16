package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonschema", "ValidationError")
@js.native
class ValidationError protected () extends js.Object {
  def this(message: js.UndefOr[java.lang.String], instance: js.UndefOr[js.Any], schema: js.UndefOr[Schema], propertyPath: js.UndefOr[js.Any], name: js.UndefOr[java.lang.String], argument: js.UndefOr[js.Any]) = this()
  var argument: js.Any = js.native
  var instance: js.Any = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var property: java.lang.String = js.native
  var schema: java.lang.String | Schema = js.native
}

