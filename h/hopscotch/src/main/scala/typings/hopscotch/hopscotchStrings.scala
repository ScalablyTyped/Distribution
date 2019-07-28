package typings.hopscotch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hopscotchStrings {
  @js.native
  sealed trait bottom extends placementTypes
  
  @js.native
  sealed trait center extends js.Object
  
  @js.native
  sealed trait left extends placementTypes
  
  @js.native
  sealed trait right extends placementTypes
  
  @js.native
  sealed trait top extends placementTypes
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

