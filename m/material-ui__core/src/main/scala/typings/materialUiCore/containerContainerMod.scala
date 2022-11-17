package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableGutters
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/components/container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/api/container/)
    */
  @JSImport("@material-ui/core/Container/Container", JSImport.Default)
  @js.native
  val default: OverridableComponent[ContainerTypeMap[js.Object, "div"]] = js.native
  
  object ContainerClassKey {
    
    inline def disableGutters: "disableGutters" = "disableGutters".asInstanceOf["disableGutters"]
    
    inline def fixed: "fixed" = "fixed".asInstanceOf["fixed"]
    
    inline def maxWidthLg: "maxWidthLg" = "maxWidthLg".asInstanceOf["maxWidthLg"]
    
    inline def maxWidthMd: "maxWidthMd" = "maxWidthMd".asInstanceOf["maxWidthMd"]
    
    inline def maxWidthSm: "maxWidthSm" = "maxWidthSm".asInstanceOf["maxWidthSm"]
    
    inline def maxWidthXl: "maxWidthXl" = "maxWidthXl".asInstanceOf["maxWidthXl"]
    
    inline def maxWidthXs: "maxWidthXs" = "maxWidthXs".asInstanceOf["maxWidthXs"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type ContainerClassKey = "root" | "disableGutters" | "fixed" | "maxWidthXs" | "maxWidthSm" | "maxWidthMd" | "maxWidthLg" | "maxWidthXl"
  
  type ContainerProps[D /* <: ElementType[Any] */, P] = OverrideProps[ContainerTypeMap[P, D], D]
  
  trait ContainerTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ContainerClassKey
    
    var defaultComponent: D
    
    var props: P & DisableGutters
  }
  object ContainerTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ContainerClassKey, defaultComponent: D, props: P & DisableGutters): ContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerTypeMap[P, D]]
    }
    
    extension [Self <: ContainerTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ContainerTypeMap[P, D])) {
      
      inline def setClassKey(value: ContainerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ContainerTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: OverridableComponent[ContainerTypeMap[js.Object, "div"]] = default
}
