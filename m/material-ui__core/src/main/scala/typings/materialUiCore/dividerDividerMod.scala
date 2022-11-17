package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Absolute
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dividers](https://mui.com/components/dividers/)
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/api/divider/)
    */
  @JSImport("@material-ui/core/Divider/Divider", JSImport.Default)
  @js.native
  val default: OverridableComponent[DividerTypeMap[js.Object, "hr"]] = js.native
  
  object DividerClassKey {
    
    inline def absolute: "absolute" = "absolute".asInstanceOf["absolute"]
    
    inline def inset: "inset" = "inset".asInstanceOf["inset"]
    
    inline def light: "light" = "light".asInstanceOf["light"]
    
    inline def middle: "middle" = "middle".asInstanceOf["middle"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def vertical: "vertical" = "vertical".asInstanceOf["vertical"]
  }
  type DividerClassKey = "root" | "absolute" | "inset" | "light" | "middle" | "vertical"
  
  type DividerProps[D /* <: ElementType[Any] */, P] = OverrideProps[DividerTypeMap[P, D], D]
  
  trait DividerTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: DividerClassKey
    
    var defaultComponent: D
    
    var props: P & Absolute
  }
  object DividerTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: DividerClassKey, defaultComponent: D, props: P & Absolute): DividerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerTypeMap[P, D]]
    }
    
    extension [Self <: DividerTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (DividerTypeMap[P, D])) {
      
      inline def setClassKey(value: DividerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Absolute): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[DividerTypeMap[js.Object, "hr"]]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: OverridableComponent[DividerTypeMap[js.Object, "hr"]] = default
}
