package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLEnumTypeConfig
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLEnumValueConfig
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLInputFieldConfig
import typings.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typings.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import typings.graphql.definitionMod.GraphQLScalarTypeConfig
import typings.graphql.definitionMod.GraphQLUnionTypeConfig
import typings.graphql.mod.GraphQLSchema
import typings.graphql.schemaMod.GraphQLSchemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/get-directives", JSImport.Namespace)
@js.native
object getDirectivesMod extends js.Object {
  def getDirectives(schema: GraphQLSchema, node: DirectableGraphQLObject): DirectiveUseMap = js.native
  type DirectableGraphQLObject = GraphQLSchema | GraphQLSchemaConfig | GraphQLNamedType | (GraphQLObjectTypeConfig[js.Any, js.Any]) | (GraphQLInterfaceTypeConfig[js.Any, js.Any]) | (GraphQLUnionTypeConfig[js.Any, js.Any]) | (GraphQLScalarTypeConfig[js.Any, js.Any]) | GraphQLEnumTypeConfig | GraphQLEnumValue | GraphQLEnumValueConfig | GraphQLInputObjectTypeConfig | (GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputField | (GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputFieldConfig
  type DirectiveUseMap = StringDictionary[js.Any]
}

