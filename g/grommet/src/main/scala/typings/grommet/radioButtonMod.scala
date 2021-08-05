package typings.grommet

import typings.grommet.utilsMod.A11yTitleType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RadioButton", "RadioButton")
  @js.native
  class RadioButton protected ()
    extends Component[
          RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement])) = this()
    def this(
      props: RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/RadioButton", "RadioButton")
  @js.native
  val RadioButton: ComponentClass[
    RadioButtonProps & (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    ComponentState
  ] = js.native
  
  trait RadioButtonProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var name: String
  }
  object RadioButtonProps {
    
    inline def apply(name: String): RadioButtonProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonProps]
    }
    
    extension [Self <: RadioButtonProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
