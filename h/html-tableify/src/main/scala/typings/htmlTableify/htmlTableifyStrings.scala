package typings.htmlTableify

import typings.htmlTableify.mod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object htmlTableifyStrings {
  @js.native
  sealed trait Datum extends js.Object
  
  @js.native
  sealed trait center extends Alignment
  
  @js.native
  sealed trait left extends Alignment
  
  @js.native
  sealed trait right extends Alignment
  
  @scala.inline
  def Datum: Datum = "Datum".asInstanceOf[Datum]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

