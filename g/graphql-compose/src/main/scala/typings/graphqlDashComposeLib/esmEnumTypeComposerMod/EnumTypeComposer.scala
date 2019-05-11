package typings
package graphqlDashComposeLib.esmEnumTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/EnumTypeComposer", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmObjectTypeComposerMod._ComposeOutputType[js.Any, TContext]
     with graphqlDashComposeLib.esmSchemaComposerMod._MustHaveTypes[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLEnumTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  def addFields(newValues: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clone(newTypeName: java.lang.String): EnumTypeComposer[TContext] = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField(
    name: java.lang.String,
    partialValueConfig: stdLib.Partial[graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig]
  ): this.type = js.native
  def getDescription(): java.lang.String = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  // -----------------------------------------------
  // Extensions methods
  // -----------------------------------------------
  def getExtensions(): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getField(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFields(): graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  // -----------------------------------------------
  // Value methods
  // -----------------------------------------------
  def hasField(name: java.lang.String): scala.Boolean = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeField(nameOrArray: java.lang.String): this.type = js.native
  def removeField(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField(name: java.lang.String, valueConfig: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig): this.type = js.native
  def setFields(values: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/EnumTypeComposer", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

