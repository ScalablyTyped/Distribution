package typings.materialUiLab.paginationItemPaginationItemMod

import typings.materialUiLab.anon.Color
import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationItemTypeMap[P, D /* <: ElementType[_] */] extends js.Object {
  
  var classKey: PaginationItemClassKey = js.native
  
  var defaultComponent: D = js.native
  
  var props: P with Color = js.native
}
object PaginationItemTypeMap {
  
  @scala.inline
  def apply[P, D /* <: ElementType[_] */](classKey: PaginationItemClassKey, defaultComponent: D, props: P with Color): PaginationItemTypeMap[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
  }
  
  @scala.inline
  implicit class PaginationItemTypeMapOps[Self <: PaginationItemTypeMap[_, _], P, D /* <: ElementType[_] */] (val x: Self with (PaginationItemTypeMap[P, D])) extends AnyVal {
    
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
    def setClassKey(value: PaginationItemClassKey): Self = this.set("classKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultComponent(value: D): Self = this.set("defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with Color): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
