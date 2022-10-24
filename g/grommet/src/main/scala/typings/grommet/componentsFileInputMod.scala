package typings.grommet

import typings.grommet.anon.AggregateThreshold
import typings.grommet.anon.Browse
import typings.grommet.anon.Files
import typings.grommet.anon.OnCancel
import typings.grommet.anon.Target
import typings.grommet.grommetStrings.multiple
import typings.grommet.grommetStrings.onChange
import typings.react.mod.ChangeEvent
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLInputElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsFileInputMod {
  
  @JSImport("grommet/components/FileInput", "FileInput")
  @js.native
  val FileInput: FC[FileInputExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'multiple' | 'onChange'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait FileInputExtendedProps
    extends StObject
       with FileInputProps
  object FileInputExtendedProps {
    
    inline def apply(): FileInputExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInputExtendedProps]
    }
  }
  
  trait FileInputProps extends StObject {
    
    var confirmRemove: js.UndefOr[js.Function1[/* param0 */ OnCancel, ReactElement]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[Browse] = js.undefined
    
    var multiple: js.UndefOr[Boolean | AggregateThreshold] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
          /* param1 */ js.UndefOr[Files], 
          /* param2 */ js.UndefOr[Target], 
          Unit
        ]
      ] = js.undefined
    
    var renderFile: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  }
  object FileInputProps {
    
    inline def apply(): FileInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileInputProps]
    }
    
    extension [Self <: FileInputProps](x: Self) {
      
      inline def setConfirmRemove(value: /* param0 */ OnCancel => ReactElement): Self = StObject.set(x, "confirmRemove", js.Any.fromFunction1(value))
      
      inline def setConfirmRemoveUndefined: Self = StObject.set(x, "confirmRemove", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMessages(value: Browse): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMultiple(value: Boolean | AggregateThreshold): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* param1 */ js.UndefOr[Files], /* param2 */ js.UndefOr[Target]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderFile(value: /* repeated */ Any => Unit): Self = StObject.set(x, "renderFile", js.Any.fromFunction1(value))
      
      inline def setRenderFileUndefined: Self = StObject.set(x, "renderFile", js.undefined)
    }
  }
  
  type inputProps = Omit[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    multiple | onChange
  ]
}
