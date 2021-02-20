package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTupleModel extends StObject {
  
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
  implicit class PivotTupleModelMutableBuilder[Self <: PivotTupleModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setChildren(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PivotTupleModel*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
    
    @scala.inline
    def setHierarchy(value: String): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    @scala.inline
    def setLevelName(value: String): Self = StObject.set(x, "levelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelNameUndefined: Self = StObject.set(x, "levelName", js.undefined)
    
    @scala.inline
    def setLevelNum(value: Double): Self = StObject.set(x, "levelNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
