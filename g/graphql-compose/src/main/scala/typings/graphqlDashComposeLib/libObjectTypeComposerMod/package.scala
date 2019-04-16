package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libObjectTypeComposerMod {
  type ArgsMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ComposeArgumentConfig = ComposeArgumentConfigAsObject | ComposeArgumentType | (js.Function0[ComposeArgumentConfigAsObject | ComposeArgumentType])
  type ComposeArgumentType = graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[js.Any] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[js.Any] | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[js.Any] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[js.Any]
  ])
  type ComposeFieldConfig[TSource, TContext, TArgs] = (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[js.Any, TContext]) | (graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[
    (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (ComposeOutputType[js.Any, TContext])
  ])
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ graphqlDashComposeLib.graphqlDashComposeLibStrings.ComposeFieldConfigArgumentMap with js.Any
  type ComposeFieldConfigMap[TSource, TContext] = graphqlDashComposeLib.libUtilsDefinitionsMod.ObjMap[ComposeFieldConfig[TSource, TContext, ArgsMap]]
  /* Rewritten from type alias, can be one of: 
    - graphqlLib.typeDefinitionMod.GraphQLOutputType
    - ObjectTypeComposer[TReturn, TContext]
    - graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - graphqlDashComposeLib.libTypeMapperMod.TypeAsString
    - graphqlDashComposeLib.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]
    - graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]
    - graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TReturn, TContext]
    - js.Array[
  graphqlLib.typeDefinitionMod.GraphQLOutputType | (ObjectTypeComposer[TReturn, TContext]) | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (graphqlDashComposeLib.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TReturn, TContext])]
  */
  type ComposeOutputType[TReturn, TContext] = (_ComposeOutputType[TReturn, TContext]) | (graphqlDashComposeLib.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (js.Array[
    graphqlLib.typeDefinitionMod.GraphQLOutputType | (ObjectTypeComposer[TReturn, TContext]) | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (graphqlDashComposeLib.libResolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TReturn, TContext])
  ]) | graphqlLib.typeDefinitionMod.GraphQLOutputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
  type GraphQLObjectTypeExtended[TSource, TContext] = (graphqlLib.graphqlMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) with (graphqlDashComposeLib.Anon_Description[TContext, TSource])
  type GraphqlFieldConfigExtended[TSource, TContext] = (graphqlLib.typeDefinitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[_]]) with graphqlDashComposeLib.Anon_Projection
  type ObjectTypeComposeDefinition[TSource, TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeObjectTypeConfig[TSource, TContext]) | (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  type RelationArgsMapper[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[js.Any] | (RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[js.Any]
  ]
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type RelationOpts[TRelationSource, TSource, TContext, TArgs] = (RelationOptsWithResolver[TRelationSource, TSource, TContext, TArgs]) | (RelationOptsWithFieldConfig[TSource, TContext, TArgs])
  type RelationOptsWithFieldConfig[TSource, TContext, TArgs] = (ComposeFieldConfigAsObject[TSource, TContext, TArgs]) with (graphqlDashComposeLib.Anon_Resolve[TSource, TContext, TArgs])
  type RelationThunkMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    graphqlDashComposeLib.libUtilsDefinitionsMod.Thunk[RelationOpts[TSource, TContext, ArgsMap, ArgsMap]]
  ]
}
