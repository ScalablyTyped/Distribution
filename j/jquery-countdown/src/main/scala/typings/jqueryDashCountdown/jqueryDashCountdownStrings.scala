package typings.jqueryDashCountdown

import typings.jqueryDashCountdown.jQueryCountdownNs.Controls
import typings.jqueryDashCountdown.jQueryCountdownNs.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryDashCountdownStrings {
  @js.native
  sealed trait finishDOTcountdown extends Methods
  
  @js.native
  sealed trait pause extends Controls
  
  @js.native
  sealed trait resume extends Controls
  
  @js.native
  sealed trait start extends Controls
  
  @js.native
  sealed trait stop extends Controls
  
  @js.native
  sealed trait stopDOTcountdown extends Methods
  
  @js.native
  sealed trait updateDOTcountdown extends Methods
  
  @scala.inline
  def finishDOTcountdown: finishDOTcountdown = "finish.countdown".asInstanceOf[finishDOTcountdown]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def stopDOTcountdown: stopDOTcountdown = "stop.countdown".asInstanceOf[stopDOTcountdown]
  @scala.inline
  def updateDOTcountdown: updateDOTcountdown = "update.countdown".asInstanceOf[updateDOTcountdown]
}

