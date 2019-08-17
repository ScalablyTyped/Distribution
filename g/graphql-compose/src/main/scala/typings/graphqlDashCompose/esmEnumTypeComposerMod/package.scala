package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmEnumTypeComposerMod {
  import typings.graphqlDashCompose.Anon_GqcExtensions
  import typings.graphqlDashCompose.esmGraphqlMod.GraphQLEnumType
  import typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
  import typings.graphqlDashCompose.esmTypeMapperMod.TypeDefinitionString
  import typings.graphqlDashCompose.esmUtilsDefinitionsMod.ObjMap

  type ComposeEnumType = EnumTypeComposer[js.Any] | GraphQLEnumType | TypeDefinitionString | TypeAsString
  type ComposeEnumValueConfigMap = ObjMap[ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.esmEnumTypeComposerMod.ComposeEnumTypeConfig
    - typings.graphqlDashCompose.esmGraphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = _EnumTypeComposeDefinition | TypeAsString
  type GraphQLEnumTypeExtended = GraphQLEnumType with Anon_GqcExtensions
}
