package typings.graphqlCompose

import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType
import typings.graphqlCompose.unionTypeComposerMod.UnionTypeResolversMap
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGqcExtensionsGqcTypeMap[TSource, TContext] extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var _gqcTypeMap: Map[String, ComposeObjectType]
  var _gqcTypeResolvers: js.UndefOr[UnionTypeResolversMap[TSource, TContext]] = js.undefined
}

object AnonGqcExtensionsGqcTypeMap {
  @scala.inline
  def apply[TSource, TContext](
    _gqcTypeMap: Map[String, ComposeObjectType],
    _gqcExtensions: Extensions = null,
    _gqcTypeResolvers: UnionTypeResolversMap[TSource, TContext] = null
  ): AnonGqcExtensionsGqcTypeMap[TSource, TContext] = {
    val __obj = js.Dynamic.literal(_gqcTypeMap = _gqcTypeMap.asInstanceOf[js.Any])
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (_gqcTypeResolvers != null) __obj.updateDynamic("_gqcTypeResolvers")(_gqcTypeResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGqcExtensionsGqcTypeMap[TSource, TContext]]
  }
}

