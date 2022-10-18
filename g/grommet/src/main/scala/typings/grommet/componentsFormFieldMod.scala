package typings.grommet

import typings.grommet.anon.Indicator
import typings.grommet.anon.Message
import typings.grommet.componentsBoxMod.BoxProps
import typings.grommet.grommetStrings.placeholder
import typings.grommet.grommetStrings.required
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.Omit
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsFormFieldMod {
  
  @JSImport("grommet/components/FormField", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormField[T](p: FormFieldExtendedProps & T): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("FormField")(p.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'placeholder' | 'required'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait FormFieldExtendedProps
    extends StObject
       with FormFieldProps
  object FormFieldExtendedProps {
    
    inline def apply(): FormFieldExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldExtendedProps]
    }
  }
  
  trait FormFieldProps extends StObject {
    
    var component: js.UndefOr[Any] = js.undefined
    
    var contentProps: js.UndefOr[BoxProps] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String | ReactNode] = js.undefined
    
    var help: js.UndefOr[String | ReactNode] = js.undefined
    
    var htmlFor: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String | ReactNode] = js.undefined
    
    var label: js.UndefOr[String | ReactNode] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[String]] = js.undefined
    
    var pad: js.UndefOr[Boolean] = js.undefined
    
    // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
    var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
    
    var required: js.UndefOr[Boolean | Indicator] = js.undefined
    
    var validate: js.UndefOr[
        Message | (js.Function1[/* repeated */ Any, Any]) | (js.Array[Message | (js.Function1[/* repeated */ Any, Any])])
      ] = js.undefined
  }
  object FormFieldProps {
    
    inline def apply(): FormFieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldProps]
    }
    
    extension [Self <: FormFieldProps](x: Self) {
      
      inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setContentProps(value: BoxProps): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String | ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHelp(value: String | ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setInfo(value: String | ReactNode): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLabel(value: String | ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPlaceholder(value: PlaceHolderType): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean | Indicator): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValidate(
        value: Message | (js.Function1[/* repeated */ Any, Any]) | (js.Array[Message | (js.Function1[/* repeated */ Any, Any])])
      ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction1(value: /* repeated */ Any => Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: (Message | (js.Function1[/* repeated */ Any, Any]))*): Self = StObject.set(x, "validate", js.Array(value*))
    }
  }
  
  type inputProps = Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    placeholder | required
  ]
}
