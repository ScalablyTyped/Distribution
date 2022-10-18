package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLoggingMod {
  
  @JSImport("@grpc/grpc-js/build/src/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLogger(): PartialConsole = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[PartialConsole]
  
  inline def isTracerEnabled(tracer: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTracerEnabled")(tracer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def log(severity: LogVerbosity, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(severity.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def setLogger(logger: PartialConsole): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLoggerVerbosity(verbosity: LogVerbosity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoggerVerbosity")(verbosity.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trace(severity: LogVerbosity, tracer: String, text: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(severity.asInstanceOf[js.Any], tracer.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
