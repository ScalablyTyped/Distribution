package typings.grpcGrpcJs

import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.std.Console_
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/logging", JSImport.Namespace)
@js.native
object loggingMod extends js.Object {
  def getLogger(): Partial[Console_] = js.native
  def log(severity: LogVerbosity, args: js.Any*): Unit = js.native
  def setLogger(logger: Partial[Console_]): Unit = js.native
  def setLoggerVerbosity(verbosity: LogVerbosity): Unit = js.native
  def trace(severity: LogVerbosity, tracer: String, text: String): Unit = js.native
}

