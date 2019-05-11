package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmInputTypeComposerMod {
  type ComposeInputFieldConfig = ComposeInputFieldConfigAsObject | ComposeInputType | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType])
  type ComposeInputFieldConfigMap = graphqlDashComposeLib.esmUtilsDefinitionsMod.ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = InputTypeComposer[js.Any] | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[js.Any] | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.esmTypeMapperMod.TypeAsString | (js.Array[
    InputTypeComposer[js.Any] | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[js.Any] | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType with graphqlDashComposeLib.Anon_GqcExtensionsGqcFields
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
    - ComposeInputObjectTypeConfig
    - graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = _InputTypeComposeDefinition | graphqlDashComposeLib.esmTypeMapperMod.TypeAsString
}
