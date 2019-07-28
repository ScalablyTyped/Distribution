package typings.maquette

import typings.maquette.distInterfacesMod.PerformanceLoggerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object maquetteStrings {
  @js.native
  sealed trait `Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead` extends js.Object
  
  @js.native
  sealed trait domEvent extends PerformanceLoggerEvent
  
  @js.native
  sealed trait domEventProcessed extends PerformanceLoggerEvent
  
  @js.native
  sealed trait patched extends PerformanceLoggerEvent
  
  @js.native
  sealed trait renderDone extends PerformanceLoggerEvent
  
  @js.native
  sealed trait renderStart extends PerformanceLoggerEvent
  
  @js.native
  sealed trait rendered extends PerformanceLoggerEvent
  
  @scala.inline
  def `Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead`: `Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead` = "Hint: do not use `className`, use `class` instead".asInstanceOf[`Hint: do not use BACKTICKclassNameBACKTICK, use BACKTICKclassBACKTICK instead`]
  @scala.inline
  def domEvent: domEvent = "domEvent".asInstanceOf[domEvent]
  @scala.inline
  def domEventProcessed: domEventProcessed = "domEventProcessed".asInstanceOf[domEventProcessed]
  @scala.inline
  def patched: patched = "patched".asInstanceOf[patched]
  @scala.inline
  def renderDone: renderDone = "renderDone".asInstanceOf[renderDone]
  @scala.inline
  def renderStart: renderStart = "renderStart".asInstanceOf[renderStart]
  @scala.inline
  def rendered: rendered = "rendered".asInstanceOf[rendered]
}

