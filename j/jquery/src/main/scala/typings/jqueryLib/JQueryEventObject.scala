package typings
package jqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated ​ Deprecated. Use \`{@link JQuery.Event }\`.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- jqueryLib.JQueryKeyEventObject because var conflicts: altKey, cancelBubble, ctrlKey, currentTarget, data, delegateTarget, metaKey, namespace, originalEvent, pageX, pageY, relatedTarget, result, returnValue, shiftKey, target, which. Inlined char, charCode, key, keyCode */ @js.native
trait JQueryEventObject extends JQueryMouseEventObject {
  /** @deprecated */
  var char: java.lang.String = js.native
  /** @deprecated */
  var charCode: scala.Double = js.native
  var key: java.lang.String = js.native
  /** @deprecated */
  var keyCode: scala.Double = js.native
}

