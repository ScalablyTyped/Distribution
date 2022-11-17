package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.FontSize
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIconMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [Icon API](https://mui.com/api/icon/)
    */
  @JSImport("@material-ui/core/Icon/Icon", JSImport.Default)
  @js.native
  val default: OverridableComponent[IconTypeMap[js.Object, "span"]] = js.native
  
  object IconClassKey {
    
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
  type IconClassKey = "root" | "colorSecondary" | "colorAction" | "colorDisabled" | "colorError" | "colorPrimary" | "fontSizeInherit" | "fontSizeSmall" | "fontSizeLarge"
  
  type IconProps[D /* <: ElementType[Any] */, P] = OverrideProps[IconTypeMap[P, D], D]
  
  trait IconTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: IconClassKey
    
    var defaultComponent: D
    
    var props: P & FontSize
  }
  object IconTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: IconClassKey, defaultComponent: D, props: P & FontSize): IconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconTypeMap[P, D]]
    }
    
    extension [Self <: IconTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (IconTypeMap[P, D])) {
      
      inline def setClassKey(value: IconClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & FontSize): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[IconTypeMap[js.Object, "span"]]
  
  /* This means you don't have to write `default`, but can instead just say `iconIconMod.foo` */
  override def _to: OverridableComponent[IconTypeMap[js.Object, "span"]] = default
}
