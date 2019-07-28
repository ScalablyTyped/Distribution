package typings.graphqlDashCompose

import typings.graphql.typeDefinitionMod.GraphQLScalarTypeConfig
import typings.graphqlDashCompose.Anon_Extensions
import typings.graphqlDashCompose.Anon_GqcExtensions
import typings.graphqlDashCompose.esmGraphqlMod.GraphQLScalarType
import typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmScalarTypeComposerMod {
  type ComposeScalarTypeConfig = (GraphQLScalarTypeConfig[_, _]) with Anon_Extensions
  type GraphQLScalarTypeExtended = GraphQLScalarType with Anon_GqcExtensions
  type ScalarTypeComposeDefinition = TypeAsString | ComposeScalarTypeConfig | GraphQLScalarType
}
