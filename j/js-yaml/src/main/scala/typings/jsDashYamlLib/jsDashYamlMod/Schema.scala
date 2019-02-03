package typings
package jsDashYamlLib.jsDashYamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-yaml", "Schema")
@js.native
class Schema protected () extends SchemaDefinition {
  def this(definition: SchemaDefinition) = this()
}

/* static members */
@JSImport("js-yaml", "Schema")
@js.native
object Schema extends js.Object {
  def create(
    schemas: js.Array[jsDashYamlLib.jsDashYamlMod.Schema],
    types: js.Array[jsDashYamlLib.jsDashYamlMod.Type]
  ): jsDashYamlLib.jsDashYamlMod.Schema = js.native
  def create(schemas: js.Array[jsDashYamlLib.jsDashYamlMod.Schema], types: jsDashYamlLib.jsDashYamlMod.Type): jsDashYamlLib.jsDashYamlMod.Schema = js.native
  def create(schemas: jsDashYamlLib.jsDashYamlMod.Schema, types: js.Array[jsDashYamlLib.jsDashYamlMod.Type]): jsDashYamlLib.jsDashYamlMod.Schema = js.native
  def create(schemas: jsDashYamlLib.jsDashYamlMod.Schema, types: jsDashYamlLib.jsDashYamlMod.Type): jsDashYamlLib.jsDashYamlMod.Schema = js.native
  def create(types: js.Array[jsDashYamlLib.jsDashYamlMod.Type]): jsDashYamlLib.jsDashYamlMod.Schema = js.native
  def create(types: jsDashYamlLib.jsDashYamlMod.Type): jsDashYamlLib.jsDashYamlMod.Schema = js.native
}

