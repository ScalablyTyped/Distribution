package typings.jestHasteMap.typesMod

import typings.jestHasteMap.hasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasteMap extends js.Object {
  
  var __hasteMapForTest: js.UndefOr[InternalHasteMap | Null] = js.native
  
  var hasteFS: default = js.native
  
  var moduleMap: typings.jestHasteMap.moduleMapMod.default = js.native
}
object HasteMap {
  
  @scala.inline
  def apply(hasteFS: default, moduleMap: typings.jestHasteMap.moduleMapMod.default): HasteMap = {
    val __obj = js.Dynamic.literal(hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMap]
  }
  
  @scala.inline
  implicit class HasteMapOps[Self <: HasteMap] (val x: Self) extends AnyVal {
    
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
    def setHasteFS(value: default): Self = this.set("hasteFS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleMap(value: typings.jestHasteMap.moduleMapMod.default): Self = this.set("moduleMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__hasteMapForTest(value: InternalHasteMap): Self = this.set("__hasteMapForTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__hasteMapForTest: Self = this.set("__hasteMapForTest", js.undefined)
    
    @scala.inline
    def set__hasteMapForTestNull: Self = this.set("__hasteMapForTest", null)
  }
}
