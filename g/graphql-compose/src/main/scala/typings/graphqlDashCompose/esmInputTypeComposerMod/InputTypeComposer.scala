package typings.graphqlDashCompose.esmInputTypeComposerMod

import typings.graphql.typeDefinitionMod.GraphQLInputFieldConfig
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLList
import typings.graphql.typeDefinitionMod.GraphQLNonNull
import typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer
import typings.graphqlDashCompose.esmGraphqlMod.GraphQLInputObjectType
import typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer
import typings.graphqlDashCompose.esmSchemaComposerMod._AnyComposeType
import typings.graphqlDashCompose.esmSchemaComposerMod._AnyType
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.DirectiveArgs
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.ExtensionsDirective
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/InputTypeComposer", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends _AnyComposeType[TContext]
     with _AnyType[TContext] {
  def this(gqType: GraphQLInputObjectType, schemaComposer: SchemaComposer[TContext]) = this()
  var gqType: GraphQLInputObjectTypeExtended = js.native
  var schemaComposer: SchemaComposer[TContext] = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newFields: ComposeInputFieldConfigMap): this.type = js.native
  /**
    * Add new fields or replace existed (where field name may have dots)
    */
  def addNestedFields(newFields: ComposeInputFieldConfigMap): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldExtensions(fieldName: String): this.type = js.native
  def clone(newTypeName: String): InputTypeComposer[TContext] = js.native
  def extendExtensions(extensions: Extensions): this.type = js.native
  def extendField(fieldName: String, partialFieldConfig: Partial[ComposeInputFieldConfig]): this.type = js.native
  def extendFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  /**
    *  -----------------------------------------------
    * Misc methods
    * -----------------------------------------------
    */
  def get(path: String): js.Any = js.native
  def get(path: js.Array[String]): js.Any = js.native
  def getDescription(): String = js.native
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  def getDirectiveNames(): js.Array[String] = js.native
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
  def getDirectives(): js.Array[ExtensionsDirective] = js.native
  def getExtension(extensionName: String): js.Any = js.native
  /**
    * -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): Extensions = js.native
  def getField(fieldName: String): ComposeInputFieldConfigAsObject = js.native
  def getFieldConfig(fieldName: String): GraphQLInputFieldConfig = js.native
  def getFieldDirectiveById(fieldName: String, idx: Double): DirectiveArgs | Unit = js.native
  def getFieldDirectiveByName(fieldName: String, directiveName: String): DirectiveArgs | Unit = js.native
  def getFieldDirectiveNames(fieldName: String): js.Array[String] = js.native
  def getFieldDirectives(fieldName: String): js.Array[ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: String, extensionName: String): js.Any = js.native
  def getFieldExtensions(fieldName: String): Extensions = js.native
  /**
    * Alias for `getFieldTC()` but returns statically checked InputTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldITC(fieldName: String): InputTypeComposer[TContext] = js.native
  def getFieldNames(): js.Array[String] = js.native
  def getFieldTC(fieldName: String): InputTypeComposer[TContext] | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] = js.native
  def getFieldType(fieldName: String): GraphQLInputType = js.native
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
  def getType(): GraphQLInputObjectType = js.native
  def getTypeName(): String = js.native
  def getTypeNonNull(): GraphQLNonNull[GraphQLInputObjectType] = js.native
  def getTypePlural(): GraphQLList[GraphQLInputObjectType] = js.native
  def hasExtension(extensionName: String): Boolean = js.native
  def hasField(fieldName: String): Boolean = js.native
  def hasFieldExtension(fieldName: String, extensionName: String): Boolean = js.native
  def isFieldNonNull(fieldName: String): Boolean = js.native
  /**
    * An alias for `isFieldNonNull`
    */
  def isRequired(fieldName: String): Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[String]): this.type = js.native
  /**
    * An alias for `makeFieldNullable`
    */
  def makeOptional(fieldNameOrArray: String): this.type = js.native
  def makeOptional(fieldNameOrArray: js.Array[String]): this.type = js.native
  /**
    * An alias for `makeFieldNonNull`
    */
  def makeRequired(fieldNameOrArray: String): this.type = js.native
  def makeRequired(fieldNameOrArray: js.Array[String]): this.type = js.native
  def merge(`type`: GraphQLInputObjectType): this.type = js.native
  def merge(`type`: InputTypeComposer[_]): this.type = js.native
  def removeExtension(extensionName: String): this.type = js.native
  def removeField(fieldNameOrArray: String): this.type = js.native
  def removeField(fieldNameOrArray: js.Array[String]): this.type = js.native
  def removeFieldExtension(fieldName: String, extensionName: String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[String]): this.type = js.native
  def reorderFields(names: js.Array[String]): this.type = js.native
  def setDescription(description: String): this.type = js.native
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  def setExtensions(extensions: Extensions): this.type = js.native
  def setField(fieldName: String, fieldConfig: ComposeInputFieldConfig): this.type = js.native
  def setFieldExtension(fieldName: String, extensionName: String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  def setFields(fields: ComposeInputFieldConfigMap): this.type = js.native
  def setTypeName(name: String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/InputTypeComposer", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](typeDef: InputTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition): InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): InputTypeComposer[TCtx] = js.native
}

