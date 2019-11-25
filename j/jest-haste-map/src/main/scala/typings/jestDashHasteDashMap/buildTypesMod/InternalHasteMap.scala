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
    val __obj = js.Dynamic.literal(clocks = clocks.asInstanceOf[js.Any], duplicates = duplicates.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalHasteMap]
  }
}

