package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.HtmlColor
import typings.materialUiCore.materialUiCoreStrings.svg
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
  val default: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.colorSecondary
    - typings.materialUiCore.materialUiCoreStrings.colorAction
    - typings.materialUiCore.materialUiCoreStrings.colorDisabled
    - typings.materialUiCore.materialUiCoreStrings.colorError
    - typings.materialUiCore.materialUiCoreStrings.colorPrimary
    - typings.materialUiCore.materialUiCoreStrings.fontSizeInherit
    - typings.materialUiCore.materialUiCoreStrings.fontSizeSmall
    - typings.materialUiCore.materialUiCoreStrings.fontSizeLarge
  */
  trait SvgIconClassKey extends StObject
  object SvgIconClassKey {
    
    inline def colorAction: typings.materialUiCore.materialUiCoreStrings.colorAction = "colorAction".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorAction]
    
    inline def colorDisabled: typings.materialUiCore.materialUiCoreStrings.colorDisabled = "colorDisabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorDisabled]
    
    inline def colorError: typings.materialUiCore.materialUiCoreStrings.colorError = "colorError".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorError]
    
    inline def colorPrimary: typings.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typings.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def fontSizeInherit: typings.materialUiCore.materialUiCoreStrings.fontSizeInherit = "fontSizeInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fontSizeInherit]
    
    inline def fontSizeLarge: typings.materialUiCore.materialUiCoreStrings.fontSizeLarge = "fontSizeLarge".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fontSizeLarge]
    
    inline def fontSizeSmall: typings.materialUiCore.materialUiCoreStrings.fontSizeSmall = "fontSizeSmall".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fontSizeSmall]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
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
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, svg]]
  
  /* This means you don't have to write `default`, but can instead just say `svgIconSvgIconMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = default
}
