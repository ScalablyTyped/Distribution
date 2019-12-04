package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObjectTypeComposerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.graphqlMod.GraphQLObjectType
  import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
  import typings.graphql.typeDefinitionMod.GraphQLInputType
  import typings.graphql.typeDefinitionMod.GraphQLOutputType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphqlDashCompose.Anon_Description
  import typings.graphqlDashCompose.Anon_Projection
  import typings.graphqlDashCompose.Anon_Resolve
  import typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer
  import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
  import typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer
  import typings.graphqlDashCompose.libResolverMod.Resolver
  import typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer
  import typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typings.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
  import typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer
  import typings.graphqlDashCompose.libUtilsDefinitionsMod.ObjMap
  import typings.graphqlDashCompose.libUtilsDefinitionsMod.Thunk

  type ArgsMap = StringDictionary[js.Any]
  type ComposeArgumentConfig = ComposeArgumentConfigAsObject | ComposeArgumentType | (js.Function0[ComposeArgumentConfigAsObject | ComposeArgumentType])
  type ComposeArgumentType = GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | (js.Array[
    GraphQLInputType | TypeAsString | InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any]
  ])
  type ComposeFieldConfig[TSource, TContext, TArgs] = (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[js.Any, TContext]) | (Thunk[
    (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[js.Any, TContext])
  ])
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ typings.graphqlDashCompose.graphqlDashComposeStrings.ComposeFieldConfigArgumentMap with js.Any
  type ComposeFieldConfigMap[TSource, TContext] = ObjMap[ComposeFieldConfig[TSource, TContext, ArgsMap]]
  type ComposeObjectType = (ObjectTypeComposer[js.Any, js.Any]) | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | TypeDefinitionString | TypeAsString
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLOutputType
    - typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]
    - typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]
    - typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]
    - typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TReturn, TContext]
    - js.Array[
  typings.graphql.typeDefinitionMod.GraphQLOutputType | (typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext] | typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TContext] | typings.graphqlDashCompose.libTypeMapperMod.TypeAsString | (typings.graphqlDashCompose.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TReturn, TContext])]
  */
  type ComposeOutputType[TReturn, TContext] = (_ComposeOutputType[TReturn, TContext]) | (Resolver[js.Any, TContext, js.Any, js.Any]) | (js.Array[
    GraphQLOutputType | (ObjectTypeComposer[TReturn, TContext]) | EnumTypeComposer[TContext] | ScalarTypeComposer[TContext] | TypeAsString | (Resolver[js.Any, TContext, js.Any, js.Any]) | (InterfaceTypeComposer[TReturn, TContext]) | (UnionTypeComposer[TReturn, TContext])
  ]) | GraphQLOutputType | TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, String]
  type GraphQLObjectTypeExtended[TSource, TContext] = (GraphQLObjectType[_, _, StringDictionary[_]]) with (Anon_Description[TContext, TSource])
  type GraphqlFieldConfigExtended[TSource, TContext] = (GraphQLFieldConfig[TSource, TContext, StringDictionary[_]]) with Anon_Projection
  type ObjectTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeObjectTypeConfig[TSource, TContext]) | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]])
  type RelationArgsMapper[TSource, TContext, TArgs] = StringDictionary[
    StringDictionary[js.Any] | (RelationArgsMapperFn[TSource, TContext, TArgs]) | Null | Unit | String | Double | js.Array[js.Any]
  ]
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type RelationOpts[TRelationSource, TSource, TContext, TArgs] = (RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]) | (RelationOptsWithFieldConfig[TSource, TContext, TArgs])
  type RelationOptsWithFieldConfig[TSource, TContext, TArgs] = (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) with (Anon_Resolve[TSource, TContext, TArgs])
  type RelationThunkMap[TSource, TContext] = StringDictionary[Thunk[RelationOpts[TSource, TContext, ArgsMap, ArgsMap]]]
}
