package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEnumTypeComposerMod {
  type ComposeEnumType = EnumTypeComposer[js.Any] | graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType | graphqlDashComposeLib.libTypeMapperMod.TypeDefinitionString | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type ComposeEnumValueConfigMap = graphqlDashComposeLib.libUtilsDefinitionsMod.ObjMap[ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.libTypeMapperMod.TypeAsString
    - ComposeEnumTypeConfig
    - graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = _EnumTypeComposeDefinition | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type GraphQLEnumTypeExtended = graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType with graphqlDashComposeLib.Anon_GqcExtensions
}
