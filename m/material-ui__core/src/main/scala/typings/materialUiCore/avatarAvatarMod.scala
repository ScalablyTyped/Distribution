package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Alt
import typings.materialUiCore.materialUiCoreStrings.div
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
  val default: OverridableComponent[AvatarTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.colorDefault
    - typings.materialUiCore.materialUiCoreStrings.circle
    - typings.materialUiCore.materialUiCoreStrings.circular
    - typings.materialUiCore.materialUiCoreStrings.rounded
    - typings.materialUiCore.materialUiCoreStrings.square
    - typings.materialUiCore.materialUiCoreStrings.img
    - typings.materialUiCore.materialUiCoreStrings.fallback
  */
  trait AvatarClassKey extends StObject
  object AvatarClassKey {
    
    inline def circle: typings.materialUiCore.materialUiCoreStrings.circle = "circle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.circle]
    
    inline def circular: typings.materialUiCore.materialUiCoreStrings.circular = "circular".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.circular]
    
    inline def colorDefault: typings.materialUiCore.materialUiCoreStrings.colorDefault = "colorDefault".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorDefault]
    
    inline def fallback: typings.materialUiCore.materialUiCoreStrings.fallback = "fallback".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fallback]
    
    inline def img: typings.materialUiCore.materialUiCoreStrings.img = "img".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.img]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def rounded: typings.materialUiCore.materialUiCoreStrings.rounded = "rounded".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rounded]
    
    inline def square: typings.materialUiCore.materialUiCoreStrings.square = "square".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.square]
  }
  
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
  
  type _To = OverridableComponent[AvatarTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: OverridableComponent[AvatarTypeMap[js.Object, div]] = default
}
