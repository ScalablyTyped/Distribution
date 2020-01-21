package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait propagate extends js.Object

@JSImport("grpc", "propagate")
@js.native
object propagate extends js.Object {
  @js.native
  sealed trait CANCELLATION extends propagate
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT extends propagate
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT extends propagate
  
  @js.native
  sealed trait DEADLINE extends propagate
  
  @js.native
  sealed trait DEFAULTS extends propagate
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[propagate with Double] = js.native
  /* 3 */ @js.native
  object CANCELLATION extends TopLevel[CANCELLATION with Double]
  
  /* 1 */ @js.native
  object CENSUS_STATS_CONTEXT extends TopLevel[CENSUS_STATS_CONTEXT with Double]
  
  /* 2 */ @js.native
  object CENSUS_TRACING_CONTEXT extends TopLevel[CENSUS_TRACING_CONTEXT with Double]
  
  /* 0 */ @js.native
  object DEADLINE extends TopLevel[DEADLINE with Double]
  
  /* 4 */ @js.native
  object DEFAULTS extends TopLevel[DEFAULTS with Double]
  
}

