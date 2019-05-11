package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description[TContext, TSource] extends js.Object {
  var _gqcExtensions: js.UndefOr[graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions] = js.undefined
  var _gqcFields: js.UndefOr[
    graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext]
  ] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[graphqlDashComposeLib.esmObjectTypeComposerMod.GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext]] = js.undefined
  var _gqcInterfaces: js.UndefOr[
    js.Array[
      graphqlLib.graphqlMod.GraphQLInterfaceType | (graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext])
    ]
  ] = js.undefined
  var _gqcRelations: js.UndefOr[
    graphqlDashComposeLib.esmObjectTypeComposerMod.RelationThunkMap[TSource, TContext]
  ] = js.undefined
  var _gqcResolvers: js.UndefOr[
    stdLib.Map[
      java.lang.String, 
      graphqlDashComposeLib.esmResolverMod.Resolver[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap, _]
    ]
  ] = js.undefined
  var description: java.lang.String | scala.Null
}

object Anon_Description {
  @scala.inline
  def apply[TContext, TSource](
    _gqcExtensions: graphqlDashComposeLib.esmUtilsDefinitionsMod.Extensions = null,
    _gqcFields: graphqlDashComposeLib.esmObjectTypeComposerMod.ComposeFieldConfigMap[TSource, TContext] = null,
    _gqcGetRecordIdFn: graphqlDashComposeLib.esmObjectTypeComposerMod.GetRecordIdFn[TSource, TContext] = null,
    _gqcInputTypeComposer: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = null,
    _gqcInterfaces: js.Array[
      graphqlLib.graphqlMod.GraphQLInterfaceType | (graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext])
    ] = null,
    _gqcRelations: graphqlDashComposeLib.esmObjectTypeComposerMod.RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: stdLib.Map[
      java.lang.String, 
      graphqlDashComposeLib.esmResolverMod.Resolver[TSource, TContext, graphqlDashComposeLib.esmObjectTypeComposerMod.ArgsMap, _]
    ] = null,
    description: java.lang.String = null
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

