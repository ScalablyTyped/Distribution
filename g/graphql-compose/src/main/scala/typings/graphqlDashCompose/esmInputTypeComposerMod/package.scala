package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmInputTypeComposerMod {
  import typings.graphql.typeDefinitionMod.GraphQLInputType
  import typings.graphqlDashCompose.Anon_GqcExtensionsGqcFields
  import typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer
  import typings.graphqlDashCompose.esmGraphqlMod.GraphQLInputObjectType
  import typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer
  import typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
  import typings.graphqlDashCompose.esmUtilsDefinitionsMod.ObjMap

  type ComposeInputFieldConfig = ComposeInputFieldConfigAsObject | ComposeInputType | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType])
  type ComposeInputFieldConfigMap = ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString | (js.Array[
    InputTypeComposer[js.Any] | EnumTypeComposer[js.Any] | ScalarTypeComposer[js.Any] | GraphQLInputType | TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = GraphQLInputObjectType with Anon_GqcExtensionsGqcFields
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
    - typings.graphqlDashCompose.esmInputTypeComposerMod.ComposeInputObjectTypeConfig
    - typings.graphqlDashCompose.esmGraphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = _InputTypeComposeDefinition | TypeAsString
}
