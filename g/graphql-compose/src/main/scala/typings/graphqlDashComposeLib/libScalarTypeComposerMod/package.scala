package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libScalarTypeComposerMod {
  type ComposeScalarTypeConfig = (graphqlLib.typeDefinitionMod.GraphQLScalarTypeConfig[_, _]) with graphqlDashComposeLib.Anon_ExtensionsOptional
  type GraphQLScalarTypeExtended = graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType with graphqlDashComposeLib.Anon_GqcExtensionsExtensions
  type ScalarTypeComposeDefinition = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | ComposeScalarTypeConfig | graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType
}
