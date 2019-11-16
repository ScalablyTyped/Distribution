package typings.jestDashWatcher.buildLibPromptMod

import typings.jestDashWatcher.buildTypesMod.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prompt extends js.Object {
  var _entering: js.Any
  var _offset: js.Any
  var _onCancel: js.Any
  var _onChange: js.Any
  var _onResize: js.Any
  var _onSuccess: js.Any
  var _promptLength: js.Any
  var _selection: js.Any
  var _value: js.Any
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
    val __obj = js.Dynamic.literal(_entering = _entering, _offset = _offset, _onCancel = _onCancel, _onChange = _onChange, _onResize = _onResize, _onSuccess = _onSuccess, _promptLength = _promptLength, _selection = _selection, _value = _value, abort = js.Any.fromFunction0(abort), enter = js.Any.fromFunction3(enter), isEntering = js.Any.fromFunction0(isEntering), put = js.Any.fromFunction1(put), setPromptLength = js.Any.fromFunction1(setPromptLength), setPromptSelection = js.Any.fromFunction1(setPromptSelection))
  
    __obj.asInstanceOf[Prompt]
  }
}

