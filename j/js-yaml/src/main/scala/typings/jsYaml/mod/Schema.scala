package typings.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-yaml", "Schema")
@js.native
class Schema protected () extends SchemaDefinition {
  def this(definition: SchemaDefinition) = this()
}
/* static members */
@JSImport("js-yaml", "Schema")
@js.native
object Schema extends js.Object {
  
  def create(schemas: js.Array[Schema], types: js.Array[Type]): Schema = js.native
  def create(schemas: js.Array[Schema], types: Type): Schema = js.native
  def create(schemas: Schema, types: js.Array[Type]): Schema = js.native
  def create(schemas: Schema, types: Type): Schema = js.native
  def create(types: js.Array[Type]): Schema = js.native
  def create(types: Type): Schema = js.native
}
