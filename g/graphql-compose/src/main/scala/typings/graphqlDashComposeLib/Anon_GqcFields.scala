package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcFields[TSource, TContext] extends js.Object {
  var _gqcFields: js.UndefOr[
    graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]
  ] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer] = js.undefined
  var _gqcTypeResolvers: js.UndefOr[
    graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeResolversMap[TSource, TContext]
  ] = js.undefined
}

object Anon_GqcFields {
  @scala.inline
  def apply[TSource, TContext](
    _gqcFields: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _] = null,
    _gqcInputTypeComposer: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = null,
    _gqcTypeResolvers: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeResolversMap[TSource, TContext] = null
  ): Anon_GqcFields[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcFields[TSource, TContext]]
  }
}

