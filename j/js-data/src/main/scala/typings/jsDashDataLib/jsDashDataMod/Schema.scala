package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Schema")
@js.native
class Schema protected () extends Component {
  def this(definition: js.Any) = this()
  var properties: js.Any = js.native
  @JSName("apply")
  def apply(target: js.Any): scala.Unit = js.native
  @JSName("apply")
  def apply(target: js.Any, opts: js.Any): scala.Unit = js.native
  def applyDefaults(target: js.Any): scala.Unit = js.native
  def makeDescriptor(prop: java.lang.String, schema: Schema): js.Any = js.native
  def makeDescriptor(prop: java.lang.String, schema: Schema, opts: js.Any): js.Any = js.native
  def pick(value: js.Any): js.Any = js.native
  def validate(value: js.Any): js.Array[SchemaValidationError] = js.native
  def validate(value: js.Any, opts: js.Any): js.Array[SchemaValidationError] = js.native
}

@JSImport("js-data", "Schema")
@js.native
object Schema extends js.Object {
  var typeGroupValidators: jsDashDataLib.Anon_ArrayInteger = js.native
  var types: jsDashDataLib.Anon_Array = js.native
  var validationKeywords: jsDashDataLib.Anon_AllOf = js.native
  def validate(value: js.Any, schema: js.Any, opts: js.Any): js.Array[jsDashDataLib.jsDashDataMod.SchemaValidationError] = js.native
}

