package typings.loopbench

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object loopbenchStrings {
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait unload extends js.Object
  
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def unload: unload = "unload".asInstanceOf[unload]
}

