package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Image
import typings.materialUiCore.materialUiCoreStrings.div
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaCardMediaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardMedia API](https://mui.com/api/card-media/)
    */
  @JSImport("@material-ui/core/CardMedia/CardMedia", JSImport.Default)
  @js.native
  val default: OverridableComponent[CardMediaTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.media
  */
  trait CardMediaClassKey extends StObject
  object CardMediaClassKey {
    
    inline def media: typings.materialUiCore.materialUiCoreStrings.media = "media".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.media]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type CardMediaProps[D /* <: ElementType[Any] */, P] = OverrideProps[CardMediaTypeMap[P, D], D]
  
  trait CardMediaTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: CardMediaClassKey
    
    var defaultComponent: D
    
    var props: P & Image
  }
  object CardMediaTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: CardMediaClassKey, defaultComponent: D, props: P & Image): CardMediaTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardMediaTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardMediaTypeMap[?, ?], P, D /* <: ElementType[Any] */] (val x: Self & (CardMediaTypeMap[P, D])) extends AnyVal {
      
      inline def setClassKey(value: CardMediaClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Image): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[CardMediaTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `cardMediaCardMediaMod.foo` */
  override def _to: OverridableComponent[CardMediaTypeMap[js.Object, div]] = default
}
