package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.OnChange
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationBottomNavigationMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/api/bottom-navigation/)
    */
  @JSImport("@material-ui/core/BottomNavigation/BottomNavigation", JSImport.Default)
  @js.native
  val default: OverridableComponent[BottomNavigationTypeMap[js.Object, div]] = js.native
  
  type BottomNavigationClassKey = root
  
  type BottomNavigationProps[D /* <: ElementType[Any] */, P] = OverrideProps[BottomNavigationTypeMap[P, D], D]
  
  trait BottomNavigationTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: BottomNavigationClassKey
    
    var defaultComponent: D
    
    var props: P & OnChange
  }
  object BottomNavigationTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: BottomNavigationClassKey, defaultComponent: D, props: P & OnChange): BottomNavigationTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BottomNavigationTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (BottomNavigationTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: BottomNavigationClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OnChange): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[BottomNavigationTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationBottomNavigationMod.foo` */
  override def _to: OverridableComponent[BottomNavigationTypeMap[js.Object, div]] = default
}
