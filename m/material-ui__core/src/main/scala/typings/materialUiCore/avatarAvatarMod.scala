package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Alt
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/api/avatar/)
    */
  @JSImport("@material-ui/core/Avatar/Avatar", JSImport.Default)
  @js.native
  val default: OverridableComponent[AvatarTypeMap[js.Object, "div"]] = js.native
  
  object AvatarClassKey {
    
    inline def circle: "circle" = "circle".asInstanceOf["circle"]
    
    inline def circular: "circular" = "circular".asInstanceOf["circular"]
    
    inline def colorDefault: "colorDefault" = "colorDefault".asInstanceOf["colorDefault"]
    
    inline def fallback: "fallback" = "fallback".asInstanceOf["fallback"]
    
    inline def img: "img" = "img".asInstanceOf["img"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def rounded: "rounded" = "rounded".asInstanceOf["rounded"]
    
    inline def square: "square" = "square".asInstanceOf["square"]
  }
  type AvatarClassKey = "root" | "colorDefault" | "circle" | "circular" | "rounded" | "square" | "img" | "fallback"
  
  type AvatarProps[D /* <: ElementType[Any] */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  trait AvatarTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: AvatarClassKey
    
    var defaultComponent: D
    
    var props: P & Alt
  }
  object AvatarTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: AvatarClassKey, defaultComponent: D, props: P & Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    extension [Self <: AvatarTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (AvatarTypeMap[P, D])) {
      
      inline def setClassKey(value: AvatarClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[AvatarTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: OverridableComponent[AvatarTypeMap[js.Object, "div"]] = default
}
