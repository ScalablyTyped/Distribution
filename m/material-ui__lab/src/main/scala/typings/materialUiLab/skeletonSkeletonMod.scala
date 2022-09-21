package typings.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.overridableComponentMod.OverridableComponent
import typings.materialUiCore.overridableComponentMod.OverrideProps
import typings.materialUiLab.anon.Animation
import typings.materialUiLab.materialUiLabStrings.div
import typings.materialUiLab.materialUiLabStrings.span
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab/Skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: OverridableComponent[SkeletonTypeMap[js.Object, span]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.text
    - typings.materialUiLab.materialUiLabStrings.rect
    - typings.materialUiLab.materialUiLabStrings.circle
    - typings.materialUiLab.materialUiLabStrings.pulse
    - typings.materialUiLab.materialUiLabStrings.wave
    - typings.materialUiLab.materialUiLabStrings.withChildren
    - typings.materialUiLab.materialUiLabStrings.fitContent
    - typings.materialUiLab.materialUiLabStrings.heightAuto
  */
  trait SkeletonClassKey extends StObject
  object SkeletonClassKey {
    
    inline def circle: typings.materialUiLab.materialUiLabStrings.circle = "circle".asInstanceOf[typings.materialUiLab.materialUiLabStrings.circle]
    
    inline def fitContent: typings.materialUiLab.materialUiLabStrings.fitContent = "fitContent".asInstanceOf[typings.materialUiLab.materialUiLabStrings.fitContent]
    
    inline def heightAuto: typings.materialUiLab.materialUiLabStrings.heightAuto = "heightAuto".asInstanceOf[typings.materialUiLab.materialUiLabStrings.heightAuto]
    
    inline def pulse: typings.materialUiLab.materialUiLabStrings.pulse = "pulse".asInstanceOf[typings.materialUiLab.materialUiLabStrings.pulse]
    
    inline def rect: typings.materialUiLab.materialUiLabStrings.rect = "rect".asInstanceOf[typings.materialUiLab.materialUiLabStrings.rect]
    
    inline def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    inline def text: typings.materialUiLab.materialUiLabStrings.text = "text".asInstanceOf[typings.materialUiLab.materialUiLabStrings.text]
    
    inline def wave: typings.materialUiLab.materialUiLabStrings.wave = "wave".asInstanceOf[typings.materialUiLab.materialUiLabStrings.wave]
    
    inline def withChildren: typings.materialUiLab.materialUiLabStrings.withChildren = "withChildren".asInstanceOf[typings.materialUiLab.materialUiLabStrings.withChildren]
  }
  
  type SkeletonProps[D /* <: ElementType[Any] */, P] = OverrideProps[SkeletonTypeMap[P, D], D]
  
  trait SkeletonTypeMap[P, D /* <: ElementType[Any] */] extends StObject {
    
    var classKey: SkeletonClassKey
    
    var defaultComponent: div
    
    var props: P & Animation
  }
  object SkeletonTypeMap {
    
    inline def apply[P, D /* <: ElementType[Any] */](classKey: SkeletonClassKey, props: P & Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    extension [Self <: SkeletonTypeMap[?, ?], P, D /* <: ElementType[Any] */](x: Self & (SkeletonTypeMap[P, D])) {
      
      inline def setClassKey(value: SkeletonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SkeletonTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonSkeletonMod.foo` */
  override def _to: OverridableComponent[SkeletonTypeMap[js.Object, span]] = default
}
