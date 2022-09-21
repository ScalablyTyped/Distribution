package typings.grommet

import typings.grommet.anon.Fixed
import typings.grommet.dropMod.DropProps
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.TextAlignType
import typings.react.mod.FC
import typings.react.mod.FocusEvent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskedInputMod {
  
  @JSImport("grommet/components/MaskedInput", "MaskedInput")
  @js.native
  val MaskedInput: FC[MaskedInputExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'a11yTitle' | 'dropHeight' | 'dropProps' | 'focusIndicator' | 'icon' | 'id' | 'mask' | 'name' | 'onBlur' | 'plain' | 'reverse' | 'size' | 'textAlign' | 'value'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait MaskedInputExtendedProps
    extends StObject
       with MaskedInputProps
  object MaskedInputExtendedProps {
    
    inline def apply(): MaskedInputExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputExtendedProps]
    }
  }
  
  trait MaskedInputProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var focusIndicator: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[js.Array[Fixed]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[
        js.Function1[/* event */ FocusEvent[typings.std.Element, typings.std.Element], Any]
      ] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var textAlign: js.UndefOr[TextAlignType] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object MaskedInputProps {
    
    inline def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    extension [Self <: MaskedInputProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setDropHeight(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
      
      inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      inline def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMask(value: js.Array[Fixed]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(value: Fixed*): Self = StObject.set(x, "mask", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: /* event */ FocusEvent[typings.std.Element, typings.std.Element] => Any): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type MaskedInputType = MaskedInputExtendedProps
}
