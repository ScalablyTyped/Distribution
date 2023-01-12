package typings.kendoUi.kendo.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTupleModel extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var children: js.Array[PivotTupleModel]
  
  var hasChildren: js.UndefOr[Boolean] = js.undefined
  
  var hierarchy: js.UndefOr[String] = js.undefined
  
  var levelName: js.UndefOr[String] = js.undefined
  
  var levelNum: Double
  
  var name: String
}
object PivotTupleModel {
  
  inline def apply(children: js.Array[PivotTupleModel], levelNum: Double, name: String): PivotTupleModel = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], levelNum = levelNum.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTupleModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTupleModel] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setChildren(value: js.Array[PivotTupleModel]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PivotTupleModel*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
    
    inline def setHierarchy(value: String): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    inline def setLevelName(value: String): Self = StObject.set(x, "levelName", value.asInstanceOf[js.Any])
    
    inline def setLevelNameUndefined: Self = StObject.set(x, "levelName", js.undefined)
    
    inline def setLevelNum(value: Double): Self = StObject.set(x, "levelNum", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
