package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InputTypeComposer")
@js.native
class InputTypeComposer protected ()
  extends graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType) = this()
}

/* static members */
@JSImport("graphql-compose", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposerDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposerDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
}

