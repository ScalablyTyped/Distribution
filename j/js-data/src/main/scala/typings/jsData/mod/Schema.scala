package typings.jsData.mod

import typings.jsData.AnonAllOf
import typings.jsData.AnonArray
import typings.jsData.AnonArrayInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Schema")
@js.native
class Schema protected () extends Component {
  def this(definition: js.Any) = this()
  var properties: js.Any = js.native
  @JSName("apply")
  def apply(target: js.Any): Unit = js.native
  @JSName("apply")
  def apply(target: js.Any, opts: js.Any): Unit = js.native
  def applyDefaults(target: js.Any): Unit = js.native
  def makeDescriptor(prop: String, schema: Schema): js.Any = js.native
  def makeDescriptor(prop: String, schema: Schema, opts: js.Any): js.Any = js.native
  def pick(value: js.Any): js.Any = js.native
  def validate(value: js.Any): js.Array[SchemaValidationError] = js.native
  def validate(value: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
}

/* static members */
@JSImport("js-data", "Schema")
@js.native
object Schema extends js.Object {
  var typeGroupValidators: AnonArrayInteger = js.native
  var types: AnonArray = js.native
  var validationKeywords: AnonAllOf = js.native
  def validate(value: js.Any, schema: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
}

