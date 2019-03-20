package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description[TSource, TContext] extends js.Object {
  var _gqcFields: js.UndefOr[
    graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _]
  ] = js.undefined
  var _gqcGetRecordIdFn: js.UndefOr[graphqlDashComposeLib.libTypeComposerMod.GetRecordIdFn[TSource, TContext]] = js.undefined
  var _gqcInputTypeComposer: js.UndefOr[graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer] = js.undefined
  var _gqcInterfaces: js.UndefOr[
    js.Array[
      graphqlLib.graphqlMod.GraphQLInterfaceType | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _])
    ]
  ] = js.undefined
  var _gqcRelations: js.UndefOr[graphqlDashComposeLib.libTypeComposerMod.RelationThunkMap[TSource, TContext]] = js.undefined
  var _gqcResolvers: js.UndefOr[
    stdLib.Map[
      java.lang.String, 
      graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, _]
    ]
  ] = js.undefined
  var description: java.lang.String | scala.Null
}

object Anon_Description {
  @scala.inline
  def apply[TSource, TContext](
    _gqcFields: graphqlDashComposeLib.libTypeComposerMod.ComposeFieldConfigMap[TSource, TContext, _] = null,
    _gqcGetRecordIdFn: graphqlDashComposeLib.libTypeComposerMod.GetRecordIdFn[TSource, TContext] = null,
    _gqcInputTypeComposer: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = null,
    _gqcInterfaces: js.Array[
      graphqlLib.graphqlMod.GraphQLInterfaceType | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _])
    ] = null,
    _gqcRelations: graphqlDashComposeLib.libTypeComposerMod.RelationThunkMap[TSource, TContext] = null,
    _gqcResolvers: stdLib.Map[
      java.lang.String, 
      graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, _]
    ] = null,
    description: java.lang.String = null
  ): Anon_Description[TSource, TContext] = {
    val __obj = js.Dynamic.literal()
    if (_gqcFields != null) __obj.updateDynamic("_gqcFields")(_gqcFields)
    if (_gqcGetRecordIdFn != null) __obj.updateDynamic("_gqcGetRecordIdFn")(_gqcGetRecordIdFn)
    if (_gqcInputTypeComposer != null) __obj.updateDynamic("_gqcInputTypeComposer")(_gqcInputTypeComposer)
    if (_gqcInterfaces != null) __obj.updateDynamic("_gqcInterfaces")(_gqcInterfaces)
    if (_gqcRelations != null) __obj.updateDynamic("_gqcRelations")(_gqcRelations)
    if (_gqcResolvers != null) __obj.updateDynamic("_gqcResolvers")(_gqcResolvers)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Anon_Description[TSource, TContext]]
  }
}

