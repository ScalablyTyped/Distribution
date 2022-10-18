package typings.materialUiCore

import typings.materialUiCore.anon.Ref
import typings.materialUiCore.listListMod.ListClassKey
import typings.materialUiCore.listListMod.ListProps
import typings.materialUiCore.materialUiCoreStrings.menu
import typings.materialUiCore.materialUiCoreStrings.selectedMenu
import typings.materialUiCore.materialUiCoreStrings.ul
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListMod {
  
  @JSImport("@material-ui/core/MenuList/MenuList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MenuListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuListClassKey = ListClassKey
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/List/List.ListProps<'ul', {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/List/List.ListProps<'ul', {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/List/List.ListProps<'ul', {}>, 'classes' | never>> : never */ trait MenuListProps
    extends StObject
       with StyledComponentProps[MenuListClassKey]
       with Ref[ListProps[ul, js.Object]] {
    
    /**
      * If `true`, will focus the `[role="menu"]` container and move into tab order.
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, will focus the first menuitem if `variant="menu"` or selected item
      * if `variant="selectedMenu"`.
      */
    var autoFocusItem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * MenuList contents, normally `MenuItem`s.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If `true`, the menu items will not wrap focus.
      */
    var disableListWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, will allow focus on disabled items.
      */
    var disabledItemsFocusable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The variant to use. Use `menu` to prevent selected items from impacting the initial focus
      * and the vertical alignment relative to the anchor element.
      */
    var variant: js.UndefOr[menu | selectedMenu] = js.undefined
  }
  object MenuListProps {
    
    inline def apply(): MenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListProps]
    }
    
    extension [Self <: MenuListProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusItem(value: Boolean): Self = StObject.set(x, "autoFocusItem", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusItemUndefined: Self = StObject.set(x, "autoFocusItem", js.undefined)
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
      
      inline def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
      
      inline def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
      
      inline def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
      
      inline def setVariant(value: menu | selectedMenu): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
