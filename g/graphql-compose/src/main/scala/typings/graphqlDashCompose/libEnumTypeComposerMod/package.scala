package typings.graphqlDashCompose

import typings.graphqlDashCompose.Anon_GqcExtensionsExtensions
import typings.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
import typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
import typings.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
import typings.graphqlDashCompose.libUtilsDefinitionsMod.ObjMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEnumTypeComposerMod {
  type ComposeEnumType = EnumTypeComposer[js.Any] | GraphQLEnumType | TypeDefinitionString | TypeAsString
  type ComposeEnumValueConfigMap = ObjMap[ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.libEnumTypeComposerMod.ComposeEnumTypeConfig
    - typings.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = _EnumTypeComposeDefinition | TypeAsString
  type GraphQLEnumTypeExtended = GraphQLEnumType with Anon_GqcExtensionsExtensions
}
