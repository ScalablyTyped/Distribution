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
  
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  def hash: hash = "hash".asInstanceOf[hash]
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  def simple: simple = "simple".asInstanceOf[simple]
}

