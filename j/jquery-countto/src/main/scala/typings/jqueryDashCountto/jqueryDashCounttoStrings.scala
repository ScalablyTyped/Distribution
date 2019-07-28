package typings.jqueryDashCountto

import typings.jqueryDashCountto.jqueryDashCounttoMod.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryDashCounttoStrings {
  @js.native
  sealed trait restart extends Method
  
  @js.native
  sealed trait start extends Method
  
  @js.native
  sealed trait stop extends Method
  
  @js.native
  sealed trait toggle extends Method
  
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
}

