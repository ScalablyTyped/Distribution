package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.HtmlColor
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconSvgIconMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  @JSImport("@material-ui/core/SvgIcon/SvgIcon", JSImport.Default)
  @js.native
  val default: OverridableComponent[SvgIconTypeMap[js.Object, "svg"]] = js.native
  
  object SvgIconClassKey {
    
    inline def colorAction: "colorAction" = "colorAction".asInstanceOf["colorAction"]
    
    inline def colorDisabled: "colorDisabled" = "colorDisabled".asInstanceOf["colorDisabled"]
    
    inline def colorError: "colorError" = "colorError".asInstanceOf["colorError"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def fontSizeInherit: "fontSizeInherit" = "fontSizeInherit".asInstanceOf["fontSizeInherit"]
    
    inline def fontSizeLarge: "fontSizeLarge" = "fontSizeLarge".asInstanceOf["fontSizeLarge"]
    
    inline def fontSizeSmall: "fontSizeSmall" = "fontSizeSmall".asInstanceOf["fontSizeSmall"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type SvgIconClassKey = "root" | "colorSecondary" | "colorAction" | "colorDisabled" | "colorError" | "colorPrimary" | "fontSizeInherit" | "fontSizeSmall" | "fontSizeLarge"
  
  type SvgIconProps[D /* <: ElementType[Any] */, P] = OverrideProps[SvgIconTypeMap[P, D], D]
  
  trait SvgIconTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: SvgIconClassKey
    
    var defaultComponent: D
    
    var props: P & HtmlColor
  }
  object SvgIconTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: SvgIconClassKey, defaultComponent: D, props: P & HtmlColor): SvgIconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SvgIconTypeMap[P, D]]
    }
    
    extension [Self <: SvgIconTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (SvgIconTypeMap[P, D])) {
      
      inline def setClassKey(value: SvgIconClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & HtmlColor): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, "svg"]]
  
  /* This means you don't have to write `default`, but can instead just say `svgIconSvgIconMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, "svg"]] = default
}
