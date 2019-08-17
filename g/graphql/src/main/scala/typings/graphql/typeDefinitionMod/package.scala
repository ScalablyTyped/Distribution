package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDefinitionMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
  import typings.graphql.languageAstMod.ValueNode
  import typings.graphql.tsutilsMaybeMod.Maybe

  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.graphql.typeDefinitionMod.GraphQLInterfaceType
    - typings.graphql.typeDefinitionMod.GraphQLUnionType
  */
  type GraphQLCompositeType = _GraphQLCompositeType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]])
  type GraphQLEnumValueConfigMap = StringDictionary[GraphQLEnumValueConfig]
  type GraphQLFieldConfigArgumentMap = StringDictionary[GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext, TArgs] = StringDictionary[GraphQLFieldConfig[TSource, TContext, TArgs]]
  type GraphQLFieldMap[TSource, TContext, TArgs] = StringDictionary[GraphQLField[TSource, TContext, TArgs]]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = StringDictionary[GraphQLInputFieldConfig]
  type GraphQLInputFieldMap = StringDictionary[GraphQLInputField]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLScalarType
    - typings.graphql.typeDefinitionMod.GraphQLEnumType
    - typings.graphql.typeDefinitionMod.GraphQLInputObjectType
    - typings.graphql.typeDefinitionMod.GraphQLList[js.Any]
    - typings.graphql.typeDefinitionMod.GraphQLNonNull[
  typings.graphql.typeDefinitionMod.GraphQLScalarType | typings.graphql.typeDefinitionMod.GraphQLEnumType | typings.graphql.typeDefinitionMod.GraphQLInputObjectType | typings.graphql.typeDefinitionMod.GraphQLList[js.Any]]
  */
  type GraphQLInputType = _GraphQLInputType | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]
  ])
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    PromiseOrValue[Boolean]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLScalarType
    - typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.graphql.typeDefinitionMod.GraphQLInterfaceType
    - typings.graphql.typeDefinitionMod.GraphQLUnionType
    - typings.graphql.typeDefinitionMod.GraphQLEnumType
    - typings.graphql.typeDefinitionMod.GraphQLInputObjectType
  */
  type GraphQLNamedType = _GraphQLNamedType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]])
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLScalarType
    - typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.graphql.typeDefinitionMod.GraphQLInterfaceType
    - typings.graphql.typeDefinitionMod.GraphQLUnionType
    - typings.graphql.typeDefinitionMod.GraphQLEnumType
    - typings.graphql.typeDefinitionMod.GraphQLInputObjectType
    - typings.graphql.typeDefinitionMod.GraphQLList[js.Any]
  */
  type GraphQLNullableType = _GraphQLNullableType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLList[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLScalarType
    - typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.graphql.typeDefinitionMod.GraphQLInterfaceType
    - typings.graphql.typeDefinitionMod.GraphQLUnionType
    - typings.graphql.typeDefinitionMod.GraphQLEnumType
    - typings.graphql.typeDefinitionMod.GraphQLList[js.Any]
    - typings.graphql.typeDefinitionMod.GraphQLNonNull[
  typings.graphql.typeDefinitionMod.GraphQLScalarType | (typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphql.typeDefinitionMod.GraphQLInterfaceType | typings.graphql.typeDefinitionMod.GraphQLUnionType | typings.graphql.typeDefinitionMod.GraphQLEnumType | typings.graphql.typeDefinitionMod.GraphQLList[js.Any]]
  */
  type GraphQLOutputType = _GraphQLOutputType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ ValueNode, 
    /* variables */ Maybe[StringDictionary[js.Any]], 
    Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, Maybe[TExternal]]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, Maybe[TInternal]]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.typeDefinitionMod.GraphQLScalarType
    - typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - typings.graphql.typeDefinitionMod.GraphQLInterfaceType
    - typings.graphql.typeDefinitionMod.GraphQLUnionType
    - typings.graphql.typeDefinitionMod.GraphQLEnumType
    - typings.graphql.typeDefinitionMod.GraphQLInputObjectType
    - typings.graphql.typeDefinitionMod.GraphQLList[js.Any]
    - typings.graphql.typeDefinitionMod.GraphQLNonNull[js.Any]
  */
  type GraphQLType = _GraphQLType | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext, TArgs] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    PromiseOrValue[Maybe[(GraphQLObjectType[TSource, TContext, TArgs]) | String]]
  ]
  type GraphQLWrappingType = GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
