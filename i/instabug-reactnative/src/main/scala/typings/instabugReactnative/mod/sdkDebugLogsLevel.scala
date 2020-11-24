package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sdkDebugLogsLevel extends js.Object
@JSImport("instabug-reactnative", "sdkDebugLogsLevel")
@js.native
object sdkDebugLogsLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sdkDebugLogsLevel with Double] = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelDebug extends sdkDebugLogsLevel
  /* 1 */ @js.native
  object sdkDebugLogsLevelDebug extends TopLevel[sdkDebugLogsLevelDebug with Double]
  
  @js.native
  sealed trait sdkDebugLogsLevelError extends sdkDebugLogsLevel
  /* 2 */ @js.native
  object sdkDebugLogsLevelError extends TopLevel[sdkDebugLogsLevelError with Double]
  
  @js.native
  sealed trait sdkDebugLogsLevelNone extends sdkDebugLogsLevel
  /* 3 */ @js.native
  object sdkDebugLogsLevelNone extends TopLevel[sdkDebugLogsLevelNone with Double]
  
  @js.native
  sealed trait sdkDebugLogsLevelVerbose extends sdkDebugLogsLevel
  /* 0 */ @js.native
  object sdkDebugLogsLevelVerbose extends TopLevel[sdkDebugLogsLevelVerbose with Double]
}
