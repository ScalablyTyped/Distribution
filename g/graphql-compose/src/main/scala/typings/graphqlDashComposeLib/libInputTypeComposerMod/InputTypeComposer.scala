package typings
package graphqlDashComposeLib.libInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/InputTypeComposer", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.libSchemaComposerMod._AnyComposeType[TContext]
     with graphqlDashComposeLib.libSchemaComposerMod._AnyType[TContext] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLInputObjectTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newFields: ComposeInputFieldConfigMap): this.type = js.native
  /**
    * Add new fields or replace existed (where field name may have dots)
    */
  def addNestedFields(newFields: ComposeInputFieldConfigMap): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldExtensions(fieldName: java.lang.String): this.type = js.native
  def clone(newTypeName: java.lang.String): InputTypeComposer[TContext] = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField(fieldName: java.lang.String, partialFieldConfig: stdLib.Partial[ComposeInputFieldConfig]): this.type = js.native
  def extendFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  /**
    *  -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getDescription(): java.lang.String = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  /**
    *  -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = js.native
  def getField(fieldName: java.lang.String): ComposeInputFieldConfig = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def getFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldExtensions(fieldName: java.lang.String): graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFieldTC(fieldName: java.lang.String): InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getFieldType(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  /**
    * -----------------------------------------------
    * Field methods
    * -----------------------------------------------
    */
  def getFields(): ComposeInputFieldConfigMap = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  def hasField(fieldName: java.lang.String): scala.Boolean = js.native
  def hasFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): scala.Boolean = js.native
  def isFieldNonNull(fieldName: java.lang.String): scala.Boolean = js.native
  /**
    * An alias for `isFieldNonNull`
    */
  def isRequired(fieldName: java.lang.String): scala.Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  /**
    * An alias for `makeFieldNullable`
    */
  def makeOptional(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeOptional(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  /**
    * An alias for `makeFieldNonNull`
    */
  def makeRequired(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeRequired(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField(fieldName: java.lang.String, fieldConfig: ComposeInputFieldConfig): this.type = js.native
  def setFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions): this.type = js.native
  def setFields(fields: ComposeInputFieldConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/InputTypeComposer", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

