package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Cols
import typings.materialUiCore.materialUiCoreStrings.li
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListTileGridListTileMod extends Shortcut {
  
  /**
    * ⚠️ The GridList component was renamed to ImageList to align with the current Material Design naming.
    *
    * You should use `import { ImageListItem } from '@material-ui/core'`
    * or `import ImageListItem from '@material-ui/core/ImageListItem'`.
    * API:
    *
    * - [GridListTile API](https://mui.com/api/grid-list-tile/)
    */
  @JSImport("@material-ui/core/GridListTile/GridListTile", JSImport.Default)
  @js.native
  val default: OverridableComponent[GridListTileTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.tile
    - typings.materialUiCore.materialUiCoreStrings.imgFullHeight
    - typings.materialUiCore.materialUiCoreStrings.imgFullWidth
  */
  trait GridListTileClassKey extends StObject
  object GridListTileClassKey {
    
    inline def imgFullHeight: typings.materialUiCore.materialUiCoreStrings.imgFullHeight = "imgFullHeight".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.imgFullHeight]
    
    inline def imgFullWidth: typings.materialUiCore.materialUiCoreStrings.imgFullWidth = "imgFullWidth".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.imgFullWidth]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def tile: typings.materialUiCore.materialUiCoreStrings.tile = "tile".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.tile]
  }
  
  type GridListTileProps[D /* <: ElementType[Any] */, P] = OverrideProps[GridListTileTypeMap[P, D], D]
  
  trait GridListTileTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: GridListTileClassKey
    
    var defaultComponent: D
    
    var props: P & Cols
  }
  object GridListTileTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: GridListTileClassKey, defaultComponent: D, props: P & Cols): GridListTileTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridListTileTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GridListTileTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (GridListTileTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: GridListTileClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Cols): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[GridListTileTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileGridListTileMod.foo` */
  override def _to: OverridableComponent[GridListTileTypeMap[js.Object, li]] = default
}
