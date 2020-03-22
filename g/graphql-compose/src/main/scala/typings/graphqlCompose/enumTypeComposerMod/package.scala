package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object enumTypeComposerMod {
  type ComposeEnumType = typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typings.graphqlCompose.graphqlMod.GraphQLEnumType | typings.graphqlCompose.typeMapperMod.TypeDefinitionString | typings.graphqlCompose.typeMapperMod.TypeAsString
  type ComposeEnumValueConfigMap = typings.graphqlCompose.definitionsMod.ObjMap[typings.graphqlCompose.enumTypeComposerMod.ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlCompose.typeMapperMod.TypeAsString
    - typings.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
    - typings.graphqlCompose.graphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = typings.graphqlCompose.enumTypeComposerMod._EnumTypeComposeDefinition | typings.graphqlCompose.typeMapperMod.TypeAsString
}
