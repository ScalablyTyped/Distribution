package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.`0`
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.materialUiCoreStrings.root
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentCardContentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardContent API](https://mui.com/api/card-content/)
    */
  @JSImport("@material-ui/core/CardContent/CardContent", JSImport.Default)
  @js.native
  val default: OverridableComponent[CardContentTypeMap[js.Object, div]] = js.native
  
  type CardContentClassKey = root
  
  type CardContentProps[D /* <: ElementType[Any] */, P] = OverrideProps[CardContentTypeMap[P, D], D]
  
  trait CardContentTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: CardContentClassKey
    
    var defaultComponent: D
    
    var props: P & `0`
  }
  object CardContentTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: CardContentClassKey, defaultComponent: D, props: P & `0`): CardContentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardContentTypeMap[P, D]]
    }
    
    extension [Self <: CardContentTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (CardContentTypeMap[P, D])) {
      
      inline def setClassKey(value: CardContentClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & `0`): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[CardContentTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `cardContentCardContentMod.foo` */
  override def _to: OverridableComponent[CardContentTypeMap[js.Object, div]] = default
}
