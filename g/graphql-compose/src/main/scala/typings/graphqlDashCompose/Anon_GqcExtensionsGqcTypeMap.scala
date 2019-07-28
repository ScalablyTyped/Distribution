package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeObjectType
import typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeResolversMap
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcTypeMap[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcTypeMap: Map[String, ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.undefined
}

object Anon_GqcExtensionsGqcTypeMap {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    _gqcExtensions: Extensions = null,
    _gqcTypeResolvers: UnionTypeResolversMap[TSource, TContext] = null
  ): Anon_GqcExtensionsGqcTypeMap[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap)
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions)
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers)
    __obj.asInstanceOf[Anon_GqcExtensionsGqcTypeMap[TSource, TContext]]
  }
}

