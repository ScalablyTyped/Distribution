package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/logging", JSImport.Namespace)
@js.native
object loggingMod extends js.Object {
  
  def getLogger(): PartialConsole = js.native
  
  def log(severity: LogVerbosity, args: js.Any*): Unit = js.native
  
  def setLogger(logger: PartialConsole): Unit = js.native
  
  def setLoggerVerbosity(verbosity: LogVerbosity): Unit = js.native
  
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
}
