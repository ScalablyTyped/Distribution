package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposerClass")
@js.native
class EnumTypeComposerClass protected ()
  extends graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposerClass")
@js.native
object EnumTypeComposerClass extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposerDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposerDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
}

