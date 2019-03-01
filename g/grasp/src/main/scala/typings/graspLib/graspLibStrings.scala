package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graspLibStrings {
  @js.native
  sealed trait buffer extends js.Object
  
  @js.native
  sealed trait equery
    extends graspLib.graspMod.graspNs.QueryEngineType
  
  @js.native
  sealed trait squery
    extends graspLib.graspMod.graspNs.QueryEngineType
  
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def equery: equery = "equery".asInstanceOf[equery]
  @scala.inline
  def squery: squery = "squery".asInstanceOf[squery]
}

