package typings
package graphqlDashComposeLib.esmEnumTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/EnumTypeComposer", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmSchemaComposerMod._AnyComposeType[TContext]
     with graphqlDashComposeLib.esmSchemaComposerMod._AnyType[TContext]
     with graphqlDashComposeLib.esmObjectTypeComposerMod._ComposeOutputType[js.Any, TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLEnumTypeExtended = js.native
  var schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  /**
    * Add new fields or replace existed, other fields keep untouched.
    */
  def addFields(newValues: ComposeEnumValueConfigMap): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldExtensions(fieldName: java.lang.String): this.type = js.native
  def clone(newTypeName: java.lang.String): EnumTypeComposer[TContext] = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  /**
    * Mark value or map of values as deprecated
    */
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField(name: java.lang.String, partialValueConfig: stdLib.Partial[ComposeEnumValueConfig]): this.type = js.native
  def extendFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
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
    * -----------------------------------------------
    * Extensions methods
    * -----------------------------------------------
    */
  def getExtensions(): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getField(name: java.lang.String): ComposeEnumValueConfig = js.native
  def getFieldDirectiveById(fieldName: java.lang.String, idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveByName(fieldName: java.lang.String, directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveNames(fieldName: java.lang.String): js.Array[java.lang.String] = js.native
  def getFieldDirectives(fieldName: java.lang.String): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldExtensions(fieldName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  def getFields(): ComposeEnumValueConfigMap = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  /**
    * -----------------------------------------------
    * Value methods
    * -----------------------------------------------
    */
  /**
    * For similar naming with `ObjectTypeComposer` and `InputTypeComposer` for working with Enum values used methods with name `*field*` instead of `*value*`.
    */
  def hasField(name: java.lang.String): scala.Boolean = js.native
  def hasFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): scala.Boolean = js.native
  def merge(`type`: EnumTypeComposer[_]): this.type = js.native
  def merge(`type`: graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  /**
    * Remove one value by its name, or by array of field names.
    */
  def removeField(nameOrArray: java.lang.String): this.type = js.native
  def removeField(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  /**
    * Keep only provided fields in type, other fields will be removed.
    */
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField(name: java.lang.String, valueConfig: ComposeEnumValueConfig): this.type = js.native
  def setFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  /**
    * Completely replace all values in the type with a new set.
    */
  def setFields(values: ComposeEnumValueConfigMap): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/EnumTypeComposer", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

