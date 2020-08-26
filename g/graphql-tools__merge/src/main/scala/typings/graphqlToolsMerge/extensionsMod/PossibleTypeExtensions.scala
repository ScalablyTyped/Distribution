package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.anon.Arguments
import typings.graphqlToolsMerge.anon.Extensions
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.`object`
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.enum
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.input
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.interface
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.scalar
import typings.graphqlToolsMerge.graphqlToolsMergeStrings.union
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlToolsMerge.extensionsMod.InputTypeExtensions
  - typings.graphqlToolsMerge.extensionsMod.InterfaceTypeExtensions
  - typings.graphqlToolsMerge.extensionsMod.ObjectTypeExtensions
  - typings.graphqlToolsMerge.extensionsMod.UnionTypeExtensions
  - typings.graphqlToolsMerge.extensionsMod.ScalarTypeExtensions
  - typings.graphqlToolsMerge.extensionsMod.EnumTypeExtensions
*/
trait PossibleTypeExtensions extends js.Object

object PossibleTypeExtensions {
  @scala.inline
  def EnumTypeExtensions(`type`: enum, values: Record[String, ExtensionsObject]): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def ObjectTypeExtensions(fields: Record[String, Arguments], `type`: `object`): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def ScalarTypeExtensions(`type`: scalar): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def InterfaceTypeExtensions(fields: Record[String, Arguments], `type`: interface): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def InputTypeExtensions(fields: Record[String, Extensions], `type`: input): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
  @scala.inline
  def UnionTypeExtensions(`type`: union): PossibleTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PossibleTypeExtensions]
  }
}

