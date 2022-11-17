package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Cols
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
  val default: OverridableComponent[GridListTileTypeMap[js.Object, "li"]] = js.native
  
  object GridListTileClassKey {
    
    inline def imgFullHeight: "imgFullHeight" = "imgFullHeight".asInstanceOf["imgFullHeight"]
    
    inline def imgFullWidth: "imgFullWidth" = "imgFullWidth".asInstanceOf["imgFullWidth"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def tile: "tile" = "tile".asInstanceOf["tile"]
  }
  type GridListTileClassKey = "root" | "tile" | "imgFullHeight" | "imgFullWidth"
  
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
    
    extension [Self <: GridListTileTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (GridListTileTypeMap[P, D])) {
      
      inline def setClassKey(value: GridListTileClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Cols): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[GridListTileTypeMap[js.Object, "li"]]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileGridListTileMod.foo` */
  override def _to: OverridableComponent[GridListTileTypeMap[js.Object, "li"]] = default
}
