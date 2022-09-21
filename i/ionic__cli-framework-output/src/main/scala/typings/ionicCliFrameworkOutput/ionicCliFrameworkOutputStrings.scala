package typings.ionicCliFrameworkOutput

import typings.ionicCliFrameworkOutput.loggerMod.LoggerLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicCliFrameworkOutputStrings {
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with LoggerLevel
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LoggerLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends StObject
       with LoggerLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait WARN
    extends StObject
       with LoggerLevel
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait failure extends StObject
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait next extends StObject
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait success extends StObject
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait tick extends StObject
  inline def tick: tick = "tick".asInstanceOf[tick]
}
