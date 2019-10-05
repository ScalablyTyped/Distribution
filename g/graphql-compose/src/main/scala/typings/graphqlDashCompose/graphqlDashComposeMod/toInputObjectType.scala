package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphqlDashCompose.libUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

