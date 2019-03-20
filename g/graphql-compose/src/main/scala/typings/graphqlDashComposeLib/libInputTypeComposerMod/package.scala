package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputTypeComposerMod {
  type ComposeInputFieldConfig = _ComposeInputFieldConfig | (js.Function0[ComposeInputFieldConfigAsObject | ComposeInputType]) | (js.Array[
    InputTypeComposer | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  ]) | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type ComposeInputFieldConfigMap = graphqlDashComposeLib.libUtilsDefinitionsMod.ObjMap[ComposeInputFieldConfig]
  type ComposeInputType = _ComposeInputType | (js.Array[
    InputTypeComposer | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  ]) | graphqlLib.typeDefinitionMod.GraphQLInputType | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type InputTypeComposerDefinition = _InputTypeComposerDefinition | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
}
