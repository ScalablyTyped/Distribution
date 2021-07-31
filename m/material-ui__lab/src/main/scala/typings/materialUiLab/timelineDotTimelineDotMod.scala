package typings.materialUiLab

import typings.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typings.materialUiLab.materialUiLabStrings.default
import typings.materialUiLab.materialUiLabStrings.grey
import typings.materialUiLab.materialUiLabStrings.inherit
import typings.materialUiLab.materialUiLabStrings.outlined
import typings.materialUiLab.materialUiLabStrings.primary
import typings.materialUiLab.materialUiLabStrings.secondary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineDotTimelineDotMod {
  
  @JSImport("@material-ui/lab/TimelineDot/TimelineDot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.defaultDefault
    - typings.materialUiLab.materialUiLabStrings.defaultPrimary
    - typings.materialUiLab.materialUiLabStrings.defaultSecondary
    - typings.materialUiLab.materialUiLabStrings.outlinedDefault
    - typings.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typings.materialUiLab.materialUiLabStrings.outlinedSecondary
  */
  trait TimelineDotClassKey extends StObject
  object TimelineDotClassKey {
    
    @scala.inline
    def defaultDefault: typings.materialUiLab.materialUiLabStrings.defaultDefault = "defaultDefault".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultDefault]
    
    @scala.inline
    def defaultPrimary: typings.materialUiLab.materialUiLabStrings.defaultPrimary = "defaultPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultPrimary]
    
    @scala.inline
    def defaultSecondary: typings.materialUiLab.materialUiLabStrings.defaultSecondary = "defaultSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.defaultSecondary]
    
    @scala.inline
    def outlinedDefault: typings.materialUiLab.materialUiLabStrings.outlinedDefault = "outlinedDefault".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedDefault]
    
    @scala.inline
    def outlinedPrimary: typings.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    @scala.inline
    def outlinedSecondary: typings.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey, never> */
  trait TimelineDotProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[PartialClassNameMapTimeliDefaultDefault] = js.undefined
    
    /**
      * The dot can have a different colors.
      */
    var color: js.UndefOr[inherit | primary | secondary | grey] = js.undefined
    
    var innerRef: js.UndefOr[Ref[js.Any] | RefObject[js.Any]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The dot can appear filled or outlined.
      */
    var variant: js.UndefOr[default | outlined] = js.undefined
  }
  object TimelineDotProps {
    
    @scala.inline
    def apply(): TimelineDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineDotProps]
    }
    
    @scala.inline
    implicit class TimelineDotPropsMutableBuilder[Self <: TimelineDotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapTimeliDefaultDefault): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setColor(value: inherit | primary | secondary | grey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
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
      
      @scala.inline
      def setVariant(value: default | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
