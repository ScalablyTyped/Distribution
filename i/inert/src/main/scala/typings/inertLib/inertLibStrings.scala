package typings
package inertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inertLibStrings {
  @js.native
  sealed trait attachment extends js.Object
  
  @js.native
  sealed trait hash extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait simple extends js.Object
  
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def hash: hash = "hash".asInstanceOf[hash]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
}

