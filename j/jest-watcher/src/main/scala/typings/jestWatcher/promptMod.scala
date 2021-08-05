package typings.jestWatcher

import typings.jestWatcher.typesMod.ScrollOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptMod {
  
  @JSImport("jest-watcher/build/lib/Prompt", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Prompt {
    
    /* private */ /* CompleteClass */
    var _entering: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _offset: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _onCancel: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _onChange: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _onResize: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _onSuccess: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _promptLength: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _selection: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _value: js.Any = js.native
    
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /* CompleteClass */
    override def enter(
      onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit],
      onSuccess: js.Function1[/* pattern */ String, Unit],
      onCancel: js.Function0[Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    override def isEntering(): Boolean = js.native
    
    /* CompleteClass */
    override def put(key: String): Unit = js.native
    
    /* CompleteClass */
    override def setPromptLength(length: Double): Unit = js.native
    
    /* CompleteClass */
    override def setPromptSelection(selected: String): Unit = js.native
  }
  
  trait Prompt extends StObject {
    
    /* private */ var _entering: js.Any
    
    /* private */ var _offset: js.Any
    
    /* private */ var _onCancel: js.Any
    
    /* private */ var _onChange: js.Any
    
    /* private */ var _onResize: js.Any
    
    /* private */ var _onSuccess: js.Any
    
    /* private */ var _promptLength: js.Any
    
    /* private */ var _selection: js.Any
    
    /* private */ var _value: js.Any
    
    def abort(): Unit
    
    def enter(
      onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit],
      onSuccess: js.Function1[/* pattern */ String, Unit],
      onCancel: js.Function0[Unit]
    ): Unit
    
    def isEntering(): Boolean
    
    def put(key: String): Unit
    
    def setPromptLength(length: Double): Unit
    
    def setPromptSelection(selected: String): Unit
  }
  object Prompt {
    
    inline def apply(
      _entering: js.Any,
      _offset: js.Any,
      _onCancel: js.Any,
      _onChange: js.Any,
      _onResize: js.Any,
      _onSuccess: js.Any,
      _promptLength: js.Any,
      _selection: js.Any,
      _value: js.Any,
      abort: () => Unit,
      enter: (js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit], js.Function1[/* pattern */ String, Unit], js.Function0[Unit]) => Unit,
      isEntering: () => Boolean,
      put: String => Unit,
      setPromptLength: Double => Unit,
      setPromptSelection: String => Unit
    ): Prompt = {
      val __obj = js.Dynamic.literal(_entering = _entering.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _onCancel = _onCancel.asInstanceOf[js.Any], _onChange = _onChange.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _onSuccess = _onSuccess.asInstanceOf[js.Any], _promptLength = _promptLength.asInstanceOf[js.Any], _selection = _selection.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), enter = js.Any.fromFunction3(enter), isEntering = js.Any.fromFunction0(isEntering), put = js.Any.fromFunction1(put), setPromptLength = js.Any.fromFunction1(setPromptLength), setPromptSelection = js.Any.fromFunction1(setPromptSelection))
      __obj.asInstanceOf[Prompt]
    }
    
    extension [Self <: Prompt](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setEnter(
        value: (js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit], js.Function1[/* pattern */ String, Unit], js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
      
      inline def setIsEntering(value: () => Boolean): Self = StObject.set(x, "isEntering", js.Any.fromFunction0(value))
      
      inline def setPut(value: String => Unit): Self = StObject.set(x, "put", js.Any.fromFunction1(value))
      
      inline def setSetPromptLength(value: Double => Unit): Self = StObject.set(x, "setPromptLength", js.Any.fromFunction1(value))
      
      inline def setSetPromptSelection(value: String => Unit): Self = StObject.set(x, "setPromptSelection", js.Any.fromFunction1(value))
      
      inline def set_entering(value: js.Any): Self = StObject.set(x, "_entering", value.asInstanceOf[js.Any])
      
      inline def set_offset(value: js.Any): Self = StObject.set(x, "_offset", value.asInstanceOf[js.Any])
      
      inline def set_onCancel(value: js.Any): Self = StObject.set(x, "_onCancel", value.asInstanceOf[js.Any])
      
      inline def set_onChange(value: js.Any): Self = StObject.set(x, "_onChange", value.asInstanceOf[js.Any])
      
      inline def set_onResize(value: js.Any): Self = StObject.set(x, "_onResize", value.asInstanceOf[js.Any])
      
      inline def set_onSuccess(value: js.Any): Self = StObject.set(x, "_onSuccess", value.asInstanceOf[js.Any])
      
      inline def set_promptLength(value: js.Any): Self = StObject.set(x, "_promptLength", value.asInstanceOf[js.Any])
      
      inline def set_selection(value: js.Any): Self = StObject.set(x, "_selection", value.asInstanceOf[js.Any])
      
      inline def set_value(value: js.Any): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
