package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypeComposerMod {
  type ArgsType[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ argName in keyof T ]: T[argName]}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ArgsType with T
  type ComposeArgumentConfig = _ComposeArgumentConfig | (js.Function0[ComposeArgumentConfigAsObject | ComposeArgumentType]) | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer
  ]) | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type ComposeArgumentType = _ComposeArgumentType | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer
  ]) | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type ComposeFieldConfig[TSource, TContext, TArgs] = (_ComposeFieldConfig[TSource, TContext, TArgs]) | (graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
    (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[TSource, TContext, TArgs])
  ]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, js.Any]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any]) | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLOutputType | (TypeComposer[TSource, TContext]) | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any])
  ]) | graphqlLib.typeDefinitionMod.GraphQLOutputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/TypeComposer.ComposeArgumentConfig}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ComposeFieldConfigArgumentMap with js.Any
  type ComposeFieldConfigMap[TSource, TContext, TArgsMap] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ fieldName in keyof TArgsMap ]: graphql-compose.graphql-compose/lib/TypeComposer.ComposeFieldConfig<TSource, TContext, TArgsMap[fieldName]>}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ComposeFieldConfigMap with TArgsMap
  type ComposeOutputType[TSource, TContext, TArgs] = (_ComposeOutputType[TSource, TContext, TArgs]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, js.Any]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any]) | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLOutputType | (TypeComposer[TSource, TContext]) | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any])
  ]) | graphqlLib.typeDefinitionMod.GraphQLOutputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
  type GraphQLObjectTypeExtended[TSource, TContext] = (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) with (graphqlDashComposeLib.Anon_Description[TSource, TContext])
  type GraphqlFieldConfigExtended[TSource, TContext] = (graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) with graphqlDashComposeLib.Anon_ProjectionAny
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ js.Any, 
    /* args */ ArgsType[TArgs], 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type RelationOpts[TRelationSource, TSource, TContext, TArgs] = (RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]) | (RelationOptsWithFieldConfig[TSource, TContext, TArgs])
  type RelationOptsWithFieldConfig[TSource, TContext, TArgs] = (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) with (graphqlDashComposeLib.Anon_Args[TSource, TArgs, TContext])
  type TypeComposerDefinition[TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeObjectTypeConfig[js.Any, TContext]) | (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
}
