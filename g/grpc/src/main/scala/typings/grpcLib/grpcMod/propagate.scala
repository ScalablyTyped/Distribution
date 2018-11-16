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
  
  val CANCELLATION: CANCELLATION with java.lang.String = js.native
  val CENSUS_STATS_CONTEXT: CENSUS_STATS_CONTEXT with java.lang.String = js.native
  val CENSUS_TRACING_CONTEXT: CENSUS_TRACING_CONTEXT with java.lang.String = js.native
  val DEADLINE: DEADLINE with java.lang.String = js.native
  val DEFAULTS: DEFAULTS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[grpcLib.grpcMod.propagate with java.lang.String] = js.native
}

