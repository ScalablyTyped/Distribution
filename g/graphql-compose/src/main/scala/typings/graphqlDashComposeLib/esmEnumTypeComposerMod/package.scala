package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmEnumTypeComposerMod {
  type ComposeEnumTypeConfig = graphqlLib.typeDefinitionMod.GraphQLEnumTypeConfig with graphqlDashComposeLib.Anon_Extensions
  type EnumTypeComposeDefinition = graphqlDashComposeLib.esmTypeMapperMod.TypeAsString | ComposeEnumTypeConfig | graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType
  type GraphQLEnumTypeExtended = graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType with graphqlDashComposeLib.Anon_GqcExtensions
}
