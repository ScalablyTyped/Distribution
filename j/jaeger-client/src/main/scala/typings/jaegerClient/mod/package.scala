package typings.jaegerClient.mod

import typings.jaegerClient.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def initTracer(tracingConfig: TracingConfig, tracingOptions: TracingOptions): JaegerTracer = (^.asInstanceOf[js.Dynamic].applyDynamic("initTracer")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[JaegerTracer]

inline def initTracerFromEnv(tracingConfig: TracingConfig, tracingOptions: TracingOptions): JaegerTracer = (^.asInstanceOf[js.Dynamic].applyDynamic("initTracerFromEnv")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[JaegerTracer]
