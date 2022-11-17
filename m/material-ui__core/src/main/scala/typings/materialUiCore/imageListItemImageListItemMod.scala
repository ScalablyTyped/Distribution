package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Rows
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemImageListItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageListItem API](https://mui.com/api/image-list-item/)
    */
  @JSImport("@material-ui/core/ImageListItem/ImageListItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[ImageListItemTypeMap[js.Object, "li"]] = js.native
  
  object ImageListItemClassKey {
    
    inline def imgFullHeight: "imgFullHeight" = "imgFullHeight".asInstanceOf["imgFullHeight"]
    
    inline def imgFullWidth: "imgFullWidth" = "imgFullWidth".asInstanceOf["imgFullWidth"]
    
    inline def item: "item" = "item".asInstanceOf["item"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type ImageListItemClassKey = "root" | "item" | "imgFullHeight" | "imgFullWidth"
  
  type ImageListItemProps[D /* <: ElementType[Any] */, P] = OverrideProps[ImageListItemTypeMap[P, D], D]
  
  trait ImageListItemTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ImageListItemClassKey
    
    var defaultComponent: D
    
    var props: P & Rows
  }
  object ImageListItemTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ImageListItemClassKey, defaultComponent: D, props: P & Rows): ImageListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListItemTypeMap[P, D]]
    }
    
    extension [Self <: ImageListItemTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ImageListItemTypeMap[P, D])) {
      
      inline def setClassKey(value: ImageListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Rows): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ImageListItemTypeMap[js.Object, "li"]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListItemImageListItemMod.foo` */
  override def _to: OverridableComponent[ImageListItemTypeMap[js.Object, "li"]] = default
}
