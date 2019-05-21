package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmEnumTypeComposerMod {
  type ComposeEnumType = EnumTypeComposer[js.Any] | graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType | graphqlDashComposeLib.esmTypeMapperMod.TypeDefinitionString | graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
  type ComposeEnumValueConfigMap = graphqlDashComposeLib.esmUtilsDefinitionsMod.ObjMap[ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
    - ComposeEnumTypeConfig
    - graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = _EnumTypeComposeDefinition | graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
  type GraphQLEnumTypeExtended = graphqlDashComposeLib.esmGraphqlMod.GraphQLEnumType with graphqlDashComposeLib.Anon_GqcExtensions
}
