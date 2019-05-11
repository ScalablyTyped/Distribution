package typings
package graphqlDashComposeLib.esmScalarTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmObjectTypeComposerMod._ComposeOutputType[js.Any, TContext]
     with graphqlDashComposeLib.esmSchemaComposerMod._MustHaveTypes[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLScalarTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  def clearExtensions(): this.type = js.native
  def clone(newTypeName: java.lang.String): ScalarTypeComposer[TContext] = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def getDescription(): java.lang.String = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  // -----------------------------------------------
  // Extensions methods
  // -----------------------------------------------
  def getExtensions(): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getParseLiteral(): graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_] = js.native
  def getParseValue(): graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_] = js.native
  def getSerialize(): graphqlLib.typeDefinitionMod.GraphQLScalarSerializer[_] = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
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
@JSImport("graphql-compose/esm/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

