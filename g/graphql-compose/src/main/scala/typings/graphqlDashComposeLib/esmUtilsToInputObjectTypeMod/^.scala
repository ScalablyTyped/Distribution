package typings
package graphqlDashComposeLib.esmUtilsToInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/utils/toInputObjectType", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convertInputObjectField(
    field: graphqlLib.typeDefinitionMod.GraphQLType,
    opts: ConvertInputObjectFieldOpts,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[_]
  ): graphqlLib.typeDefinitionMod.GraphQLInputType | scala.Null = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](tc: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def toInputObjectType[TContext](
    tc: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

