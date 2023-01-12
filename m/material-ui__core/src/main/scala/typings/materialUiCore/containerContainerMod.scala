package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableGutters
import typings.materialUiCore.materialUiCoreStrings.div
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
  val default: OverridableComponent[ContainerTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.disableGutters
    - typings.materialUiCore.materialUiCoreStrings.fixed
    - typings.materialUiCore.materialUiCoreStrings.maxWidthXs
    - typings.materialUiCore.materialUiCoreStrings.maxWidthSm
    - typings.materialUiCore.materialUiCoreStrings.maxWidthMd
    - typings.materialUiCore.materialUiCoreStrings.maxWidthLg
    - typings.materialUiCore.materialUiCoreStrings.maxWidthXl
  */
  trait ContainerClassKey extends StObject
  object ContainerClassKey {
    
    inline def disableGutters: typings.materialUiCore.materialUiCoreStrings.disableGutters = "disableGutters".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disableGutters]
    
    inline def fixed: typings.materialUiCore.materialUiCoreStrings.fixed = "fixed".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.fixed]
    
    inline def maxWidthLg: typings.materialUiCore.materialUiCoreStrings.maxWidthLg = "maxWidthLg".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.maxWidthLg]
    
    inline def maxWidthMd: typings.materialUiCore.materialUiCoreStrings.maxWidthMd = "maxWidthMd".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.maxWidthMd]
    
    inline def maxWidthSm: typings.materialUiCore.materialUiCoreStrings.maxWidthSm = "maxWidthSm".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.maxWidthSm]
    
    inline def maxWidthXl: typings.materialUiCore.materialUiCoreStrings.maxWidthXl = "maxWidthXl".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.maxWidthXl]
    
    inline def maxWidthXs: typings.materialUiCore.materialUiCoreStrings.maxWidthXs = "maxWidthXs".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.maxWidthXs]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ContainerTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: ContainerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ContainerTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: OverridableComponent[ContainerTypeMap[js.Object, div]] = default
}
