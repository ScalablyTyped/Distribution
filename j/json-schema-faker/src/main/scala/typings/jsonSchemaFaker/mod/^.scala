package typings.jsonSchemaFaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-schema-faker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated calling JsonSchemaFaker() is deprecated, call either .generate() or .resolve()' */
  def apply(schema: Schema): js.Any = js.native
  def apply(schema: Schema, refs: String): js.Any = js.native
  def apply(schema: Schema, refs: js.Array[Schema]): js.Any = js.native
}

