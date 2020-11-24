package typings.grpcGrpcJs.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Propagate extends js.Object
@JSImport("@grpc/grpc-js/build/src/constants", "Propagate")
@js.native
object Propagate extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Propagate with Double] = js.native
  
  @js.native
  sealed trait CANCELLATION extends Propagate
  /* 8 */ @js.native
  object CANCELLATION extends TopLevel[CANCELLATION with Double]
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT extends Propagate
  /* 2 */ @js.native
  object CENSUS_STATS_CONTEXT extends TopLevel[CENSUS_STATS_CONTEXT with Double]
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT extends Propagate
  /* 4 */ @js.native
  object CENSUS_TRACING_CONTEXT extends TopLevel[CENSUS_TRACING_CONTEXT with Double]
  
  @js.native
  sealed trait DEADLINE extends Propagate
  /* 1 */ @js.native
  object DEADLINE extends TopLevel[DEADLINE with Double]
  
  @js.native
  sealed trait DEFAULTS extends Propagate
  /* 65536 */ @js.native
  object DEFAULTS extends TopLevel[DEFAULTS with Double]
}
