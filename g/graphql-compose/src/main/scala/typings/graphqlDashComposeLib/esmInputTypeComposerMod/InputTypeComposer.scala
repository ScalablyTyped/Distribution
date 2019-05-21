package typings
package graphqlDashComposeLib.esmInputTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/InputTypeComposer", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmSchemaComposerMod._AnyComposeType[TContext]
     with graphqlDashComposeLib.esmSchemaComposerMod._AnyType[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLInputObjectTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
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
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField(fieldName: java.lang.String, partialFieldConfig: stdLib.Partial[ComposeInputFieldConfig]): this.type = js.native
  def extendFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  /**
    *  -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def get(path: java.lang.String): js.Any = js.native
  def get(path: js.Array[java.lang.String]): js.Any = js.native
  def getDescription(): java.lang.String = js.native
  def getDirectiveById(idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveByName(directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getDirectiveNames(): js.Array[java.lang.String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    *
    * Directive methods are usefull if you declare your schemas via SDL.
    * Users who actively use `graphql-tools` can open new abilities for writing
    * your own directive handlers.
    *
    * If you create your schemas via config objects, then probably you
    * no need in `directives`. Instead directives better to use `extensions`.
    * -----------------------------------------------
    */
  def getDirectives(): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getExtension(extensionName: java.lang.String): js.Any = js.native
  /**
    * -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getField(fieldName: java.lang.String): ComposeInputFieldConfigAsObject = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputFieldConfig = js.native
  def getFieldDirectiveById(fieldName: java.lang.String, idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveByName(fieldName: java.lang.String, directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveNames(fieldName: java.lang.String): js.Array[java.lang.String] = js.native
  def getFieldDirectives(fieldName: java.lang.String): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldExtensions(fieldName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  /**
    * Alias for `getFieldTC()` but returns statically checked InputTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldITC(fieldName: java.lang.String): InputTypeComposer[TContext] = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFieldTC(fieldName: java.lang.String): InputTypeComposer[TContext] | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
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
  def getType(): graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType] = js.native
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
  def merge(`type`: graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType): this.type = js.native
  def merge(`type`: InputTypeComposer[_]): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField(fieldName: java.lang.String, fieldConfig: ComposeInputFieldConfig): this.type = js.native
  def setFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setFields(fields: ComposeInputFieldConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/InputTypeComposer", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

