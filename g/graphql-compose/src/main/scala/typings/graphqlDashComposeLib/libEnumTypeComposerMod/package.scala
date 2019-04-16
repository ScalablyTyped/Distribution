package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEnumTypeComposerMod {
  type ComposeEnumTypeConfig = graphqlLib.typeDefinitionMod.GraphQLEnumTypeConfig with graphqlDashComposeLib.Anon_Extensions
  type EnumTypeComposeDefinition = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | ComposeEnumTypeConfig | graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType
  type GraphQLEnumTypeExtended = graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType with graphqlDashComposeLib.Anon_GqcExtensions
}
