package typings
package graphqlDashComposeLib.libEnumTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/EnumTypeComposer", "EnumTypeComposer")
@js.native
class EnumTypeComposer protected ()
  extends graphqlDashComposeLib.libTypeComposerMod._ComposeArgumentType
     with graphqlDashComposeLib.libInputTypeComposerMod._ComposeInputType
     with graphqlDashComposeLib.libTypeComposerMod._ComposeOutputType[js.Any, js.Any, js.Any]
     with graphqlDashComposeLib.libSchemaComposerMod._MustHaveTypes[js.Any]
     with graphqlDashComposeLib.libTypeStorageMod._V[js.Any] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType) = this()
  var gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def addFields(newValues: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap): this.type = js.native
  def clone(newTypeName: java.lang.String): EnumTypeComposer = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendField(name: java.lang.String, partialValueConfig: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig): this.type = js.native
  def getDescription(): java.lang.String = js.native
  def getField(name: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFields(): graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType] = js.native
  // -----------------------------------------------
  // Value methods
  // -----------------------------------------------
  def hasField(name: java.lang.String): scala.Boolean = js.native
  def removeField(nameOrArray: java.lang.String): this.type = js.native
  def removeField(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setField(name: java.lang.String, valueConfig: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfig): this.type = js.native
  def setFields(values: graphqlLib.typeDefinitionMod.GraphQLEnumValueConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/EnumTypeComposer", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposerDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposerDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
}

