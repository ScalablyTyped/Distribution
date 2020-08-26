package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectTypeComposerMod {
  type ArgsMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ComposeArgumentConfig = typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType | (js.Function0[
    typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentConfigAsObject | typings.graphqlCompose.objectTypeComposerMod.ComposeArgumentType
  ])
  type ComposeArgumentType = typings.graphql.definitionMod.GraphQLInputType | typings.graphqlCompose.typeMapperMod.TypeAsString | typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | (js.Array[
    typings.graphql.definitionMod.GraphQLInputType | typings.graphqlCompose.typeMapperMod.TypeAsString | typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any]
  ])
  type ComposeFieldConfig[TSource, TContext, TArgs] = (typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typings.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext]) | (typings.graphqlCompose.definitionsMod.Thunk[
    (typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfigAsObject[TSource, TContext, TArgs]) | (typings.graphqlCompose.objectTypeComposerMod.ComposeOutputType[js.Any, TContext])
  ])
  type ComposeFieldConfigArgumentMap[TArgs] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ argName in keyof TArgs ]: graphql-compose.graphql-compose/lib/ObjectTypeComposer.ComposeArgumentConfig}
    */ typings.graphqlCompose.graphqlComposeStrings.ComposeFieldConfigArgumentMap with org.scalablytyped.runtime.TopLevel[js.Any]
  type ComposeFieldConfigMap[TSource, TContext] = typings.graphqlCompose.definitionsMod.ObjMap[
    typings.graphqlCompose.objectTypeComposerMod.ComposeFieldConfig[TSource, TContext, typings.graphqlCompose.objectTypeComposerMod.ArgsMap]
  ]
  type ComposeObjectType = (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, js.Any]) | (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any]) | typings.graphqlCompose.typeMapperMod.TypeDefinitionString | typings.graphqlCompose.typeMapperMod.TypeAsString
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLOutputType
    - typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]
    - typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typings.graphqlCompose.typeMapperMod.TypeAsString
    - typings.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]
    - typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]
    - typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext]
    - js.Array[
  typings.graphql.definitionMod.GraphQLOutputType | (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typings.graphqlCompose.typeMapperMod.TypeAsString | (typings.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])]
  */
  type ComposeOutputType[TReturn, TContext] = (typings.graphqlCompose.objectTypeComposerMod._ComposeOutputType[TReturn, TContext]) | (typings.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (js.Array[
    typings.graphql.definitionMod.GraphQLOutputType | (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[TReturn, TContext]) | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext] | typings.graphqlCompose.typeMapperMod.TypeAsString | (typings.graphqlCompose.resolverMod.Resolver[js.Any, TContext, js.Any, js.Any]) | (typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[TReturn, TContext]) | (typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[TReturn, TContext])
  ]) | typings.graphql.definitionMod.GraphQLOutputType | typings.graphqlCompose.typeMapperMod.TypeAsString
  type GetRecordIdFn[TSource, TContext] = js.Function3[/* source */ TSource, /* args */ js.Any, /* context */ TContext, java.lang.String]
  type ObjectTypeComposeDefinition[TSource, TContext] = typings.graphqlCompose.typeMapperMod.TypeAsString | (typings.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig[TSource, TContext]) | (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any])
  type RelationArgsMapper[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[js.Any] | (typings.graphqlCompose.objectTypeComposerMod.RelationArgsMapperFn[TSource, TContext, TArgs]) | scala.Null | scala.Unit | java.lang.String | scala.Double | js.Array[js.Any]
  ]
  type RelationArgsMapperFn[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type RelationThunkMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typings.graphqlCompose.definitionsMod.Thunk[
      typings.graphqlCompose.objectTypeComposerMod.RelationOpts[
        TSource, 
        TContext, 
        typings.graphqlCompose.objectTypeComposerMod.ArgsMap, 
        typings.graphqlCompose.objectTypeComposerMod.ArgsMap
      ]
    ]
  ]
}
