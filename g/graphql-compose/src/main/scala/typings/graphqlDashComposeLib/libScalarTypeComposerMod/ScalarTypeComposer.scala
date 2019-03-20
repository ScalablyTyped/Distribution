package typings
package graphqlDashComposeLib.libScalarTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer protected ()
  extends graphqlDashComposeLib.libTypeComposerMod._ComposeArgumentType
     with graphqlDashComposeLib.libInputTypeComposerMod._ComposeInputType
     with graphqlDashComposeLib.libTypeComposerMod._ComposeOutputType[js.Any, js.Any, js.Any]
     with graphqlDashComposeLib.libSchemaComposerMod._MustHaveTypes[js.Any]
     with graphqlDashComposeLib.libTypeStorageMod._V[js.Any] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType) = this()
  var gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def clone(newTypeName: java.lang.String): ScalarTypeComposer = js.native
  def getDescription(): java.lang.String = js.native
  def getParseLiteral(): graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_] = js.native
  def getParseValue(): graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_] = js.native
  def getSerialize(): graphqlLib.typeDefinitionMod.GraphQLScalarSerializer[_] = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType] = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setParseLiteral(fn: graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_]): scala.Unit = js.native
  def setParseLiteral(fn: scala.Unit): scala.Unit = js.native
  def setParseValue(fn: graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_]): scala.Unit = js.native
  def setParseValue(fn: scala.Unit): scala.Unit = js.native
  // -----------------------------------------------
  // Serialize methods
  // -----------------------------------------------
  def setSerialize(fn: graphqlLib.typeDefinitionMod.GraphQLScalarSerializer[_]): scala.Unit = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposerDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposerDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
}

