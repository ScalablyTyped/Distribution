package typings.graphqlDashCompose

import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.libInterfaceTypeComposerMod.ComposeInterfaceType
import typings.graphqlDashCompose.libObjectTypeComposerMod.ArgsMap
import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.libObjectTypeComposerMod.GetRecordIdFn
import typings.graphqlDashCompose.libObjectTypeComposerMod.RelationThunkMap
import typings.graphqlDashCompose.libResolverMod.Resolver
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionGqcExtensions[TContext, TSource] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.undefined
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.undefined
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.undefined
  var description: String | Null
}

object Anon_DescriptionGqcExtensions {
  @scala.inline
  def apply[TContext, TSource](
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcGetRecordIdFn: (TSource, /* args */ js.Any, TContext) => String = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcInterfaces: js.Array[ComposeInterfaceType] = null,
    _gqcRelations: RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: Map[String, Resolver[TSource, TContext, ArgsMap, _]] = null,
    description: String = null
  ): Anon_DescriptionGqcExtensions[TContext, TSource] = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields.asInstanceOf[js.Any])
    if (_gqcGetRecordIdFn != null) __obj.updateDynamic("_gqcGetRecordIdFn")(js.Any.fromFunction3(_gqcGetRecordIdFn))
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer.asInstanceOf[js.Any])
    if (_gqcInterfaces != null) __obj.updateDynamic("_gqcInterfaces")(_gqcInterfaces.asInstanceOf[js.Any])
    if (_gqcRelations != null) __obj.updateDynamic("_gqcRelations")(_gqcRelations.asInstanceOf[js.Any])
    if (_gqcResolvers != null) __obj.updateDynamic("_gqcResolvers")(_gqcResolvers.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionGqcExtensions[TContext, TSource]]
  }
}

