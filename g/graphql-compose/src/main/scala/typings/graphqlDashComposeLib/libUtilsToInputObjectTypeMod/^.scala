package typings
package graphqlDashComposeLib.libUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertInputObjectField(
    field: graphqlLib.typeDefinitionMod.GraphQLType,
    opts: ConvertInputObjectFieldOpts,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_]
  ): graphqlLib.typeDefinitionMod.GraphQLInputType | scala.Null = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

