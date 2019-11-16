package typings.jestDashHasteDashMap.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalHasteMap extends js.Object {
  var clocks: WatchmanClocks
  var duplicates: DuplicatesIndex
  var files: FileData
  var map: ModuleMapData
  var mocks: MockData
}

object InternalHasteMap {
  @scala.inline
  def apply(
    clocks: WatchmanClocks,
    duplicates: DuplicatesIndex,
    files: FileData,
    map: ModuleMapData,
    mocks: MockData
  ): InternalHasteMap = {
    val __obj = js.Dynamic.literal(clocks = clocks, duplicates = duplicates, files = files, map = map, mocks = mocks)
  
    __obj.asInstanceOf[InternalHasteMap]
  }
}

