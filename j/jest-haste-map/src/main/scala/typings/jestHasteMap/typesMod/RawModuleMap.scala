package typings.jestHasteMap.typesMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawModuleMap extends js.Object {
  
  var duplicates: DuplicatesIndex = js.native
  
  var map: ModuleMapData = js.native
  
  var mocks: MockData = js.native
  
  var rootDir: Path = js.native
}
object RawModuleMap {
  
  @scala.inline
  def apply(duplicates: DuplicatesIndex, map: ModuleMapData, mocks: MockData, rootDir: Path): RawModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawModuleMap]
  }
  
  @scala.inline
  implicit class RawModuleMapOps[Self <: RawModuleMap] (val x: Self) extends AnyVal {
    
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
    def setDuplicates(value: DuplicatesIndex): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: ModuleMapData): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMocks(value: MockData): Self = this.set("mocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
  }
}
