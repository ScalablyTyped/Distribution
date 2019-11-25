package typings.jestDashHasteDashMap.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawModuleMap extends js.Object {
  var duplicates: DuplicatesIndex
  var map: ModuleMapData
  var mocks: MockData
  var rootDir: Path
}

object RawModuleMap {
  @scala.inline
  def apply(duplicates: DuplicatesIndex, map: ModuleMapData, mocks: MockData, rootDir: Path): RawModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RawModuleMap]
  }
}

