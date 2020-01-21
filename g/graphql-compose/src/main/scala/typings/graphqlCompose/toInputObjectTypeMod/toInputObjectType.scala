package typings.graphqlCompose.toInputObjectTypeMod

import typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer
import typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: InterfaceTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext]): InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: ObjectTypeComposer[_, TContext], opts: ToInputObjectTypeOpts): InputTypeComposer[TContext] = js.native
}

