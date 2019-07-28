package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.ComposeInterfaceType
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ArgsMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeFieldConfigMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.GetRecordIdFn
import typings.graphqlDashCompose.esmObjectTypeComposerMod.RelationThunkMap
import typings.graphqlDashCompose.esmResolverMod.Resolver
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description[TContext, TSource] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcFields: js.UndefOr[ComposeFieldConfigMap[TSource, TContext]] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[InputTypeComposer[TContext]] = js.undefined
  var _gqcInterfaces: js.UndefOr[js.Array[ComposeInterfaceType]] = js.undefined
  var _gqcRelations: js.UndefOr[RelationThunkMap[TSource, TContext]] = js.undefined
  var _gqcResolvers: js.UndefOr[Map[String, Resolver[TSource, TContext, ArgsMap, _]]] = js.undefined
  var description: String | Null
}

object Anon_Description {
  @scala.inline
  def apply[TContext, TSource](
    _gqcExtensions: Extensions = null,
    _gqcFields: ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcGetRecordIdFn: GetRecordIdFn[TSource, TContext] = null,
    _gqcInputTypeComposer: InputTypeComposer[TContext] = null,
    _gqcInterfaces: js.Array[ComposeInterfaceType] = null,
    _gqcRelations: RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: Map[String, Resolver[TSource, TContext, ArgsMap, _]] = null,
    description: String = null
  ): Anon_Description[TContext, TSource] = {
    val __obj = js.Dynamic.literal()
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    if (_gqcGetRecordIdFn != null) __obj.updateDynamic("_gqcGetRecordIdFn")(_gqcGetRecordIdFn)
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer)
    if (_gqcInterfaces != null) __obj.updateDynamic("_gqcInterfaces")(_gqcInterfaces)
    if (_gqcRelations != null) __obj.updateDynamic("_gqcRelations")(_gqcRelations)
    if (_gqcResolvers != null) __obj.updateDynamic("_gqcResolvers")(_gqcResolvers)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Description[TContext, TSource]]
  }
}

