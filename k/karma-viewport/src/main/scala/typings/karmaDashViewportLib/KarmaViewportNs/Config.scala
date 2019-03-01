package typings
package karmaDashViewportLib.KarmaViewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** Breakpoints */
  var breakpoints: js.Array[Breakpoint]
  /** Context selector */
  var context: java.lang.String
}

object Config {
  @scala.inline
  def apply(breakpoints: js.Array[Breakpoint], context: java.lang.String): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakpoints")(breakpoints)
    __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Config]
  }
}

