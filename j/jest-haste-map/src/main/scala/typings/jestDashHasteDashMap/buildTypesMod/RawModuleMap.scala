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
    val __obj = js.Dynamic.literal(duplicates = duplicates, map = map, mocks = mocks, rootDir = rootDir)
  
    __obj.asInstanceOf[RawModuleMap]
  }
}

