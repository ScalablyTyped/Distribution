package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypeComposerMod {
  type ComposeInputFieldConfig = typings.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typings.graphqlCompose.inputTypeComposerMod.ComposeInputType | (js.Function0[
    typings.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typings.graphqlCompose.inputTypeComposerMod.ComposeInputType
  ])
  type ComposeInputFieldConfigMap = typings.graphqlCompose.definitionsMod.ObjMap[typings.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfig]
  type ComposeInputType = typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typings.graphql.definitionMod.GraphQLInputType | typings.graphqlCompose.typeMapperMod.TypeAsString | (js.Array[
    typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typings.graphql.definitionMod.GraphQLInputType | typings.graphqlCompose.typeMapperMod.TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = typings.graphqlCompose.graphqlMod.GraphQLInputObjectType with typings.graphqlCompose.AnonGqcExtensionsGqcFields
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlCompose.typeMapperMod.TypeAsString
    - typings.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
    - typings.graphqlCompose.graphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = typings.graphqlCompose.inputTypeComposerMod._InputTypeComposeDefinition | typings.graphqlCompose.typeMapperMod.TypeAsString
}
