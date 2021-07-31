package typings.materialUiLab

import typings.materialUiLab.anon.PartialClassNameMapTimeli
import typings.materialUiLab.materialUiLabStrings.alternate
import typings.materialUiLab.materialUiLabStrings.left
import typings.materialUiLab.materialUiLabStrings.right
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineTimelineMod {
  
  @JSImport("@material-ui/lab/Timeline/Timeline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TimelineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.alignLeft
    - typings.materialUiLab.materialUiLabStrings.alignRight
    - typings.materialUiLab.materialUiLabStrings.alignAlternate
  */
  trait TimelineClassKey extends StObject
  object TimelineClassKey {
    
    @scala.inline
    def alignAlternate: typings.materialUiLab.materialUiLabStrings.alignAlternate = "alignAlternate".asInstanceOf[typings.materialUiLab.materialUiLabStrings.alignAlternate]
    
    @scala.inline
    def alignLeft: typings.materialUiLab.materialUiLabStrings.alignLeft = "alignLeft".asInstanceOf[typings.materialUiLab.materialUiLabStrings.alignLeft]
    
    @scala.inline
    def alignRight: typings.materialUiLab.materialUiLabStrings.alignRight = "alignRight".asInstanceOf[typings.materialUiLab.materialUiLabStrings.alignRight]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/Timeline/Timeline.TimelineClassKey, never> */
  trait TimelineProps extends StObject {
    
    /**
      * The position where the timeline's content should appear.
      */
    var align: js.UndefOr[left | right | alternate] = js.undefined
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[PartialClassNameMapTimeli] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineProps {
    
    @scala.inline
    def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    @scala.inline
    implicit class TimelinePropsMutableBuilder[Self <: TimelineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right | alternate): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapTimeli): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[js.Any] | RefObject[js.Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
