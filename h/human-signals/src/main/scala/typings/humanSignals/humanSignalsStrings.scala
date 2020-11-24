package typings.humanSignals

import typings.humanSignals.mod.SignalAction
import typings.humanSignals.mod.SignalStandard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object humanSignalsStrings {
  
  @scala.inline
  def ansi: ansi = "ansi".asInstanceOf[ansi]
  
  @scala.inline
  def bsd: bsd = "bsd".asInstanceOf[bsd]
  
  @scala.inline
  def core: core = "core".asInstanceOf[core]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def posix: posix = "posix".asInstanceOf[posix]
  
  @scala.inline
  def systemv: systemv = "systemv".asInstanceOf[systemv]
  
  @scala.inline
  def terminate: terminate = "terminate".asInstanceOf[terminate]
  
  @scala.inline
  def unpause: unpause = "unpause".asInstanceOf[unpause]
  
  @js.native
  sealed trait ansi extends SignalStandard
  
  @js.native
  sealed trait bsd extends SignalStandard
  
  @js.native
  sealed trait core extends SignalAction
  
  @js.native
  sealed trait ignore extends SignalAction
  
  @js.native
  sealed trait other extends SignalStandard
  
  @js.native
  sealed trait pause extends SignalAction
  
  @js.native
  sealed trait posix extends SignalStandard
  
  @js.native
  sealed trait systemv extends SignalStandard
  
  @js.native
  sealed trait terminate extends SignalAction
  
  @js.native
  sealed trait unpause extends SignalAction
}
