package typings.klaw

import typings.klaw.mod.Event
import typings.klaw.mod.QueueMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object klawStrings {
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
  
  @js.native
  sealed trait close extends Event
  
  @js.native
  sealed trait data extends Event
  
  @js.native
  sealed trait end extends Event
  
  @js.native
  sealed trait error extends Event
  
  @js.native
  sealed trait pause extends Event
  
  @js.native
  sealed trait pop extends QueueMethod
  
  @js.native
  sealed trait readable extends Event
  
  @js.native
  sealed trait resume extends Event
  
  @js.native
  sealed trait shift extends QueueMethod
}
