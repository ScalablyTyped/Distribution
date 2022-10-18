package typings.leafletGeosearch

import typings.leafletGeosearch.anon.Container
import typings.leafletGeosearch.anon.QueryString
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLFormElement
import typings.std.HTMLInputElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchElementMod {
  
  @JSImport("leaflet-geosearch/dist/SearchElement", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SearchElement {
    def this(hasHandleSubmitSearchLabelClassNames: SearchElementProps) = this()
    
    /* CompleteClass */
    var container: HTMLDivElement = js.native
    
    /* CompleteClass */
    var form: HTMLFormElement = js.native
    
    /* CompleteClass */
    override def handleSubmit(args: QueryString): Unit = js.native
    
    /* CompleteClass */
    var hasError: Boolean = js.native
    
    /* CompleteClass */
    var input: HTMLInputElement = js.native
    
    /* CompleteClass */
    override def onBlur(): Unit = js.native
    
    /* CompleteClass */
    override def onFocus(): Unit = js.native
    
    /* CompleteClass */
    override def onInput(): Unit = js.native
    
    /* CompleteClass */
    override def onKeyPress(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def onKeyUp(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def onSubmit(event: Event): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setQuery(query: String): Unit = js.native
  }
  
  trait SearchElement extends StObject {
    
    var container: HTMLDivElement
    
    var form: HTMLFormElement
    
    def handleSubmit(args: QueryString): Unit
    
    var hasError: Boolean
    
    var input: HTMLInputElement
    
    def onBlur(): Unit
    
    def onFocus(): Unit
    
    def onInput(): Unit
    
    def onKeyPress(event: KeyboardEvent): Unit
    
    def onKeyUp(event: KeyboardEvent): Unit
    
    def onSubmit(event: Event): js.Promise[Unit]
    
    def setQuery(query: String): Unit
  }
  object SearchElement {
    
    inline def apply(
      container: HTMLDivElement,
      form: HTMLFormElement,
      handleSubmit: QueryString => Unit,
      hasError: Boolean,
      input: HTMLInputElement,
      onBlur: () => Unit,
      onFocus: () => Unit,
      onInput: () => Unit,
      onKeyPress: KeyboardEvent => Unit,
      onKeyUp: KeyboardEvent => Unit,
      onSubmit: Event => js.Promise[Unit],
      setQuery: String => Unit
    ): SearchElement = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = js.Any.fromFunction1(handleSubmit), hasError = hasError.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), onInput = js.Any.fromFunction0(onInput), onKeyPress = js.Any.fromFunction1(onKeyPress), onKeyUp = js.Any.fromFunction1(onKeyUp), onSubmit = js.Any.fromFunction1(onSubmit), setQuery = js.Any.fromFunction1(setQuery))
      __obj.asInstanceOf[SearchElement]
    }
    
    extension [Self <: SearchElement](x: Self) {
      
      inline def setContainer(value: HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setForm(value: HTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setHandleSubmit(value: QueryString => Unit): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction1(value))
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setOnInput(value: () => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction0(value))
      
      inline def setOnKeyPress(value: KeyboardEvent => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyUp(value: KeyboardEvent => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnSubmit(value: Event => js.Promise[Unit]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setSetQuery(value: String => Unit): Self = StObject.set(x, "setQuery", js.Any.fromFunction1(value))
    }
  }
  
  trait SearchElementProps extends StObject {
    
    var classNames: js.UndefOr[Container] = js.undefined
    
    def handleSubmit(args: QueryString): Unit
    
    var searchLabel: js.UndefOr[String] = js.undefined
  }
  object SearchElementProps {
    
    inline def apply(handleSubmit: QueryString => Unit): SearchElementProps = {
      val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction1(handleSubmit))
      __obj.asInstanceOf[SearchElementProps]
    }
    
    extension [Self <: SearchElementProps](x: Self) {
      
      inline def setClassNames(value: Container): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setHandleSubmit(value: QueryString => Unit): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction1(value))
      
      inline def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelUndefined: Self = StObject.set(x, "searchLabel", js.undefined)
    }
  }
}
