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
  ): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def toInputObjectType(typeComposer: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, _]): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def toInputObjectType(
    typeComposer: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, _],
    opts: ToInputObjectTypeOpts
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
}

