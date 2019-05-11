package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmScalarTypeComposerMod {
  type ComposeScalarTypeConfig = (graphqlLib.typeDefinitionMod.GraphQLScalarTypeConfig[_, _]) with graphqlDashComposeLib.Anon_Extensions
  type GraphQLScalarTypeExtended = graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType with graphqlDashComposeLib.Anon_GqcExtensions
  type ScalarTypeComposeDefinition = graphqlDashComposeLib.esmTypeMapperMod.TypeAsString | ComposeScalarTypeConfig | graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType
}
