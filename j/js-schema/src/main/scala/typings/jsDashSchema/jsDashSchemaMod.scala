package typings.jsDashSchema

import typings.jsDashSchema.jsDashSchemaMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-schema", JSImport.Namespace)
@js.native
object jsDashSchemaMod extends js.Object {
  def apply(definition: js.Any): Schema = js.native
  type Schema = js.Function1[/* obj */ js.Any, Boolean]
}

