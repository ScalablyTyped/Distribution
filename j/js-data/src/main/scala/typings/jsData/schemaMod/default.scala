package typings.jsData.schemaMod

import typings.jsData.AnonArray
import typings.jsData.AnonBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Schema", JSImport.Default)
@js.native
class default () extends Schema {
  def this(definition: SchemaDefinition) = this()
}

/* static members */
@JSImport("js-data/dist/Schema", JSImport.Default)
@js.native
object default extends js.Object {
  var ANY_OPS: js.Array[String] = js.native
  var ARRAY_OPS: js.Array[String] = js.native
  var NUMERIC_OPS: js.Array[String] = js.native
  var OBJECT_OPS: js.Array[String] = js.native
  var STRING_OPS: js.Array[String] = js.native
  var typeGroupValidators: AnonArray = js.native
  var types: AnonBoolean = js.native
  var validationKeywords: js.Any = js.native
  def validate(value: js.Any, schema: js.Any): js.Array[_] = js.native
  def validate(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
}

