package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Absolute
import typings.materialUiCore.materialUiCoreStrings.hr
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
  val default: OverridableComponent[DividerTypeMap[js.Object, hr]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.absolute
    - typings.materialUiCore.materialUiCoreStrings.inset
    - typings.materialUiCore.materialUiCoreStrings.light
    - typings.materialUiCore.materialUiCoreStrings.middle
    - typings.materialUiCore.materialUiCoreStrings.vertical
  */
  trait DividerClassKey extends StObject
  object DividerClassKey {
    
    inline def absolute: typings.materialUiCore.materialUiCoreStrings.absolute = "absolute".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.absolute]
    
    inline def inset: typings.materialUiCore.materialUiCoreStrings.inset = "inset".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.inset]
    
    inline def light: typings.materialUiCore.materialUiCoreStrings.light = "light".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.light]
    
    inline def middle: typings.materialUiCore.materialUiCoreStrings.middle = "middle".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.middle]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def vertical: typings.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.vertical]
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DividerTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (DividerTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: DividerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Absolute): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[DividerTypeMap[js.Object, hr]]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: OverridableComponent[DividerTypeMap[js.Object, hr]] = default
}
