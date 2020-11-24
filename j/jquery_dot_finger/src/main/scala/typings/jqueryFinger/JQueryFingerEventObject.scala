package typings.jqueryFinger

import typings.jquery.JQueryMouseEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.jquery.BaseJQueryEventObject because Already inherited
- typings.jquery.JQueryInputEventObject because Already inherited
- typings.jquery.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget_BaseJQueryEventObject, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target_BaseJQueryEventObject, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryFingerEventObject extends JQueryMouseEventObject {
  
  /**
    * The absolute x delta since the last event.
    */
  var adx: Double = js.native
  
  /**
    * The absolute y delta since the last event.
    */
  var ady: Double = js.native
  
  /** @deprecated */
  var char: String = js.native
  
  /** @deprecated */
  var charCode: Double = js.native
  
  /**
    * The direction of the motion. Value is 1 if the motion is 'positive'
    * (left-to-right or top-to-bottom) or -1 if 'negative'(right-to-left or
    * bottom-to-top).
    */
  var direction: Double = js.native
  
  /**
    * The x delta since the last event.
    */
  var dx: Double = js.native
  
  /**
    * The y delta since the last event.
    */
  var dy: Double = js.native
  
  var key: String = js.native
  
  /** @deprecated */
  var keyCode: Double = js.native
  
  /**
    * The orientation of the motion. Adjusted by $.Finger.motionThreshhold.
    * Value is 'horizontal' or 'vertical'.
    */
  var orientation: String = js.native
  
  /**
    * The x page coordinate.
    */
  var x: Double = js.native
  
  /**
    * The y page coordinate.
    */
  var y: Double = js.native
}
