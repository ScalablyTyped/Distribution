package typings.ignoreWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ignoreWalkStrings {
  @js.native
  sealed trait done extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

