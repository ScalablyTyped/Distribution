package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDefinitionMod {
  /* Rewritten from type alias, can be one of: 
    - GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - GraphQLInterfaceType
    - GraphQLUnionType
  */
  type GraphQLCompositeType = _GraphQLCompositeType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[GraphQLEnumValueConfig]
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[GraphQLFieldConfig[TSource, TContext, TArgs]]
  type GraphQLFieldMap[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[GraphQLField[TSource, TContext, TArgs]]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = org.scalablytyped.runtime.StringDictionary[GraphQLInputFieldConfig]
  type GraphQLInputFieldMap = org.scalablytyped.runtime.StringDictionary[GraphQLInputField]
  /* Rewritten from type alias, can be one of: 
    - GraphQLScalarType
    - GraphQLEnumType
    - GraphQLInputObjectType
    - GraphQLList[js.Any]
    - GraphQLNonNull[
  GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]]
  */
  type GraphQLInputType = _GraphQLInputType | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]
  ])
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[scala.Boolean]
  ]
  /* Rewritten from type alias, can be one of: 
    - GraphQLScalarType
    - GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - GraphQLInterfaceType
    - GraphQLUnionType
    - GraphQLEnumType
    - GraphQLInputObjectType
  */
  type GraphQLNamedType = _GraphQLNamedType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]])
  /* Rewritten from type alias, can be one of: 
    - GraphQLScalarType
    - GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - GraphQLInterfaceType
    - GraphQLUnionType
    - GraphQLEnumType
    - GraphQLInputObjectType
    - GraphQLList[js.Any]
  */
  type GraphQLNullableType = _GraphQLNullableType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | GraphQLList[js.Any]
  /* Rewritten from type alias, can be one of: 
    - GraphQLScalarType
    - GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - GraphQLInterfaceType
    - GraphQLUnionType
    - GraphQLEnumType
    - GraphQLList[js.Any]
    - GraphQLNonNull[
  GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any]]
  */
  type GraphQLOutputType = _GraphQLOutputType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ graphqlLib.languageAstMod.ValueNode, 
    /* variables */ graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    graphqlLib.tsutilsMaybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, graphqlLib.tsutilsMaybeMod.Maybe[TExternal]]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, graphqlLib.tsutilsMaybeMod.Maybe[TInternal]]
  /* Rewritten from type alias, can be one of: 
    - GraphQLScalarType
    - GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    - GraphQLInterfaceType
    - GraphQLUnionType
    - GraphQLEnumType
    - GraphQLInputObjectType
    - GraphQLList[js.Any]
    - GraphQLNonNull[js.Any]
  */
  type GraphQLType = _GraphQLType | (GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext, TArgs] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[
      graphqlLib.tsutilsMaybeMod.Maybe[(GraphQLObjectType[TSource, TContext, TArgs]) | java.lang.String]
    ]
  ]
  type GraphQLWrappingType = GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
