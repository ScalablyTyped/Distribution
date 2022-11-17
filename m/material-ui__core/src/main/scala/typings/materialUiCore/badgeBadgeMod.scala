package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.AnchorOrigin
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgeMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    * - [Badges](https://mui.com/components/badges/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/api/badge/)
    */
  @JSImport("@material-ui/core/Badge/Badge", JSImport.Default)
  @js.native
  val default: OverridableComponent[BadgeTypeMap[js.Object, "div"]] = js.native
  
  object BadgeClassKey {
    
    inline def anchorOriginBottomLeftRectangle: "anchorOriginBottomLeftRectangle" = "anchorOriginBottomLeftRectangle".asInstanceOf["anchorOriginBottomLeftRectangle"]
    
    inline def anchorOriginBottomLeftRectangular: "anchorOriginBottomLeftRectangular" = "anchorOriginBottomLeftRectangular".asInstanceOf["anchorOriginBottomLeftRectangular"]
    
    inline def anchorOriginBottomRightCircle: "anchorOriginBottomRightCircle" = "anchorOriginBottomRightCircle".asInstanceOf["anchorOriginBottomRightCircle"]
    
    inline def anchorOriginBottomRightCircular: "anchorOriginBottomRightCircular" = "anchorOriginBottomRightCircular".asInstanceOf["anchorOriginBottomRightCircular"]
    
    inline def anchorOriginBottomRightRectangle: "anchorOriginBottomRightRectangle" = "anchorOriginBottomRightRectangle".asInstanceOf["anchorOriginBottomRightRectangle"]
    
    inline def anchorOriginBottomRightRectangular: "anchorOriginBottomRightRectangular" = "anchorOriginBottomRightRectangular".asInstanceOf["anchorOriginBottomRightRectangular"]
    
    inline def anchorOriginTopLeftCircle: "anchorOriginTopLeftCircle" = "anchorOriginTopLeftCircle".asInstanceOf["anchorOriginTopLeftCircle"]
    
    inline def anchorOriginTopLeftCircular: "anchorOriginTopLeftCircular" = "anchorOriginTopLeftCircular".asInstanceOf["anchorOriginTopLeftCircular"]
    
    inline def anchorOriginTopLeftRectangle: "anchorOriginTopLeftRectangle" = "anchorOriginTopLeftRectangle".asInstanceOf["anchorOriginTopLeftRectangle"]
    
    inline def anchorOriginTopLeftRectangular: "anchorOriginTopLeftRectangular" = "anchorOriginTopLeftRectangular".asInstanceOf["anchorOriginTopLeftRectangular"]
    
    inline def anchorOriginTopRightCircle: "anchorOriginTopRightCircle" = "anchorOriginTopRightCircle".asInstanceOf["anchorOriginTopRightCircle"]
    
    inline def anchorOriginTopRightCircular: "anchorOriginTopRightCircular" = "anchorOriginTopRightCircular".asInstanceOf["anchorOriginTopRightCircular"]
    
    inline def anchorOriginTopRightRectangle: "anchorOriginTopRightRectangle" = "anchorOriginTopRightRectangle".asInstanceOf["anchorOriginTopRightRectangle"]
    
    inline def anchorOriginTopRightRectangular: "anchorOriginTopRightRectangular" = "anchorOriginTopRightRectangular".asInstanceOf["anchorOriginTopRightRectangular"]
    
    inline def badge: "badge" = "badge".asInstanceOf["badge"]
    
    inline def colorError: "colorError" = "colorError".asInstanceOf["colorError"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def colorSecondary: "colorSecondary" = "colorSecondary".asInstanceOf["colorSecondary"]
    
    inline def dot: "dot" = "dot".asInstanceOf["dot"]
    
    inline def invisible: "invisible" = "invisible".asInstanceOf["invisible"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type BadgeClassKey = "root" | "badge" | "colorPrimary" | "colorSecondary" | "colorError" | "dot" | "anchorOriginTopRightRectangle" | "anchorOriginBottomRightRectangle" | "anchorOriginTopLeftRectangle" | "anchorOriginBottomLeftRectangle" | "anchorOriginTopRightCircle" | "anchorOriginBottomRightCircle" | "anchorOriginTopLeftCircle" | "anchorOriginTopRightRectangular" | "anchorOriginBottomRightRectangular" | "anchorOriginTopLeftRectangular" | "anchorOriginBottomLeftRectangular" | "anchorOriginTopRightCircular" | "anchorOriginBottomRightCircular" | "anchorOriginTopLeftCircular" | "invisible"
  
  trait BadgeOrigin extends StObject {
    
    var horizontal: "left" | "right"
    
    var vertical: "top" | "bottom"
  }
  object BadgeOrigin {
    
    inline def apply(horizontal: "left" | "right", vertical: "top" | "bottom"): BadgeOrigin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeOrigin]
    }
    
    extension [Self <: BadgeOrigin](x: Self) {
      
      inline def setHorizontal(value: "left" | "right"): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: "top" | "bottom"): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  type BadgeProps[D /* <: ElementType[Any] */, P] = OverrideProps[BadgeTypeMap[P, D], D]
  
  trait BadgeTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: BadgeClassKey
    
    var defaultComponent: D
    
    var props: P & AnchorOrigin
  }
  object BadgeTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: BadgeClassKey, defaultComponent: D, props: P & AnchorOrigin): BadgeTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeTypeMap[P, D]]
    }
    
    extension [Self <: BadgeTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (BadgeTypeMap[P, D])) {
      
      inline def setClassKey(value: BadgeClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AnchorOrigin): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[BadgeTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `badgeBadgeMod.foo` */
  override def _to: OverridableComponent[BadgeTypeMap[js.Object, "div"]] = default
}
