package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseMoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] extends MouseEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] {
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
  @JSName("relatedTarget")
  var relatedTarget_MouseMoveEvent: js.UndefOr[scala.Null] = js.undefined
  @JSName("type")
  var type_MouseMoveEvent: jqueryLib.jqueryLibStrings.mousemove
}

