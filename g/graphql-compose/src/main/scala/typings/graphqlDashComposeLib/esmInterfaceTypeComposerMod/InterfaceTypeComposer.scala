package typings
package graphqlDashComposeLib.esmInterfaceTypeComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.esmObjectTypeComposerMod._ComposeOutputType[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLInterfaceType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
  var gqType: GraphQLInterfaceTypeExtended[TSource, TContext] = js.native
  var sc: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext] = js.native
  def addFieldArgs(
    fieldName: java.lang.String,
    newArgs: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
  ): this.type = js.native
  /**
    * Add new fields or replace existed in a GraphQL type
    */
  def addFields(newValues: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def addTypeResolver[TSrc](
    `type`: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSrc, TContext],
    checkFn: InterfaceTypeResolverCheckFn[TSrc, TContext]
  ): this.type = js.native
  def addTypeResolver[TSrc](
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    checkFn: InterfaceTypeResolverCheckFn[TSrc, TContext]
  ): this.type = js.native
  def clearExtensions(): this.type = js.native
  def clearFieldArgExtensions(fieldName: java.lang.String, argName: java.lang.String): this.type = js.native
  def clearFieldExtensions(fieldName: java.lang.String): this.type = js.native
  def clone(newTypeName: java.lang.String): this.type = js.native
  def deprecateFields(fields: java.lang.String): this.type = js.native
  def deprecateFields(fields: js.Array[java.lang.String]): this.type = js.native
  def deprecateFields(fields: org.scalablytyped.runtime.StringDictionary[java.lang.String]): this.type = js.native
  def extendExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def extendField(
    fieldName: java.lang.String,
    partialFieldConfig: stdLib.Partial[
      graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap]
    ]
  ): this.type = js.native
  def extendFieldArgExtensions(
    fieldName: java.lang.String,
    argName: java.lang.String,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions
  ): this.type = js.native
  def extendFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  /**
    * -----------------------------------------------
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
  def getField(name: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap] = js.native
  def getFieldArg(fieldName: java.lang.String, argName: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfigAsObject = js.native
  def getFieldArgDirectiveById(fieldName: java.lang.String, argName: java.lang.String, idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldArgDirectiveByName(fieldName: java.lang.String, argName: java.lang.String, directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldArgDirectiveNames(fieldName: java.lang.String, argName: java.lang.String): js.Array[java.lang.String] = js.native
  def getFieldArgDirectives(fieldName: java.lang.String, argName: java.lang.String): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getFieldArgExtension(fieldName: java.lang.String, argName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldArgExtensions(fieldName: java.lang.String, argName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  /**
    * Alias for `getFieldArgTC()` but returns statically checked InputTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldArgITC(fieldName: java.lang.String, argName: java.lang.String): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getFieldArgTC(fieldName: java.lang.String, argName: java.lang.String): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getFieldArgType(fieldName: java.lang.String, argName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def getFieldArgs[TArgs](fieldName: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[TArgs] = js.native
  def getFieldConfig(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getFieldDirectiveById(fieldName: java.lang.String, idx: scala.Double): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveByName(fieldName: java.lang.String, directiveName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.DirectiveArgs | scala.Unit = js.native
  def getFieldDirectiveNames(fieldName: java.lang.String): js.Array[java.lang.String] = js.native
  def getFieldDirectives(fieldName: java.lang.String): js.Array[graphqlDashComposeLib.esmUtilsDefinitionsMod.ExtensionsDirective] = js.native
  def getFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): js.Any = js.native
  def getFieldExtensions(fieldName: java.lang.String): graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = js.native
  def getFieldNames(): js.Array[java.lang.String] = js.native
  /**
    * Alias for `getFieldTC()` but returns statically checked ObjectTypeComposer.
    * If field have other type then error will be thrown.
    */
  def getFieldOTC(fieldName: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getFieldTC(fieldName: java.lang.String): (graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext]) | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] | (InterfaceTypeComposer[TSource, TContext]) | (graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext]) | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getFieldType(fieldName: java.lang.String): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def getFields(): graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext] = js.native
  /**
    * An alias for `getInputTypeComposer`
    */
  def getITC(): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  /**
    * -----------------------------------------------
    * InputType methods
    * -----------------------------------------------
    */
  def getInputType(): graphqlLib.graphqlMod.GraphQLInputObjectType = js.native
  def getInputTypeComposer(): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  /**
    * -----------------------------------------------
    * ResolveType methods
    * -----------------------------------------------
    */
  def getResolveType(): (graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Null | scala.Unit = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def getType(): graphqlLib.graphqlMod.GraphQLInterfaceType = js.native
  def getTypeName(): java.lang.String = js.native
  def getTypeNonNull(): graphqlLib.typeDefinitionMod.GraphQLNonNull[graphqlLib.graphqlMod.GraphQLInterfaceType] = js.native
  def getTypePlural(): graphqlLib.typeDefinitionMod.GraphQLList[graphqlLib.graphqlMod.GraphQLInterfaceType] = js.native
  def getTypeResolverCheckFn(`type`: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): InterfaceTypeResolverCheckFn[TSource, TContext] = js.native
  def getTypeResolverCheckFn(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): InterfaceTypeResolverCheckFn[TSource, TContext] = js.native
  def getTypeResolverNames(): js.Array[java.lang.String] = js.native
  def getTypeResolverTypes(): js.Array[
    graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def getTypeResolvers(): InterfaceTypeResolversMap[TContext] = js.native
  def hasExtension(extensionName: java.lang.String): scala.Boolean = js.native
  /**
    * -----------------------------------------------
    * Field methods
    * -----------------------------------------------
    */
  def hasField(name: java.lang.String): scala.Boolean = js.native
  def hasFieldArg(fieldName: java.lang.String, argName: java.lang.String): scala.Boolean = js.native
  def hasFieldArgExtension(fieldName: java.lang.String, argName: java.lang.String, extensionName: java.lang.String): scala.Boolean = js.native
  def hasFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): scala.Boolean = js.native
  def hasInputTypeComposer(): scala.Boolean = js.native
  def hasTypeResolver(`type`: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): scala.Boolean = js.native
  def hasTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Boolean = js.native
  def isFieldNonNull(fieldName: java.lang.String): scala.Boolean = js.native
  def makeFieldNonNull(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNonNull(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: java.lang.String): this.type = js.native
  def makeFieldNullable(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeExtension(extensionName: java.lang.String): this.type = js.native
  def removeField(nameOrArray: java.lang.String): this.type = js.native
  def removeField(nameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeFieldArgExtension(fieldName: java.lang.String, argName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  def removeFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String): this.type = js.native
  def removeInputTypeComposer(): this.type = js.native
  def removeOtherFields(fieldNameOrArray: java.lang.String): this.type = js.native
  def removeOtherFields(fieldNameOrArray: js.Array[java.lang.String]): this.type = js.native
  def removeTypeResolver(`type`: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]): this.type = js.native
  def removeTypeResolver(
    `type`: graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def reorderFields(names: js.Array[java.lang.String]): this.type = js.native
  def setDescription(description: java.lang.String): this.type = js.native
  def setExtension(extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setExtensions(extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setField(
    name: java.lang.String,
    fieldConfig: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfig[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap]
  ): this.type = js.native
  def setFieldArg(
    fieldName: java.lang.String,
    argName: java.lang.String,
    argConfig: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeArgumentConfig
  ): this.type = js.native
  def setFieldArgExtension(
    fieldName: java.lang.String,
    argName: java.lang.String,
    extensionName: java.lang.String,
    value: js.Any
  ): this.type = js.native
  def setFieldArgExtensions(
    fieldName: java.lang.String,
    argName: java.lang.String,
    extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions
  ): this.type = js.native
  def setFieldArgs(
    fieldName: java.lang.String,
    args: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigArgumentMap[_]
  ): this.type = js.native
  def setFieldExtension(fieldName: java.lang.String, extensionName: java.lang.String, value: js.Any): this.type = js.native
  def setFieldExtensions(fieldName: java.lang.String, extensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions): this.type = js.native
  def setFields(fields: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]): this.type = js.native
  def setInputTypeComposer(itc: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext]): this.type = js.native
  def setResolveType(): this.type = js.native
  def setResolveType(
    fn: graphqlLib.typeDefinitionMod.GraphQLTypeResolver[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]
  ): this.type = js.native
  def setResolveType(fn: scala.Unit): this.type = js.native
  def setTypeName(name: java.lang.String): this.type = js.native
  def setTypeResolvers(typeResolversMap: InterfaceTypeResolversMap[TContext]): this.type = js.native
}

/* static members */
@JSImport("graphql-compose/esm/InterfaceTypeComposer", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

