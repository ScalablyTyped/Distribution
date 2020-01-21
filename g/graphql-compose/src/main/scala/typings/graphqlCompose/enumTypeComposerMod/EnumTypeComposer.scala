package typings.graphqlCompose.enumTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLNonNull
import typings.graphqlCompose.definitionsMod.DirectiveArgs
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.ExtensionsDirective
import typings.graphqlCompose.graphqlMod.GraphQLEnumType
import typings.graphqlCompose.objectTypeComposerMod._ComposeOutputType
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import typings.graphqlCompose.schemaComposerMod._AnyComposeType
import typings.graphqlCompose.schemaComposerMod._AnyType
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/EnumTypeComposer", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends _AnyComposeType[TContext]
     with _AnyType[TContext]
     with _ComposeOutputType[js.Any, TContext] {
  def this(gqType: GraphQLEnumType, schemaComposer: SchemaComposer[TContext]) = this()
  var gqType: GraphQLEnumTypeExtended = js.native
  var schemaComposer: SchemaComposer[TContext] = js.native
  /**
    * Add new fields or replace existed, other fields keep untouched.
    */
  def addFields(newValues: ComposeEnumValueConfigMap): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldExtensions(fieldName: String): this.type = js.native
  def clone(newTypeName: String): EnumTypeComposer[TContext] = js.native
  def deprecateFields(fields: String): this.type = js.native
  def deprecateFields(fields: js.Array[String]): this.type = js.native
  /**
    * Mark value or map of values as deprecated
    */
  def deprecateFields(fields: StringDictionary[String]): this.type = js.native
  def extendExtensions(extensions: Extensions): this.type = js.native
  def extendField(name: String, partialValueConfig: Partial[ComposeEnumValueConfig]): this.type = js.native
  def extendFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  def getDescription(): String = js.native
  def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
  def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
  def getDirectiveNames(): js.Array[String] = js.native
  /**
    * -----------------------------------------------
    * Directive methods
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
  def getField(name: String): ComposeEnumValueConfig = js.native
  def getFieldDirectiveById(fieldName: String, idx: Double): DirectiveArgs | Unit = js.native
  def getFieldDirectiveByName(fieldName: String, directiveName: String): DirectiveArgs | Unit = js.native
  def getFieldDirectiveNames(fieldName: String): js.Array[String] = js.native
  def getFieldDirectives(fieldName: String): js.Array[ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: String, extensionName: String): js.Any = js.native
  def getFieldExtensions(fieldName: String): Extensions = js.native
  def getFieldNames(): js.Array[String] = js.native
  def getFields(): ComposeEnumValueConfigMap = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): GraphQLEnumType = js.native
  def getTypeName(): String = js.native
  def getTypeNonNull(): GraphQLNonNull[GraphQLEnumType] = js.native
  def getTypePlural(): GraphQLList[GraphQLEnumType] = js.native
  def hasExtension(extensionName: String): Boolean = js.native
  /**
    * -----------------------------------------------
    * Value methods
    * -----------------------------------------------
    */
  /**
    * For similar naming with `ObjectTypeComposer` and `InputTypeComposer` for working with Enum values used methods with name `*field*` instead of `*value*`.
    */
  def hasField(name: String): Boolean = js.native
  def hasFieldExtension(fieldName: String, extensionName: String): Boolean = js.native
  def merge(`type`: EnumTypeComposer[_]): this.type = js.native
  def merge(`type`: GraphQLEnumType): this.type = js.native
  def removeExtension(extensionName: String): this.type = js.native
  /**
    * Remove one value by its name, or by array of field names.
    */
  def removeField(nameOrArray: String): this.type = js.native
  def removeField(nameOrArray: js.Array[String]): this.type = js.native
  def removeFieldExtension(fieldName: String, extensionName: String): this.type = js.native
  /**
    * Keep only provided fields in type, other fields will be removed.
    */
  def removeOtherFields(fieldNameOrArray: String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[String]): this.type = js.native
  def reorderFields(names: js.Array[String]): this.type = js.native
  def setDescription(description: String): this.type = js.native
  def setExtension(extensionName: String, value: js.Any): this.type = js.native
  def setExtensions(extensions: Extensions): this.type = js.native
  def setField(name: String, valueConfig: ComposeEnumValueConfig): this.type = js.native
  def setFieldExtension(fieldName: String, extensionName: String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: String, extensions: Extensions): this.type = js.native
  /**
    * Completely replace all values in the type with a new set.
    */
  def setFields(values: ComposeEnumValueConfigMap): this.type = js.native
  def setTypeName(name: String): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/lib/EnumTypeComposer", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): EnumTypeComposer[TCtx] = js.native
}

