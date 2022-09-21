package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.TypographyClasses
import typings.materialUiCore.materialUiCoreStrings.a
import typings.materialUiCore.materialUiCoreStrings.component
import typings.materialUiCore.materialUiCoreStrings.span
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
  val default: OverridableComponent[LinkTypeMap[js.Object, a]] = js.native
  
  type LinkBaseProps = AnchorHTMLAttributes[HTMLAnchorElement] & (Omit[TypographyProps[span, js.Object], component])
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.underlineNone
    - typings.materialUiCore.materialUiCoreStrings.underlineHover
    - typings.materialUiCore.materialUiCoreStrings.underlineAlways
    - typings.materialUiCore.materialUiCoreStrings.button
    - typings.materialUiCore.materialUiCoreStrings.focusVisible
  */
  trait LinkClassKey extends StObject
  object LinkClassKey {
    
    inline def button: typings.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.button]
    
    inline def focusVisible: typings.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def underlineAlways: typings.materialUiCore.materialUiCoreStrings.underlineAlways = "underlineAlways".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.underlineAlways]
    
    inline def underlineHover: typings.materialUiCore.materialUiCoreStrings.underlineHover = "underlineHover".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.underlineHover]
    
    inline def underlineNone: typings.materialUiCore.materialUiCoreStrings.underlineNone = "underlineNone".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.underlineNone]
  }
  
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
  
  type _To = OverridableComponent[LinkTypeMap[js.Object, a]]
  
  /* This means you don't have to write `default`, but can instead just say `linkLinkMod.foo` */
  override def _to: OverridableComponent[LinkTypeMap[js.Object, a]] = default
}
