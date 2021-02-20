package typings.materialUiLab

import typings.materialUiLab.anon.PartialClassNameMapTimeliRoot
import typings.materialUiLab.materialUiLabStrings.root
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineSeparatorTimelineSeparatorMod {
  
  @JSImport("@material-ui/lab/TimelineSeparator/TimelineSeparator", JSImport.Default)
  @js.native
  def default(props: TimelineSeparatorProps): Element = js.native
  
  type TimelineSeparatorClassKey = root
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineSeparator/TimelineSeparator.TimelineSeparatorClassKey, never> */
  @js.native
  trait TimelineSeparatorProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapTimeliRoot] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object TimelineSeparatorProps {
    
    @scala.inline
    def apply(): TimelineSeparatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineSeparatorProps]
    }
    
    @scala.inline
    implicit class TimelineSeparatorPropsMutableBuilder[Self <: TimelineSeparatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapTimeliRoot): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | RefObject[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
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
