package typings.graphqlCompose.mod

import typings.graphqlCompose.toInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext]): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

