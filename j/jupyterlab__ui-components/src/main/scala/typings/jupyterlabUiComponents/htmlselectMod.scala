package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.iconMod.LabIcon
import typings.jupyterlabUiComponents.interfaceMod.IElementRefProps
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IProps
import typings.react.mod.Component
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlselectMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components/htmlselect", "HTMLSelect")
  @js.native
  class HTMLSelect protected ()
    extends Component[IHTMLSelectProps, js.Object, js.Any] {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: js.Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components/htmlselect", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
  
  @js.native
  trait IHTMLSelectProps
    extends SelectHTMLAttributes[HTMLSelectElement]
       with IElementRefProps[HTMLSelectElement] {
    
    var defaultStyle: js.UndefOr[Boolean] = js.native
    
    var icon: js.UndefOr[LabIcon] = js.native
    
    var iconProps: js.UndefOr[IProps] = js.native
    
    var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.native
  }
  object IHTMLSelectProps {
    
    @scala.inline
    def apply(): IHTMLSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLSelectProps]
    }
    
    @scala.inline
    implicit class IHTMLSelectPropsMutableBuilder[Self <: IHTMLSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultStyle(value: Boolean): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconProps(value: IProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[String | Double | IOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: (String | Double | IOptionProps)*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait IOptionProps extends StObject {
    
    /**
      * A space-delimited list of class names
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Whether this option is non-interactive.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Label text for this option. If omitted, `value` is used as the label.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Value of this option.
      */
    var value: String | Double = js.native
  }
  object IOptionProps {
    
    @scala.inline
    def apply(value: String | Double): IOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionProps]
    }
    
    @scala.inline
    implicit class IOptionPropsMutableBuilder[Self <: IOptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
