package typings.jestHasteMap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalHasteMap extends js.Object {
  
  var clocks: WatchmanClocks = js.native
  
  var duplicates: DuplicatesIndex = js.native
  
  var files: FileData = js.native
  
  var map: ModuleMapData = js.native
  
  var mocks: MockData = js.native
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
  
  @scala.inline
  implicit class InternalHasteMapOps[Self <: InternalHasteMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClocks(value: WatchmanClocks): Self = this.set("clocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicates(value: DuplicatesIndex): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: FileData): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: ModuleMapData): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMocks(value: MockData): Self = this.set("mocks", value.asInstanceOf[js.Any])
  }
}
