package typings.karmaDashViewport.KarmaViewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /** Breakpoints */
  var breakpoints: js.Array[Breakpoint]
  /** Context selector */
  var context: String
}

object Config {
  @scala.inline
  def apply(breakpoints: js.Array[Breakpoint], context: String): Config = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints, context = context)
  
    __obj.asInstanceOf[Config]
  }
}

