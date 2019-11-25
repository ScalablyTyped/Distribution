package typings.jestDashHasteDashMap.buildTypesMod

import typings.jestDashHasteDashMap.buildHasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteMap extends js.Object {
  var __hasteMapForTest: js.UndefOr[InternalHasteMap | Null] = js.undefined
  var hasteFS: default
  var moduleMap: typings.jestDashHasteDashMap.buildModuleMapMod.default
}

object HasteMap {
  @scala.inline
  def apply(
    hasteFS: default,
    moduleMap: typings.jestDashHasteDashMap.buildModuleMapMod.default,
    __hasteMapForTest: InternalHasteMap = null
  ): HasteMap = {
    val __obj = js.Dynamic.literal(hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
    if (__hasteMapForTest != null) __obj.updateDynamic("__hasteMapForTest")(__hasteMapForTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMap]
  }
}

