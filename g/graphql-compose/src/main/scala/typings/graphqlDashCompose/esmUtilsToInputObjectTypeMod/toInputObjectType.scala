package typings.graphqlDashCompose.esmUtilsToInputObjectTypeMod

import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/utils/toInputObjectType", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
}

