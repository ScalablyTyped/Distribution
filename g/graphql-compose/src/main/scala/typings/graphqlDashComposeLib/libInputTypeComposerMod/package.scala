package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputTypeComposerMod {
  type ComposeInputFieldConfig = ComposeInputFieldConfigAsObject | ComposeInputType | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType])
  type ComposeInputFieldConfigMap = graphqlDashComposeLib.libUtilsDefinitionsMod.ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = InputTypeComposer[js.Any] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[js.Any] | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (js.Array[
    InputTypeComposer[js.Any] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[js.Any] | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[js.Any] | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  ])
  type GraphQLInputObjectTypeExtended = graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType with graphqlDashComposeLib.Anon_GqcExtensionsGqcFields
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.libTypeMapperMod.TypeAsString
    - ComposeInputObjectTypeConfig
    - graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = _InputTypeComposeDefinition | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
}
