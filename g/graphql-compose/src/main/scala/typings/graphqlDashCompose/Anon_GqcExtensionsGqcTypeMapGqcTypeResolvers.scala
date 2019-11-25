package typings.graphqlDashCompose

import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeObjectType
import typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeResolversMap
import typings.graphqlDashCompose.libUtilsDefinitionsMod.Extensions
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcTypeMap: Map[String, ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.undefined
}

object Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    _gqcExtensions: Extensions = null,
    _gqcTypeResolvers: UnionTypeResolversMap[TSource, TContext] = null
  ): Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any])
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext]]
  }
}

