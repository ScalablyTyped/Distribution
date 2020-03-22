package typings.jquery

import typings.jquery.JQuery_.Ajax.ErrorTextStatus
import typings.jquery.JQuery_.Ajax.SuccessTextStatus
import typings.jquery.JQuery_.Ajax.TextStatus
import typings.jquery.JQuery_._Duration
import typings.jquery.JQuery_._Falsy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryStrings {
  @js.native
  sealed trait Promise extends js.Object
  
  @js.native
  sealed trait _empty extends _Falsy
  
  @js.native
  sealed trait abort
    extends ErrorTextStatus
       with TextStatus
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait blur extends js.Object
  
  @js.native
  sealed trait boolean extends js.Object
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait contextmenu extends js.Object
  
  @js.native
  sealed trait date extends js.Object
  
  @js.native
  sealed trait dblclick extends js.Object
  
  @js.native
  sealed trait drag extends js.Object
  
  @js.native
  sealed trait dragend extends js.Object
  
  @js.native
  sealed trait dragenter extends js.Object
  
  @js.native
  sealed trait dragexit extends js.Object
  
  @js.native
  sealed trait dragleave extends js.Object
  
  @js.native
  sealed trait dragover extends js.Object
  
  @js.native
  sealed trait dragstart extends js.Object
  
  @js.native
  sealed trait drop extends js.Object
  
  @js.native
  sealed trait error
    extends ErrorTextStatus
       with TextStatus
  
  @js.native
  sealed trait fast extends _Duration
  
  @js.native
  sealed trait focus extends js.Object
  
  @js.native
  sealed trait focusin extends js.Object
  
  @js.native
  sealed trait focusout extends js.Object
  
  @js.native
  sealed trait function extends js.Object
  
  @js.native
  sealed trait get extends js.Object
  
  @js.native
  sealed trait html extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait jsonp extends js.Object
  
  @js.native
  sealed trait keydown extends js.Object
  
  @js.native
  sealed trait keypress extends js.Object
  
  @js.native
  sealed trait keyup extends js.Object
  
  @js.native
  sealed trait mousedown extends js.Object
  
  @js.native
  sealed trait mouseenter extends js.Object
  
  @js.native
  sealed trait mouseleave extends js.Object
  
  @js.native
  sealed trait mousemove extends js.Object
  
  @js.native
  sealed trait mouseout extends js.Object
  
  @js.native
  sealed trait mouseover extends js.Object
  
  @js.native
  sealed trait mouseup extends js.Object
  
  @js.native
  sealed trait nocontent
    extends SuccessTextStatus
       with TextStatus
  
  @js.native
  sealed trait notmodified
    extends SuccessTextStatus
       with TextStatus
  
  @js.native
  sealed trait `null` extends js.Object
  
  @js.native
  sealed trait number extends js.Object
  
  @js.native
  sealed trait `object` extends js.Object
  
  @js.native
  sealed trait parsererror
    extends ErrorTextStatus
       with TextStatus
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait regexp extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @js.native
  sealed trait resize extends js.Object
  
  @js.native
  sealed trait resolved extends js.Object
  
  @js.native
  sealed trait script extends js.Object
  
  @js.native
  sealed trait scroll extends js.Object
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait set extends js.Object
  
  @js.native
  sealed trait slow extends _Duration
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait success
    extends SuccessTextStatus
       with TextStatus
  
  @js.native
  sealed trait symbol extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  @js.native
  sealed trait timeout
    extends ErrorTextStatus
       with TextStatus
  
  @js.native
  sealed trait touchcancel extends js.Object
  
  @js.native
  sealed trait touchend extends js.Object
  
  @js.native
  sealed trait touchmove extends js.Object
  
  @js.native
  sealed trait touchstart extends js.Object
  
  @js.native
  sealed trait undefined extends js.Object
  
  @js.native
  sealed trait xml extends js.Object
  
  @scala.inline
  def Promise: Promise = "Promise".asInstanceOf[Promise]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def dragend: dragend = "dragend".asInstanceOf[dragend]
  @scala.inline
  def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  @scala.inline
  def dragexit: dragexit = "dragexit".asInstanceOf[dragexit]
  @scala.inline
  def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  @scala.inline
  def dragover: dragover = "dragover".asInstanceOf[dragover]
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fast: fast = "fast".asInstanceOf[fast]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def focusin: focusin = "focusin".asInstanceOf[focusin]
  @scala.inline
  def focusout: focusout = "focusout".asInstanceOf[focusout]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def jsonp: jsonp = "jsonp".asInstanceOf[jsonp]
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  @scala.inline
  def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def nocontent: nocontent = "nocontent".asInstanceOf[nocontent]
  @scala.inline
  def notmodified: notmodified = "notmodified".asInstanceOf[notmodified]
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def parsererror: parsererror = "parsererror".asInstanceOf[parsererror]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def slow: slow = "slow".asInstanceOf[slow]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  @scala.inline
  def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
}

