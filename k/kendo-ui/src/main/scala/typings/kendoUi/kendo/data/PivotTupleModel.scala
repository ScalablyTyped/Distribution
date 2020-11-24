package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTupleModel extends js.Object {
  
  var caption: js.UndefOr[String] = js.native
  
  var children: js.Array[PivotTupleModel] = js.native
  
  var hasChildren: js.UndefOr[Boolean] = js.native
  
  var hierarchy: js.UndefOr[String] = js.native
  
  var levelName: js.UndefOr[String] = js.native
  
  var levelNum: Double = js.native
  
  var name: String = js.native
}
object PivotTupleModel {
  
  @scala.inline
  def apply(children: js.Array[PivotTupleModel], levelNum: Double, name: String): PivotTupleModel = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], levelNum = levelNum.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTupleModel]
  }
  
  @scala.inline
  implicit class PivotTupleModelOps[Self <: PivotTupleModel] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: PivotTupleModel*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[PivotTupleModel]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelNum(value: Double): Self = this.set("levelNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
    
    @scala.inline
    def setHierarchy(value: String): Self = this.set("hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchy: Self = this.set("hierarchy", js.undefined)
    
    @scala.inline
    def setLevelName(value: String): Self = this.set("levelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevelName: Self = this.set("levelName", js.undefined)
  }
}
