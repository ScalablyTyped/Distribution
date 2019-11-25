package typings.jsgraph.jsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalOptions extends js.Object {
  var allowEmptyStartVector: Boolean
  var signalStart: Boolean
  var startVector: String | js.Array[String]
  var traverseContext: TraversalContext
}

object TraversalOptions {
  @scala.inline
  def apply(
    allowEmptyStartVector: Boolean,
    signalStart: Boolean,
    startVector: String | js.Array[String],
    traverseContext: TraversalContext
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector.asInstanceOf[js.Any], signalStart = signalStart.asInstanceOf[js.Any], startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TraversalOptions]
  }
}

