package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.CellHeight
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.materialUiCoreStrings.ul
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListGridListMod extends Shortcut {
  
  /**
    * ⚠️ The GridList component was renamed to ImageList to align with the current Material Design naming.
    *
    * You should use `import { ImageList } from '@material-ui/core'`
    * or `import ImageList from '@material-ui/core/ImageList'`.
    * API:
    *
    * - [GridList API](https://mui.com/api/grid-list/)
    */
  @JSImport("@material-ui/core/GridList/GridList", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridListTypeMap[js.Object, ul]] = js.native
  
  type GridListClassKey = root
  
  type GridListProps[D /* <: ElementType[Any] */, P] = OverrideProps[GridListTypeMap[P, D], D]
  
  trait GridListTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: GridListClassKey
    
    var defaultComponent: D
    
    var props: P & CellHeight
  }
  object GridListTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: GridListClassKey, defaultComponent: D, props: P & CellHeight): GridListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridListTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (GridListTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: GridListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & CellHeight): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[GridListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListGridListMod.foo` */
  override def _to: OverridableComponent[GridListTypeMap[js.Object, ul]] = default
}
