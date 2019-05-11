package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
  var _gqcTypeMap: stdLib.Map[java.lang.String, graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[
    graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeResolversMap[TSource, TContext]
  ] = js.undefined
}

object Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: stdLib.Map[java.lang.String, graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType],
    _gqcExtensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null,
    _gqcTypeResolvers: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeResolversMap[TSource, TContext] = null
  ): Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext]]
  }
}

