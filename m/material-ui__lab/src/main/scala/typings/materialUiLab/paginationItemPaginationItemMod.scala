package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.materialUiLab.anon.Color
import typings.materialUiLab.materialUiLabStrings.div
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.page
    - typings.materialUiLab.materialUiLabStrings.sizeSmall
    - typings.materialUiLab.materialUiLabStrings.sizeLarge
    - typings.materialUiLab.materialUiLabStrings.textPrimary
    - typings.materialUiLab.materialUiLabStrings.textSecondary
    - typings.materialUiLab.materialUiLabStrings.outlined
    - typings.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typings.materialUiLab.materialUiLabStrings.outlinedSecondary
    - typings.materialUiLab.materialUiLabStrings.rounded
    - typings.materialUiLab.materialUiLabStrings.ellipsis
    - typings.materialUiLab.materialUiLabStrings.focusVisible
    - typings.materialUiLab.materialUiLabStrings.disabled
    - typings.materialUiLab.materialUiLabStrings.selected
    - typings.materialUiLab.materialUiLabStrings.icon
  */
  trait PaginationItemClassKey extends StObject
  object PaginationItemClassKey {
    
    inline def disabled: typings.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typings.materialUiLab.materialUiLabStrings.disabled]
    
    inline def ellipsis: typings.materialUiLab.materialUiLabStrings.ellipsis = "ellipsis".asInstanceOf[typings.materialUiLab.materialUiLabStrings.ellipsis]
    
    inline def focusVisible: typings.materialUiLab.materialUiLabStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiLab.materialUiLabStrings.focusVisible]
    
    inline def icon: typings.materialUiLab.materialUiLabStrings.icon = "icon".asInstanceOf[typings.materialUiLab.materialUiLabStrings.icon]
    
    inline def outlined: typings.materialUiLab.materialUiLabStrings.outlined = "outlined".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlined]
    
    inline def outlinedPrimary: typings.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    inline def outlinedSecondary: typings.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    inline def page: typings.materialUiLab.materialUiLabStrings.page = "page".asInstanceOf[typings.materialUiLab.materialUiLabStrings.page]
    
    inline def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    inline def rounded: typings.materialUiLab.materialUiLabStrings.rounded = "rounded".asInstanceOf[typings.materialUiLab.materialUiLabStrings.rounded]
    
    inline def selected: typings.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typings.materialUiLab.materialUiLabStrings.selected]
    
    inline def sizeLarge: typings.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeLarge]
    
    inline def sizeSmall: typings.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeSmall]
    
    inline def textPrimary: typings.materialUiLab.materialUiLabStrings.textPrimary = "textPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.textPrimary]
    
    inline def textSecondary: typings.materialUiLab.materialUiLabStrings.textSecondary = "textSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.textSecondary]
  }
  
  type PaginationItemProps[D /* <: ElementType[Any] */, P] = OverrideProps[PaginationItemTypeMap[P, D], D]
  
  trait PaginationItemTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: PaginationItemClassKey
    
    var defaultComponent: D
    
    var props: P & Color
  }
  object PaginationItemTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: PaginationItemClassKey, defaultComponent: D, props: P & Color): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationItemTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (PaginationItemTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: PaginationItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[PaginationItemTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `paginationItemPaginationItemMod.foo` */
  override def _to: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = default
}
