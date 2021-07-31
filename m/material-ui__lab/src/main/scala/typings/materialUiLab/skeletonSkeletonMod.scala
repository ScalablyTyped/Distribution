package typings.materialUiLab

import typings.materialUiLab.anon.Animation
import typings.materialUiLab.materialUiLabStrings.div
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://material-ui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://material-ui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab/Skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  
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
    
    @scala.inline
    def circle: typings.materialUiLab.materialUiLabStrings.circle = "circle".asInstanceOf[typings.materialUiLab.materialUiLabStrings.circle]
    
    @scala.inline
    def fitContent: typings.materialUiLab.materialUiLabStrings.fitContent = "fitContent".asInstanceOf[typings.materialUiLab.materialUiLabStrings.fitContent]
    
    @scala.inline
    def heightAuto: typings.materialUiLab.materialUiLabStrings.heightAuto = "heightAuto".asInstanceOf[typings.materialUiLab.materialUiLabStrings.heightAuto]
    
    @scala.inline
    def pulse: typings.materialUiLab.materialUiLabStrings.pulse = "pulse".asInstanceOf[typings.materialUiLab.materialUiLabStrings.pulse]
    
    @scala.inline
    def rect: typings.materialUiLab.materialUiLabStrings.rect = "rect".asInstanceOf[typings.materialUiLab.materialUiLabStrings.rect]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def text: typings.materialUiLab.materialUiLabStrings.text = "text".asInstanceOf[typings.materialUiLab.materialUiLabStrings.text]
    
    @scala.inline
    def wave: typings.materialUiLab.materialUiLabStrings.wave = "wave".asInstanceOf[typings.materialUiLab.materialUiLabStrings.wave]
    
    @scala.inline
    def withChildren: typings.materialUiLab.materialUiLabStrings.withChildren = "withChildren".asInstanceOf[typings.materialUiLab.materialUiLabStrings.withChildren]
  }
  
  type SkeletonProps[D /* <: ElementType[js.Any] */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<SkeletonTypeMap<P, D>, D> */ js.Any
  
  trait SkeletonTypeMap[P, D /* <: ElementType[js.Any] */] extends StObject {
    
    var classKey: SkeletonClassKey
    
    var defaultComponent: div
    
    var props: P & Animation
  }
  object SkeletonTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType[js.Any] */](classKey: SkeletonClassKey, props: P & Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class SkeletonTypeMapMutableBuilder[Self <: SkeletonTypeMap[?, ?], P, D /* <: ElementType[js.Any] */] (val x: Self & (SkeletonTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setClassKey(value: SkeletonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P & Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
