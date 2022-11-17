package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.TypographyClasses
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.materialUiCore.typographyTypographyMod.TypographyProps
import typings.materialUiTypes.mod.Omit
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ElementType
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Links](https://mui.com/components/links/)
    *
    * API:
    *
    * - [Link API](https://mui.com/api/link/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/Link/Link", JSImport.Default)
  @js.native
  val default: OverridableComponent[LinkTypeMap[js.Object, "a"]] = js.native
  
  type LinkBaseProps = AnchorHTMLAttributes[HTMLAnchorElement] & (Omit[TypographyProps["span", js.Object], "component"])
  
  object LinkClassKey {
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def focusVisible: "focusVisible" = "focusVisible".asInstanceOf["focusVisible"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def underlineAlways: "underlineAlways" = "underlineAlways".asInstanceOf["underlineAlways"]
    
    inline def underlineHover: "underlineHover" = "underlineHover".asInstanceOf["underlineHover"]
    
    inline def underlineNone: "underlineNone" = "underlineNone".asInstanceOf["underlineNone"]
  }
  type LinkClassKey = "root" | "underlineNone" | "underlineHover" | "underlineAlways" | "button" | "focusVisible"
  
  type LinkProps[D /* <: ElementType[Any] */, P] = OverrideProps[LinkTypeMap[P, D], D]
  
  trait LinkTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: LinkClassKey
    
    var defaultComponent: D
    
    var props: P & LinkBaseProps & TypographyClasses
  }
  object LinkTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: LinkClassKey, defaultComponent: D, props: P & LinkBaseProps & TypographyClasses): LinkTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkTypeMap[P, D]]
    }
    
    extension [Self <: LinkTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (LinkTypeMap[P, D])) {
      
      inline def setClassKey(value: LinkClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & LinkBaseProps & TypographyClasses): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[LinkTypeMap[js.Object, "a"]]
  
  /* This means you don't have to write `default`, but can instead just say `linkLinkMod.foo` */
  override def _to: OverridableComponent[LinkTypeMap[js.Object, "a"]] = default
}
