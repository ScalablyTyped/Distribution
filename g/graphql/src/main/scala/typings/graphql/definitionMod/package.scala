package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object definitionMod {
  type GraphQLArgumentExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typings.graphql.definitionMod.GraphQLInterfaceType
    - typings.graphql.definitionMod.GraphQLUnionType
  */
  type GraphQLCompositeType = typings.graphql.definitionMod._GraphQLCompositeType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any])
  type GraphQLEnumTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLEnumValueConfigMap = org.scalablytyped.runtime.StringDictionary[typings.graphql.definitionMod.GraphQLEnumValueConfig]
  type GraphQLEnumValueExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLFieldConfigArgumentMap = org.scalablytyped.runtime.StringDictionary[typings.graphql.definitionMod.GraphQLArgumentConfig]
  type GraphQLFieldConfigMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typings.graphql.definitionMod.GraphQLFieldConfig[TSource, TContext, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type GraphQLFieldExtensions[TSource, TContext, TArgs] = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLFieldMap[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[
    typings.graphql.definitionMod.GraphQLField[TSource, TContext, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type GraphQLFieldResolver[TSource, TContext, TArgs] = js.Function4[
    /* source */ TSource, 
    /* args */ TArgs, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    js.Any
  ]
  type GraphQLInputFieldConfigMap = org.scalablytyped.runtime.StringDictionary[typings.graphql.definitionMod.GraphQLInputFieldConfig]
  type GraphQLInputFieldExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLInputFieldMap = org.scalablytyped.runtime.StringDictionary[typings.graphql.definitionMod.GraphQLInputField]
  type GraphQLInputObjectTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLScalarType
    - typings.graphql.definitionMod.GraphQLEnumType
    - typings.graphql.definitionMod.GraphQLInputObjectType
    - typings.graphql.definitionMod.GraphQLList[js.Any]
    - typings.graphql.definitionMod.GraphQLNonNull[
  typings.graphql.definitionMod.GraphQLScalarType | typings.graphql.definitionMod.GraphQLEnumType | typings.graphql.definitionMod.GraphQLInputObjectType | typings.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLInputType = typings.graphql.definitionMod._GraphQLInputType | typings.graphql.definitionMod.GraphQLList[js.Any] | (typings.graphql.definitionMod.GraphQLNonNull[
    typings.graphql.definitionMod.GraphQLScalarType | typings.graphql.definitionMod.GraphQLEnumType | typings.graphql.definitionMod.GraphQLInputObjectType | typings.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLInterfaceTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLIsTypeOfFn[TSource, TContext] = js.Function3[
    /* source */ TSource, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    typings.graphql.promiseOrValueMod.PromiseOrValue[scala.Boolean]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLScalarType
    - typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typings.graphql.definitionMod.GraphQLInterfaceType
    - typings.graphql.definitionMod.GraphQLUnionType
    - typings.graphql.definitionMod.GraphQLEnumType
    - typings.graphql.definitionMod.GraphQLInputObjectType
  */
  type GraphQLNamedType = typings.graphql.definitionMod._GraphQLNamedType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any])
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLScalarType
    - typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typings.graphql.definitionMod.GraphQLInterfaceType
    - typings.graphql.definitionMod.GraphQLUnionType
    - typings.graphql.definitionMod.GraphQLEnumType
    - typings.graphql.definitionMod.GraphQLInputObjectType
    - typings.graphql.definitionMod.GraphQLList[js.Any]
  */
  type GraphQLNullableType = typings.graphql.definitionMod._GraphQLNullableType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.definitionMod.GraphQLList[js.Any]
  type GraphQLObjectTypeExtensions[TSource, TContext] = org.scalablytyped.runtime.StringDictionary[js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLScalarType
    - typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typings.graphql.definitionMod.GraphQLInterfaceType
    - typings.graphql.definitionMod.GraphQLUnionType
    - typings.graphql.definitionMod.GraphQLEnumType
    - typings.graphql.definitionMod.GraphQLList[js.Any]
    - typings.graphql.definitionMod.GraphQLNonNull[
  typings.graphql.definitionMod.GraphQLScalarType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.definitionMod.GraphQLInterfaceType | typings.graphql.definitionMod.GraphQLUnionType | typings.graphql.definitionMod.GraphQLEnumType | typings.graphql.definitionMod.GraphQLList[js.Any]]
  */
  type GraphQLOutputType = typings.graphql.definitionMod._GraphQLOutputType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.definitionMod.GraphQLList[js.Any] | (typings.graphql.definitionMod.GraphQLNonNull[
    typings.graphql.definitionMod.GraphQLScalarType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.definitionMod.GraphQLInterfaceType | typings.graphql.definitionMod.GraphQLUnionType | typings.graphql.definitionMod.GraphQLEnumType | typings.graphql.definitionMod.GraphQLList[js.Any]
  ])
  type GraphQLScalarLiteralParser[TInternal] = js.Function2[
    /* valueNode */ typings.graphql.astMod.ValueNode, 
    /* variables */ typings.graphql.maybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    typings.graphql.maybeMod.Maybe[TInternal]
  ]
  type GraphQLScalarSerializer[TExternal] = js.Function1[/* value */ js.Any, typings.graphql.maybeMod.Maybe[TExternal]]
  type GraphQLScalarTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLScalarValueParser[TInternal] = js.Function1[/* value */ js.Any, typings.graphql.maybeMod.Maybe[TInternal]]
  /* Rewritten from type alias, can be one of: 
    - typings.graphql.definitionMod.GraphQLScalarType
    - typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]
    - typings.graphql.definitionMod.GraphQLInterfaceType
    - typings.graphql.definitionMod.GraphQLUnionType
    - typings.graphql.definitionMod.GraphQLEnumType
    - typings.graphql.definitionMod.GraphQLInputObjectType
    - typings.graphql.definitionMod.GraphQLList[js.Any]
    - typings.graphql.definitionMod.GraphQLNonNull[js.Any]
  */
  type GraphQLType = typings.graphql.definitionMod._GraphQLType | (typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any]) | typings.graphql.definitionMod.GraphQLList[js.Any] | typings.graphql.definitionMod.GraphQLNonNull[js.Any]
  type GraphQLTypeResolver[TSource, TContext] = js.Function4[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    /* abstractType */ typings.graphql.definitionMod.GraphQLAbstractType, 
    typings.graphql.promiseOrValueMod.PromiseOrValue[
      typings.graphql.maybeMod.Maybe[
        (typings.graphql.definitionMod.GraphQLObjectType[TSource, TContext]) | java.lang.String
      ]
    ]
  ]
  type GraphQLUnionTypeExtensions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GraphQLWrappingType = typings.graphql.definitionMod.GraphQLList[js.Any] | typings.graphql.definitionMod.GraphQLNonNull[js.Any]
  type Thunk[T] = js.Function0[T] | T
}
