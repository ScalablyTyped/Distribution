package typings.grommet

import typings.grommet.anon.Errors
import typings.grommet.anon.Invalid
import typings.grommet.grommetStrings.blur
import typings.grommet.grommetStrings.onChange
import typings.grommet.grommetStrings.onSubmit
import typings.grommet.grommetStrings.submit
import typings.react.mod.BaseSyntheticEvent
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLFormElement
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Form", "Form")
  @js.native
  class Form protected ()
    extends Component[
          FormProps[js.Any] & (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: FormProps[js.Any] & (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ])) = this()
    def this(
      props: FormProps[js.Any] & (Omit[
            DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
            onChange | onSubmit
          ]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Form", "Form")
  @js.native
  val Form: TypedForm[js.Any] = js.native
  
  trait FormExtendedEvent[R, T]
    extends StObject
       with BaseSyntheticEvent[Event, EventTarget & T, EventTarget] {
    
    var touched: Record[String, Boolean]
    
    var value: R
  }
  object FormExtendedEvent {
    
    inline def apply[R, T](
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget & T,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: () => Boolean,
      isPropagationStopped: () => Boolean,
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: () => Unit,
      preventDefault: () => Unit,
      stopPropagation: () => Unit,
      target: EventTarget,
      timeStamp: Double,
      touched: Record[String, Boolean],
      `type`: String,
      value: R
    ): FormExtendedEvent[R, T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist), preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormExtendedEvent[R, T]]
    }
    
    extension [Self <: FormExtendedEvent[?, ?], R, T](x: Self & (FormExtendedEvent[R, T])) {
      
      inline def setTouched(value: Record[String, Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProps[T] extends StObject {
    
    var errors: js.UndefOr[js.Object] = js.undefined
    
    var infos: js.UndefOr[js.Object] = js.undefined
    
    var messages: js.UndefOr[Invalid] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], js.Any]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ FormExtendedEvent[T, Element], Unit]] = js.undefined
    
    var onValidate: js.UndefOr[js.Function1[/* validationResults */ Errors, Unit]] = js.undefined
    
    var validate: js.UndefOr[blur | submit] = js.undefined
    
    var value: js.UndefOr[js.Object] = js.undefined
  }
  object FormProps {
    
    inline def apply[T](): FormProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps[T]]
    }
    
    extension [Self <: FormProps[?], T](x: Self & FormProps[T]) {
      
      inline def setErrors(value: js.Object): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setInfos(value: js.Object): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
      
      inline def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
      
      inline def setMessages(value: Invalid): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnChange(value: /* value */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnReset(value: /* event */ SyntheticEvent[Element, Event] => js.Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(value: /* event */ FormExtendedEvent[T, Element] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnValidate(value: /* validationResults */ Errors => Unit): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setValidate(value: blur | submit): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TypedForm[T] = ComponentClass[
    FormProps[T] & (Omit[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      onChange | onSubmit
    ]), 
    ComponentState
  ]
}
