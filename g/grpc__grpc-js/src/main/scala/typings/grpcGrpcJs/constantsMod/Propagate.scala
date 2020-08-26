package typings.grpcGrpcJs.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Propagate extends js.Object

@JSImport("@grpc/grpc-js/build/src/constants", "Propagate")
@js.native
object Propagate extends js.Object {
  @js.native
  sealed trait CANCELLATION extends Propagate
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT extends Propagate
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT extends Propagate
  
  @js.native
  sealed trait DEADLINE extends Propagate
  
  @js.native
  sealed trait DEFAULTS extends Propagate
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Propagate with Double] = js.native
  /* 8 */ @js.native
  object CANCELLATION extends TopLevel[CANCELLATION with Double]
  
  /* 2 */ @js.native
  object CENSUS_STATS_CONTEXT extends TopLevel[CENSUS_STATS_CONTEXT with Double]
  
  /* 4 */ @js.native
  object CENSUS_TRACING_CONTEXT extends TopLevel[CENSUS_TRACING_CONTEXT with Double]
  
  /* 1 */ @js.native
  object DEADLINE extends TopLevel[DEADLINE with Double]
  
  /* 65536 */ @js.native
  object DEFAULTS extends TopLevel[DEFAULTS with Double]
  
}

