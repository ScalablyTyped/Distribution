package typings.jestWatcher.promptMod

import typings.jestWatcher.typesMod.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prompt extends js.Object {
  
  var _entering: js.Any = js.native
  
  var _offset: js.Any = js.native
  
  var _onCancel: js.Any = js.native
  
  var _onChange: js.Any = js.native
  
  var _onResize: js.Any = js.native
  
  var _onSuccess: js.Any = js.native
  
  var _promptLength: js.Any = js.native
  
  var _selection: js.Any = js.native
  
  var _value: js.Any = js.native
  
  def abort(): Unit = js.native
  
  def enter(
    onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit],
    onSuccess: js.Function1[/* pattern */ String, Unit],
    onCancel: js.Function0[Unit]
  ): Unit = js.native
  
  def isEntering(): Boolean = js.native
  
  def put(key: String): Unit = js.native
  
  def setPromptLength(length: Double): Unit = js.native
  
  def setPromptSelection(selected: String): Unit = js.native
}
object Prompt {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PromptOps[Self <: Prompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_entering(value: js.Any): Self = this.set("_entering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_offset(value: js.Any): Self = this.set("_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onCancel(value: js.Any): Self = this.set("_onCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onChange(value: js.Any): Self = this.set("_onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onResize(value: js.Any): Self = this.set("_onResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_onSuccess(value: js.Any): Self = this.set("_onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_promptLength(value: js.Any): Self = this.set("_promptLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_selection(value: js.Any): Self = this.set("_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_value(value: js.Any): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnter(
      value: (js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit], js.Function1[/* pattern */ String, Unit], js.Function0[Unit]) => Unit
    ): Self = this.set("enter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsEntering(value: () => Boolean): Self = this.set("isEntering", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: String => Unit): Self = this.set("put", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptLength(value: Double => Unit): Self = this.set("setPromptLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPromptSelection(value: String => Unit): Self = this.set("setPromptSelection", js.Any.fromFunction1(value))
  }
}
