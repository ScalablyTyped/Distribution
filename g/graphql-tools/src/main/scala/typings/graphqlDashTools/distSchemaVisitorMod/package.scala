package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLEnumType
import typings.graphql.graphqlMod.GraphQLInputObjectType
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLEnumValue
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSchemaVisitorMod {
  type VisitableSchemaType = GraphQLSchema | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLInputObjectType | GraphQLNamedType | GraphQLScalarType | (GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLArgument | GraphQLUnionType | GraphQLEnumType | GraphQLEnumValue
}
