package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.iconMod.LabIcon
import typings.jupyterlabUiComponents.interfaceMod.IElementRefProps
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IProps
import typings.react.mod.Component
import typings.react.mod.SelectHTMLAttributes
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlselectMod {
  
  @JSImport("@jupyterlab/ui-components/lib/components/htmlselect", "HTMLSelect")
  @js.native
  open class HTMLSelect protected ()
    extends Component[IHTMLSelectProps, js.Object, Any] {
    def this(props: IHTMLSelectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IHTMLSelectProps, context: Any) = this()
  }
  
  @JSImport("@jupyterlab/ui-components/lib/components/htmlselect", "HTML_SELECT_CLASS")
  @js.native
  val HTML_SELECT_CLASS: /* "jp-HTMLSelect" */ String = js.native
  
  trait IHTMLSelectProps
    extends StObject
       with IElementRefProps[HTMLSelectElement]
       with SelectHTMLAttributes[HTMLSelectElement] {
    
    var defaultStyle: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[LabIcon] = js.undefined
    
    var iconProps: js.UndefOr[IProps] = js.undefined
    
    var options: js.UndefOr[js.Array[String | Double | IOptionProps]] = js.undefined
  }
  object IHTMLSelectProps {
    
    inline def apply(): IHTMLSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHTMLSelectProps]
    }
    
    extension [Self <: IHTMLSelectProps](x: Self) {
      
      inline def setDefaultStyle(value: Boolean): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconProps(value: IProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      inline def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOptions(value: js.Array[String | Double | IOptionProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: (String | Double | IOptionProps)*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait IOptionProps extends StObject {
    
    /**
      * A space-delimited list of class names
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this option is non-interactive.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Label text for this option. If omitted, `value` is used as the label.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Value of this option.
      */
    var value: String | Double
  }
  object IOptionProps {
    
    inline def apply(value: String | Double): IOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionProps]
    }
    
    extension [Self <: IOptionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
