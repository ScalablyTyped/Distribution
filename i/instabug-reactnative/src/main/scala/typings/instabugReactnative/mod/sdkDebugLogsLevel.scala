package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait sdkDebugLogsLevel extends js.Object

@JSImport("instabug-reactnative", "sdkDebugLogsLevel")
@js.native
object sdkDebugLogsLevel extends js.Object {
  @js.native
  sealed trait sdkDebugLogsLevelDebug extends sdkDebugLogsLevel
  
  @js.native
  sealed trait sdkDebugLogsLevelError extends sdkDebugLogsLevel
  
  @js.native
  sealed trait sdkDebugLogsLevelNone extends sdkDebugLogsLevel
  
  @js.native
  sealed trait sdkDebugLogsLevelVerbose extends sdkDebugLogsLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sdkDebugLogsLevel with Double] = js.native
  /* 1 */ @js.native
  object sdkDebugLogsLevelDebug extends TopLevel[sdkDebugLogsLevelDebug with Double]
  
  /* 2 */ @js.native
  object sdkDebugLogsLevelError extends TopLevel[sdkDebugLogsLevelError with Double]
  
  /* 3 */ @js.native
  object sdkDebugLogsLevelNone extends TopLevel[sdkDebugLogsLevelNone with Double]
  
  /* 0 */ @js.native
  object sdkDebugLogsLevelVerbose extends TopLevel[sdkDebugLogsLevelVerbose with Double]
  
}

