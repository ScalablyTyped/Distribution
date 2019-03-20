package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcTypeMap[TSource, TContext] extends js.Object {
  var _gqcTypeMap: stdLib.Map[java.lang.String, graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[
    graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeResolversMap[TSource, TContext]
  ] = js.undefined
}

object Anon_GqcTypeMap {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: stdLib.Map[java.lang.String, graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType],
    _gqcTypeResolvers: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeResolversMap[TSource, TContext] = null
  ): Anon_GqcTypeMap[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcTypeMap[TSource, TContext]]
  }
}

