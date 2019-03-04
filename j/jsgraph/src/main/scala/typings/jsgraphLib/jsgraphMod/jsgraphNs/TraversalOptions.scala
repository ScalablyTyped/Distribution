package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalOptions extends js.Object {
  var allowEmptyStartVector: scala.Boolean
  var signalStart: scala.Boolean
  var startVector: java.lang.String | js.Array[java.lang.String]
  var traverseContext: TraversalContext
}

object TraversalOptions {
  @scala.inline
  def apply(
    allowEmptyStartVector: scala.Boolean,
    signalStart: scala.Boolean,
    startVector: java.lang.String | js.Array[java.lang.String],
    traverseContext: TraversalContext
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector, signalStart = signalStart, startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext)
  
    __obj.asInstanceOf[TraversalOptions]
  }
}

