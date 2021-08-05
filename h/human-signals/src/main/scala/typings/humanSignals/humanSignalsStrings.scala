package typings.humanSignals

import typings.humanSignals.mod.SignalAction
import typings.humanSignals.mod.SignalStandard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object humanSignalsStrings {
  
  @js.native
  sealed trait ansi
    extends StObject
       with SignalStandard
  inline def ansi: ansi = "ansi".asInstanceOf[ansi]
  
  @js.native
  sealed trait bsd
    extends StObject
       with SignalStandard
  inline def bsd: bsd = "bsd".asInstanceOf[bsd]
  
  @js.native
  sealed trait core
    extends StObject
       with SignalAction
  inline def core: core = "core".asInstanceOf[core]
  
  @js.native
  sealed trait ignore
    extends StObject
       with SignalAction
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait other
    extends StObject
       with SignalStandard
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait pause
    extends StObject
       with SignalAction
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait posix
    extends StObject
       with SignalStandard
  inline def posix: posix = "posix".asInstanceOf[posix]
  
  @js.native
  sealed trait systemv
    extends StObject
       with SignalStandard
  inline def systemv: systemv = "systemv".asInstanceOf[systemv]
  
  @js.native
  sealed trait terminate
    extends StObject
       with SignalAction
  inline def terminate: terminate = "terminate".asInstanceOf[terminate]
  
  @js.native
  sealed trait unpause
    extends StObject
       with SignalAction
  inline def unpause: unpause = "unpause".asInstanceOf[unpause]
}
