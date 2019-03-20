package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ScalarTypeComposerClass")
@js.native
class ScalarTypeComposerClass protected ()
  extends graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType) = this()
}

/* static members */
@JSImport("graphql-compose", "ScalarTypeComposerClass")
@js.native
object ScalarTypeComposerClass extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposerDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposerDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
}

