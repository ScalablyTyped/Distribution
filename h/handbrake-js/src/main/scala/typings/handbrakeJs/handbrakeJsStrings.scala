package typings.handbrakeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handbrakeJsStrings {
  
  @scala.inline
  def Encoding: Encoding = "Encoding".asInstanceOf[Encoding]
  
  @scala.inline
  def Muxing: Muxing = "Muxing".asInstanceOf[Muxing]
  
  @scala.inline
  def begin: begin = "begin".asInstanceOf[begin]
  
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def output: output = "output".asInstanceOf[output]
  
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait Encoding extends js.Object
  
  @js.native
  sealed trait Muxing extends js.Object
  
  @js.native
  sealed trait begin extends js.Object
  
  @js.native
  sealed trait cancelled extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait output extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait start extends js.Object
}
