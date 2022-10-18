package typings.materialUiLab

import typings.materialUiLab.anon.PartialClassNameMapTimeliAlignRight
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineOppositeContentTimelineOppositeContentMod {
  
  @JSImport("@material-ui/lab/TimelineOppositeContent/TimelineOppositeContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimelineOppositeContentProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.alignRight
  */
  trait TimelineOppositeContentClassKey extends StObject
  object TimelineOppositeContentClassKey {
    
    inline def alignRight: typings.materialUiLab.materialUiLabStrings.alignRight = "alignRight".asInstanceOf[typings.materialUiLab.materialUiLabStrings.alignRight]
    
    inline def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineOppositeContent/TimelineOppositeContent.TimelineOppositeContentClassKey, never> */
  trait TimelineOppositeContentProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapTimeliAlignRight] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineOppositeContentProps {
    
    inline def apply(): TimelineOppositeContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineOppositeContentProps]
    }
    
    extension [Self <: TimelineOppositeContentProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapTimeliAlignRight): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
