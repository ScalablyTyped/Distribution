package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
  var _gqcFields: js.UndefOr[
    graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
  ] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext]] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[
    graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeResolversMap[TContext]
  ] = js.undefined
}

object Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer {
  @scala.inline
  def apply[TSource, TContext](
    _gqcExtensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null,
    _gqcFields: graphqlDashComposeLib.libObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcInputTypeComposer: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = null,
    _gqcTypeResolvers: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeResolversMap[TContext] = null
  ): Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext]]
  }
}

