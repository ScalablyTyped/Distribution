package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableSticky
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderListSubheaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [ListSubheader API](https://mui.com/api/list-subheader/)
    */
  @JSImport("@material-ui/core/ListSubheader/ListSubheader", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]] = js.native
  
  object ListSubheaderClassKey {
    
    inline def colorInherit: "colorInherit" = "colorInherit".asInstanceOf["colorInherit"]
    
    inline def colorPrimary: "colorPrimary" = "colorPrimary".asInstanceOf["colorPrimary"]
    
    inline def gutters: "gutters" = "gutters".asInstanceOf["gutters"]
    
    inline def inset: "inset" = "inset".asInstanceOf["inset"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def sticky: "sticky" = "sticky".asInstanceOf["sticky"]
  }
  type ListSubheaderClassKey = "root" | "colorPrimary" | "colorInherit" | "inset" | "sticky" | "gutters"
  
  type ListSubheaderProps[D /* <: ElementType[Any] */, P] = OverrideProps[ListSubheaderTypeMap[P, D], D]
  
  trait ListSubheaderTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ListSubheaderClassKey
    
    var defaultComponent: D
    
    var props: P & DisableSticky
  }
  object ListSubheaderTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ListSubheaderClassKey, defaultComponent: D, props: P & DisableSticky): ListSubheaderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderTypeMap[P, D]]
    }
    
    extension [Self <: ListSubheaderTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (ListSubheaderTypeMap[P, D])) {
      
      inline def setClassKey(value: ListSubheaderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableSticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderListSubheaderMod.foo` */
  override def _to: OverridableComponent[ListSubheaderTypeMap[js.Object, "li"]] = default
}
