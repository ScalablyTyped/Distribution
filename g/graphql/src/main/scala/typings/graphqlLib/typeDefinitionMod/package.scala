package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDefinitionMod {
  type GraphQLAbstractType = GraphQLInterfaceType | GraphQLUnionType
  type GraphQLCompositeType = (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputType = GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]
  ])
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    graphqlLib.jsutilsMaybePromiseMod.MaybePromise[scala.Boolean]
  ]
  type GraphQLLeafType = GraphQLScalarType | GraphQLEnumType
  type GraphQLNamedType = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType
  type GraphQLNullableType = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any]
  type GraphQLOutputType = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any] | (GraphQLNonNull[
    GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ graphqlLib.languageAstMod.ValueNode, 
    /* variables */ graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    graphqlLib.tsutilsMaybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, graphqlLib.tsutilsMaybeMod.Maybe[TExternal]]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, graphqlLib.tsutilsMaybeMod.Maybe[TInternal]]
  type GraphQLType = GraphQLScalarType | (GraphQLObjectType[js.Any, js.Any]) | GraphQLInterfaceType | GraphQLUnionType | GraphQLEnumType | GraphQLInputObjectType | GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    graphqlLib.jsutilsMaybePromiseMod.MaybePromise[
      graphqlLib.tsutilsMaybeMod.Maybe[(GraphQLObjectType[TSource, TContext]) | java.lang.String]
    ]
  ]
  type GraphQLWrappingType = GraphQLList[js.Any] | GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
