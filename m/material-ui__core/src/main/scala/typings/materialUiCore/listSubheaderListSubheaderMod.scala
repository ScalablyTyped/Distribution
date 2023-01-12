package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.DisableSticky
import typings.materialUiCore.materialUiCoreStrings.li
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
  val default: OverridableComponent[ListSubheaderTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.colorPrimary
    - typings.materialUiCore.materialUiCoreStrings.colorInherit
    - typings.materialUiCore.materialUiCoreStrings.inset
    - typings.materialUiCore.materialUiCoreStrings.sticky
    - typings.materialUiCore.materialUiCoreStrings.gutters
  */
  trait ListSubheaderClassKey extends StObject
  object ListSubheaderClassKey {
    
    inline def colorInherit: typings.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def colorPrimary: typings.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def gutters: typings.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def inset: typings.materialUiCore.materialUiCoreStrings.inset = "inset".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.inset]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def sticky: typings.materialUiCore.materialUiCoreStrings.sticky = "sticky".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.sticky]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListSubheaderTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ListSubheaderTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: ListSubheaderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableSticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ListSubheaderTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderListSubheaderMod.foo` */
  override def _to: OverridableComponent[ListSubheaderTypeMap[js.Object, li]] = default
}
