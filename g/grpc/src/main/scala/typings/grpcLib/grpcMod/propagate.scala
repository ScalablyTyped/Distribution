package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait propagate extends js.Object

@JSImport("grpc", "propagate")
@js.native
object propagate extends js.Object {
  @js.native
  sealed trait CANCELLATION
    extends grpcLib.grpcMod.propagate
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT
    extends grpcLib.grpcMod.propagate
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT
    extends grpcLib.grpcMod.propagate
  
  @js.native
  sealed trait DEADLINE
    extends grpcLib.grpcMod.propagate
  
  @js.native
  sealed trait DEFAULTS
    extends grpcLib.grpcMod.propagate
  
  /* 3 */ val CANCELLATION: CANCELLATION with scala.Double = js.native
  /* 1 */ val CENSUS_STATS_CONTEXT: CENSUS_STATS_CONTEXT with scala.Double = js.native
  /* 2 */ val CENSUS_TRACING_CONTEXT: CENSUS_TRACING_CONTEXT with scala.Double = js.native
  /* 0 */ val DEADLINE: DEADLINE with scala.Double = js.native
  /* 4 */ val DEFAULTS: DEFAULTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.propagate with scala.Double] = js.native
}

