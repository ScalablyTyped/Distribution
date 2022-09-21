package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ExpandText
import typings.materialUiCore.materialUiCoreStrings.nav
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsBreadcrumbsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/api/breadcrumbs/)
    */
  @JSImport("@material-ui/core/Breadcrumbs/Breadcrumbs", JSImport.Default)
  @js.native
  val default: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.ol
    - typings.materialUiCore.materialUiCoreStrings.li
    - typings.materialUiCore.materialUiCoreStrings.separator
  */
  trait BreadcrumbsClassKey extends StObject
  object BreadcrumbsClassKey {
    
    inline def li: typings.materialUiCore.materialUiCoreStrings.li = "li".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.li]
    
    inline def ol: typings.materialUiCore.materialUiCoreStrings.ol = "ol".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.ol]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def separator: typings.materialUiCore.materialUiCoreStrings.separator = "separator".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.separator]
  }
  
  type BreadcrumbsProps[D /* <: ElementType[Any] */, P] = OverrideProps[BreadcrumbsTypeMap[P, D], D]
  
  trait BreadcrumbsTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: BreadcrumbsClassKey
    
    var defaultComponent: D
    
    var props: P & ExpandText
  }
  object BreadcrumbsTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: BreadcrumbsClassKey, defaultComponent: D, props: P & ExpandText): BreadcrumbsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsTypeMap[P, D]]
    }
    
    extension [Self <: BreadcrumbsTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (BreadcrumbsTypeMap[P, D])) {
      
      inline def setClassKey(value: BreadcrumbsClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ExpandText): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbsBreadcrumbsMod.foo` */
  override def _to: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = default
}
