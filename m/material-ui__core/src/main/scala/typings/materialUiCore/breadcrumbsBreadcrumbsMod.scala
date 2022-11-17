package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.ExpandText
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
  val default: OverridableComponent[BreadcrumbsTypeMap[js.Object, "nav"]] = js.native
  
  object BreadcrumbsClassKey {
    
    inline def li: "li" = "li".asInstanceOf["li"]
    
    inline def ol: "ol" = "ol".asInstanceOf["ol"]
    
    inline def root: "root" = "root".asInstanceOf["root"]
    
    inline def separator: "separator" = "separator".asInstanceOf["separator"]
  }
  type BreadcrumbsClassKey = "root" | "ol" | "li" | "separator"
  
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
  
  type _To = OverridableComponent[BreadcrumbsTypeMap[js.Object, "nav"]]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbsBreadcrumbsMod.foo` */
  override def _to: OverridableComponent[BreadcrumbsTypeMap[js.Object, "nav"]] = default
}
