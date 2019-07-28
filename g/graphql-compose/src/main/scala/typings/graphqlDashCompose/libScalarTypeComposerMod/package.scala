package typings.graphqlDashCompose

import typings.graphql.typeDefinitionMod.GraphQLScalarTypeConfig
import typings.graphqlDashCompose.Anon_ExtensionsOptional
import typings.graphqlDashCompose.Anon_GqcExtensionsExtensions
import typings.graphqlDashCompose.libGraphqlMod.GraphQLScalarType
import typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libScalarTypeComposerMod {
  type ComposeScalarTypeConfig = (GraphQLScalarTypeConfig[_, _]) with Anon_ExtensionsOptional
  type GraphQLScalarTypeExtended = GraphQLScalarType with Anon_GqcExtensionsExtensions
  type ScalarTypeComposeDefinition = TypeAsString | ComposeScalarTypeConfig | GraphQLScalarType
}
