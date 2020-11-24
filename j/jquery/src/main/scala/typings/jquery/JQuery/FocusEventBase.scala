package typings.jquery.JQuery

import typings.std.EventTarget
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// region FocusEvent
// #region FocusEvent
@js.native
trait FocusEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  
  // MouseEvent, KeyboardEvent, TouchEvent
  @JSName("altKey")
  var altKey_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  // MouseEvent
  @JSName("button")
  var button_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("buttons")
  var buttons_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  // TouchEvent
  @JSName("changedTouches")
  var changedTouches_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /** @deprecated */
  @JSName("charCode")
  var charCode_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  // KeyboardEvent
  /** @deprecated */
  @JSName("char")
  var char_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("clientX")
  var clientX_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("clientY")
  var clientY_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("ctrlKey")
  var ctrlKey_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /** @deprecated */
  @JSName("keyCode")
  var keyCode_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("key")
  var key_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Indicates whether the META key was pressed when the event fired.
    * @see \`{@link https://api.jquery.com/event.metaKey/ }\`
    * @since 1.0.4
    * @example ​ ````Determine whether the META key was pressed when the event fired.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.metaKey demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <button value="Test" name="Test" id="checkMetaKey">Click me!</button>
  <div id="display"></div>
  ​
  <script>
  $( "#checkMetaKey" ).click(function( event ) {
    $( "#display" ).text( event.metaKey );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("metaKey")
  var metaKey_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("offsetX")
  var offsetX_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("offsetY")
  var offsetY_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("originalEvent")
  var originalEvent_FocusEventBase: js.UndefOr[typings.jquery.FocusEvent] = js.native
  
  /**
    * The mouse position relative to the left edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageX/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageX demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageX")
  var pageX_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The mouse position relative to the top edge of the document.
    * @see \`{@link https://api.jquery.com/event.pageY/ }\`
    * @since 1.0.4
    * @example ​ ````Show the mouse position relative to the left and top edges of the document (within this iframe).
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.pageY demo</title>
    <style>
    body {
    background-color: #eef;
    }
    div {
    padding: 20px;
    }
    </style>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <div id="log"></div>
  ​
  <script>
  $( document ).on( "mousemove", function( event ) {
    $( "#log" ).text( "pageX: " + event.pageX + ", pageY: " + event.pageY );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("pageY")
  var pageY_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  // PointerEvent
  @JSName("pointerId")
  var pointerId_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("pointerType")
  var pointerType_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * The other DOM element involved in the event, if any.
    * @see \`{@link https://api.jquery.com/event.relatedTarget/ }\`
    * @since 1.1.4
    * @example ​ ````On mouseout of anchors, alert the element type being entered.
  ```javascript
  $( "a" ).mouseout(function( event ) {
    alert( event.relatedTarget.nodeName ); // "DIV"
  });
  ```
    */
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
  
  @JSName("screenX")
  var screenX_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("screenY")
  var screenY_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("shiftKey")
  var shiftKey_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("targetTouches")
  var targetTouches_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  /** @deprecated */
  @JSName("toElement")
  var toElement_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("touches")
  var touches_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
  
  // MouseEvent, KeyboardEvent
  /**
    * For key or mouse events, this property indicates the specific key or button that was pressed.
    * @see \`{@link https://api.jquery.com/event.which/ }\`
    * @since 1.1.3
    * @deprecated ​ Deprecated since 3.3. See \`{@link https://github.com/jquery/api.jquery.com/issues/821 }\`.
    * @example ​ ````Log which key was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="type something">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "keydown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    * @example ​ ````Log which mouse button was depressed.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>event.which demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <input id="whichkey" value="click here">
  <div id="log"></div>
  ​
  <script>
  $( "#whichkey" ).on( "mousedown", function( event ) {
    $( "#log" ).html( event.type + ": " +  event.which );
  });
  </script>
  ​
  </body>
  </html>
  ```
    */
  @JSName("which")
  var which_FocusEventBase: js.UndefOr[scala.Nothing] = js.native
}
object FocusEventBase {
  
  @scala.inline
  def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: TCurrentTarget,
    data: TData,
    delegateTarget: TDelegateTarget,
    detail: Double,
    eventPhase: Double,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: TTarget,
    timeStamp: Double,
    `type`: String,
    view: Window
  ): FocusEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget]]
  }
  
  @scala.inline
  implicit class FocusEventBaseOps[Self <: FocusEventBase[_, _, _, _], TDelegateTarget, TData, TCurrentTarget, TTarget] (val x: Self with (FocusEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget])) extends AnyVal {
    
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
    def setOriginalEvent(value: typings.jquery.FocusEvent): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalEvent: Self = this.set("originalEvent", js.undefined)
    
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = this.set("relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedTarget: Self = this.set("relatedTarget", js.undefined)
    
    @scala.inline
    def setRelatedTargetNull: Self = this.set("relatedTarget", null)
  }
}
