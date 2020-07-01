package typings.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type AbstractTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type AbstractTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type ArgumentMapper = js.Function4[
    /* argumentConfig */ typings.graphql.definitionMod.GraphQLArgumentConfig, 
    /* fieldName */ java.lang.String, 
    /* typeName */ java.lang.String, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typings.graphql.definitionMod.GraphQLArgumentConfig | (js.Tuple2[java.lang.String, typings.graphql.definitionMod.GraphQLArgumentConfig]) | scala.Null
    ]
  ]
  type CompositeTypeMapper = js.Function2[
    /* type */ (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type CompositeTypeVisitor = js.Function2[
    /* type */ (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLUnionType | scala.Null
    ]
  ]
  type DirectiveMapper = js.Function2[
    /* directive */ typings.graphql.mod.GraphQLDirective, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLDirective | scala.Null]
  ]
  type DirectiveResolverFn[TSource, TContext] = js.Function5[
    /* next */ typings.graphqlToolsUtils.interfacesMod.NextResolverFn, 
    /* source */ TSource, 
    /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type EnumTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLEnumType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLEnumType | scala.Null]
  ]
  type EnumTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLEnumType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLEnumType | scala.Null]
  ]
  type EnumValueMapper = js.Function3[
    /* value */ typings.graphql.definitionMod.GraphQLEnumValueConfig, 
    /* typeName */ java.lang.String, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      typings.graphql.definitionMod.GraphQLEnumValueConfig | (js.Tuple2[java.lang.String, typings.graphql.definitionMod.GraphQLEnumValueConfig]) | scala.Null
    ]
  ]
  type FieldFilter = js.Function3[
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    /* fieldConfig */ js.UndefOr[
      typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    scala.Boolean
  ]
  type FieldMapper = typings.graphqlToolsUtils.interfacesMod.GenericFieldMapper[
    typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type FieldNodeMapper = js.Function2[
    /* fieldNode */ typings.graphql.astMod.FieldNode, 
    /* fragments */ typings.std.Record[java.lang.String, typings.graphql.astMod.FragmentDefinitionNode], 
    typings.graphql.astMod.SelectionNode | js.Array[typings.graphql.astMod.SelectionNode]
  ]
  type FieldNodeMappers = typings.std.Record[
    java.lang.String, 
    typings.std.Record[java.lang.String, typings.graphqlToolsUtils.interfacesMod.FieldNodeMapper]
  ]
  type GenericFieldMapper[F /* <: (typings.graphql.definitionMod.GraphQLFieldConfig[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | typings.graphql.definitionMod.GraphQLInputFieldConfig */] = js.Function4[
    /* fieldConfig */ F, 
    /* fieldName */ java.lang.String, 
    /* typeName */ java.lang.String, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[F | (js.Tuple2[java.lang.String, F]) | scala.Null]
  ]
  type IDefaultValueIteratorFn = js.Function2[
    /* type */ typings.graphql.definitionMod.GraphQLInputType, 
    /* value */ js.Any, 
    scala.Unit
  ]
  type IDirectiveResolvers[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[typings.graphqlToolsUtils.interfacesMod.DirectiveResolverFn[TSource, TContext]]
  type IEnumTypeResolver = (typings.std.Record[java.lang.String, _]) with typings.graphqlToolsUtils.anon.AstNode
  type IFieldIteratorFn = js.Function3[
    /* fieldDef */ typings.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    scala.Unit
  ]
  type IFieldResolver[TSource, TContext, TArgs, TReturn] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    TReturn
  ]
  type IResolvers[TSource, TContext, TArgs, TReturn] = typings.std.Record[
    java.lang.String, 
    (typings.graphqlToolsUtils.interfacesMod.ISchemaLevelResolver[TSource, TContext, TArgs, TReturn]) | (typings.graphqlToolsUtils.interfacesMod.IObjectTypeResolver[TSource, TContext, js.Any]) | (typings.graphqlToolsUtils.interfacesMod.IInterfaceTypeResolver[TSource, TContext, js.Any]) | typings.graphqlToolsUtils.interfacesMod.IUnionTypeResolver | typings.graphqlToolsUtils.interfacesMod.IScalarTypeResolver | typings.graphqlToolsUtils.interfacesMod.IEnumTypeResolver | typings.graphqlToolsUtils.interfacesMod.IInputObjectTypeResolver
  ]
  type ISchemaLevelResolver[TSource, TContext, TArgs, TReturn] = typings.graphqlToolsUtils.interfacesMod.IFieldResolver[TSource, TContext, TArgs, TReturn]
  type ITypeDefinitions = typings.graphqlToolsUtils.interfacesMod.ITypedef | js.Array[typings.graphqlToolsUtils.interfacesMod.ITypedef]
  type ITypedef = (js.Function0[
    js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @graphql-tools/utils.@graphql-tools/utils/Interfaces.ITypedef */ js.Object
    ]
  ]) | java.lang.String | typings.graphql.astMod.DocumentNode
  type InputFieldFilter = js.Function3[
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    /* inputFieldConfig */ js.UndefOr[typings.graphql.definitionMod.GraphQLInputFieldConfig], 
    scala.Boolean
  ]
  type InputFieldMapper = typings.graphqlToolsUtils.interfacesMod.GenericFieldMapper[typings.graphql.definitionMod.GraphQLInputFieldConfig]
  type InputObjectTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInputObjectType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLInputObjectType | scala.Null]
  ]
  type InputObjectTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInputObjectType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLInputObjectType | scala.Null]
  ]
  type InterfaceTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInterfaceType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLInterfaceType | scala.Null]
  ]
  type InterfaceTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLInterfaceType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLInterfaceType | scala.Null]
  ]
  type NamedTypeMapper = js.Function2[
    /* type */ typings.graphql.definitionMod.GraphQLNamedType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.definitionMod.GraphQLNamedType | scala.Null]
  ]
  type NamedTypeVisitor = js.Function2[
    /* type */ typings.graphql.definitionMod.GraphQLNamedType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.definitionMod.GraphQLNamedType | scala.Null]
  ]
  type NextResolverFn = js.Function0[js.Promise[js.Any]]
  type ObjectTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | scala.Null
    ]
  ]
  type ObjectTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[
      (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | scala.Null
    ]
  ]
  type RequestTransform = js.Function3[
    /* originalRequest */ typings.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typings.std.Record[java.lang.String, js.Any]], 
    /* transformationContext */ js.UndefOr[typings.std.Record[java.lang.String, js.Any]], 
    typings.graphqlToolsUtils.interfacesMod.Request
  ]
  type Result = typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]]
  type ResultTransform = js.Function3[
    /* originalResult */ typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]], 
    /* delegationContext */ js.UndefOr[typings.std.Record[java.lang.String, js.Any]], 
    /* transformationContext */ js.UndefOr[typings.std.Record[java.lang.String, js.Any]], 
    typings.graphqlToolsUtils.interfacesMod.ExecutionResult[typings.std.Record[java.lang.String, js.Any]]
  ]
  type RootFieldFilter = js.Function3[
    /* operation */ js.UndefOr[
      typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Query | typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Mutation | typings.graphqlToolsUtils.graphqlToolsUtilsStrings.Subscription
    ], 
    /* rootFieldName */ js.UndefOr[java.lang.String], 
    /* fieldConfig */ js.UndefOr[
      typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    scala.Boolean
  ]
  type ScalarTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLScalarType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLScalarType | scala.Null]
  ]
  type ScalarTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLScalarType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLScalarType | scala.Null]
  ]
  type SchemaTransform = js.Function1[
    /* originalSchema */ typings.graphql.mod.GraphQLSchema, 
    typings.graphql.mod.GraphQLSchema
  ]
  type TypeMap = typings.std.Record[java.lang.String, typings.graphql.definitionMod.GraphQLNamedType]
  type UnionTypeMapper = js.Function2[
    /* type */ typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLUnionType | scala.Null]
  ]
  type UnionTypeVisitor = js.Function2[
    /* type */ typings.graphql.mod.GraphQLUnionType, 
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    js.UndefOr[typings.graphql.mod.GraphQLUnionType | scala.Null]
  ]
  type VisitableSchemaType = typings.graphql.mod.GraphQLSchema | (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphql.mod.GraphQLInputObjectType | typings.graphql.definitionMod.GraphQLNamedType | typings.graphql.mod.GraphQLScalarType | (typings.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.definitionMod.GraphQLInputField | typings.graphql.definitionMod.GraphQLArgument | typings.graphql.mod.GraphQLUnionType | typings.graphql.mod.GraphQLEnumType | typings.graphql.definitionMod.GraphQLEnumValue
  type VisitorSelector = js.Function2[
    /* type */ typings.graphqlToolsUtils.interfacesMod.VisitableSchemaType, 
    /* methodName */ java.lang.String, 
    js.Array[
      typings.graphqlToolsUtils.schemaVisitorMod.SchemaVisitor | typings.graphqlToolsUtils.interfacesMod.SchemaVisitorMap
    ]
  ]
}
