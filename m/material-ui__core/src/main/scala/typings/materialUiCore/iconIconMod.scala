package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.FontSize
import typings.materialUiCore.materialUiCoreStrings.span
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
  val default: OverridableComponent[IconTypeMap[js.Object, span]] = js.native
  
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
  trait IconClassKey extends StObject
  object IconClassKey {
    
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
  
  type _To = OverridableComponent[IconTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `iconIconMod.foo` */
  override def _to: OverridableComponent[IconTypeMap[js.Object, span]] = default
}
