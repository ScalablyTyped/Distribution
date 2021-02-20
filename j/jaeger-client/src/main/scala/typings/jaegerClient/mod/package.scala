package typings.jaegerClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def initTracer(
    tracingConfig: typings.jaegerClient.mod.TracingConfig,
    tracingOptions: typings.jaegerClient.mod.TracingOptions
  ): typings.jaegerClient.mod.JaegerTracer = (typings.jaegerClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initTracer")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[typings.jaegerClient.mod.JaegerTracer]
  
  @scala.inline
  def initTracerFromEnv(
    tracingConfig: typings.jaegerClient.mod.TracingConfig,
    tracingOptions: typings.jaegerClient.mod.TracingOptions
  ): typings.jaegerClient.mod.JaegerTracer = (typings.jaegerClient.mod.^.asInstanceOf[js.Dynamic].applyDynamic("initTracerFromEnv")(tracingConfig.asInstanceOf[js.Any], tracingOptions.asInstanceOf[js.Any])).asInstanceOf[typings.jaegerClient.mod.JaegerTracer]
}
