package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Dense
import typings.materialUiCore.materialUiCoreStrings.ul
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/api/list/)
    */
  @JSImport("@material-ui/core/List/List", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListTypeMap[js.Object, ul]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.padding
    - typings.materialUiCore.materialUiCoreStrings.dense
    - typings.materialUiCore.materialUiCoreStrings.subheader
  */
  trait ListClassKey extends StObject
  object ListClassKey {
    
    inline def dense: typings.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.dense]
    
    inline def padding: typings.materialUiCore.materialUiCoreStrings.padding = "padding".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.padding]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def subheader: typings.materialUiCore.materialUiCoreStrings.subheader = "subheader".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.subheader]
  }
  
  type ListProps[D /* <: ElementType[Any] */, P] = OverrideProps[ListTypeMap[P, D], D]
  
  trait ListTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: ListClassKey
    
    var defaultComponent: D
    
    var props: P & Dense
  }
  object ListTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: ListClassKey, defaultComponent: D, props: P & Dense): ListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (ListTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: ListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Dense): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: OverridableComponent[ListTypeMap[js.Object, ul]] = default
}
