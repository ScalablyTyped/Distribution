package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libScalarTypeComposerMod {
  type ComposeScalarTypeConfig = (graphqlLib.typeDefinitionMod.GraphQLScalarTypeConfig[_, _]) with graphqlDashComposeLib.Anon_Extensions
  type GraphQLScalarTypeExtended = graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType with graphqlDashComposeLib.Anon_GqcExtensions
  type ScalarTypeComposeDefinition = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | ComposeScalarTypeConfig | graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType
}
