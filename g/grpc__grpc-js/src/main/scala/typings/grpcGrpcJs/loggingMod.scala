package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("@grpc/grpc-js/build/src/logging", "getLogger")
  @js.native
  def getLogger(): PartialConsole = js.native
  
  @JSImport("@grpc/grpc-js/build/src/logging", "log")
  @js.native
  def log(severity: LogVerbosity, args: js.Any*): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/logging", "setLogger")
  @js.native
  def setLogger(logger: PartialConsole): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/logging", "setLoggerVerbosity")
  @js.native
  def setLoggerVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  @JSImport("@grpc/grpc-js/build/src/logging", "trace")
  @js.native
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
}
