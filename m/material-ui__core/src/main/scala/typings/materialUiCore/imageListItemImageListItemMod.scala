package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Rows
import typings.materialUiCore.materialUiCoreStrings.li
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
  val default: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.item
    - typings.materialUiCore.materialUiCoreStrings.imgFullHeight
    - typings.materialUiCore.materialUiCoreStrings.imgFullWidth
  */
  trait ImageListItemClassKey extends StObject
  object ImageListItemClassKey {
    
    inline def imgFullHeight: typings.materialUiCore.materialUiCoreStrings.imgFullHeight = "imgFullHeight".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.imgFullHeight]
    
    inline def imgFullWidth: typings.materialUiCore.materialUiCoreStrings.imgFullWidth = "imgFullWidth".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.imgFullWidth]
    
    inline def item: typings.materialUiCore.materialUiCoreStrings.item = "item".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.item]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageListItemTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ImageListItemTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: ImageListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Rows): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ImageListItemTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListItemImageListItemMod.foo` */
  override def _to: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = default
}
