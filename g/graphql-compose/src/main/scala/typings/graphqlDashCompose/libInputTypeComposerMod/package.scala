package typings.graphqlDashCompose

import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphqlDashCompose.Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap
import typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer
import typings.graphqlDashCompose.libGraphqlMod.GraphQLInputObjectType
import typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
import typings.graphqlDashCompose.libUtilsDefinitionsMod.ObjMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputTypeComposerMod {
  type ComposeInputFieldConfig = ComposeInputFieldConfigAsObject | ComposeInputType | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType])
  type ComposeInputFieldConfigMap = ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString | (js.Array[
    InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = GraphQLInputObjectType with Anon_GqcExtensionsGqcFieldsComposeInputFieldConfigMap
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.libInputTypeComposerMod.ComposeInputObjectTypeConfig
    - typings.graphqlDashCompose.libGraphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = _InputTypeComposeDefinition | TypeAsString
}
