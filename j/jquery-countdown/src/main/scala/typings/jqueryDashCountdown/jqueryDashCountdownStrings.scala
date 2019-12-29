package typings.jqueryDashCountdown

import typings.jqueryDashCountdown.jQueryCountdown.Controls
import typings.jqueryDashCountdown.jQueryCountdown.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryDashCountdownStrings {
  @js.native
  sealed trait finishDotcountdown extends Methods
  
  @js.native
  sealed trait pause extends Controls
  
  @js.native
  sealed trait resume extends Controls
  
  @js.native
  sealed trait start extends Controls
  
  @js.native
  sealed trait stop extends Controls
  
  @js.native
  sealed trait stopDotcountdown extends Methods
  
  @js.native
  sealed trait updateDotcountdown extends Methods
  
  @scala.inline
  def finishDotcountdown: finishDotcountdown = "finish.countdown".asInstanceOf[finishDotcountdown]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def stopDotcountdown: stopDotcountdown = "stop.countdown".asInstanceOf[stopDotcountdown]
  @scala.inline
  def updateDotcountdown: updateDotcountdown = "update.countdown".asInstanceOf[updateDotcountdown]
}

