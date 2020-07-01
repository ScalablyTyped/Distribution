package typings.inkBox

import typings.inkBox.mod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object inkBoxStrings {
  @js.native
  sealed trait center extends Alignment
  
  @js.native
  sealed trait classic extends js.Object
  
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait doubleSingle extends js.Object
  
  @js.native
  sealed trait left extends Alignment
  
  @js.native
  sealed trait right extends Alignment
  
  @js.native
  sealed trait round extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @js.native
  sealed trait singleDouble extends js.Object
  
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def classic: classic = "classic".asInstanceOf[classic]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def doubleSingle: doubleSingle = "doubleSingle".asInstanceOf[doubleSingle]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  @scala.inline
  def singleDouble: singleDouble = "singleDouble".asInstanceOf[singleDouble]
}

