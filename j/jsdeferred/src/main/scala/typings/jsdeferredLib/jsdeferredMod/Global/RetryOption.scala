package typings
package jsdeferredLib.jsdeferredMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOption extends js.Object {
  @JSName("wait")
  var wait_FRetryOption: scala.Double
}

object RetryOption {
  @scala.inline
  def apply(wait: scala.Double): RetryOption = {
    val __obj = js.Dynamic.literal(wait = wait)
  
    __obj.asInstanceOf[RetryOption]
  }
}

