package typings
package graphqlDashComposeLib.libInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/InputTypeComposer", "InputTypeComposer")
@js.native
class InputTypeComposer protected ()
  extends graphqlDashComposeLib.libTypeComposerMod._ComposeArgumentType
     with _ComposeInputType
     with graphqlDashComposeLib.libSchemaComposerMod._MustHaveTypes[js.Any]
     with graphqlDashComposeLib.libTypeStorageMod._V[js.Any] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType) = this()
  var gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newFields: ComposeInputFieldConfigMap): this.type = js.native
  /**
    * Add new fields or replace existed (where field name may have dots)
    */
  def addNestedFields(newFields: ComposeInputFieldConfigMap): InputTypeComposer = js.native
  def clone(newTypeName: java.lang.String): InputTypeComposer = js.native
  def extendField(fieldName: java.lang.String, parialFieldConfig: ComposeInputFieldConfig): this.type = js.native
  // -----------------------------------------------
  // Misc methods
  // -----------------------------------------------
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getDescription(): java.lang.String = js.native
  /**
    * Get fieldConfig by name
    */
  def getField(fieldName: java.lang.String): ComposeInputFieldConfig = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFieldTC(fieldName: java.lang.String): InputTypeComposer = js.native
  def getFieldType(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  // -----------------------------------------------
  // Field methods
  // -----------------------------------------------
  def getFields(): ComposeInputFieldConfigMap = js.native
  // -----------------------------------------------
  // Type methods
  // -----------------------------------------------
  def getType(): graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType] = js.native
  def hasField(fieldName: java.lang.String): scala.Boolean = js.native
  def isFieldNonNull(fieldName: java.lang.String): scala.Boolean = js.native
  // alias for isFieldNonNull
  def isRequired(fieldName: java.lang.String): scala.Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  // alias for makeFieldNullable
  def makeOptional(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeOptional(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  // alias for makeFieldNonNull
  def makeRequired(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeRequired(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeField(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setField(fieldName: java.lang.String, fieldConfig: ComposeInputFieldConfig): this.type = js.native
  def setFields(fields: ComposeInputFieldConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/InputTypeComposer", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[_] = js.native
  def create(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposerDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def createTemp(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposerDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
}

