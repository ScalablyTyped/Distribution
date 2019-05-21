package typings
package graphqlDashComposeLib.esmScalarTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmSchemaComposerMod._AnyComposeType[TContext]
     with graphqlDashComposeLib.esmSchemaComposerMod._AnyType[TContext]
     with graphqlDashComposeLib.esmObjectTypeComposerMod._ComposeOutputType[js.Any, TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLScalarTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  def clearExtensions(): this.type = js.native
  def clone(newTypeName: java.lang.String): ScalarTypeComposer[TContext] = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def getDescription(): java.lang.String = js.native
  def getDirectiveById(idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveByName(directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveNames(): js.Array[java.lang.String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  /**
    *  -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getParseLiteral(): graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_] = js.native
  def getParseValue(): graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_] = js.native
  def getSerialize(): graphqlLib.typeDefinitionMod.GraphQLScalarSerializer[_] = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  def merge(`type`: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType): this.type = js.native
  def merge(`type`: ScalarTypeComposer[_]): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setParseLiteral(fn: graphqlLib.typeDefinitionMod.GraphQLScalarLiteralParser[_]): scala.Unit = js.native
  def setParseLiteral(fn: scala.Unit): scala.Unit = js.native
  def setParseValue(fn: graphqlLib.typeDefinitionMod.GraphQLScalarValueParser[_]): scala.Unit = js.native
  def setParseValue(fn: scala.Unit): scala.Unit = js.native
  /**
    *  -----------------------------------------------
    * Serialize methods
    * -----------------------------------------------
    */
  def setSerialize(fn: graphqlLib.typeDefinitionMod.GraphQLScalarSerializer[_]): scala.Unit = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/ScalarTypeComposer", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

