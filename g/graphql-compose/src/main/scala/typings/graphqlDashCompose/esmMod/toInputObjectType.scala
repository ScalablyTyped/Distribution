package typings.graphqlDashCompose.esmMod

import typings.graphqlDashCompose.esmUtilsToInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

