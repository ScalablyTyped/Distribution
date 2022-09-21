package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.boxMod.BoxProps
import typings.grommet.checkBoxMod.CheckBoxProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBoxGroupMod {
  
  @JSImport("grommet/components/CheckBoxGroup", "CheckBoxGroup")
  @js.native
  val CheckBoxGroup: FC[CheckBoxGroupExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'onClick' | 'onChange'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait CheckBoxGroupExtendedProps
    extends StObject
       with CheckBoxGroupProps
       with BoxProps
  object CheckBoxGroupExtendedProps {
    
    inline def apply(options: js.Array[CheckBoxType | String]): CheckBoxGroupExtendedProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckBoxGroupExtendedProps]
    }
  }
  
  trait CheckBoxGroupProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var labelKey: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ js.UndefOr[OnChangeEvent], Unit]] = js.undefined
    
    var options: js.Array[CheckBoxType | String]
    
    var value: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object CheckBoxGroupProps {
    
    inline def apply(options: js.Array[CheckBoxType | String]): CheckBoxGroupProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckBoxGroupProps]
    }
    
    extension [Self <: CheckBoxGroupProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* event */ js.UndefOr[OnChangeEvent] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOptions(value: js.Array[CheckBoxType | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (CheckBoxType | String)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof grommet.grommet/components/CheckBox.CheckBoxProps & react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'checked'> ]: grommet.grommet/components/CheckBox.CheckBoxProps & react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait CheckBoxType
    extends StObject
       with /* key */ StringDictionary[Any]
  object CheckBoxType {
    
    inline def apply(): CheckBoxType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckBoxType]
    }
  }
  
  trait OnChangeEvent extends StObject {
    
    var option: String | CheckBoxProps
    
    var value: String
  }
  object OnChangeEvent {
    
    inline def apply(option: String | CheckBoxProps, value: String): OnChangeEvent = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeEvent]
    }
    
    extension [Self <: OnChangeEvent](x: Self) {
      
      inline def setOption(value: String | CheckBoxProps): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
