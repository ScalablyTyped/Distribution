package typings.klaw

import typings.klaw.mod.Event
import typings.klaw.mod.QueueMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object klawStrings {
  
  @js.native
  sealed trait close extends Event
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data extends Event
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends Event
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error extends Event
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait pause extends Event
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pop extends QueueMethod
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  
  @js.native
  sealed trait readable extends Event
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait resume extends Event
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait shift extends QueueMethod
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
}
