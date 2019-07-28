package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeResolversMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[InterfaceTypeResolversMap[TContext]] = js.undefined
}

object Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer {
  @scala.inline
  def apply[TSource, TContext](
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcTypeResolvers: InterfaceTypeResolversMap[TContext] = null
  ): Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext]]
  }
}

