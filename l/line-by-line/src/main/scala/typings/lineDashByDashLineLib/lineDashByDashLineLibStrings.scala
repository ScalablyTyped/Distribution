package typings
package lineDashByDashLineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object lineDashByDashLineLibStrings {
  @js.native
  sealed trait end extends LineByLineReaderEvent
  
  @js.native
  sealed trait error extends LineByLineReaderEvent
  
  @js.native
  sealed trait line extends LineByLineReaderEvent
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def line: line = "line".asInstanceOf[line]
}

