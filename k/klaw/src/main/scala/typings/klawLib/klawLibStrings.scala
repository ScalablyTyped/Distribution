package typings
package klawLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object klawLibStrings {
  @js.native
  sealed trait close
    extends klawLib.klawMod.KNs.Event
  
  @js.native
  sealed trait data
    extends klawLib.klawMod.KNs.Event
  
  @js.native
  sealed trait end
    extends klawLib.klawMod.KNs.Event
  
  @js.native
  sealed trait error
    extends klawLib.klawMod.KNs.Event
  
  @js.native
  sealed trait pop
    extends klawLib.klawMod.KNs.QueueMethod
  
  @js.native
  sealed trait readable
    extends klawLib.klawMod.KNs.Event
  
  @js.native
  sealed trait shift
    extends klawLib.klawMod.KNs.QueueMethod
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def pop: pop = "pop".asInstanceOf[pop]
  @scala.inline
  def readable: readable = "readable".asInstanceOf[readable]
  @scala.inline
  def shift: shift = "shift".asInstanceOf[shift]
}

