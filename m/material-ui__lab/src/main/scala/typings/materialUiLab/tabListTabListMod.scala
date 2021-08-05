package typings.materialUiLab

import typings.materialUiCore.tabsTabsMod.TabsClassKey
import typings.materialUiLab.materialUiLabStrings.value
import typings.materialUiTypes.mod.Omit
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListTabListMod {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://material-ui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://material-ui.com/api/tab-list/)
    * - inherits [Tabs API](https://material-ui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab/TabList/TabList", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<TabListTypeMap> */ js.Any = js.native
  
  type TabListClassKey = TabsClassKey
  
  type TabListProps[D /* <: ElementType[js.Any] */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<TabListTypeMap<P, D>, D> */ js.Any
  
  trait TabListTypeMap[P, D /* <: ElementType[js.Any] */] extends StObject {
    
    var classKey: TabListClassKey
    
    var defaultComponent: D
    
    var props: P & (Omit[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
        value
      ])
  }
  object TabListTypeMap {
    
    inline def apply[P, D /* <: ElementType[js.Any] */](
      classKey: TabListClassKey,
      defaultComponent: D,
      props: P & (Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
          value
        ])
    ): TabListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabListTypeMap[P, D]]
    }
    
    extension [Self <: TabListTypeMap[?, ?], P, D /* <: ElementType[js.Any] */](x: Self & (TabListTypeMap[P, D])) {
      
      inline def setClassKey(value: TabListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: P & (Omit[
              /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
              value
            ])
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
