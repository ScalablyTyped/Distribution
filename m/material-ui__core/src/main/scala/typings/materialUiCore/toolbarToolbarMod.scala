package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Variant
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarToolbarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [Toolbar API](https://mui.com/api/toolbar/)
    */
  @JSImport("@material-ui/core/Toolbar/Toolbar", JSImport.Default)
  @js.native
  val default: OverridableComponent[ToolbarTypeMap[js.Object, "div"]] = js.native
  
  object ToolbarClassKey {
    
    inline def dense: "dense" = "dense".asInstanceOf["dense"]
    
    inline def gutters: "gutters" = "gutters".asInstanceOf["gutters"]
    
    inline def regular: "regular" = "regular".asInstanceOf["regular"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
  }
  type ToolbarClassKey = "root" | "gutters" | "regular" | "dense"
  
  type ToolbarProps[D /* <: ElementType[Any] */, P] = OverrideProps[ToolbarTypeMap[P, D], D]
  
  trait ToolbarTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ToolbarClassKey
    
    var defaultComponent: D
    
    var props: P & Variant
  }
  object ToolbarTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ToolbarClassKey, defaultComponent: D, props: P & Variant): ToolbarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarTypeMap[P, D]]
    }
    
    extension [Self <: ToolbarTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ToolbarTypeMap[P, D])) {
      
      inline def setClassKey(value: ToolbarClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Variant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ToolbarTypeMap[js.Object, "div"]]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarToolbarMod.foo` */
  override def _to: OverridableComponent[ToolbarTypeMap[js.Object, "div"]] = default
}
