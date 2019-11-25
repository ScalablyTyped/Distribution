package typings.graphqlDashCompose

import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeResolversMap
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFieldsGqcInputTypeComposerGqcTypeResolvers[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.undefined
}

object Anon_GqcExtensionsGqcFieldsGqcInputTypeComposerGqcTypeResolvers {
  @scala.inline
  def apply[TSource, TContext](
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcTypeResolvers: InterfaceTypeResolversMap[TContext] = null
  ): Anon_GqcExtensionsGqcFieldsGqcInputTypeComposerGqcTypeResolvers[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFieldsGqcInputTypeComposerGqcTypeResolvers[TSource, TContext]]
  }
}

